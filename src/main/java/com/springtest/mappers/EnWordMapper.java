package com.springtest.mappers;

import com.springtest.dto.EnWordDTO;
import com.springtest.model.EnWord;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnWordMapper {
    EnWordMapper INSTANCE = Mappers.getMapper(EnWordMapper.class);

    EnWordDTO toDTO(EnWord enWord);
}
