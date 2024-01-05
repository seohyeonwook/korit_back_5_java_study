package com.study.ch08;

public class TestA01 {
    public static void main(String[] args) {//a는 메인이 있고 b는 메인이 없다 b는 add라는 메소드를 만들었다
                                            //
        int num = 10;
        int num2 = 20;
        int[] nums = new int[3];

        TestB01 bClass = new TestB01();// 왜써줘야하나??<클래스는 메모리에 실제 존재해야지 쓸수있다
                                       // 클래스는 변수 ,메소드를 가진다
        bClass.add(nums, num, num2);
        bClass.showArrayDatas(nums);

        bClass.add(nums, 20, 40);
        bClass.showArrayDatas(nums);


    }
}
