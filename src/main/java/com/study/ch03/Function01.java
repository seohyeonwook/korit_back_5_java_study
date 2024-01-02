package com.study.ch03;

public class Function01 {// 함수쓰는 목적 1. 자주 재사용 하는것 2. 코드가 너무 길어져서 기능적으로 분리시키고싶을때
    public static void main(String[] args) {
        fx3();// 따로 두고 호출하면 가독성 높아짐 클린코드
        System.out.println(fx1(1,2,3,4,5));// 각각abcde에 들어간다 //함수 호출(콜)이라고 부름
        fx2("서현욱");

    }
    // 함수는 정의한다 표현 변수나 상수는 선언한다라고 한다
    static int fx1(int a, int b, int c, int d, int e) {
        return a + b * c - d * e;
    }
    static void fx2(String name) {
        System.out.println("이름은 " + name + " 입니다.");
    }

    static void fx3(){
        System.out.println(1 + 2 * 3 / 2 * 3);
        System.out.println(1 + 2 * 3 / 2 * 3);
        System.out.println(1 + 2 * 3 / 2 * 3);
    }
}
