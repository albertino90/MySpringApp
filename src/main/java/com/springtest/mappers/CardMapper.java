package com.springtest.mappers;

import com.springtest.dto.CardDTO;
import com.springtest.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.io.IOException;

@Mapper
public interface CardMapper {
    @Mapping(source = "enWord", target = "enWordDTO")
    @Mapping(source = "ruWord", target = "ruWordDTO")
    @Mapping(source = "image", target = "imageDTO")

    CardDTO toDTO(Card card) throws IOException;
    Card toEntity(CardDTO cardDTO) throws IOException;

}
