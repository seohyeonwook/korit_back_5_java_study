package com.study.ch18;

public class AdditionImpl implements Addition{//추상메소드 구현
    @Override
    public int add(int x, int y) {//변수명은 바꿔도 된다 상관없다 자료형만 같으면 된다 xy >>ab
        return x+y;
    }
}
