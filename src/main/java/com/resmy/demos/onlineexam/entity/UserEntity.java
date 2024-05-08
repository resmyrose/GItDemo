package com.resmy.demos.onlineexam.entity;

import jakarta.persistence.Entity;

@Entity
public class UserEntity {
    private long userId;
    private long roleId;
    private String userName;
    private String email;

    public UserEntity() {
    }

    public UserEntity(long userId,long roleId, String userName, String email) {
        this.userId = userId;
        this.roleId = roleId;
        this.userName = userName;
        this.email = email;
    }

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId){
        this.userId = userId;
    }
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String  toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
