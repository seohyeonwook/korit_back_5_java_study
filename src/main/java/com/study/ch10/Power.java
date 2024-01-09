package com.study.ch10;

public interface Power {
    /*
    인터페이스의 메소드는 기본값은 추상메소드이다
    변수선언이 불가능 하다 -->상수선언만 가능
    추상클래스의 기본값은 일반메소드이다 변수선언 가능하다
     */
    void setPowerOn();
    void setPowerOff();

    default void test() {
        //default붕티면 일반 메소드 사용가능
        //추상메소드는 안붙이면 일반 메소드 붙이면 추상
        //인터페이스는 안붙이면 불가능 붙이면 일반메소드
        //추상은 다중상속이 안되는데 인터페이스는 다중상속이 가능해
    }
}
