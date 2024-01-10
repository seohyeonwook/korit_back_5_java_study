package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("서현욱", 444));//객체추가할수있다
        students.add(new Student("서서서", 244));
        students.add(new Student("서어엉", 454));//
        students.add(new Student("서으응", 224));//
        System.out.println(students);// 4명이 어레이 리스트에 들어가있는거다

//

            Student student2 = new Student("aaa",10);
            student2.setAge(student2.getAge() + 1  );

            for(int i = 0 ; i< students.size(); i++){
            students.get(i).setAge(students.get(i).getAge() + 1);
        }
        System.out.println(students);


        }


        }


