package com.springtest.services;

import com.springtest.model.Account;
import com.springtest.model.User;

import java.util.List;

public interface AccountService {

    Account getAccount(Long id);
    List<Account>findAll();
    Account addAccount(Account account);
    void delete(Long id);
//    Account update(Account account);
//    Account findByCurrency_name(String name);

}
