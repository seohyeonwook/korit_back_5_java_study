package com.study.ch18;

public class AdditionMain {
    public static void main(String[] args) {
        //익명 클래스- 형태가 없는 걸 구현함 -> 이름이 없다 -> 메모리할당할수있는 모양으로 만듬
        Addition addition1 = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };
        Addition addition2 = new AdditionImpl();

        System.out.println(addition1.add(10,20));
        System.out.println(addition2.add(30,40));

        //람다식 핵심조건 -> 인터페이스 안에 딱 하나의 추상메소드만 정의 되어 있어야 한다!
        //단, 일반(default) 메소드는 여러개 정의되어 있어도 된다.

        Addition addition3 = (int x, int y) -> {// -> << add함수명이라고 생각하자
            System.out.println("람다식으로 구현한 add메소드");
            return x+y; //addition1을 람다식으로 줄인거 더줄일수이따
        };
        System.out.println(addition3.add(50,60));

        // 1.람다식의 매개변수 자료형은 생략할 수 있다. 인터페이스 자체에 이미 자료형을 써둬서
        Addition addition4 = (x,y) -> {
            return x + y;
        };
        // 2. 함수의 실행문이 하나의 명령문만 실행된다면 줄괄호를 생략 할 수 있다.
        // 단, return은 중괄호를 생략할 시에 같이 생략한다.
        Addition addition5 = (x,y) -> x + y;
        Viewer viewer1 = (viewData) -> {
            System.out.println("화면출력");
        };
        Viewer viewer2 = (viewData) -> System.out.println("화면 출력");


        //3. 매개변수가 1개면 매개변수의 괄호를 생략할 수 있다. >2개면 안댐
        Viewer viewer3 = viewData -> System.out.println("화면출력" );
        //                                매개 반환값
        //java.lang.Runnable void run()  	X	X   입력용
        //Supplier<T>	T get()         	X	O   주기만 한다 리턴만 있다 <>제네릭 들어옴
        //Consumer<T>	void accept(T t)	O	X   소비만 한다 주진 않는다
        //Function<T, R>	R apply(T t)	O	O   함수= 입력과 출력이 있다 리턴과 출력형을 따로따로준다
        //Predicate<T>	boolean test(T t)	O	O   리턴자료형이 boolean으로 고정이다

    }



}
