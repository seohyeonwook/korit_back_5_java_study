package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor//필수 아규먼트 생성 //노아규랑 같이못씀= 상수는 무조건 초기화 해야 돼서
@AllArgsConstructor
@Data//
public class Student2 {
    private final String name;//Setter가 없음
    private String address;
    @NonNull//final과 비교 알아보기
    private String phone;
}
