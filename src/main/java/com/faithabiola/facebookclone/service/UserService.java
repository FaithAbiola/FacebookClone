package com.faithabiola.facebookclone.service;

import com.faithabiola.facebookclone.entities.User;

public interface UserService {
    User createUser(User user);

    User findUserByUsernameAndPassword(User user);

    User findById(Long id);
}
