package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        Runnable start = () -> {
            System.out.println("프로그램 실행");
            System.out.println("데이터 초기화");//매개변수가 없으면 괄호 생략 못함
            int a = 10 ;
            int b = 20;
            System.out.println("a + b = :" + (a + b));
        };
        start.run(); // 호출//람다식을 쓰면 함수안에서 함수를 정의 할 수 있음

        Supplier<Integer> supplier = () -> 10; //매개변수 없다 >받을게 없다 리턴만 있다
        int a = supplier.get();

//        Supplier<Scanner> scannerInstance = ()->  new Scanner(System.in);
//        scannerInstance.get().nextLine();

        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(newName);
        }; //매개변수 1개  제네릭 하나있슴괄호생략 가능

        setName.accept("김준일");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        Consumer<String> action = str -> System.out.println(str);
        action.accept("김준일");//

        strList.forEach(str -> System.out.println(str));// 이래도 되고 str넣어도 된다

        Function<Integer,String> fx1 = num -> Integer.toString(num * num);//들어갈때,나올때 = 매개변수명
        //Default  는 추상이 아니다 재정의 X

        String result= fx1.apply(10);
        System.out.println(result);

        String result2 = fx1.andThen(num -> {
            System.out.println("andThen 에 넣은 함수" + num);
            return "문자열" + num;
        }).apply(10);

        System.out.println(result2);


        Predicate<Integer>  filterFx = num -> num % 2 == 0;

        List<Integer> numList = new ArrayList<>();
        for (int i = 0 ; i < 10; i++) {
            numList.add (i +1);

        }
        System.out.println(numList);
        List<Integer> newList = numList.stream().filter(filterFx).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList2 = newList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2);




    }

}
