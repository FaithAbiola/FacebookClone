package com.faithabiola.facebookclone.service;

import com.faithabiola.facebookclone.entities.Comment;
import com.faithabiola.facebookclone.entities.Like;
import com.faithabiola.facebookclone.entities.Post;
import com.faithabiola.facebookclone.entities.User;

import java.util.Optional;

public interface LikeService {
    void addLike(Like like);
    void removeLike(Long id);

    Optional<Like> getPostLikeByUser(Post post, User user);
    Optional<Like> getCommentLikeByUser(Comment comment, User user);
}
