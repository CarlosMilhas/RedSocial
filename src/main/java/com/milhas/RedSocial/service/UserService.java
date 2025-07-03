package com.milhas.RedSocial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.milhas.RedSocial.model.User;
import com.milhas.RedSocial.repository.IUserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    IUserRepository myRepository;

    public void createUser(User user) {
        myRepository.save(user);
    }

    public List<User> getAllUsers() {

        return myRepository.findAll();
    }

    public User findById(long id) {

        return myRepository.findById(id).orElse(null);
    }

}
