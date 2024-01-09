package com.study.ch09;

public class ElectronicDeviceMain {

    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[2];
        //자료형 먼저 좀 확인하는 버릇 가지자
        // 업캐스팅 -자식대의 메서드 사용 못하지만 부모와 교집합은 사용가능


        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();//재정의 우선 오버라이딩 ㄴ이ㅏ러ㅣㄴ아렁니ㅏ런이ㅏ머리ㅏㄴㅇㄹ
        }
        System.out.println();

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }
        System.out.println();
        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
        //업캐스팅 하면 자식의 메서드 재정의 돼서 자식이 우선순위가 된다
        // 그래서 부모가 기존에 가지고 있던 메서드 사용불가
        // 다운캐스팅 하면 쓸수있다
        //업캐스팅 안하면 다운캐스팅 못한다
        //생성된 객체 = 인스턴스
        //객체 = 생성할수 있는대상
        for (int i = 0; i < electronicDevices.length; i++) {
            if (electronicDevices[i] instanceof Computer) {
                Computer computer = (Computer) electronicDevices[i];//()가고자하는거 그러니까 컴푸타
                computer.playGame();
            } else if (electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();// 이건안씀
            }

        }


    }
}
