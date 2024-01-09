package com.study.ch07.member;

public class MemberRepository {

    int insert(Member member1) { //(자료형 +변수명) s
        System.out.println("저장소에 Member 저장");
        System.out.println(member1.toString());
        return 1;
    }
}
