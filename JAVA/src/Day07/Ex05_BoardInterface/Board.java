package Day07.Ex05_BoardInterface;


public class Board extends Text{
	private int boardNo;
//	생성자
	public Board() {
		this("제목없음", "글쓴이없음", "내용없음");
	}

	public Board(String title, String writer, String content) {
		super(title,writer,content);
	}

//	getter,setter
	

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
		setNo(boardNo);
	}
	

//	toString
//	: 객체를 출력할 때, 지정한 문자열 형식으로 반환하는 메소드
//		Object(최상위클래스)에 정의되어 있으며, 이를 오버라이딩하여 사용한다.
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" +  ", writer=" +  ", content=" + 
				", regDate=" +  ", updDate=" +  "]";
	}

	}

