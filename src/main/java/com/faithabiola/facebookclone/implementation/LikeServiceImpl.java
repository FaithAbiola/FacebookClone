package com.faithabiola.facebookclone.implementation;

import com.faithabiola.facebookclone.entities.Comment;
import com.faithabiola.facebookclone.entities.Like;
import com.faithabiola.facebookclone.entities.Post;
import com.faithabiola.facebookclone.entities.User;
import com.faithabiola.facebookclone.repository.LikeRepository;
import com.faithabiola.facebookclone.service.LikeService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LikeServiceImpl implements LikeService {

    private final LikeRepository likeRepository;

    public LikeServiceImpl(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    @Override
    public void addLike(Like like) {
        likeRepository.save(like);
    }

    @Override
    public void removeLike(Long id) {
        likeRepository.deleteById(id);
    }

    @Override
    public Optional<Like> getPostLikeByUser(Post post, User user) {
        return likeRepository.findByPostsAndUsers(post, user);
    }

    @Override
    public Optional<Like> getCommentLikeByUser(Comment comment, User user) {
        return likeRepository.findByCommentsAndUsers(comment, user);
    }
}
