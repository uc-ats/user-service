package io.avinash.ats.userservice.service.impl;

import io.avinash.ats.userservice.mapper.UserMapper;
import io.avinash.ats.userservice.model.dto.UserDto;
import io.avinash.ats.userservice.model.entity.User;
import io.avinash.ats.userservice.repository.UserRepository;
import io.avinash.ats.userservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDto> getAllUsers() {
        var users = userRepository.findAll();
        return userMapper.toDtoList(users);
    }

    @Override
    public UserDto getUserByUsername(String username) {
        var user = userRepository.findByUsername(username);
        return userMapper.toDto(user);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
