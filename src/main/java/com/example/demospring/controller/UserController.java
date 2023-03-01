package com.example.demospring.controller;

import com.example.demospring.entity.User;
import com.example.demospring.manager.UserManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
// adlandirma yoxdu
    private final UserManager userManager;

    public UserController(UserManager userManager) {
        this.userManager = userManager;
    }

    @GetMapping("/users")
    public List<User> getAll(){
        return userManager.getAll();
    }
    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id){
        return userManager.getById(id);
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody User user){
        userManager.saveUser(user);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id){
        userManager.deleteUser(id);
    }
}
