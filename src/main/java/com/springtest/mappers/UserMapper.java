package com.springtest.mappers;

import com.springtest.dto.UserDTO;
import com.springtest.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    //    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDTO toDTO(User user);

}
