package ex01.services;

import ex01.annotation.ToLog;
import ex01.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

	private Logger logger =
			Logger.getLogger(CommentService.class.getName());

	public String publishComment(Comment comment) {
		logger.info("Publishing comment:" + comment.getText());
		return "SUCCESS";
	}

	@ToLog
	public String deleteComment(Comment comment) {
		logger.info("Deleting comment:" + comment.getText());
		return "SUCCESS";
	}

	public void editComment(Comment comment) {
		logger.info("Editing comment:" + comment.getText());
	}
}
