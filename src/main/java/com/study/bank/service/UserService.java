package com.study.bank.service;

import com.study.bank.model.User;

public interface UserService {
    public void save(User user);

    public void remove(Long id);

    public User findUserById(Long id);

    public User findUserByPhoneNumber(String phoneNumber);
}
