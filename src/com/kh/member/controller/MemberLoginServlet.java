package com.kh.member.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;


/**
 * Servlet implementation class MemberLoginServlet
 */
@WebServlet("/member/login")
public class MemberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");		
		
		String memberId = request.getParameter("memberId");
		String memberPwd = request.getParameter("memberPwd");
		System.out.printf("[%s, %s]\n", memberId, memberPwd);
		
		// return 1 : 로그인성공
		// return 0 : 패스워드 틀림
		// return -1 : 존재하지 않는 아이디.
		Member m = new Member();
		m.setMemberId(memberId);
		m.setMemberPwd(memberPwd);		
		
		int result = new MemberService().loginCheck(m);
//		int result = 1;
		System.out.println("[로그인결과 : "+result+"]");		
		
		String view = "";		
		String msg = "";
		String loc = "/";
		
			
		String referer = request.getHeader("Referer");
		String origin = request.getHeader("Origin");
		String url = request.getRequestURL().toString();
		String uri = request.getRequestURI();		
		
		//referer =http://localhost:9090/scheduler/index.jsp
		//origin =http://localhost:9090
		//url =http://localhost:9090/scheduler/member/login
		//uri =/scheduler/member/login
		
		//크롬 외 브라우져용
		if(origin == null)
		{
			origin = url.replace(uri, "");
		}
		//1.로그인 성공한 경우		
			if(result == MemberService.LOGIN_OK) {
			
			//login business logic
			//test code
			Calendar c = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH);
			int day = c.get(Calendar.DATE);
			
			c.set(Calendar.DATE, 1);
			int start = c.get(Calendar.DAY_OF_WEEK)-1;
			
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int i=0; i<=11; i++) {
				c.set(Calendar.MONTH, i);
				map.put(i, c.getActualMaximum(Calendar.DATE));
			}
		
			Member memberLoggedIn = new MemberService().memberOne(memberId);			
			HttpSession session = request.getSession(true);				
												
			session.setAttribute("memberLoggedIn", memberLoggedIn);	
			request.setAttribute("start", start);
			request.setAttribute("year", year);
			request.setAttribute("month", month);
			request.setAttribute("day", day);
			request.setAttribute("map", map);
			request.getRequestDispatcher("/WEB-INF/views/member/monthlySchedule.jsp").forward(request, response);
			
		//2.로그인 실패한 경우
			}else {
			view = "/WEB-INF/views/common/msg.jsp";
			
			if(result == MemberService.WRONG_PASSWORD) {
				msg = "패스워드를 잘못 입력하셨습니다.";
			}
			else if(result == MemberService.ID_NOT_EXIST) {
				msg = "존재하지 않는 아이디 입니다.";
			}
			
			//속성에 값 보관
			request.setAttribute("msg", msg);
			request.setAttribute("loc", loc);
			
			RequestDispatcher reqDispatcher = request.getRequestDispatcher(view);
			reqDispatcher.forward(request, response);
		}
		
	}	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}