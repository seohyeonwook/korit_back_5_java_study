package com.study.ch01;

public class 스마트폰 {

    String model;
    String color;

    스마트폰() {
        System.out.println("스마트폰 생성");
    }

    스마트폰(String model, String color) {
        this.model = model;
        this.color = color;
    }

    int 테스트() {
        return 10;
    }
}
