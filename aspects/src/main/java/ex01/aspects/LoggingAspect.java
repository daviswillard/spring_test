package ex01.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1)
public class LoggingAspect {
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

	/*Аннотации советов*/
//	@Before
//	@AfterReturning
//	@AfterThrowing
//	@After
	@Around("@annotation(ex01.annotation.ToLog)")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("LoggingAspect: intercepted method will be called");
		Object returnedValue = joinPoint.proceed();
		logger.info("LoggingAspect: Method executed and returned " +
				returnedValue);
		return returnedValue;
	}

	@AfterReturning(value = "@annotation(ex01.annotation.ToLog)",
		returning = "returnedValue")
	public void log(Object returnedValue) {
		logger.info("Method executed and returned " + returnedValue);
	}
}
