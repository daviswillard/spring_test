package ex00.service;

import ex00.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private final CommentRepository commentRepository;

	@Autowired
	public UserService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
}
