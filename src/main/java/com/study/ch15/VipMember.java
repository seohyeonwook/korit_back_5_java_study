package com.study.ch15;

public class VipMember extends Member {//Member클래스 상속받음
    private final  String GAADE = "VIP";

    public VipMember(String name, String phone) {
        super(name, phone);// 노 아규가 없어서 VIP를 생성하려하면 무조건 멤버 객체는 올아규가 적용됨
    }
}
