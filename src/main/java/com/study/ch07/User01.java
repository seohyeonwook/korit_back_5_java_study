package com.study.ch07;

public class User01 { //생성자를 만드는거
    // 속성
    // username(아이디) - 필수
    // password(비밀번호) - 필수
    // name(이름)
    // email(이메일)

    // 메소드
    // setName(String name) - 메소드의 매개변수를 통해 name의 값을 변경
    // setEmail(String email) - 메소드의 매개변수를 통해 email의 값을 변경
    // showInfo() - 모든 속성값 출력

    String username;// User01로 묶는거잖아 그래서 다른 코드가 추가 되어도 여기만 바꾸면 되게
    String password;
    String name;
    String email;

    User01(String username, String password) {//1번
        this.username = username;
        this.password = password;
    }
    User01(String username, String password, String name, String email) {//2번
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;

    }

    void showInfo() {//3번
        System.out.println("username: "+ username);
        System.out.println("password: "+ password);
        System.out.println("name: "+ name);
        System.out.println("email: "+ email);

    }
    void setName(String name) {
        this.name = name;
    }
    void setEmail(String email) {
        this.email = email;
    }
    //this 하면






}
