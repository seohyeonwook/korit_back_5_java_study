package com.study.study;

class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        // 업캐스팅: Dog 객체를 Animal 타입으로 형변환
        Animal myDog = new Dog();

        // Animal 타입으로 선언된 변수는 Animal 클래스의 멤버에만 접근 가능
        myDog.makeSound();  // "Some generic sound"

        // 컴파일러는 Animal 타입으로 인식하기 때문에 bark() 메서드에는 접근할 수 없음
        // myDog.bark();  // 컴파일 에러
    }
}
