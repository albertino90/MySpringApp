package com.springtest.mappers;

import com.springtest.dto.CardDTO;
import com.springtest.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CardMapper {
    @Mapping(source = "enWord", target = "enWordDTO")
    @Mapping(source = "ruWord", target = "ruWordDTO")
    CardDTO toDTO(Card card);

}
