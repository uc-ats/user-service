package io.avinash.ats.userservice.mapper;

import io.avinash.ats.userservice.model.dto.UserDto;
import io.avinash.ats.userservice.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    //UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto toDto(User user);
    List<UserDto> toDtoList(List<User> users);
}
