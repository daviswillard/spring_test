package ex01.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(2)
public class SecurityAspect {
	private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

	@Around("@annotation(ex01.annotation.ToLog)")
	public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("SecurityAspect: intercepted method will be called");
		Object returnedValue = joinPoint.proceed();

		logger.info("SecurityAspect: Method executed and returned: " +
				returnedValue);
		return returnedValue;
	}

}
