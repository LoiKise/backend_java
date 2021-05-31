package com.example.Mochi.controller;

import com.example.Mochi.entity.User;
import com.example.Mochi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping()
    public List<User>  getUsers(){
        return service.getUsers();
    }

    @GetMapping("/{userid}")
    public Optional<User> getUserById (@PathVariable("userid") int id){
        return service.getUserById(id);
    }
    @PostMapping()
    public String createUser(@RequestBody User user){
        return service.insertUser(user);
    }
    @PutMapping()
    public User updateUser (@RequestBody User user){
        return service.updateUser(user);
    }
    @PutMapping("/updatePassword")
    public User updatePassword(@RequestBody User passUser){
        return service.updatePassword(passUser);
    }

    @DeleteMapping("/{userid}")
    @ResponseBody
    public String deleteById(@PathVariable("userid") int id){
        service.deleteUserById(id);
        return "Successfully";
    }
}
