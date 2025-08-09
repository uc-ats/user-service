package io.avinash.ats.userservice.service;

import io.avinash.ats.userservice.model.dto.UserDto;
import io.avinash.ats.userservice.model.entity.User;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();

    UserDto getUserByUsername(String username);

    void addUser(User user);
}
