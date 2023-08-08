package com.yuzarsif.restful_service_basic.dto;

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

    private Long id;
    // User first name should not be null or empty
    @NotEmpty
    private String firstName;
    // User last name should not be null or empty
    @NotEmpty
    private String lastName;
    // User email should not be null or empty
    @NotEmpty
    @Email
    private String email;
}
