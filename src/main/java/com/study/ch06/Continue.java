package com.study.ch06;

public class Continue {
    public static void main(String[] args) {
        for(int i =0; i < 10; i++) {
            System.out.println("i: "+i);
            if(i % 2 != 0) {
                continue;//만나면 밑에꺼 실행안한다 -> 홀수면 실행안된다
            }
            System.out.println("for문 마지막");// 홀수일때는 출력 안됨
        }
    }
}
