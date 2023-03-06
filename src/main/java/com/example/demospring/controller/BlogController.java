package com.example.demospring.controller;

import com.example.demospring.entity.Blog;
import com.example.demospring.entity.User;
import com.example.demospring.manager.BlogManager;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
@AllArgsConstructor
public class BlogController {

    private final BlogManager manager;

    @GetMapping
    public List<Blog> getAll(){
        return manager.getAll();
    }

    @GetMapping("/{id}")
    public Blog getById(@PathVariable int id){
        return manager.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveUser(@RequestBody Blog blog){
        manager.saveBlog(blog);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        manager.deleteBlog(id);
    }

}
