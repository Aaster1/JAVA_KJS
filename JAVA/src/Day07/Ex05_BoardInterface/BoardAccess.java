package Day07.Ex05_BoardInterface;

import java.sql.SQLException;

import Day14.Board.DTO.Text;

public class BoardAccess extends JDBConnection implements DataService{
	
//	데이터 목록 조회
	
	public Text[] selectList() {
		int max = Main.max;
		Text[] boardList = new Text[max];
		
//		SQL 
		String sql = "SELECT *" + "FROM board ";
		try {
			stmt = con.createStatement();		//<--쿼리 실행 객체 생성
			rs = stmt.executeQuery(sql);		//<--쿼리 실행 - 결과 --> rs(ResultSet)
			int i =0;
			while(rs.next()) {
				Text board = new Text();
				
//				결과 데이터 가져오기
//				rs.getXXX("컬럼명") --> 해당 컬럼의 데이터를 가져온다.
				board.setNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setUpdDate(rs.getTimestamp("upd_date"));
				
				if(i>=max)break;
				boardList[i++] = board;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return boardList;
	}
	
//	데이터 조회
	public Text select(int no) {
		Text board = new Text();
		
		String sql = " SELECT * " + " FROM board "+" WHERE board_no = ?";
		
		
		try {
			psmt = con.prepareStatement(sql);		//<--쿼리 실행 객체 생성
//		psmt.setXXX(순서번호, 매핑할 값);
			psmt.setInt(1, no);				//<--?(1) <--boardNo(글번호)
			rs = psmt.executeQuery();					//쿼리 실행
			
//			조회 결과 가져오기
			if(rs.next()) {
				board.setNo(rs.getInt("board_No"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setUpdDate(rs.getTimestamp("upd_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("게시글 조회 시, 에러 발생");
			e.printStackTrace();
		}
		return board;
	}
	
//	데이터 등록
	
	public int insert(Text board) {
		int result = 0;
		
		String sql = " INSERT INTO board( title, writer, content ) "+ " VALUES ( ?, ?, ? )";		//<--띄어쓰기 주의!!!
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, board.getTitle());		//<--제목 매핑
			psmt.setString(2, board.getWriter());		//<--작성자 매핑
			psmt.setString(3, board.getContent());		//<--내용 매핑
			
			result = psmt.executeUpdate();				// SQL 실행 요청, 적용된 데이터 개수를 받아옴			조회 시엔 executeQuery, 수정 시엔 executeUpdate
														//게시글 1개 쓰기 성공시, result : 1
														//				실패 시, result : 0
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("게시글 등록 시, 에러 발생");
			e.printStackTrace();
		}
		return result;
	}
	
//	데이터 수정
	
	public int update(Text board) {
		int result = 0;
		
		String sql = " UPDATE board " + " SET title = ? " + "	,writer = ? "+ "	,content = ?"+"		,upd_date = now() " + " WHERE board_no = ? ";
		
//		- now() : 현재 날짜 / 시간을 반환하는 MySQL 함수
		
		try {
			psmt=con.prepareStatement(sql);
			psmt.setString(1, board.getTitle());;
			psmt.setString(2, board.getWriter());		
			psmt.setString(3, board.getContent());
			psmt.setInt(4, board.getNo());
			
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("게시글 수정 시, 에러 발생");
			e.printStackTrace();
		}
		
		return result;
	}
	
	
//	데이터 삭제
	
	public int delete(int no) {
		int result = 0;
		
		String sql = " DELETE FROM board " + " WHERE board_no = ? ";
		
//		- now() : 현재 날짜 / 시간을 반환하는 MySQL 함수
		
		try {
			psmt=con.prepareStatement(sql);
			psmt.setInt(1, no);
			
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("게시글 삭제 시, 에러 발생");
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Text[] selectList(int boardNo) {
		return null;
	}
}
