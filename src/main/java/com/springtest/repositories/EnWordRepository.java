package com.springtest.repositories;

import com.springtest.model.EnWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnWordRepository extends CrudRepository<EnWord,Long> {
    EnWord getById(Long id);
}
