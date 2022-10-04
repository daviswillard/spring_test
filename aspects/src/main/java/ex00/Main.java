package ex00;

import ex00.models.Comment;
import ex00.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);

		var service = context.getBean(CommentService.class);

		Comment comment = new Comment();
		comment.setText("Demo content");
		comment.setAuthor("Natasha");

		service.publishComment(comment);

		String value = service.publishReturn(comment);
		logger.info(value);

		value = service.publishFailed(comment);
		logger.info(value);
	}
}
