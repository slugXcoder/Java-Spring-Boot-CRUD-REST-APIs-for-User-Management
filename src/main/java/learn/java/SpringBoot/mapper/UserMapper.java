package learn.java.SpringBoot.mapper;

import learn.java.SpringBoot.dto.UserDto;
import learn.java.SpringBoot.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
    }

    public static User mapToUser(UserDto dto){
        return new User(
                dto.getId(),
                dto.getFirstName(),
                dto.getFirstName(),
                dto.getEmail()
        );
    }
}
