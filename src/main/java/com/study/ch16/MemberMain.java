//package com.study.ch16;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class MemberMain {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);//여기까지 하고 반복 제거 위해서 다른
//
//        ArrayList<Member> members = new ArrayList<>();//배열처럼 되어있는데 방을 하나씩 만들어서 추가함
//
//        String selectedMenu = null;//문제를 보면 무슨 코드를 사용해야할지 보일만큼 공부하자
//
//        while(true) {
//            System.out.println("회원관리 프로그램");
//            System.out.println("1. 회원 등록");
//            System.out.println("2. 회원 이름 수정");
//            System.out.println("3. 회원 주소 수정");
//            System.out.println("4. 회원 이름으로 조회");
//            System.out.println("5. 회원 전체 조회");
//            System.out.println("6. 회원 삭제");
//            System.out.println("q. 프로그램 종료");
//            System.out.print("메뉴 선택");
//            selectedMenu = scanner.nextLine();
//            //1번-> 5번 ->4번 -> 6번 -> 2번 -> 3번
//            //개망함
//            if ("q".equalsIgnoreCase(selectedMenu)) {
//                break;
//            } else if ("1".equals(selectedMenu)) {
//                /*
//                [회원등록 하기]
//                이름>>김준일
//                주소>>부산동래구
//                <<등록이 완료되었습니다.>>// 이렇게 출력
//                 */
//                String name = null;
//                String address = null;
//                System.out.print("등록해");
//                System.out.print("이름내나");
//                name = scanner.nextLine();
//                System.out.print("주소내나");
//                address = scanner.nextLine();
//
//
//                Member member = new Member(name, address);
//                members.add(member);
//                System.out.println("등록완");
//
//            } else if ("2".equals(selectedMenu)) {
//                /*
//                    [회원 이름 수정하기]
//                    수정 할 회원의 이름을 입력하세요>>
//                    이름>> 김준이
//                    <<등록이 완료되었습니다.>>
//                 */
//                System.out.println("회원이름 수정하기");
//
//            } else if ("3".equals(selectedMenu)) {
//                /*
//                    [회원 주소 수정하기]
//                    수정 할 회원의 이름을 입력하세요>> 김준이
//                    해당 이름의 회원이 존재하지 않습니다.
//                    주소>> 부산 동래구 사직동
//                    <<등록이 완료되었습니다.>>
//                 */
//
//            } else if ("4".equals(selectedMenu)) {
//                /*
//                    [회원 이름으로 조회하기]
//                    조회 할 회원의 이름을 입력하세요>>
//                    Member 객체 toString();
//                    <<조회가 완료되었습니다.>>
//                 */
//                String serchName = null;
//                System.out.println("회원이름 조회 할거야");
//                System.out.print("조회할 회원 이름 적어");
//                serchName = scanner.nextLine();
//                //indexof못씀 members.indexOf()
//                Member findMember = null;
//                for (Member member : members) {
//                    if (member.getName().equals(serchName))//serchName과 동일하면 밑으로내려감 {
//                        findMember = member;//null에서 멤버이름이 들어가서
//                    break;
//                }
//                if (findMember == null) {
//                    System.out.println("해당 이름의 회원이 없다");
//                    continue;
//                }
//                System.out.println(findMember);
//                System.out.println("조회가 완료 되었슴");
//
//            }else if("5".equals(selectedMenu)) {
//                 /*
//                    [회원 전체 조회하기]
//                    MemberList 전체 반복 toString();
//                    <<조회가 완료되었습니다.>>
//                 */
//                System.out.println("회원 전체 조회");
//
//                for(Member member : members) {// for each문?
//                    System.out.println(member);
//                }
//                System.out.println("조회가 완료되었엉 집에가");
//
//            }else if("6".equals(selectedMenu)) {
//                /*
//                    [회원 이름으로 삭제하기]
//                    삭제 할 회원의 이름을 입력하세요>> 김준이
//                    삭제 된 Member 객체 toString();
//                    <<조회가 완료되었습니다.>>
//                 */
//                String serchName = null;
//                System.out.println("회원이름 삭제 할거야");
//                System.out.print("삭제할 회원 이름 적어");
//                serchName = scanner.nextLine();
//
//                Member findMember = null;
//                for (Member member : members) {
//                    if (member.getName().equals(serchName))//serchName과 동일하면 밑으로내려감 {
//                        findMember = member;//null에서 멤버이름이 들어가서
//                    break;
//                }
//                if (findMember == null) {
//                    System.out.println("해당 이름의 회원이 없다");
//                    continue;
//                }//찾으면 해당객체를 삭제해야함 members.remove해야한다
//                members.remove(findMember);//객체자체를 지워라
//                //members.remove(members.indexOf(findMember));//해당인덱스를 지워라
//                System.out.println(findMember);
//                System.out.println("조회가 완료 되었슴");
//
//            }else if("5".equals(selectedMenu)) {
//                 /*
//                    [회원 전체 조회하기]
//                    MemberList 전체 반복 toString();
//                    <<조회가 완료되었습니다.>>
//                 */
//                System.out.println("전체 조회 할거야");
//                for(Member member : members) {// for each문?
//                    System.out.println(member);
//                }
//                System.out.println("조회가 완료되었엉 집에가");
//
//
//            } else {
//                System.out.println("열받게 하지말고 다시 선택하셈");
//            }
//            System.out.println();
//        }
//        System.out.println("프로그램 종료.");
//
//
//    }
//}
//
//수정
//
//클래스 밑에 작성
//스태틱 변수를 쓴다 = 전체 영역에서 static을 쓰면  스테틱 메소드들이 접근가능