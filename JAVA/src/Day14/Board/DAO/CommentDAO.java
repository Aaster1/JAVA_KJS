package Day14.Board.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Day14.Board.DTO.Comment;
import Day14.Board.DTO.Text;

public class CommentDAO extends JDBConnection implements DataService {

	public List<? extends Text>selectList() {
		List<Comment>commentList = new ArrayList<Comment>();

//		SQL 
		String sql = "SELECT *" + "FROM comment ";
		try {
			stmt = con.createStatement(); // <--쿼리 실행 객체 생성
			rs = stmt.executeQuery(sql); // <--쿼리 실행 - 결과 --> rs(ResultSet)
			int i = 0;
			while (rs.next()) {
				Comment comment = new Comment();

//				결과 데이터 가져오기
//				rs.getXXX("컬럼명") --> 해당 컬럼의 데이터를 가져온다.
				comment.setCommentNo(rs.getInt("comment_no"));
				comment.setBoardNo(rs.getInt("board_no"));
				comment.setWriter(rs.getString("writer"));
				comment.setContent(rs.getString("content"));
				comment.setRegDate(rs.getTimestamp("reg_date"));
				comment.setUpdDate(rs.getTimestamp("upd_date"));

				commentList.add(comment);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return commentList;
	}

//	데이터 조회
	public Text select(int no) {
		Comment comment= new Comment();

		String sql = " SELECT * " + " FROM comment" + " WHERE comment_no = ?";

		try {
			psmt = con.prepareStatement(sql); // <--쿼리 실행 객체 생성
//		psmt.setXXX(순서번호, 매핑할 값);
			psmt.setInt(1, no); // <--?(1) <--boardNo(글번호)
			rs = psmt.executeQuery(); // 쿼리 실행

//			조회 결과 가져오기
			if (rs.next()) {
				comment.setCommentNo(rs.getInt("comment_no"));
				comment.setBoardNo(rs.getInt("board_No"));
				comment.setWriter(rs.getString("writer"));
				comment.setContent(rs.getString("content"));
				comment.setRegDate(rs.getTimestamp("reg_date"));
				comment.setUpdDate(rs.getTimestamp("upd_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("댓글 조회 시, 에러 발생");
			e.printStackTrace();
		}
		return comment;
	}
	
//	특정 글에 해당하는 댓글 데이터 목록 조회

		public List<? extends Text> selectList(int boardNo) {
			List<Text>commentList = new ArrayList<Text>();

//			SQL 
			String sql = "SELECT *" + "FROM comment " + " WHERE board_no = ?";
			try {
				psmt = con.prepareStatement(sql);		// <--쿼리 실행 객체 생성
				psmt.setInt(1, boardNo);				//1번 ? 에 글번호를 매핑
				rs = psmt.executeQuery(); 				//<--쿼리 실행 - 결과 -->rs(ResultSet)
				int i = 0;								//<--쿼리 실행 - 결과 -->rs(ResultSet)
				while (rs.next()) {
					
//					조회 결과를 배열에 추가
					
					Comment comment = new Comment();

//					결과 데이터 가져오기
//					rs.getXXX("컬럼명") --> 해당 컬럼의 데이터를 가져온다.
					comment.setCommentNo(rs.getInt("comment_no"));
					comment.setBoardNo(rs.getInt("board_no"));
					comment.setWriter(rs.getString("writer"));
					comment.setContent(rs.getString("content"));
					comment.setRegDate(rs.getTimestamp("reg_date"));
					comment.setUpdDate(rs.getTimestamp("upd_date"));
					
					commentList.add(comment);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return commentList;
		}
	

//	데이터 등록

	public int insert(Text board) {
		int result = 0;

		String sql = " INSERT INTO comment( board_no, writer, content ) " + " VALUES ( ?, ?, ? )"; // <--띄어쓰기 주의!!!
		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, board.getNo());
			psmt.setString(2, board.getWriter()); // <--작성자 매핑
			psmt.setString(3, board.getContent()); // <--내용 매핑

			result = psmt.executeUpdate(); // SQL 실행 요청, 적용된 데이터 개수를 받아옴 조회 시엔 executeQuery, 수정 시엔 executeUpdate
											// 댓글 1개 쓰기 성공시, result : 1
											// 실패 시, result : 0

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("댓글 등록 시, 에러 발생");
			e.printStackTrace();
		}
		return result;
	}

	public int update(Text board) {
		int result = 0;

		String sql = " UPDATE comment " + "SET writer = ? " + "	,content = ?"
				+ "		,upd_date = now() " + " WHERE comment_no = ? ";

//		- now() : 현재 날짜 / 시간을 반환하는 MySQL 함수

		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, board.getWriter());
			psmt.setString(2, board.getContent());
			psmt.setInt(3, board.getNo());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("댓글 수정 시, 에러 발생");
			e.printStackTrace();
		}

		return result;
	}

//	데이터 삭제

	public int delete(int no) {
		int result = 0;

		String sql = " DELETE FROM comment " + " WHERE comment_no = ? ";

//		- now() : 현재 날짜 / 시간을 반환하는 MySQL 함수

		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, no);

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("댓글 삭제 시, 에러 발생");
			e.printStackTrace();
		}

		return result;
	}
}