package Day02;

import java.util.Scanner;

public class Ex21_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {				//<-무한루프. 종료조건이 필수.
			System.out.print("입력 : ");
			String str = sc.nextLine().toUpperCase();
//			문자열.equals("비교문자열")
//			 : 문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드
			if(str.equals("STOP")) {
				break;
			}
			System.out.println(">> " + str);
		}
		System.out.println("프로그램을 종료합니다...");
		sc.close();
		
	}
}
