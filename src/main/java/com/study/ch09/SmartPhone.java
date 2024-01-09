package com.study.ch09;

public class SmartPhone extends ElectronicDevice {//일렉트로닉 한테 상속 받음
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다.");//깐트롤+o = 오버라이딩 단축키
    }

    @Override //@로 시작하면 어노테이션~
    void showDeviceState() {
        super.showDeviceState();
    }
    //    void showDeviceState() {
//        System.out.println("스마트폰 전원상태: "+ ((powerState)?"켜짐" : "꺼짐" ));

    }

