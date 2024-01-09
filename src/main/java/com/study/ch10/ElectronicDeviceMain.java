package com.study.ch10;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        //익명 클래스
        ElectronicDevice electronicDevice = new ElectronicDevice() {
            @Override  //컨트롤 스페이스
            void showDeviceState() {
                System.out.println("첫번째 기기 상태확인");

            }
        };//일회용클래스

        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("2째 기기 상태확인");

            }
        };
        // 추상클래스는 생성을 할수 없다
        // 추상화는 완성 되지 않은 완성본이아니다 > 형태를 완성시켜줘야지만 생성가능
        // 추상적이면 안된다

        RemoteController remoteController = new RemoteController();

        //일반클래스는 생성 가능 ElectronicDevice 가 RemoteController 상속 되면서
        // 일반클래스가 되었다
    }
}
