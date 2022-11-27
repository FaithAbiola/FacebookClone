package com.faithabiola.facebookclone.service;

import com.faithabiola.facebookclone.entities.Comment;

public interface CommentService {

    Comment createComment(Comment comment);

    Comment getComment(Long id);

    void updateComment(Comment updateComment);

    void deleteComment(Long id);

}
