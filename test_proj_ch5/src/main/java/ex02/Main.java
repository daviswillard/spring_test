package ex02;

import ex02.services.CommentService;
import ex02.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);


		/* Для случая @Bean */
//		var cs1 =
//				context.getBean("commentService", CommentService.class);
//		var cs2 =
//				context.getBean("commentService", CommentService.class);
//		System.out.println(cs1 == cs2);
		var cs = context.getBean(CommentService.class);
		var us = context.getBean(UserService.class);

		System.out.println(cs.getCommentRepository() == us.getCommentRepository());
	}
}
