package com.faithabiola.facebookclone.repository;

import com.faithabiola.facebookclone.entities.Comment;
import com.faithabiola.facebookclone.entities.Like;
import com.faithabiola.facebookclone.entities.Post;
import com.faithabiola.facebookclone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {

    Optional<Like> findByPostsAndUsers(Post posts, User users);
    Optional<Like> findByCommentsAndUsers(Comment comments, User users);
}
