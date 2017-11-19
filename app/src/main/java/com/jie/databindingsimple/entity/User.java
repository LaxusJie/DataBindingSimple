package com.jie.databindingsimple.entity;

/**
 * desc：用户实体
 * author：haojie
 * date：2017/11/19
 */
public class User {
    private final String firstName;
    private final String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}