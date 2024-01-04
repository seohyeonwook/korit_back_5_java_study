package com.study.ch07;

public class User001 { //생성자를 만드는거
    // 속성
    // username(아이디) - 필수
    // password(비밀번호) - 필수
    // name(이름)
    // email(이메일)

    // 메소드
    // setName(String name) - 메소드의 매개변수를 통해 name의 값을 변경
    // setEmail(String email) - 메소드의 매개변수를 통해 email의 값을 변경
    // showInfo() - 모든 속성값 출력

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
