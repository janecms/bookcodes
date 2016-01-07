package com.apress.springrecipes.court.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.apress.springrecipes.court.domain.Member;
import com.apress.springrecipes.court.service.MemberService;

@Controller
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/member/add.htm")
    public String addMember(Member member) {
        memberService.add(member);
        return "redirect:list.htm";
    }

    @RequestMapping("/member/remove.htm")
    public String removeMember(
            @RequestParam("memberName") String memberName) {
        memberService.remove(memberName);
        return "redirect:list.htm";
    }

    @RequestMapping("/member/list.htm")
    public ModelAndView listMember() {
        List<Member> members = memberService.list();
        return new ModelAndView("memberList", "members", members);
    }
}
