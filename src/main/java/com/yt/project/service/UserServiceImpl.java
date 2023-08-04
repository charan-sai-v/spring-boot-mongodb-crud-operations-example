package com.yt.project.service;

import com.yt.project.model.User;
import com.yt.project.repostiory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUserById(String id, User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }
}
