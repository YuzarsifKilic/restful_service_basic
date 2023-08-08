package com.yuzarsif.restful_service_basic.mapper;

import com.yuzarsif.restful_service_basic.dto.UserDto;
import com.yuzarsif.restful_service_basic.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
