package yesspring.proxies;

import yesspring.model.Comment;

public interface CommentNotificationProxy {
    void    sendComment(Comment comment);
}
