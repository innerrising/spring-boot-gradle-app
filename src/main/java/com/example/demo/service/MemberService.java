package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.mapper.MemberMapper;

@Service
public class MemberService {
    
    MemberMapper memberMapper; 

    public MemberService(MemberMapper memberMapper){
        this.memberMapper = memberMapper;
    }

    public List<Member> getMemberList() {
        return memberMapper.getMemberList();
    }
}
