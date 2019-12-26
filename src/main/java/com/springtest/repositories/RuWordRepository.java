package com.springtest.repositories;

import com.springtest.model.EnWord;
import com.springtest.model.RuWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuWordRepository extends CrudRepository<RuWord, Long> {
    RuWord getById(Long id);
}
