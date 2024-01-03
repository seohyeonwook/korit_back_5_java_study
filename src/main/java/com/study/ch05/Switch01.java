package com.study.ch05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("번호 선택: ");
        num = scanner.nextInt();

        switch (num) { // 동일한 자료형으로 해줘야한다 ex)num이면 num String이면 String
            case 0:
                System.out.println("0선택");
                break;// 이거없이 0 입력하면 0,1,2 다 선택된다
            case 1:
                System.out.println("1선택");
                break;
            case 2:
                System.out.println("2선택");
                break;
            default:// 값이 없을때 나옴 if의 else랑 비슷함
                System.out.println("오류");

        }
    }
}
