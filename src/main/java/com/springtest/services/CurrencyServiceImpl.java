package com.springtest.services;

import com.springtest.model.Currency;
import com.springtest.repositories.CurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService {
    private final CurrencyRepository currencyRepository;

    @Override
    public Currency getCurrency(Long id) {
        return currencyRepository.getById(id);
    }

    @Override
    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }

    @Override
    public Currency addCurrency(Currency currency) {
        return currencyRepository.saveAndFlush(currency);
    }

    @Override
    public void deleteCurrency(Long id) {
        currencyRepository.deleteById(id);
    }
}
