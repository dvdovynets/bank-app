package com.study.bank.repository;

import com.study.bank.model.Account;
import com.study.bank.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    public List<Account> findAccountsByUser(User user);

    public Optional<Account> findAccountByAccountNumber(String accountNumber);
}
