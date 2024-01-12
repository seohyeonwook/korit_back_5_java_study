package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("김준1");
        nameList.add("김준2");
        nameList.add(null);//반복문에서 null.equals 를했는데 null은 equals가 없다
        nameList.add("김준4");
        //컴파일러 전 오류 -> 문법적 오류
        //컴파일러 후 >>문법적 오류가 없어서 실행시 발생하는 오류 > RuntimeException

        try {
            for (int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                if (name.equals("김준4")) {
                    System.out.println("찾았당!!!");
                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예상하지 못하는 예외 > 최종병기 바로 밑 > Throwable 최종병기");
        } finally {
            System.out.println("이거는 무조건 실행 됨");
        }
        System.out.println("프로그램 종료");
    }


}

