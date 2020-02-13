package com.springtest.services;

import com.springtest.model.Currency;
import com.springtest.model.User;

import java.util.List;

public interface CurrencyService {

    Currency getCurrency(Long id);
    List<Currency>findAll();
    Currency addCurrency(Currency currency);
    void deleteCurrency (Long id);
//    User updateCurrency (Currency currency);

}
