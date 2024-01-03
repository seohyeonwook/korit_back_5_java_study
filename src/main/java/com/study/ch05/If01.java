package com.study.ch05;

public class If01 {
    public static void main(String[] args) {
        // 조건문 연산의 결과가 true flase값만 온다
        int i = 3;
        if(i > 3) {
            System.out.println("i가 3보다 큽니다");
            System.out.println("if문 종료");//참이면 두개가 묶여서 실행 된다
        } else if( i == 3) {//중첩가능
            System.out.println("i가 3입니다.");
        } else {
            System.out.println("i가 3보다 작습니다.");
        }


        // 삼항연산자는 함수적용이 안된다
        // ex) i > 3 ? System.out.println("i가 3보다 큽니다") : "";//이렇게 실행하면 오류남
        // println은 return값이 없다
        String tempStr = i > 3 ? print("i가 3보다 큽니다") : "";// 밑에 String 을 불러오는거라 오류안남
    }
      public static String print(String str) {
        System.out.println(str);
       return str; //값을 돌려준다 ,걍 if문 쓰자..
    }
}
