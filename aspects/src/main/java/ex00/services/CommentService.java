package ex00.services;

import ex00.models.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

	private Logger logger =
			Logger.getLogger(CommentService.class.getName());

	public void publishComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
	}

	public String publishReturn(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
		return "RETURN";
	}

	public String publishFailed(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
		return "Failed";
	}
}
