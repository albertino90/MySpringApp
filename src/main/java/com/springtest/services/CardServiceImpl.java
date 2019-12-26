package com.springtest.services;

import com.springtest.model.Card;
import com.springtest.repositories.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public Card getCard(Long id) {
        return cardRepository.getById(id);
    }
}
