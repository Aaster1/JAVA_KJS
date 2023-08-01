package Day02;

import java.util.Scanner;

public class Ex10_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("채널을 선택하세요 : ");
		int channel = sc.nextInt();
		
//		switch : ctrl + space
		switch (channel) {
		case 11:
			System.out.println("MBC");
			break;
			
		case 1:
			System.out.println("넷플릭스 - 하트시그널");
			break;			
			
		case 15:
			System.out.println("JTBC");
			break;
			
		case 2:
			System.out.println("디즈니플러스");
			break;
			
		case 4:
			System.out.println("쿠팡플레이");
			break;

		default:
			System.out.println("잘못된 채널입니다");
			break;
		}
	}
}
