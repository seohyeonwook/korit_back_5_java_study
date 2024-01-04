package com.study.ch03;

public class Function02 { //함수 = 호출을 하면
    //매개변수x ,리턴x
    public static void fx01() {//타입에 맞게 입력해야 호출이 된다()안에 매개변수가 없기때문에 빈공간
        System.out.println("fx01 함수 실행");
        System.out.println();//한칸 띄우기
    }
    //메소드의 오버로딩 찾아보기-> 함수명이 같더라도 매개변수의 자료형이 다르면 함수정의가 가능하다
    //매개변수o,리턴x
    public static void fx02(int age, String name) {//이름(매개변수 -인트랑 문자열을 가지는 함수)
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);

    }
    public static int fx03() {//매개변수x 리턴o
        System.out.println("fx03 함수 실행");
        return 100;
    }
    public static String fx04(String name, int age) {//매개변수o 리턴o
        return name + ", " + age;
    }

    public static void main(String[] args) {//void가 들어가면 리턴이 없다
        fx01();
        fx02(33,"서현욱");
        fx02(33,"서현욱");//매개변수 순서대로 넣어야함
        int num = fx03();//선언한다고 표현
        String result = fx04("서현욱",31);// String 과 int 면 int 의 형이 String으로 바뀌니까 String만
        System.out.println(result);

        System.out.println(fx04("서현욱",34));//그냥 위에처럼 해도 된다만 알고있자

    }
}