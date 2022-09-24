package nospring.repositories;

import nospring.model.Comment;

public interface CommentRepository {
    void    storeComment(Comment comment);
}
