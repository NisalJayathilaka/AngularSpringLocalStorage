package com.login.loginregister.entity;

import javax.persistence.*;

@Entity
@Table(name = "")
public class UserEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name = "user_email")
    private String email;
    @Column(name = "use_name")
    private String userName;
    @Column(name = "user_password")
    private String password;

    public UserEntity() {
    }

    public UserEntity(int userId, String email, String userName, String password) {
        this.userId = userId;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
