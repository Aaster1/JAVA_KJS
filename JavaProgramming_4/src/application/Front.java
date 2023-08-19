package application;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Front extends Application {
	
	
//  실행 순서를 가장 앞쪽으로 떙겨옴. 다른 클래스에 정의하여 사용할 경우 실행 순서가 엇나기 때문에 예외가 발생함.
	public static Connection con;		//<-con = Connection자료형. 해당 자료형에 JDBC드라이버의 getConnection을 통해 연결할 데이터베이스 경로를 붙여줘야함
	public static Statement stmt;		//<-String 형태의 SQL문법을 그대로 받아 실행하는 『정적』 형태 과정.
	public static PreparedStatement psmt;	//<- String형태의 SQL문법 중 ? 부분을 매핑하여 원하는 값으로 치환하는 과정. ex) psmt.setInt(1, no);
	public static ResultSet rs;			//<--데이터베이스에서의 결과를 읽어오기 위한 기능.
	
//	connect 메소드 정의. 보드인터페이스에서의 JDBConecction역할을 static의 connect라는 이름으로 정의.
//	가장 먼저 실행될 예정.
	public static void connect() {
		try {
			//JDBConnection에서의 과정을 2줄로 체인메소드로 압축.
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aster?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false","aster","Wlstn85275395!");	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
//	데이터베이스의 모든 행 중 no,title,writer,content,regDate,updDate 열만 불러오기
//	불러온 값을 DTO인 Board의 멤버변수들에 입히고, 더 이상 읽을 값이 없을 때까지 해당 Board를 List에 추가하기. 형태 ->	 List[0] = board1, List[1] = board2
	public static List<Board> selectAll(){		//<-Board자료형 List 반환 메소드
		List<Board> boardList = new ArrayList<>();	//<- 빈 List 생성 들어갈 타입은 Board. 구현 자료형은 ArrayList. List로 업캐스팅 안해도 무방함.
		String sql = "SELECT no,title,writer,regDate,updDate FROM esd.board;";	//<-SQL에서 실행할 문법 정의
		try {	//<-connection 예외 가능성이 있음.
			stmt = con.createStatement();		//<-정적인 SQL 문법을 사용할 때 필요한 과정. connect()에서 연결 경로를 쥐어준 con에서 createStatement()메소드 실행 후 반환값을 stmt로 정의.
			rs = stmt.executeQuery(sql);		//<-SELECT문을 통해 조회할 때는 executeQuery()메소드 사용. 그리고 ResultSet 자료형으로 반환받음. rs는 조회한 결과와 접촉하는 역할
			while(rs.next()) {					//<- rs.next()가 반환하는 타입은 boolean. SQL조회 결과가 남아있으면 true, 없으면 false 반환. 따라서, 없을 때까지 반복.
				Board board = new Board();		//<- 빈 보드 객체 생성
				board.setBoardNo(rs.getInt("no"));	//<-rs.getInt()메소드를 통해 열 이름 no의 값을 해당 열 자료형으로 가져온 뒤, board의 setBoardNo로 넣어버리기!
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setRegDate(rs.getString("regDate"));
				board.setUpdDate(rs.getString("updDate"));
				boardList.add(board);			//<-매개변수가 갱신된 Board를 빈 List에 넣어주기.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return boardList;		//<-boardList 반환
	}
	
	public static Board select(int boardNo) {	//<-숫자와 일치하는 행만 가져오는 메소드. 반환은 Board 객체 한 개.
		String sql = "SELECT * FROM esd.board WHERE no = ?;";		//<-동적 SQL문법 = ?의 값을 이곳에서 지정해 줄 수가 있음. 따라서 selectAll()메소드와는 다르게 stmt 가 아닌 psmt가 사용됨.
		Board board = new Board();
		try {
			psmt = con.prepareStatement(sql);		//<-매핑할 문자열 때려박기
			psmt.setInt(1, boardNo);				//<-때려박은 문자열, 몇번째 ?에 무슨 값을 넣을지. int를 넣기에 setInt()로 열고 첫번째 ? 에 boardNo을 매핑한다는 1,boardNo를 넣음.
			rs = psmt.executeQuery();				//<-매핑된 psmt를 실행. SELECT 이기에 executeQuery()사용. 또한 데이터베이스의 결과를 읽어와야하기에 반환 받아 rs 정의.
			if(rs.next()) {		//<-반복이 아니니 if. 값이 있으면 읽기.
				board.setBoardNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getString("regDate"));
				board.setUpdDate(rs.getString("updDate")); 
			}
			
		} catch (Exception e) {
		}
		
		return board;			//<-보드 객체 반환
	}
	
	public static void upd(Board board,int boardNo) {		//<-매개변수로 Board 객체와 int를 받아 메소드 실행
		Date now = new Date();	//<-수정 시 수정일자를 찍기 위해 현재 시각 정보를 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");		//<--심플 데이트포맷. 데이트 자료형을 String 자료형으로 변환시키기 위해 줏어옴.
		String sql = "UPDATE esd.board SET title = ?, writer = ?, content = ?, updDate = ? WHERE no = ?;";	//<-sql문법. WHERE절 조건에 부합하는 열의 값을 ? 매핑한 값으로 변경하기. 형태 -> UPDATE esd.board SET (열이름) = (변경할값) WHERE (조건열이름) = (조건값);
		
		try {
			psmt = con.prepareStatement(sql);		//<-동적 SQL문법에 사용되는 psmt = ? 매핑이 들어가면 무조건 이거
			psmt.setString(1, board.getTitle());	//<-매개변수로 받아온 board의 Title값을 ? 에 입혀버리기.
			psmt.setString(2, board.getWriter());
			psmt.setString(3, board.getContent());
			psmt.setString(4, sdf.format(now));		//<- 현시각을 String으로 변환한 값을 updDate열에 넣기.
			psmt.setInt(5, boardNo);		//<-조건절에 들어가는 ? 값을 매개변수로 받아온 no로 넣어버리기
			
			psmt.executeUpdate();			//<-자세히보면 executeQuery() 가 아닌 executeUpdate(). SELECT 가 아닌 INSERT,DELETE,UPDATE 의 문법을 사용할 땐 executeUpdate()를 사용한뒈요.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		public static void delete(int boardNo) {
			String sql = "DELETE FROM esd.board WHERE no = ?;";			//<-WHERE절 조건에 부합하는 행 삭제처리. 따라서 매개변수로 boardNo만 가져오고 매핑으로 입혀버리기
			try {
				psmt = con.prepareStatement(sql);
				psmt.setInt(1, boardNo);
				psmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void create(Board board) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date now = new Date();
			String sql = "INSERT INTO esd.board (title,writer,content,regDate,updDate) VALUES (?,?,?,?,?);";	//<-새로운 행을 생성하는 SQL문법. 형태 -> INSERT INTO 테이블이름 (열이름) VALUES (값)

			try {
				psmt = con.prepareStatement(sql);
				psmt.setString(1, board.getTitle());
				psmt.setString(2, board.getWriter());
				psmt.setString(3, board.getContent());
				psmt.setString(4, sdf.format(now));
				psmt.setString(5, sdf.format(now));
				
				psmt.executeUpdate();		//<-여기 또한 executeUpdate()사용.
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	
//		드디어 실행 시작
	@Override
	public void start(Stage stage) {
		
		try {
			connect();		//<-가장 먼저 호출. JDBConnection 역할
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Front.fxml"));		//<-Front.fxml 소스를 불러와 로더로 생성하기(자세한 역할은 이해하지 못함)
			Parent root = loader.load();		//<-생성된 로더 실행. 한 줄로 묶어 오버로드된 load()메소드를 이용할 순 있지만, 두 줄로 나누면 loader.getController()등의 메소드에 접근 가능. 하지만 여기선 쓰이지 않지ㅋㅋ 사실 getController()만들었다가 충돌나서 지움.
			Scene scene = new Scene(root);		//<-Front.fxml소스를 기반,으로 생성한 로더,를 실행한 결과를 넣어, Scene 생성.
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());		//<-생성된 scene에 스타일시트 입히기. scenebuilder 에서 스타일시트 중첩하면 버그가 나는걸까?
			stage.setScene(scene);		//<-start()메소드의 매개변수로 받은 stage에 만들어진 scene을 입혀버리기
			stage.show();				//<-Show me the stage!
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
//	자, 이렇게 실행하면 Front.fxml이 담긴 stage가 실행되고 그 Front.fxml의 컨트롤러는 FrontCon이라는 클래스에 연동시켜놓았습니다. 그러니 실행되는 Front.fxml의 내부를 살피기 위해서는 Front.fxml과 FrontCon.class를 살피면 됩니다!!
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
