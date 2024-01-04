package com.study.ch05;

import java.util.Scanner; // 외부에서 가지고 올거야

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //컨트롤 스페이스 = 자동 변수명 ,out in 이해하기


        System.out.print("a: ");
        int a =scanner.nextInt();//기본적으로 문자열로 가지고 온다 그래서 숫자는 nextint 쓴다

        System.out.println("b: ");//ln은 기본적으로 줄바꿈
        int b =scanner.nextInt();

        System.out.print("c: ");
        int c =scanner.nextInt();

        scanner.nextLine();//이렇게하면 int enter가 씹혀서 타이틀 띄어쓰기가 된다
        System.out.print("타이틀: ");
        String title = scanner.nextLine();//next는 띄어쓰기 인식 못함 띄어쓰기 인식하려면 nextLine

        System.out.println("결과: " + (a + b + c));
    }
}
