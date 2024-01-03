package com.study.ch06;

import java.util.Scanner;

public class Meun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;//true라서 무한반복

        while(flag) {
            System.out.println("입력: ");
            int inputValue = scanner.nextInt();

            System.out.println("입력한 번호: " + inputValue);
            if(inputValue == 0) {
                System.out.println("프로그램을 종료합니다.");
                flag = false;// 0누르면 false로 바껴서 프로그램 종료
            } else if(inputValue == 1) {
                System.out.println("1번으로 들어왔습니다.");
                while(true) {
                    System.out.println("1번에서 입력: ");
                   inputValue = scanner.nextInt();

                    System.out.println("입력한 번호: " + inputValue);
                    if(inputValue == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        flag = false;
                        break; // 0누르면 false로 바껴서 프로그램 종료
                    }else if(inputValue == -1) {
                            System.out.println("뒤로가기.");
                        break; //밖으로 나가서 다시 돈다-> false가 없다
                    } else if(inputValue == 1) {
                        System.out.println("1번에서 1번으로 들어왔습니다.");
                    } else if(inputValue == 2) {
                        System.out.println("1번에서 2번으로 들어왔습니다.");
                    } else {
                        System.out.println("다시입력하세요.");
                    }
                    System.out.println();
                }
            } else if(inputValue == 2) {
                System.out.println("2번으로 들어왔습니다.");
            } else {
                System.out.println("다시입력하세요.");
            }
            System.out.println();
        }
    }
}
