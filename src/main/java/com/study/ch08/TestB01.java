package com.study.ch08;

public class TestB01 {

    void add(int[] array, int x, int y) {//메서드 int 자료형
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[0] = x + y;
                break;
            }

        }
    }

    void showArrayDatas(int[] array) {
        System.out.println("배열  값 확인");
        for(int i = 0; i < array.length; i++) {

            System.out.println("index[" + i + " ] >" +array[i]);

        }
        System.out.println();
    }
}