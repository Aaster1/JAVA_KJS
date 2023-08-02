package Day07.Ex05_BoardInterface;


public class Comment extends Text{
	
	private int commnetNo;
	
	public Comment() {
		this("글쓴이없음", "내용없음");
	}

	public Comment( String writer, String content) {
		super(writer, content);
	}

	public int getCommnetNo() {
		return commnetNo;
	}

	public void setCommnetNo(int commnetNo) {
		this.commnetNo = commnetNo;
	}


	
	
}
