package com.smart.DTO;

public class UserLogginDto {
    private String name;
    private String userName;
    private String email;
    private Character  numberPhone;
    private String password;
UserLogginDto(String userName,String name,String email,Character numberphone,String password){
    this.name=name;
    this.email=email;
    this.numberPhone=numberphone;
    this.password=password;


}
    UserLogginDto(){}
    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public Character getNumberPhone() {
        return numberPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {


        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumberPhone(Character numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
