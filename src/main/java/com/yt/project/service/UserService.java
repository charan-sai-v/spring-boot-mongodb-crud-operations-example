package com.yt.project.service;

import com.yt.project.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    User createUser(User user);
    User getUserById(String id);
    List<User> getUsers();
    User updateUserById(String id, User user);
    void deleteUserById(String id);

}
