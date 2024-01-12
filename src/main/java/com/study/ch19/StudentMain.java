package com.study.ch19;

public class StudentMain {
    public static void main(String[] args) {
        Student student =Student.Builder().name("ddd").address("dddd").age(2222).build();

        System.out.println(student);
    }
}
