package com.study.bank.service;

import com.study.bank.model.Account;
import com.study.bank.model.Transaction;
import java.util.List;

public interface AccountService {
    public Account save(Account account, Long userId);

    public List<Account> getAllAccounts(String userPhoneNumber);

    public void transfer(Transaction transaction);

    public Account getAccountByNumber(String accountNumber);

    public List<Transaction> getOperationsByAccountNumber(String accountNumber);

    public void blockAccount(String accountNumber);
}
