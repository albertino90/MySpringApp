package com.springtest.controllers;

import com.springtest.dto.EnWordDTO;
import com.springtest.mappers.EnWordMapper;
import com.springtest.model.EnWord;
import com.springtest.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;
    private final EnWordMapper enWordMapper;

    @GetMapping("/en-words/{id}")
    public EnWordDTO sayHello(@PathVariable Long id) {
        EnWord enWord = enWordService.getEnWord(id);
        return enWordMapper.toDTO(enWord);

    }


}
