package ex01;

import ex01.model.Comment;
import ex01.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
	private Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		CommentService service = context.getBean(CommentService.class);

		Comment comment = new Comment();
		comment.setText("Some kind of text");
		comment.setAuthor("Kamil");

//		service.publishComment(comment);
		service.deleteComment(comment);
//		service.editComment(comment);
	}
}
