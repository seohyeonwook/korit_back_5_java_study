package com.study.ch21;

public class ExceptionMain {
    public static void main(String[] args) {

        int[]numArray = new int[] {1,2,3,4,5};//배열을 생성할때 바로 12345가 들어감 배열 크기 x
        for(int i = 0 ; i < 6; i++) {
            try{//예외가 일어날수도있는 부분을 넣어준다
                System.out.println(numArray[i]);
            }catch (ArrayIndexOutOfBoundsException e) {
                //예외는 클래스로 존재한다
                System.out.println("예외가 발생했다.");
            }
                                             //공간이 6개가 없다 그래서 오류 5까지만 출력되고 에러메세지 뜸
                                            //그래서 프로그램 종료 까지 출력해야하는데 프로그램이 끝나서 출력안됨
        }                                   //예외를 처리해야 할 수 있어야 한다
        System.out.println("쁘로그램 종료");

    }
}
