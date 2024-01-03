package com.study.ch06;

public class For01 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println("i: " +i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println("i: " + i);
            i++;
        }//for는 반복횟수가 정해져있고 반복횟수를 일정하게 증가될때 (반복횟수 중심)
         //while 조건이 중심
    }
}
