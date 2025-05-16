package learn.java.SpringBoot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private long id;

    @NotEmpty(message = "Should not be empty")
    private String firstName;

    @NotEmpty(message = "Should not be empty")
    private String lastName;

    @NotEmpty(message = "Should not be empty")
    @Email(message = "Should be valid")
    private String email;
}
