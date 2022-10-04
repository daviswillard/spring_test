package yesspring.services;


import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import yesspring.model.Comment;
import yesspring.proxies.CommentNotificationProxy;
import yesspring.repositories.CommentRepository;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(
            CommentRepository commentRepository,
            @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy
    ) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
