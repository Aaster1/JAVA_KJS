package Aster.leveling.Dun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnection {
	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
//	기본 생성자
	public JDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			DB에 연결
			String url = "jdbc:mysql://localhost:3306/aster?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			String id= "aster";
			String pw = "Wlstn85275395!";
			
			con = DriverManager.getConnection(url,id,pw);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("DB 연결 실패");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		JDBConnection jdbc = new JDBConnection();
	}
	
}
