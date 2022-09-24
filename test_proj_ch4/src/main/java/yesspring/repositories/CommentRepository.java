package yesspring.repositories;

import yesspring.model.Comment;

public interface CommentRepository {
    void    storeComment(Comment comment);
}
