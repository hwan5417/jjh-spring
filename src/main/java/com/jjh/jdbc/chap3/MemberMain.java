package com.jjh.jdbc.chap3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jjh.jdbc.example.ArticleService;

/**
 * MemberRegisterService를 테스트한다.<br>
 * new를 사용해서 직접 인스턴스를 생성한다.
 * 
 * @author Jacob
 */

public class MemberMain {

	public static void main(String[] args) {
		//MemberDao memberDao = new MemberDao();
		//MemberRegisterService regService = new MemberRegisterService(memberDao);
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService", MemberRegisterService.class);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("hwan5417@naver.com");
		req.setPassword("xxxx");
		req.setName("JJH");

		// 회원 등록
		regService.regist(req);
	}
}