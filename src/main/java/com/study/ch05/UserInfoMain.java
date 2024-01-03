package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        /*
          이름: 서현욱
          나이: 33
          연락처: 01065518287 //0은 숫자로인식안돼서 문자열로해야함
          학년: 4
          주소: 부산 동래구
         */
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String phone = null;
        int grade = 0;
        String address = null; //변수 선언은 제일위로 올려서 가독성 올린다

        System.out.print("이름");
        name = scanner.nextLine();

        System.out.print("나이");
        age = scanner.nextInt();

        System.out.print("연락처");
        scanner.nextLine();
        phone = scanner.nextLine(); //nextLine쓰는애는 위에 nextLine하나 더 쓴다

        System.out.print("학년");
        grade = scanner.nextInt();

        System.out.print("주소");
        scanner.nextLine();
        address = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("학년: " + grade);
        System.out.println("주소: " + address);


    }
}
