package com.springtest.mappers;

import com.springtest.dto.EnWordDTO;
import com.springtest.model.EnWord;
import org.mapstruct.Mapper;

@Mapper
public interface EnWordMapper {

    EnWordDTO toDTO(EnWord enWord);

}
