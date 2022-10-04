package ex00.aspects;

import ex00.models.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

	private Logger logger =
			Logger.getLogger(LoggingAspect.class.getName());

	/*перехват метода*/
	@Around("execution(* ex00.services.CommentService.publishComment(..))")
	public void log(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("Method will execute");
		joinPoint.proceed();
		logger.info("Method executed");
	}

	/*перехват метода и изменение возвращаемого значения*/
	@Around("execution(* ex00.services.CommentService.publishReturn(..))")
	public Object log2(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		Object [] arguments = joinPoint.getArgs();
		logger.info("Method " + methodName +
				" with parameters " + Arrays.asList(arguments) +
				" will execute");
		Object returnedByMethod = joinPoint.proceed();
		logger.info("Method executed and returned " + returnedByMethod);
		return returnedByMethod;
	}

	/*перехват метода и изменение передаваемого параметра*/
	@Around("execution(* ex00.services.CommentService.publishFailed(..))")
	public Object log3(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		Object [] arguments = joinPoint.getArgs();
		logger.info("Method " + methodName +
				" with parameters " + Arrays.asList(arguments) +
				" will execute");

		Comment comment = new Comment();
		comment.setText("Some other text!");
		Object[] newArguments = {comment};

		Object returnedByMethod = joinPoint.proceed(newArguments);
		logger.info("Method executed and returned " + returnedByMethod);
		return "MEMED";
	}
}
