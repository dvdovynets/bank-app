package com.study.bank.repository;

import com.study.bank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User getUserByPhoneNumber(String phoneNumber);
}
