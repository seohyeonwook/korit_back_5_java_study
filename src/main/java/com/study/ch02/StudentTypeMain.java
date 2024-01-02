package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        /*
         * 이름, 학년, 주소를 저장할 수 있는 StudentType 클래스를 만드시오.
         */
        StudentType s = new StudentType();
        s.name = "서현욱";//Person자료에서 name가지고 왔기 때문에 Type 에 name을 지워도 괜찮음
        s.studentYear = 1;
        s.address ="부산 영도구";

        System.out.println("이름 :" + s.name);
        System.out.println("나이 :" + s.studentYear +"학년");
        System.out.println("주소 :" + s.address);


        Person p = s;// Person 안에 StudentType 를 포함시킨다
        StudentType s2 =(StudentType) s;//다운캐스팅이니까 명시적 형변환 해줘야함

//        Person 서현욱 = new Person();
//        StudentType 서현욱학생 = (StudentType) 서현욱; // 이건안됨 이해필요

        StudentType 서현욱학생 = new StudentType();
        Person 서현욱사람 = 서현욱학생;//상속을 받으니까
        StudentType 서현욱학생2 = (StudentType) 서현욱학생;




    }

}
