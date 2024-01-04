package com.study.ch07;

public class UserMain001 { //여기서 틀을만들고 생성자에서 틀을찍어낸다
    public static void main(String[] args) {

        User001 user001 = new User001("aaa","1234");//1번
        User001 user002 = new User001("bbb","1234","김준이","skjil1218@gmail.com");//2번

        user001.showInfo();
        System.out.println("============");

        user002.showInfo();
        System.out.println("============");

        user001.setName("서현욱");//이걸 aaa로 바꾸는 작업
        user001.setEmail("SKU5.com");

        user001.showInfo();



    }
}