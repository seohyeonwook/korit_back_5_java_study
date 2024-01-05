package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {
    public static void main(String[] args) {
         // int[] array  =   new--- (생성자 new)
         // 자료형  변수  대입   값
        //int[] []배열 - 정수배열 자료형만 들어가야함
        //배열을 만들때는 무조건new가 들어감 new = 생성 = 힙메모리 할당 = 메모리 공간 빌리는것(동적 메모리 할당)
        //동적 ㅁㅔ모리 -> 빌려서 쓰고 줄게
        //배열은 크기를 조절할수 없다 -> 새로만들고 옮기면 된다(1)
        //자료형에는 다 배열이 들어간다 배열안에도 배열이있다
        // 배열(Array) 사용이유 : !순서대로! 데이터를 묶어서 사용하기 위해서
                               // 비슷한 변수명이라도 메모리에 순서없이 저장하기때문
        //int 형 배열에서는 index 사용 ex) 0= 100, 1= 104 2= 108 4바이트 단위로 주소가 바뀐다
        int num1 = 10;
        int num2 = 20;
        int[] numArray; //메모리 할당//선언 numArray<<변수명

        //new int[3] // int3개를 엮어서 메모리할당한거다 대신 값은 없음 이대로//
        numArray = new int[3]; // 값 (주소) 대입
        System.out.println(numArray);//주소

        System.out.println(numArray[0]);//numArray[0] 0은변수명 아님 인덱스임 프로그램 실행중에 인덱스는 바꿀수있다

        numArray[0] = 10;
        System.out.println(numArray[0]);//10을 넣은상태 순서대로 생각하자

        numArray[1] = 20;
        numArray[2] = 30;
        Scanner scanner = new Scanner(System.in);
        System.out.println("인덱스: ");
        int index = scanner.nextInt();
        System.out.println(numArray[index]);//인덱스는 바꿀수 있다는게 이말 하지만
                                            // 인덱스 자리에 num1넣으면 이미 정해져있는 값이라 못바꿈
    }
}
