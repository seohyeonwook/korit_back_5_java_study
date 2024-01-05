package com.study.ch01;

public class 메인 {

    public static void main(String[] args) {
        int a = 10;
        double b = 3.14;
        스마트폰 s = new 스마트폰();
        s.model = "아이폰";
        s.color = "블랙";
        스마트폰 s2 = new 스마트폰();
        s2.model = "갤럭시";
        s2.color = "화이트";
        스마트폰 s3 = new 스마트폰("샤오미", "레드");

        s.테스트();
        s2.테스트();

        int c = test();
    }
    
    public static int test() {
        System.out.println("test 호출");
        return 10;
    }

}
