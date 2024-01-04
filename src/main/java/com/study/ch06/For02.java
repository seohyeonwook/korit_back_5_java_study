package com.study.ch06;

import javax.sound.midi.SoundbankResource;

public class For02 {
    public static void main(String[] args) {
        /*
        0, 1, 2, 3, 4
        5, 6, 7, 8, 9
         */
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i % 5 != 4) {
                System.out.print(", ");
            } else if (i % 5 == 4) {
                System.out.println();
            }
            //나머지가 4가 아닐때 쉼표를 찍어라
            // 0 1 2 3 4는 5보다 작기떄문에 나머지가 01234
            // 숫자 4일때 나머지 4
        }
        System.out.println();

        for (int i = 0; i < 5; i++) { //3  //줄//이게 참일때까지 하위에서 실행해라
            for (int j = 0; j < i +1  ; j++) {//1 //칸
                System.out.print("*");//
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) { //i는 1씩 높아진다
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        }

    }




