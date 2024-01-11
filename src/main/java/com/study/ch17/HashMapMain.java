package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("1번학생", "김준1");
        map.put("2번학생", "김준2");
        map.put("3번학생", "김준3");
        map.put("4번학생", "김준4");//map은 순서가없다 데이터중복 가능


        System.out.println(map);
        System.out.println(map.get("3번학생"));//get(key값 호출한다)


    }

}
