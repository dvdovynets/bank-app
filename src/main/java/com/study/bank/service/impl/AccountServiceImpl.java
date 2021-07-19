package com.study.bank.service.impl;

import com.study.bank.model.Account;
import com.study.bank.model.Transaction;
import com.study.bank.model.User;
import com.study.bank.repository.AccountRepository;
import com.study.bank.repository.UserRepository;
import com.study.bank.service.AccountService;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final UserRepository userRepository;

    public AccountServiceImpl(AccountRepository accountRepository,
                              UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Account save(Account account, Long userId) {
        User user = userRepository.findById(userId).orElseThrow();
        account.setUser(user);
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccounts(String userPhoneNumber) {
        User user = userRepository.getUserByPhoneNumber(userPhoneNumber).orElseThrow();
        return accountRepository.findAccountsByUser(user);
    }

    @Override
    public void transfer(Transaction transaction) {
        //TODO: Deal later
    }

    @Override
    public Account getAccountByNumber(String accountNumber) {
        return accountRepository.findAccountByAccountNumber(accountNumber).orElseThrow();
    }

    @Override
    public List<Transaction> getOperationsByAccountNumber(String accountNumber) {
        //TODO: Deal later
        return new LinkedList<>();
    }

    @Override
    public void blockAccount(String accountNumber) {
        //TODO: Later
    }
}
