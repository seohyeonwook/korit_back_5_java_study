package com.study.ch07;

public class Student01 {
        String name;
        int age;
        //     String address;
        final String address;//

        // 생성자 constructor
        // args(arguments) ==매개변수


//    Student01 () {//NoArgsConstructor final이 있으면 NoArgsConstructor 사용못함



    Student01(String name , int age, String address) {// AllArgsConstructor
        this.name = name;
        this.age = age;
        this.address = address;
    }
    Student01(String address) {//RequireaArgsConstructor
        this.address = address;
    }

}
