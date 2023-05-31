package com.blog.blog_app_apis.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;

    @NotEmpty
    @Size(min = 8, message = "Username should be more than 8 characters")
    private String name;

    @Email(message = "Pls follow email format")
    private String email;

    @NotEmpty
    @Size(min = 8, max = 10, message = "Password should be within 8 to 10 characters")
    private String password;

    @NotEmpty(message = "About can't be empty")
    private String about;

}
