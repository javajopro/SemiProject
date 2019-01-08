package com.kh.member.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static com.kh.common.JDBCTemplate.*;
import com.kh.member.model.vo.Member;

public class MemberDao {
    Properties prop = new Properties();
    
    public MemberDao() {
        String fileName = MemberDao.class.getResource("/sql/member/member-query.properties").getPath();
        try {
            prop.load(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int insertMember(Connection conn, Member m) {
        int result = 0;
        PreparedStatement pstmt = null;
        
        String query = prop.getProperty("insertMember");
       // System.out.println(query);
        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, m.getMemberId());
            pstmt.setString(2, m.getMemberPwd());
            pstmt.setString(3, m.getMemberName());
            pstmt.setString(4, m.getMemberGender());
            pstmt.setInt(5, m.getMemberAge());
            pstmt.setString(6, m.getMemberEmail());
            
            result = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
        }
        return result;
    }



	public int loginCheck(Connection conn, Member m) {
		int result = -1;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("loginCheck");		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberId());
			pstmt.setString(2, m.getMemberPwd());
			pstmt.setString(3, m.getMemberId());
			
			rset = pstmt.executeQuery();			
			if(rset.next()) {
				result = rset.getInt("login_check");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);			
		}		
		return result;
	}

	public Member memberOne(Connection conn, String memberId) {
		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("memberOne");
		
		try{
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rset = pstmt.executeQuery();
			
			if(rset.next()){
				m = new Member();
				//컬럼명은 대소문자 구분이 없다.
				m.setMemberId(rset.getString("member_id"));
				m.setMemberPwd(rset.getString("member_pwd"));
				m.setMemberName(rset.getString("member_name"));
				m.setMemberGender(rset.getString("member_gender"));
				m.setMemberAge(rset.getInt("member_age"));
				m.setMemberEmail(rset.getString("member_email"));
				m.setMemberLoginlog(rset.getInt("member_login_log"));
				m.setMemberStatus(rset.getString("member_status"));
				m.setMemberSnsaccount(rset.getString("Member_sns_account"));
			}			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			close(rset);
			close(pstmt);
		}		
		return m;
	}

}