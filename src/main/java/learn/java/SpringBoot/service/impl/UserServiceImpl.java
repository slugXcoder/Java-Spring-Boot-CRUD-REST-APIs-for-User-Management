package learn.java.SpringBoot.service.impl;
import learn.java.SpringBoot.dto.UserDto;
import learn.java.SpringBoot.entity.User;
import learn.java.SpringBoot.exception.ResourceNotFoundException;
import learn.java.SpringBoot.mapper.UserMapper;
import learn.java.SpringBoot.repository.UserRepository;
import learn.java.SpringBoot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto dto) {

        //convert userDto into user jpa entity
        User user = UserMapper.mapToUser(dto);
        User savedUser = userRepository.save(user);

        //convert user jpa entity into userDto

        return UserMapper.mapToUserDto(savedUser);


    }

    @Override
    public UserDto getUserById(long userId) {


        User optionalUser = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User","id",userId)
        );
        return UserMapper.mapToUserDto(optionalUser);
    }

    @Override
    public List<UserDto> returnAllUsers() {
        List<User> users= userRepository.findAll();

        //convert list of users to list of user DTO and return

        return users.stream().map(UserMapper::mapToUserDto).collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(UserDto dto) {

        //convert user dto to user jpa
        User user = UserMapper.mapToUser(dto);
        User existingUser = userRepository.findById(user.getId()).orElseThrow(
                () -> new ResourceNotFoundException("User","id",user.getId())
        );
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());

        //convert user jpa to user dto
        return UserMapper.mapToUserDto(userRepository.save(existingUser));
    }

    @Override
    public void deleteUser(long userId) {
        User existingUser = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User","id",userId)
        );
        userRepository.deleteById(userId);
    }
}
