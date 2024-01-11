package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("서현욱", 444));//객체추가할수있다
        students.add(new Student("서서서", 244));
        students.add(new Student("서어엉", 454));//
        students.add(new Student("서으응", 224));//
        System.out.println(students);// 4명이 어레이 리스트에 들어가있는거다

//// 들어 이해가 안돼 + 집가서 그전에 인강을 들어 필기를해(외울시간이있어야하는데 없어) -> 활용시간도없어 근데 다음날에오면 진도나가
//        안익숙해 > 또몰라 또집가 또인강들어 또 필기해 또외울시간이 없어 적어볼시간도없어 오늘걸 해야하는데 계속밀려나는 나는 밀리기만해
//                근데 옆에서는 개쿠사리맥이고 그것만을 일단 적어보고 익숙해직려면 졸라게해야하는데 졸라게 듣기만해 졸라게 적고 다음날 되면
//                8시간 공부해 8시간동안 졸라나가 그러면 나는 졸라조랄라졸라 밀려 근데 안익숙하니까 계속 봐야해 코드를

        Student student2 = new Student("aaa", 10);
        student2.setAge(student2.getAge() + 1);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.setAge(student.getAge() + 1);
            System.out.println(students);
        }

            //향상된 for
            for (Student student : students) {
                student.setAge(student.getAge() + 1);
            }
            Student[] studentArray = new Student[4];
            for(int i = 0; i < studentArray.length; i ++) {

            }
            int i = 0;
            for(Student student : studentArray) {
                studentArray[i] = new Student("서현ㅇ", 33);
                i++;//이렇게 하지마
            }
//            for(Student student ;studentArray) {
//                System.out.println(students);
//            }
//
//            students.set(
//                    0,
//            )


        }


    }



