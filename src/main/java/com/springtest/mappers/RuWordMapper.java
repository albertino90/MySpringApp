package com.springtest.mappers;

import com.springtest.dto.RuWordDTO;
import com.springtest.model.RuWord;
import org.mapstruct.Mapper;

@Mapper
public interface RuWordMapper {

    RuWordDTO toDTO(RuWord ruWord);
}
