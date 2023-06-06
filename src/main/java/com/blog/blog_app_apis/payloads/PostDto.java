package com.blog.blog_app_apis.payloads;

import com.blog.blog_app_apis.entities.Category;
import com.blog.blog_app_apis.entities.Post;
import com.blog.blog_app_apis.entities.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class PostDto{
    private int postId;
    private String title;
    private String content;
    private String imageName;
    private Date addDate;
    private Category category;
    private User user;
}
