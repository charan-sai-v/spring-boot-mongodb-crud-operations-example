package com.yt.project;

import com.yt.project.model.User;
import com.yt.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ClientController {
    @Autowired
    private UserService userService;

    @PostMapping("user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PutMapping("user/{id}")
    public User updateUserById(@PathVariable String id, @RequestBody User user){
        return userService.updateUserById(id, user);
    }

    @DeleteMapping("user/{id}")
    public String deleteUserById(@PathVariable String id){
        userService.deleteUserById(id);
        return "User Deleted Successfully";
    }

}
