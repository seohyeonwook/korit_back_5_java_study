package com.study.ch07;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer1 = new Computer();// 객체를(인스턴스) 생성 //new붙으면 동적메모리 할당
        Computer computer2 = new Computer("노트북 ");// 함수호출인데 new는 생성자 호출
        //new해서 생성을하면 주소값이 들어간다 그래서 주소를 retrun하기때문에  retrun자료형 없음void

        System.out.println(computer1);
        System.out.println(computer2);//함수호출

        computer1.cpu = "i5";
        computer2.cpu = "i7";

        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);

        computer1.showInfo();//함수호출
        computer2.showInfo();

        computer1.ram = "8GB";
        computer2.ram = "16GB";

        computer1.showInfo();
        computer2.showInfo();

        computer1.type = "데스크탑";
    }
}
