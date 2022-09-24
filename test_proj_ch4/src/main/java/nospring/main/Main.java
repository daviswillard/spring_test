package nospring.main;

import nospring.model.Comment;
import nospring.proxies.EmailCommentNotificationProxy;
import nospring.repositories.DBCommentRepository;
import nospring.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository =
                new DBCommentRepository();
        var commentNotificationProxy =
                new EmailCommentNotificationProxy();
        var commentService =
                new CommentService(
                        commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Kamil");
        comment.setText("Ulelelele");

        commentService.publishComment(comment);
    }
}
