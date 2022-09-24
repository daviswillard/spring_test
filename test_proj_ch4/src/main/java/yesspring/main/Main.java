package yesspring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yesspring.model.Comment;
import yesspring.services.CommentService;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("Kamil");
        comment.setText("Ulelelele");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
