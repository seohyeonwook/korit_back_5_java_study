package com.study.ch07;

public class UserMain001 {
    public static void main(String[] args) {

        User001 user001 = new User001("aaa","1234");//1번 이건 생성이고
        System.out.println(user001);
        User001 user002 = new User001("bbb","1234","김준이","skjil1218@gmail.com");//2번

        user001.showInfo();
        System.out.println("============");

        user002.showInfo();
        System.out.println("============");

        user001.setName("서현욱");
        user001.setEmail("SKU5.com");

        user001.showInfo();



    }
}