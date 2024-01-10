package com.study.ch16;

import java.util.ArrayList;

public class StrArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();//제네릭을쓸수있담 제네릭쓰면 자료형을 맘대로 쓸수있다
        //데이터를 추가하고 삭제하고 꺼내는게 훨씬 쉽당ㅇㅇㅇ
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        System.out.println(strList);
        System.out.println(strList.get(1));//1번인덱스 가지고와라
        System.out.println(strList.indexOf("c"));//c가몇번에 있느지
        strList.remove(1);//1번인덱스지우겠다
        System.out.println(strList);//지운결과
    }






















}
