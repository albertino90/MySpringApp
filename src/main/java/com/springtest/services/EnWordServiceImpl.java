package com.springtest.services;

import com.springtest.model.EnWord;
import com.springtest.repositories.EnWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnWordServiceImpl implements EnWordService {

    private final EnWordRepository enWordRepository;

    @Override
    public EnWord getEnWord(Long id) {
        return enWordRepository.getById(id);
    }
}
