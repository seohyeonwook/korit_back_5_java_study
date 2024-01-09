//package com.study.ch10;
//
///*
//    [추상화]
//    1.추상클래스 abstract class - 공통점을 뽑아낸다
//    2.인터페이스 interface
// */
//
//public abstract class ElectronicDevice {//추상화
//    boolean powerState;
//
//    void setPowerOn() {
//        powerState = true;
//
//    }
//
//    void setPowerOff() {
//        powerState = false;
//
//    }
//
//    abstract void showDeviceState() ;//관계성을 주고싶어서abstract붙임
//    //추상메소드 = 추상클래스와 인터페이스에서만 정의 할 수 있다- 일반 클래스는 못함
//       // System.out.println("전원상태: "+ ((powerState)?"켜짐" : "꺼짐" ));
//
//    }
//}
