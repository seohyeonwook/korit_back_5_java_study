package com.study.ch15;

import lombok.AllArgsConstructor;// 이거하나로 전체 생성자 만들어짐

@AllArgsConstructor
public class SendData<T> {//제네릭 - 클래스 생성하다보면 멤버변수의 타입이 변할 수 있다 그거 보완
                          // 타입 여러개 가능<T,E>가능
                           //제네릭 타입으로 일반자료형 사용 불가
                         //EX)  SendData<int> sendData1 = new SendData<>(200, "서현욱"); int 안된다 참조자료형만 가능
                          //EX)  SendData<Integer>은 가능 대문자 형으로 형변환 해줘야행
    private int code;
    //private String data;// 여기에 멤버가 들어가줘야한다 하지만 그럼 1은 안되고 2는 안됨 동시에 받을수있는 자료형 찾아야함
                        //object 최상위 자료형
    //private object data;   //하지만 object업캐스팅 되어서 매번 다운캐스팅 되어야지만 쓸수있다 그래서 제네릭 써야함
    private T data; //자료형을 바꿀수 있는 변수 = 제네릭
    public void send() {
        System.out.println("[데이터 전송]");
        System.out.println("code " +code);
        System.out.println("data " +data);
    }


}
