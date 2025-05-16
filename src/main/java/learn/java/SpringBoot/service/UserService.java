package learn.java.SpringBoot.service;

import learn.java.SpringBoot.dto.UserDto;
import learn.java.SpringBoot.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto dto);

    UserDto getUserById(long userId);

    List<UserDto> returnAllUsers();

    UserDto updateUser(UserDto dto);

    void deleteUser(long userId);
}
