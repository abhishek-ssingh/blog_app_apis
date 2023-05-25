package com.blog.blog_app_apis.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    //using this we will expose the things we want to expose
    //and hide the original entities
    private int id;
    private String name;
    private String email;
    private String password;
    private String about;

}
