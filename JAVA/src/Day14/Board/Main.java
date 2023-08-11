package Day14.Board;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Day14.Board.DTO.Board;
import Day14.Board.DTO.Comment;
import Day14.Board.DTO.Text;
import Day14.Board.Service.BoardService;
import Day14.Board.Service.BoardServiceImpl;
import Day14.Board.Service.CommentService;
import Day14.Board.Service.CommentServiceImpl;


// 미친듯이 반복 복습하기 
//	미친듯이 쓰고 구조 익숙해지기

/*
 * 	게시판 프로그램
 * 	- 메뉴판
 * 	- 게시글 목록
 * 	- 게시글 읽기
 * 	- 게시글 쓰기
 * 	- 게시글 수정
 * 	- 게시글 삭제
 */

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	static List<Board> boardList= new ArrayList<Board>();		//<--게시글 개수 배열
	static List<Comment> commentList = new ArrayList<Comment>();
//	비즈니스 로직 계층으로 전환(Service 패키지)
//	비즈니스 로직 계층의 객체를 생성
	static BoardService boardService= new BoardServiceImpl();		//데이터 베이스 접근 객체
	static CommentService commentService = new CommentServiceImpl();
//	보드엑세스 객체 생성할 때, 그 super클래스인 JDBConnection까지 생성된다. 묵시적. compiler가 묵시적으로 수행.
//	생성하는 객체의 부모 객체가 생성되어있지않으면 부모 객체 생성을 따로 안해도 생성이 이루어진다는 이야기다.
	
	
	
	public static void menu() {
		System.out.println("================\t게\t시\t판\t===============");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("6. 댓글 쓰기");
		System.out.println("7. 댓글 수정");
		System.out.println("8. 댓글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.println("================\t번호 입력 : > >");
	}
	/*
	 * 게시글 목록
	 */
	
	public static void list() {
		System.out.println("========\t게\t시\t판\t목\t록\t=======");
		boardList = boardService.list();
		printaAll(boardList);
	}
	
	public static void printaAll(List<? extends Text> list) {
		if(list==null||list.isEmpty()) {
			System.out.println("조회딘 글이 없습니다.");
			return;		//<--반환 값이 없는 메소드에서도 return;으로 끝내면 종료의 의미가 있다!!!!!
		}
		for (Text text : list) {
			print(text);
		}
	}
	
	public static void print(Text text) {
		
		if(text==null) {
			System.out.println("조회되지 않는 글");
			return;
		}
		int no = text.getNo();
		String title = text.getTitle();
		String writer = text.getWriter();
		String content = text.getContent();
		Date regDate = text.getRegDate();
		Date updDate = text.getUpdDate();
		
		System.out.println();
		System.out.println("# 글번호 : "+no+" ================");
		System.out.println();
		if(text instanceof Board)
		System.out.println("# 제목 : "+title);
		System.out.println("# 작성자 : "+writer);
		System.out.println("# " + content);
		System.out.println(" - 등록일자 : " +regDate);
		System.out.println(" - 수정일자 : " +updDate);
		System.out.println();
		System.out.println("=========================");
		System.out.println();

	}
	
	
	
	public static void read() {
		System.out.println("========\t게\t시\t글\t읽\t기\t=======");
		System.out.println("================ 글 번호 : ");
		int boardNo=sc.nextInt();
		Text board = boardService.select(boardNo);

		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		Date regDate = board.getRegDate();
		Date updDate = board.getUpdDate();

		System.out.println();
		System.out.println("# 글번호 : "+boardNo+" ================");
		System.out.println();
		System.out.println("# 제목 : "+title);
		System.out.println("# 작성자 : "+writer);
		System.out.println("# " + content);
		System.out.println(" - 등록일자 : " +regDate);
		System.out.println(" - 수정일자 : " +updDate);
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		
		
//		해당 글의 댓글 목록
		
		commentList = commentService.list(boardNo);

		System.out.println("================\t[댓 글 목 록]\t================");
		
		for (Comment comment : commentList) {
			if(comment ==null)continue;
			
			int commentNo = comment.getNo();
			String commentWriter = comment.getWriter();
			String commentContent = comment.getContent();
			Date commentRegDate = comment.getRegDate();
			Date commentUpdDate = comment.getUpdDate();
			
			System.out.println("==========================================================");
			System.out.println("("+commentNo+") - [" + commentWriter + "]");
			System.out.println("# : " + commentContent );
			System.out.println("# - 등록일자 : " + commentRegDate);
			System.out.println("# - 수정일자 : " + commentUpdDate);
			System.out.println("==========================================================");
		}
			
		
	}
	/*
	 * 게시글 쓰기
	 */
	public static void write() {
		System.out.println("========\t게\t시\t글\t쓰\t기\t=======");
		Board board = input();
		
//		System.out.println("제목 : ");
//		String title = sc.nextLine();				//<-- enter 또한 입력값으로 취급받기에, 바로 다음 입력 받는 변수가 이를 값을 인식해버린다. 해결법은 엔터를 없애버리기 
//		System.out.println("작성자 : ");
//		String writer = sc.nextLine();
//		System.out.println("내용 : ");
//		String content= sc.nextLine();
		
//		Text board = new Board(title,writer,content);
		int result = boardService.insert(board);
		
		//에러 수정필요
		if(result >0) {
			System.out.println("게시글이 작성되었습니다.");
		}
	}
	
	/*
	 * 게시글 수정
	 */
	
	public static void update() {
		System.out.println("========\t게\t시\t글\t수\t정\t=======");
		System.out.println("================게시글 수정 : > >");
		int boardNo = sc.nextInt();
		sc.nextLine();
		Board boardInput = input();
		
		boardInput.setNo(boardNo);
		
		int result = boardService.update(boardInput);
		if(result >0) {
			System.out.println("게시글이 수정되었습니다.");
		}
	}
		public static void delete() {
			System.out.println("========\t게\t시\t글\t삭\t제\t=======");
			System.out.println("================삭제 게시글 No : > >");
			int boardNo = sc.nextInt();
			sc.nextLine();
			
			
			int result = boardService.delete(boardNo);
			if(result >0) {
				System.out.println(boardNo+"번 게시글이 삭제되었습니다.");
			}
		}
	
		public static Board input() {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("작성자 : ");
			String writer= sc.nextLine();
			System.out.print("내용 : ");
			String content= sc.nextLine();
			
			Board board = new Board(title,writer,content);
			return board;
			
		}
		
		/*
		 * 댓글 쓰기
		 */
		public static void commentWrite() {
			System.out.println("================\t댓 글 쓰 기\t");
			System.out.println("글 번호 : ");
			int boardNo = sc.nextInt();
			sc.nextLine();
			Comment comment = inputComment();
			comment.setNo(boardNo);
			
			int result = commentService.insert(comment);
			
			if(result >0) {
				System.out.println("댓글이 작성되었습니다.");
			}
		}
			public static void commentUpdate() {
				System.out.println("================\t댓 글 수 정\t");
				System.out.println("댓글 번호 : ");
				int commentNo = sc.nextInt();
				sc.nextLine();
				Comment comment = inputComment();
				comment.setNo(commentNo);
				
				int result = commentService.update(comment);
				
				if(result >0) {
					System.out.println("댓글이 수정되었습니다.");
				}
			}
				public static void commentDelete() {
					System.out.println("================\t댓 글 삭 제\t");
					System.out.println("댓글 번호 : ");
					int commentNo = sc.nextInt();
					sc.nextLine();
					
					int result = commentService.delete(commentNo);
					
					if(result >0) {
						System.out.println("댓글이 삭제되었습니다.");
					}
			
			
		}
		
		public static Comment inputComment() {
			System.out.print("작성자 : ");
			String writer= sc.nextLine();
			System.out.print("내용 : ");
			String content= sc.nextLine();
			
			Comment comment= new Comment(writer,content);
			return comment;
		}
		
	
//	게시판 프로그램 시작
	public static void main(String[] args) {
		int menuNo = 0;		//	메뉴번호
		do {
			menu();						// <--메뉴판 출력
			menuNo = sc.nextInt();		// <--메뉴번호 입력
			sc.nextLine(); 				// 엔터를 입력버퍼에서 제거
//			메뉴 선택
			
			switch (menuNo) {
			case 1:
				list();					// 게시글 목록
				break;
			case 2:
				read();					// 게시글 읽기
				break;
			case 3:
				write();					// 게시글 쓰기
				break;
			case 4:
				update();					// 게시글 수정
				break;
				
			case 5:
				delete();					// 게시글 삭제
				break;
			case 6:
				commentWrite();
				break;
			case 7:
				commentUpdate();
				break;
			case 8:
				commentDelete();
				break;
			default:
				
				break;
			}
		}while(menuNo !=0);
		
		System.out.println("프로그램을 종료합니다 . . .");
	}
}
