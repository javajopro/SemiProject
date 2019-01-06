package com.kh.member.model.service;


import static com.kh.common.JDBCTemplate.commit;
import static com.kh.common.JDBCTemplate.getConnection;
import static com.kh.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;

public class MemberService {
	//로그인 관련 상수
	public static final int LOGIN_OK = 1;
	public static final int WRONG_PASSWORD = 0;
	public static final int ID_NOT_EXIST = -1;

	public int loginCheck(Member m) {
		int result = -1;
		Connection conn = getConnection();		
		result = new MemberDao().loginCheck(conn, m);		
		if(result>0) commit(conn);
		else rollback(conn);		
		return result;		
	}	

	public Member memberOne(String memberId) {
		Connection conn = getConnection();
		Member m = new MemberDao().memberOne(conn, memberId);
		if(m != null) commit(conn);
		else rollback(conn);
		return m;		
	}

}
