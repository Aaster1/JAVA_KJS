package Day09.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public static void main(String[] args) {
		int menuNo = 0;
		String menuName;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("=================================================================================================================================================");
			System.out.println();
			System.out.println("1. JAVA");
			System.out.println();
			System.out.println("2. HTML");
			System.out.println();
			System.out.println("3. CSS");
			System.out.println();
			System.out.println("4. JavaScript");
			System.out.println();
			System.out.println("0. 줭료");
			System.out.println();
			System.out.println("입력하세요");
			System.out.println();
			System.out.println("=================================================================================================================================================");
			try {
//				에러메세지 :
//					java.util.InputMismatchException	:	by int A
				menuNo = sc.nextInt();
				
			} catch (InputMismatchException e) {		//<--import 됨 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 자동으로됨
				sc.next(); 				//<-- 입력 『스트림』에 남아있는 (엔터) 비움
				System.err.println("(0~4) 사이의 정수를 입력해주세요.");
				continue;
			}
			if(menuNo==0) {
				sc.close();				
				break;
			}
			switch(menuNo) {
			case 1: menuName = "Java";break;
			case 2: menuName = "HTML";break;
			case 3: menuName = "CSS";break;
			case 4: menuName = "JavaScript";break;
			default: menuName = "선택없음"; break;
			}
			System.out.println(menuName+"을/를 공부합니다.");
		}while(true);
		
	}
}
