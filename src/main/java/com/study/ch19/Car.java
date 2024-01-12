package com.study.ch19;

import lombok.Builder;
import lombok.ToString;
//빌드업 패턴 작성하는법 알아야함

//@Builder//이거달아줘 이거안쓰고도 만들수있어야해
@ToString
public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public static CarBuilder builder() { //이건 메서드??
                   //리턴자료형          //스태틱이 아니면 new가 (new Car) 되어야지만

        return new CarBuilder();//객체 만들기 클래스를 생성하려면 클래스 생성을 해야지 쓸수있다
        //위에 두개는 자기들끼리  공유하고 밑에 클래스의 생성이 없는 이유는 static을 달아서.

    }

    public static class CarBuilder { //static 끼리는 생성없이 호출 가능
                                     // 내부 클래스 Car클래스 안에 또 스태틱 클래스

        // 아래는 CarBuilder 카피해서 만들어낸 방이라고 이해하자0
        private String model;
        private String color;


        public Car build() {//리턴 타입을 Car로 받겠다고
            return new Car(model, color);//생성자new 주소를 만들때 매개변수 두개를 넘겨주자
        }
        //build. 찍으니까 여기 안에 들어와서 아래에서 함수들을 작성할수 있다

        public CarBuilder model(String model) {//메서드 호출 -> 내부클래스에 메서드
            this.model = model;
            return this;//자기 주소를 리턴해서 다시 호출 가능
            //값을 넣고 리턴하고 (자기주소를 모델함수 호출)하고 다시 모델에. 찍으면

        }
        public CarBuilder color(String color) {
            this.color = color;
            return this;  //CarBuilder 저장되어있는 값을 Car로 보내줘야함

        }
    }



//    public Car(String model, String color) {
//        this.model = model;
//        this.color = color;
//    }
}

//클래스 설명 바탕화면에 car라는 폴더가 있고 들어가면 또다른 폴더가 있다 폴더이름 model, color
//model이라는 폴더안에는 메모장이 하나있다 메모장이름이String
//color라는 폴더 안에 메모장이름이 또 String 근데 똑같은 폴더를 하나 더 만들고 싶다
//  ctrl c + v 해서 car2를 만들고 싶다 이때 ctrl c + v하는 행위가 new car
//이떄 new car("아반떼")적으면 아반떼로 바뀐채로 복사가된다
//static 메모리에 들어있다 new할때마다 힙메모리로 들어간다
//car2.찍으면 폴더안으로 들어간다 model찍으면 모델 폴더 안으로 들어간다
//car 2안에 model폴더있고color폴더 똑같이 있지만 car폴더와 다르다 거기서 car2.model= "기아"하면 기아로 저장된다
// new car2 전체를 객체라고 하고 .찍으면 (하위파일)model로 들어가고

//static 얘는 복사안됨 car에서 car2로 복사하면 복사안된다 외부(car2)에서
// static으로 접근하고싶다면 무조건 클래스(car)에서.찍고 접근해야함

//bulider는 스태틱이라 car.bulider찍는다  bulider 리턴할때 new
//static은 서로 생성없이 접근가능 그래서 new car bulider를 생성 가능
//car.bulider 호출할때마다 new car bulider가 호출돼서 인스턴스 계속 새로 생성됨
//

