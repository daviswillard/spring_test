package nospring.proxies;

import nospring.model.Comment;

public interface CommentNotificationProxy {
    void    sendComment(Comment comment);
}
