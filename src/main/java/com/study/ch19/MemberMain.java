package com.study.ch19;

public class MemberMain {
    public static void main(String[] args) {
        Member member = Member.builder().name("dddd").phone("23323").build();
        System.out.println(member);
    }
}
