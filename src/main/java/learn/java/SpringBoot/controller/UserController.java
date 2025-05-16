package learn.java.SpringBoot.controller;

import jakarta.validation.Valid;
import learn.java.SpringBoot.dto.UserDto;
import learn.java.SpringBoot.entity.User;
import learn.java.SpringBoot.exception.ErrorDetails;
import learn.java.SpringBoot.exception.ResourceNotFoundException;
import learn.java.SpringBoot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private UserService userService;

    @PostMapping("create")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto dto){
        UserDto savedUserReturn = userService.createUser(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedUserReturn);
    }

    @GetMapping("{Id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("Id") long userId){
        UserDto getUser = userService.getUserById(userId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(getUser);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> returnAllUsers(){
        List<UserDto> allUsers = userService.returnAllUsers();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(allUsers);
    }

    @PutMapping("{id}/update")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") long pid,@Valid @RequestBody UserDto dto){
        dto.setId(pid);
        UserDto updateUser = userService.updateUser(dto);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(updateUser);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") long pid){
        userService.deleteUser(pid);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Record Deleted Successfully");
    }

//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ErrorDetails> resourceNotFoundException(ResourceNotFoundException exception, WebRequest request){
//        ErrorDetails errorDetails = new ErrorDetails(
//                LocalDateTime.now(),
//                exception.getMessage(),
//                request.getDescription(false),
//                "1.User Not Found"
//        );
//        return ResponseEntity
//                .status(HttpStatus.NOT_FOUND)
//                .body(errorDetails);
//    }
}
