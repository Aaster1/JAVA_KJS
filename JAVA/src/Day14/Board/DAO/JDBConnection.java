package Day14.Board.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnection {
	public Connection con;			//<--연결된 드라이버에 SQL을 요청할 객체 생성하는 기능
	public Statement stmt;			//<--SQL 실행 요청을 하는 기
	public PreparedStatement psmt;	//<--Statement에서 ? 파라미터 확장기능을 추가로 제공하는 기능
	public ResultSet rs;			//<--SQL 실행 결과를 읽어들이는 기능
	
//	기본 생성자
	public JDBConnection() {
		try {

//			mysql-connector-j.xxx.jar 드라이버의 클래스를 로드합니다.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
//			DB에 연결
//			- 연결에 필요한 정보 : YRL, id,pw
//			URL : jdbc:mysql ://도메인:[PORT]/[스키마]?옵션파라미터
//				*도메인 : 내 pc의 ip주소 : localhost : 127.0.0.1로 초기화됨
//				*3306 : mySQL 데이터베이스의 기본 포트
			String url = "jdbc:mysql://localhost:3306/Aster?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			String id= "Aster";
			String pw = "12345678";
			
//			자바 프로그램에서 jDBC 드라이버를 연결시켜주는 클래스
			con = DriverManager.getConnection(url,id,pw);
			
			
			
			System.out.println("DB 연결 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("DB 연결 실패");
			e.printStackTrace();
		}
	}
	
	
}