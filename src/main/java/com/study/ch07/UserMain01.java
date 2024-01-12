package com.study.ch07;

public class UserMain01 { //여기서 틀을만들고 생성자에서 틀을찍어낸다
    public static void main(String[] args) {

        User01 user01 = new User01("aaa","1234");//1번.//아 이거 클래스다 클래스는 무조건new를 해서 짂어낸다
                                                  //new를 안하려면 static을 해야한다

        User01 user02 = new User01("bbb","1234","김준이","skjil1218@gmail.com");//2번

        user01.showInfo();//3번// 처음
        System.out.println("============");

        user02.showInfo();//2번// 두번째
        System.out.println("============");

        user01.setName("서현욱");//이걸 aaa로 바꾸는 작업
        user01.setEmail("SKU5.com");

        user01.showInfo();// 서현욱 //EMA



    }
}