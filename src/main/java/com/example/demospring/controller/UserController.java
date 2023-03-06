package com.example.demospring.controller;

import com.example.demospring.entity.Blog;
import com.example.demospring.entity.User;
import com.example.demospring.manager.UserManager;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private final UserManager userManager;

    @GetMapping
    public List<User> getAll(){
        return userManager.getAll();
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable int id){
        return userManager.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveUser(@RequestBody User user){
        userManager.saveUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        userManager.deleteUser(id);
    }
}
