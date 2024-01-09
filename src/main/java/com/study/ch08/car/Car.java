package com.study.ch08.car;

public class Car {
    String model;
    String color;

    //NoArgsConstructor
    Car() {// 앞에 생성자 만들었으니 여기서 만들어줘야지 노랑 올이랑 둘다 생성안되면 no자동생성이지만

    }
    //AllArgsConstructor
    Car(String model, String color) {// 앞에 생성자 만들었으니 여기서 만들어줘야지 1번
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
