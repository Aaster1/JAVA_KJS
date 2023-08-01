package Day06.Board;

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
	static Board[] boardList= new Board[max];		//<--게시글 개수 배열
	static DataAccess data = new DataAccess();		//데이터 베이스 접근 객체
	public static void menu() {
		System.out.println("================\t게\t시\t판\t===============");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.println("================\t번호 입력 : > >");
	}
	/*
	 * 게시글 목록
	 */
	
	public static void list() {
		System.out.println("========\t게\t시\t판\t목\t록\t=======");
		boardList = data.selectList();
		for (Board board : boardList) {
			if(board ==null) {
				System.out.println("(게시글 없음)");
				continue;
			}
			int boardNo = board.getBoardNo();
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
		Board board = data.select(boardNo);

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
		
//		Board board = new Board(title,writer,content);
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
		Board boardInput = input();
		
		boardInput.setBoardNo(boardNo);
		
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
				
			default:
				
				break;
			}
		}while(menuNo !=0);
		
		System.out.println("프로그램을 종료합니다 . . .");
	}
}
