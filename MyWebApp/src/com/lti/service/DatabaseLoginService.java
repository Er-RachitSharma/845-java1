package com.lti.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseLoginService {
	
	public boolean authenticate(String uname, String pwd) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:ORCL", "system", "Rachit_123");
			
			String sql = "SELECT COUNT(user_id) FROM tbl_users where user_name = ? AND user_pass = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uname);
			stmt.setString(2, pwd);
			rs = stmt.executeQuery();
			if(rs.next()) {
				int count = rs.getInt(1);
				if(count == 1)
					return true;
			}
			return false;
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace(); //We should rather throw a user defined exception here.
			return false;
		}
		finally {
			try { conn.close(); } catch(Exception e) {}
		}
	}
	
}


//create table tbl_users(user_id NUMBER(5) primary key, 
//					user_name varchar2(20) unique, 
//					user_pass varchar2(8), 
//					user_email varchar2(30) unique, 
//					last_logged_in TIMESTAMP);

//insert into tbl_users values(1, 'Rachit', '123', 'rachit@lti', null);
//insert into tbl_users values(2, 'Majrul', '456', 'majrul@lti', null);
//insert into tbl_users values(3, 'Soumya', '789', 'soumya@lti', null);
