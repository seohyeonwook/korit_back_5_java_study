package com.study.ch15;

public class SendDataMain {
    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData<>(200, "서현욱");//이렇게하면 스트링 자료형이된다 제네릭
        //이렇게하면 t부분이 String으로
        //sendData1.send();
        send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("서현욱", "01324106"));//멤버자료형
        //sendData2.send(); // 1과 2는 같은 틀인데 두개자료형이 다르다 >두개의 틀 String 틀 Member틀
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("서연우","4444444"));
        send(sendData3);
    }


    public static void send(SendData<?> sendData) {//어떤타입이 들어올지 모른다(Member String) 그래서 ?넣는다//
                                 // <? extends Member>//멤버를 상속받은 애들만 받을 수있다 이거넣으면 1번 빨간줄 뜸
                                // <? super VipMember>// vip와 부모만 들어갈수있다
                                // 상속은 위에서 밑으로 super는 밑에서 위로
                                // 상속은 아빠 나 동생 쓸수 있는데 super는 나랑 아빠만 쓸수 있다 나위로는 동생없어서
        sendData.send();//이러면 각각의 데이터 출력
        //와일드카드 (?)
    }
}
