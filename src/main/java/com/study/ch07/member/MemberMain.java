package com.study.ch07.member;//1번

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        String selectedMenu = null;//널을 주는이유??
        //String selecteMunu = new String("aaa")와 위에 똑같다

        while(true) {//참일동안 무한루프
            System.out.println("[[회원 관리 프로그램]]");
            System.out.println("1. 회원 등록");
            System.out.println("q. 프로그램 종료하기");

            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();//???

            if("1".equals(selectedMenu)) {//1과selectedMenu 같으면 참
               boolean responseData = memberService.addMember();//!!!!!!!!!!!!!!!!!!!!!??
                if(responseData) {
                    System.out.println("<<<회원 등록 완료>>>");
                } else {
                    System.out.println("<<<회원 등록 취소>>>");
                }

            } else if("q".equalsIgnoreCase(selectedMenu)) {
               //소문자 와 대문자 둘다 입력 가능하게하기위해서
                //equalsIgnoreCase 쓰면 대소문자 구분안함
                break;
            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("<<<<<< 프로그램이 종료되었습니다.>>>>>");//무한루프를 빠져나왔을때 =종료

    }

}
