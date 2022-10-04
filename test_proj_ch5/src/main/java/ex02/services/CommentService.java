package ex02.services;

import ex02.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

	private final CommentRepository commentRepository;

//	@Autowired - необязательно
	public CommentService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
}
