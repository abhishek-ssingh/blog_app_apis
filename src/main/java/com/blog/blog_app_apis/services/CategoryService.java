package com.blog.blog_app_apis.services;

import com.blog.blog_app_apis.payloads.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
    List<CategoryDto> getAllCategories();
    CategoryDto getCategoryById(Integer categoryId);
    void deleteCategory(Integer categoryId);
}
