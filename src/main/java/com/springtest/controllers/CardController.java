package com.springtest.controllers;

import com.springtest.dto.CardDTO;
import com.springtest.mappers.CardMapper;
import com.springtest.model.Card;
import com.springtest.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping("/cards/{id}")
    public CardDTO getCard(@PathVariable Long id) throws IOException {
        Card card = cardService.getCard(id);
        return cardMapper.toDTO(card);
    }

//    @PostMapping("/cards")
//    public ResponseEntity<?> saveCard(@RequestBody CardDTO cardDTO)throws IOException{
//
//        Card card = cardMapper.toEntity(cardDTO);
//        card = cardService.addCard(card);
//        cardDTO = cardMapper.toDTO(card);
//        return new ResponseEntity<>(cardDTO, HttpStatus.CREATED);
//    }


}
