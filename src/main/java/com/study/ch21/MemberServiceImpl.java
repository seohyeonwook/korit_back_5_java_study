package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberServiceImpl implements MemberService {


    @Override
    public void printMemberSerList(ArrayList<Member> members)throws Exception {//throws모든 기능은 무조건 예외처리
        for( int i = 0 ; i < 5 ; i ++) {
            System.out.println(members.get(i));
        }

    }
}
