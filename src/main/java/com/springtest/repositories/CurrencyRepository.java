package com.springtest.repositories;

import com.springtest.model.Account;
import com.springtest.model.Currency;
import com.springtest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {

        Currency getById(Long id);
}
