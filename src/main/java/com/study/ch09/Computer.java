package com.study.ch09;

public class Computer extends ElectronicDevice {//일렉트로닉 한테 상속 받음
    String cpu;
    int ram;

    void playGame() {
        System.out.println(" PC 게임을 합니다. ");
    }

    void showDeviceState( ) {//부모의 메소드와 동일한 메소드 형태로 실행문만
                             //실행문만 다시 정의할 수 있다
        System.out.print("콤푸타");
        super.showDeviceState();
//    void showDeviceState() {//오버라이드 재정의
//        System.out.println(" 컴퓨터 전원상태: "+ ((powerState)?"켜짐" : "꺼짐" ));

    }
}
