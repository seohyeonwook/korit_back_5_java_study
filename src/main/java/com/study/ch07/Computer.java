package com.study.ch07;

public class Computer { //class 객체를 찍어낼수있는 틀
    String type;
    String cpu;
    String ram;//class 안에 정의된 함수는 메소드라고 부른다
    String disk;//자바는 다 Class안에 있기때문에 그냥 다 메소드라고 부른다

    Computer() {//근데 이건 클래스의 이름과 같다 대문자도 같다
        //생성자
        // 1. 클래스의 이름과 동일하다.
        // 2. 메소드의 형태이다.
        type = "컴퓨터";

    }
    Computer(String type) {//오버로딩

        this.type = type;

    }

    void showInfo() {//변수와 메소드는 소문자로 시작해야한다 //void는 retrun자료형
        System.out.println("type: " + type);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        System.out.println("disk: " + disk);
    }

}
