package com.login.loginregister.service.impl;

import com.login.loginregister.entity.UserEntity;
import com.login.loginregister.repository.UserRepository;
import com.login.loginregister.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity fetchUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public UserEntity fetchUserByPasswordAndEmail(String password,String email) {
        return userRepository.findByPasswordAndEmail(password,email);
    }
}
