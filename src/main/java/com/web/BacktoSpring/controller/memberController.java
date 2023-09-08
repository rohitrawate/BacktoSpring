package com.web.BacktoSpring.controller;

import com.web.BacktoSpring.entities.Member;
import com.web.BacktoSpring.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
@Controller
public class memberController {

    //    @Autowired
    private final MemberService memberService;
    public memberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute( "registerReq", new Member() ); //// This creates a null Object on html page to hold vales
        System.out.println("GET mapping -'/register' called : "+model);
//        model.addAttribute("member", new Member());
        return "registerForm";
    }

    @GetMapping("/login")
    public String showLoginForm( Model model){
        model.addAttribute("loginReq", new Member());
        System.out.println("Get Mapping -'/login' called ...");
        return "loginForm";
    }

    @PostMapping("/register")
    public String registerMember(@ModelAttribute Member member){
        System.out.println("POST mapping -'/register' called : "+member);
//        memberService.createMember(member);
        Member registeredMember  =  memberService.registerMember( member.getFirstName(), member.getLastName(), member.getEmail(), member.getPassword() );

        return registeredMember == null ? "error" : "loginForm";
    }

    @PostMapping("/login")
    public String loginMember(@ModelAttribute Member member , Model model){
        System.out.println("Login request : " + member );
        Member authenticated = memberService.authenticate( member.getEmail(), member.getPassword() );
        if( authenticated != null ){
            model.addAttribute( "memberlogin", authenticated.getEmail()  );
            return "member_page";
        }else {
            return  "error";
        }
    }

//    @GetMapping("/register")
//    public String registerForm(Model model){
//        return "views/registerForm";
//    }

}