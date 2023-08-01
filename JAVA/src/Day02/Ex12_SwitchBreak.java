package Day02;

import java.util.Scanner;

public class Ex12_SwitchBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		
//		입력 받은 정수를 5로 나눈 나머지
//		2보다 작으면 "*" 출력
//		그렇지 않으면 "**"출력
		
		switch (num%5) {
		case 0:
			System.out.println("*");
			break;
		case 1:
			System.out.println("*");
			break;
		case 2:
			System.out.println("**");
			break;
		case 3:
			System.out.println("**");
			break;
		case 4:
			System.out.println("**");
			break;
			
//			switch (num%5) {
//			case 0:
//			case 1:
//				System.out.println("*");
//				break;
//			case 2:
//			case 3:
//			case 4:
//				System.out.println("**");
//				break;

//			1번째 코드는 비효율 => 주석 코드 스위치 케이스의 경우 break 생략으로 아래 명령문까지 끌어올수 있기에 활용가능
			
		default:
			System.out.println("올바른 정수를 입력햐");
			break;
		}
		sc.close();
	}
}
