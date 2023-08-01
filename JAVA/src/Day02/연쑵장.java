package Day02;

import java.util.Scanner;

public class 연쑵장{
	public static void main(String[] args) {
		int menuNo=0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("####점심 메뉴판####");
			System.out.println("1. 떡볶이");
			System.out.println("2. 김밥");
			System.out.println("3. 쌀국수");
			System.out.println("4. 라면");
			System.out.println("5. 돈까스");
			System.out.println("6. 버거킹");
			System.out.println("메뉴번호(중단을 원하시면 0을 입력하십시오) : ");
			menuNo=sc.nextInt();
			switch (menuNo) {
			case 1:
				menuName = "떡볶이";
				break;
			case 2:
				menuName = "김밥";
				break;
			case 3:
				menuName = "쌀국수";
				break;
			case 4:
				menuName = "라면";
				break;
			case 5:
				menuName = "돈까스";
				break;
			case 6:
				menuName = "버거킹";
				break;

			default:
				break;
			}
			if(menuNo>=1&&menuNo<=6) System.out.println(menuName+"을/를 먹었습니다.");
			else if(menuNo==0) System.out.println("메뉴 시스템을 정지합니다.");
			else System.out.println("That's wrong number");
		}while(menuNo!=0);
		sc.close();
	}
}