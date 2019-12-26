package com.springtest.controllers;

import com.springtest.dto.CardDTO;
import com.springtest.mappers.CardMapper;
import com.springtest.model.Card;
import com.springtest.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping("/cards/{id}")
    public CardDTO sayyyHello(@PathVariable Long id) {
        Card card = cardService.getCard(id);
        return cardMapper.toDTO(card);

    }


}
