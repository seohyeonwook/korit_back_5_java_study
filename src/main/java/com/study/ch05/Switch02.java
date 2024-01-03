package com.study.ch05;

import java.util.Scanner;

public class Switch02 { //리턴타입이 있다 void가 없으니까 무조건 리턴값을 넣어야한다
    public static boolean select () {//중괄호가 열리고 닫히면 지역이 나뉜다라고 생각
                                     //각각의 중괄호 안에서는 변수이름이 중복돼도 된다
                                     //상위 중괄호안에 중괄호 속해 있으면 중복xx

        Scanner scanner = new Scanner(System.in);
        System.out.print("여기서 멈출까요(y/n)? ");
        String value = scanner.next();
        return "y".equals(value) || "Y".equals(value);
        }

    public static void main(String[] args) {//함수안에서 함수는정의 못함
        int num = 1;

        System.out.println("게임 시작");
        switch (num) {
            case 1:
                System.out.println("1단계 시작");
                if (select()) {
                    break;//명령문이라 리턴불가
                }
                    case 2:
                        System.out.println("2단계 시작");
                        if (select()) {
                            break;
                        }
                    case 3:
                        System.out.println("3단계 시작");
                        if (select()) {
                            break;
                        }
                    case 4:
                        System.out.println("4단계 시작");
                        if (select()) {
                            break;
                        }
                    case 5:
                        System.out.println("마지막단계 시작");
                }

        }


    }