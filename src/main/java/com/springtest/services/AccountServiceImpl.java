package com.springtest.services;

import com.springtest.model.Account;
import com.springtest.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{
    private final AccountRepository accountRepository;

    @Override
    public Account getAccount(Long id) {
        return accountRepository.getById(id);
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account addAccount(Account account) {
        return accountRepository.saveAndFlush(account);
    }

    @Override
    public void delete(Long id) {
        accountRepository.deleteById(id);
    }
//    @Override
//    public Account update(Account account) {
//        return null;
//    }

//    @Override
//    public Account findByCurrency_name(String name) {
//        return
//    }
}
