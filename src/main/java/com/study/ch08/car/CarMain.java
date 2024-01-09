package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {// 하나로 짠거임 기능별로 분류가 가능해야함
    //저장소repository 클래스; 데이터를 관리하는곳 배열을 가지고 와서 먼가를 하는것
    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null; //선언부
        boolean loopFlag = true; //무한루프 돌게끔 트루로

        Car[] cars = new Car[3];





        while(loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택>>>   ");
            selectedMenu= scanner.nextLine();//여기서 입력을 기다려야하기떄문에 무한루프를 멈춘다
            //여기서 입력을 했을때 어디로 갈지 결정을해줘야해
            if("q".equalsIgnoreCase(selectedMenu)) {// q눌렀을시 대소문자 안가리고
                System.out.println("프로그램 종료중....");
                loopFlag = false;//프로그램 종료로  loopFlag 가 false가 되어서 종료됨

            } else if("1".equalsIgnoreCase(selectedMenu)) {
                System.out.println("<<<자동차 등록 페이지>>>");//선택했을때 각각 이동 할 메뉴
                int emptyCount = 0;
                String model = null;
                String color = null;

                for(int i = 0; i < cars.length; i++) {
                    if(cars[i] == null) {
                        emptyCount++;
                    }

                }

                if(emptyCount == 0) {
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue;
                }


                System.out.println("모델명 >>>");//자동차라는 정보를 받는거임 자동차로 묶어줄수있어야해
                                                // 그래서 Car클래스 만들어서 정보기입
                model = scanner.nextLine();
                System.out.println("색상 >>>");
                color = scanner.nextLine(); //여기까지 자동차등록페이지 선택했을때 들어와서 순서

                Car car = new Car( model, color);
                System.out.println(car.toString());

                int emptyIndex = 0;
                for (int i = 0; i <cars.length; i++) {
                    if(cars[i] ==null) {//비어있는 인덱스 찾는거
                        emptyIndex = i;
                        break;

                    }
                }

               // Car car = new Car( model, color);// 생성할때 생성자로 넘겨주자 Car클래스 에 1번으로가서 생성자 만들자
                // 루프 돌떄마다 초기화 되니까 위로 빼주자 *
                //cars[0] = new Car( model, color);// 위에꺼 배열로 바꿔주자
               // System.out.println(cars[emptyIndex].toString());

                //System.out.println("Car(model = " + car.model + ", color=" +car.color+ ")");
                //이거 힘드니까 함수화 시키자 =toString (art + intsert 하면 다음줄
//                System.out.println(cars[0].toString());//이렇게 해도 위로 똑같음





            } else if ("2".equalsIgnoreCase(selectedMenu)) {
                System.out.println("<<<자동차 조회 페이지>>>");
                for(int i = 0 ; i <cars.length; i++) {
                    System.out.print("[" + i + "] > ");
                    if(cars[i] == null) {
                        System.out.print("x");//저렇게 나누는것보다 이렇게 하고 해석하는게 지금 이해가 더 돼
                        //저렇게하면 집가서 또 몰라 나는 어차피 지금 여기서 이해가 안됨
                        continue;
                    }
                    System.out.println(cars[i].toString());
                }


            } else {
                System.out.println("다시 입력하세요."); // 선택지 없는거 골랐을때
        }
        }
        System.out.println("프로그램이 종료되었습니다");


    }
}
