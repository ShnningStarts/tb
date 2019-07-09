package com.smart.DTO;

import javax.swing.*;

public class UserFindDto {
    private String  userName;
    private String id;
    private String sex;
    private String age;
    private String address;

    public  UserFindDto(String userName,String id,String sex,String address){
        this.address=address;
        this.userName=userName;
        this.sex=sex;
        this.id=id;
    }
   public  UserFindDto(){}

    public String getSex() {
        return sex;
    }

    public String getUserName() {
        return userName;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

}
