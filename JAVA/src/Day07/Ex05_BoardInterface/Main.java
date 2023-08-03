package Day07.Ex05_BoardInterface;

import java.util.Date;
import java.util.Scanner;


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
	static int max = 10;		// <--게시글 최대 개수 설정
	static Text[] boardList= new Text[max];		//<--게시글 개수 배열
	static DataService data = new BoardAccess();		//데이터 베이스 접근 객체
	static DataService data2 = new CommentAccess();		//데이터 베이스 접근 객체
	static Text[] commentList = new Comment[max]; 		//댓글 목록
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
		boardList = data.selectList();
		for (Text board : boardList) {
			if(board ==null) {
				System.out.println("(게시글 없음)");
				continue;
			}
			int boardNo = board.getNo();
			String title = board.getTitle();
			String writer = board.getWriter();
			String content = board.getContent();
			Date regDate = board.getRegDate();
			
			
			System.out.println("("+boardNo+") \t | " + title + " \t| " + writer+ " \t| "+content+" \t| " + regDate );
		}

	}
	public static void read() {
		System.out.println("========\t게\t시\t글\t읽\t기\t=======");
		System.out.println("================ 글 번호 : ");
		int boardNo=sc.nextInt();
		Text board = data.select(boardNo);

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
		
		commentList = data2.selectList(boardNo);

		System.out.println("================\t[댓 글 목 록]\t================");
		
		for (int i = 0; i < commentList.length; i++) {
			if(commentList[i] ==null)continue;
			
			int commentNo = commentList[i].getNo();
			String commentWriter = commentList[i].getWriter();
			String commentContent = commentList[i].getContent();
			Date commentRegDate = commentList[i].getRegDate();
			Date commentUpdDate = commentList[i].getUpdDate();
			
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
		Text board = input();
		
//		System.out.println("제목 : ");
//		String title = sc.nextLine();				//<-- enter 또한 입력값으로 취급받기에, 바로 다음 입력 받는 변수가 이를 값을 인식해버린다. 해결법은 엔터를 없애버리기 
//		System.out.println("작성자 : ");
//		String writer = sc.nextLine();
//		System.out.println("내용 : ");
//		String content= sc.nextLine();
		
//		Text board = new Board(title,writer,content);
		int result = data.insert(board);
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
		Text boardInput = input();
		
		boardInput.setNo(boardNo);
		
		int result = data.update(boardInput);
		if(result >0) {
			System.out.println("게시글이 수정되었습니다.");
		}
	}
		public static void delete() {
			System.out.println("========\t게\t시\t글\t삭\t제\t=======");
			System.out.println("================삭제 게시글 No : > >");
			int boardNo = sc.nextInt();
			sc.nextLine();
			
			
			int result = data.delete(boardNo);
			if(result >0) {
				System.out.println(boardNo+"번 게시글이 삭제되었습니다.");
			}
		}
	
		public static Text input() {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("작성자 : ");
			String writer= sc.nextLine();
			System.out.print("내용 : ");
			String content= sc.nextLine();
			
			Text board = new Text(title,writer,content);
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
			
			int result = data2.insert(comment);
			
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
				
				int result = data2.update(comment);
				
				if(result >0) {
					System.out.println("댓글이 수정되었습니다.");
				}
			}
				public static void commentDelete() {
					System.out.println("================\t댓 글 삭 제\t");
					System.out.println("댓글 번호 : ");
					int commentNo = sc.nextInt();
					sc.nextLine();
					
					int result = data2.delete(commentNo);
					
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
