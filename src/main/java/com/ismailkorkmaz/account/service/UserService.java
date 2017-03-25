package com.ismailkorkmaz.account.service;

import com.ismailkorkmaz.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
