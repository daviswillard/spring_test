package ex00;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ex00.repository.*;
import ex00.service.*;

public class Main {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


		/* Для случая через Bean */
//		var commentService1 =
//				context.getBean("commentService", CommentService.class);
//		var commentService2 =
//				context.getBean("commentService", CommentService.class);

		/* Для случая через стереотипные аннотации */
		var s1 = context.getBean(CommentService.class);
		var s2 = context.getBean(UserService.class);
		System.out.println(s1.getCommentRepository() == s2.getCommentRepository());
	}
}