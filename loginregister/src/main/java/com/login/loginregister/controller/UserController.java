package com.login.loginregister.controller;

import com.login.loginregister.entity.UserEntity;
import com.login.loginregister.service.UserService;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1/user")
@CrossOrigin()
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public UserEntity registerUser(@RequestBody UserEntity userEntity) throws Exception {
        String tempEmail = userEntity.getEmail();
        if(tempEmail != null && !"".equals(tempEmail)){
            UserEntity userObject = userService.fetchUserByEmail(tempEmail);
            if(userObject != null){
                throw new Exception("User is already exist");
            }
        }
        return userService.saveUser(userEntity);
    }

    @PostMapping("/login")
    public UserEntity loginUser(@RequestBody UserEntity userEntity) throws Exception{
        String tempPass = userEntity.getPassword();
        String tempEmail = userEntity.getEmail();
        UserEntity user= null;
        if(tempPass !=null && tempEmail !=null) {
            user =  userService.fetchUserByPasswordAndEmail(tempPass, tempEmail);
        }
        if(user == null){
            throw new Exception("login failed");
        }
        return  user;
    }
}
