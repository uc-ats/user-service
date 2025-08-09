package io.avinash.ats.userservice.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class UserDto {
    private String username;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String email;
    private String phoneNo;
}
