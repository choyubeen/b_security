package com.jafa.secourity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import lombok.extern.log4j.Log4j;

@Log4j
public class LoginSucessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
//		String loginId = request.getParameter("loginId");
		String loginId = authentication.getName();
		
		log.info("로그인 성공");
		log.info(loginId+"님이 로그인 했습니다");
		String requestURL = request.getRequestURL().toString();
		log.info(requestURL);
		String requestURI = request.getRequestURI().toString();
		log.info(requestURI);
		response.sendRedirect(requestURI);
	}

}
