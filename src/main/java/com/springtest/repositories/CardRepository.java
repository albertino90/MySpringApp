package com.springtest.repositories;

import com.springtest.model.Card;
import com.springtest.model.EnWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
    Card getById(Long id);
}
