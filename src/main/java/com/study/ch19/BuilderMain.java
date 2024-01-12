package com.study.ch19;

public class BuilderMain {
    public static void main(String[] args) {
        //1.번 하던방법
        // Car car = new Car("아반떼","블랙"); //변수가 10개정도있는데 나는 2개정도만 넣고싶고 나머지는 기본값
//       //2.번
//       Car car = Car.builder()//클래스명.스태틱메서드(클래스에서 점찍어서 갈수있는건 스태틱메서드)
//                .color("블랙")
//                .model("와아아아")
//                .build();//.빌드메서드
 //       Car.CarBuilder carBuilder = new Car.builder();//Car클래스 안에 CarBuilder내부클래스라서 점찍음
                                              //생성자   //스태틱이라. 찍고 접근가능 이유는 Car class에
//        System.out.println(car);
        Car.CarBuilder carBuilder  = Car.builder();
        Car car2 = carBuilder.build();//두줄이 아래줄이랑 같다

        Car car =Car.builder().model("ㅂ재댜ㅗㄱ랴ㅐㅂ졸ㄴㅇ").color("아오오오오왼ㅇ라ㅗㄴㅁ아ㅓㄹ혼ㅇ").build();
                //100번 주소. 함수호출(StringType으로
        System.out.println(car);



        }

    }
