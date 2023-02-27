package com.login.loginregister.repository;

import com.login.loginregister.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    UserEntity findByEmail(String email);

    UserEntity findByPasswordAndEmail(String password,String email);
}
