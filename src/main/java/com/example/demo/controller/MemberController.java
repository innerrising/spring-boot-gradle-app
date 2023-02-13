package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Member;
import com.example.demo.service.MemberService; 

@Controller 
@RequestMapping("member")
public class MemberController  {
 
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("list")
    public String getMemberList(Model model) throws Exception{
        
        List<Member> memberList = memberService.getMemberList();
        model.addAttribute("members", memberList);
        
        return "views/memberForm";
    }
}
