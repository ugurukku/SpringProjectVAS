package com.example.demospring.service;

import com.example.demospring.entity.Blog;
import com.example.demospring.entity.User;

import java.util.List;

public interface BlogService {

    List<Blog> getAll();

    List<Blog> getAllByUser(int id);

    Blog getById(int id);

    void saveBlog(Blog blog);

    void deleteBlog(int id);

}
