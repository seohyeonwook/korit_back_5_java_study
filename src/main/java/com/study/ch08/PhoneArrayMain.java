package com.study.ch08;

public class PhoneArrayMain {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];//공간이 3개가 생긴거지 객체가 3개가 만들어진건아님
        phones[0] = new Phone("삼성", "갤럭시"); //이게 객체
        phones[1] = new Phone("애플", "아이폰"); //이게 객체
        phones[2] = new Phone("샤오미", "miPhone"); //이게 객체
        Phone p1 = new Phone ("삼성", "갤럭시");


        for(int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].toString());
        }
        int [] nums = new int[3];
    }
}
