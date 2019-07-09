package com.smart.DTO;

import java.sql.Date;

public class UserSignInDto {
    private String name;
    private String userName;
    private String sex;
    private String  numberPhone;
    private String email;
    private String  brithday;
    private String password;

    UserSignInDto(String name,String userName,String sex,String numberPhone,String email,String brithday,String password){
        this.name=name;
        this.userName=userName;
        this.sex=sex;
        this.numberPhone=numberPhone;
        this.email=email;
        this.brithday=brithday;
        this.password=password;
    }
    UserSignInDto(){}

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String  getNumberPhone() {
        return numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String  getBrithday() {
        return brithday;
    }

    public String getSex() {
        return sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumberPhone(String  numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBrithday(String  brithday) {
        this.brithday = brithday;
    }

}
