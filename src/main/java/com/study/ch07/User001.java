package com.study.ch07;

public class User001 {

    String username;
    String password;
    String name;
    String email;

    User001(String username, String password) {
        this.username = username;
        this.password = password;
    }
    User001(String username, String password, String name, String email) {
        this.username =username;
        this.password =password;
        this.name =name;
        this.email =email;
    }
    void showInfo(){
        System.out.println("username :"+ username);
        System.out.println("password :"+ password);
        System.out.println("name :"+ name);
        System.out.println("email :"+ email);
    }
    void setName(String name){
        this.name = name;
    }
    void setEmail(String email) {
        this.email = email;
    }








}
