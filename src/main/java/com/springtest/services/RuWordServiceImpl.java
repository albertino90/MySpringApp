package com.springtest.services;

import com.springtest.model.RuWord;
import com.springtest.repositories.RuWordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RuWordServiceImpl implements RuWordService {

    private final RuWordRepository ruWordRepository;

    @Override
    public RuWord getRuWord(Long id) {
        return ruWordRepository.getById(id);
    }

}
