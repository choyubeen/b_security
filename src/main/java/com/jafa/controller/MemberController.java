package com.jafa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
@Controller
public class MemberController {

	//로그인 페이지
	@RequestMapping("/login")
	public String loginForm(){
		return "member/login";
	}
	
	// 모든 사용자 허용
	@GetMapping("/all")
	public void doAll() {
		
	}
	
	//로그인 사용자 허용
	@GetMapping("/member")
	public void doMember() {
		
	}
	
	// 관리자만 허용
	@GetMapping("/admin")
	public void doAdmin() {
		
	}
	
	// 접근 거부 처리
	@GetMapping("/accessError")
	public void accessError() {
		
	}
}
