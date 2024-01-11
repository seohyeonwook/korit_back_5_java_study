package com.study.ch18;

@FunctionalInterface//람다형은 함수형 인터페이스
public interface Addition   {
    public int add(int x, int y);//기본 메서드가 추상으로 돼서 추상은  중괄호를 안하고;로 끝낸다
}
