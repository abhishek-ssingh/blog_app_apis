package com.blog.blog_app_apis.services.impl;

import com.blog.blog_app_apis.entities.User;
import com.blog.blog_app_apis.payloads.UserDto;
import com.blog.blog_app_apis.repositories.UserRepo;
import com.blog.blog_app_apis.services.UserService;
import com.blog.blog_app_apis.exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    //linked with database
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDto createUser(UserDto userDto) {
        //since we are using userDto, lets convert it into
        //user and save it and return as converted to dto

        User user = this.dtoToUser(userDto);
        User savedUser = this.userRepo.save(user);

        return this.userToDto(savedUser);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Integer userId) {
        User user = this.userRepo.findById(userId)
                .orElseThrow(()-> new ResourceNotFoundException(
                "User", "id", userId
        ));

        return null;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }

    private User dtoToUser(UserDto userDto){
        //converting userDto to user
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setAbout(userDto.getAbout());
        user.setPassword(userDto.getPassword());

        return user;
    }

    private UserDto userToDto(User user){
        //converting user to userDto
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setAbout(user.getAbout());
        userDto.setPassword(user.getPassword());

        return userDto;
    }
}
