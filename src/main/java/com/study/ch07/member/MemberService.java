package com.study.ch07.member;


import java.util.Scanner;

public class MemberService {
    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        while(true) {
            System.out.print(label + "(입력 취소: exit) >>>");//code에 if로 gogo
            value = scanner.nextLine();// unll로 선언을 해서 이런모양
            if(!value.isBlank()) {
                break;
            }
        }
        return value;

    }



    boolean addMember() {// true 아니면 false리턴받으려고
        //Scanner scanner = new Scanner(System.in);
        String code = null;
        String name = null;
        String age = null;
        String address = null;

        System.out.println("<<<< 회원 등록 >>>>");
        code = inputValue("회원코드");
        if("exit".equalsIgnoreCase(code)){
            return false;// 이거 리턴은 어디로가??
        }
        name = inputValue("이름");
        if("exit".equalsIgnoreCase(name)){
            return false;
        }
        age = inputValue("나이");
        if("exit".equalsIgnoreCase(age)){
            return false;
        }
        address = inputValue("주소");
        if("exit".equalsIgnoreCase(address)){
            return false;
        }

        Member member = new Member(code, name, Integer.parseInt(age), address);//age문자열로 받았는데 int로 바꾸장

        MemberRepository memberRepository = new MemberRepository();//
        return memberRepository.insert(member) > 0; //true or false///


//        while(true) { // 입력한게 공백인지 확인하기 위해서
//        System.out.print("회원코드 >>>");
//        code = scanner.nextLine();//회원코드 입력 받음 //nextLine이 스페이랑 엔터 다 포함해서 null안뜸
//                                  //그래서 if code ==null 안됨
//        if(!code.isBlank) {//코드값이 비어있다면 isBlank(공백체크용)
//            break;
//

    }
}
