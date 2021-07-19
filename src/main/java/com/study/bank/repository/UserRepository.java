package com.study.bank.repository;

import com.study.bank.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> getUserByPhoneNumber(String phoneNumber);

    public void deleteById(Long id);
}
