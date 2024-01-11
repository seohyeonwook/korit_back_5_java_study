package com.study.ch17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {// hASH는 순서관련된게 ㅇ벗다SET,GET,INDEXOF등등
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김준1");
        nameList.add("김준2");
        nameList.add("김준3");
        nameList.add("김준4");
        nameList.add("김준5");
        nameList.add("김준5");

        System.out.println(nameList);
        HashSet<String> names = new HashSet<>();//set은 수정 개념이 없다 찾아서 지우고 다시 만들어서 넣어야해

        names.addAll(nameList);//중복제거
        System.out.println(names);

        ArrayList<String> newMameList = new ArrayList<>();
        newMameList.addAll(names);

        System.out.println(newMameList.get(1));


//        System.out.println(names);//순서가 뒤죽박죽 돼서 출력한다-> class가 HashSet이라서
//        System.out.println(Objects.hash("김준1"));
//        System.out.println(Objects.hash("김준2"));
//        System.out.println(Objects.hash("김준3"));
//        System.out.println(Objects.hash("김준4"));
//        System.out.println(Objects.hash("김준5"));


        String findName = null;
        for(String name : names) {
            System.out.println("김준3");//HashSet에서김준3찾는법 하나씩 꺼내서 비교한다
            findName = name; //김준3을 찾았다라는뜻
            break;

        }
        System.out.println(names);
    }
}
