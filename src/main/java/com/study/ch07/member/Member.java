package com.study.ch07.member;

public class Member {
    String code;
    String name;
    int age;
    String address;

    Member(String code, String name, int age, String address) {//art insert constructor 누르면 자동으로 생성자만들어줌
        this.code = code;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {//메서드
        return "Member{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
