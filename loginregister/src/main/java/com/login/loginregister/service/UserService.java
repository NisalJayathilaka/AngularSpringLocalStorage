package com.login.loginregister.service;

import com.login.loginregister.entity.UserEntity;

public interface UserService {
    UserEntity saveUser(UserEntity userEntity);

    UserEntity fetchUserByEmail(String email);

    UserEntity fetchUserByPasswordAndEmail(String password,String email);
}
