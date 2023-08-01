package Day02;

import java.util.Scanner;

public class Ex18_Gugu {
	public static void main(String[] args) {
//		구구단(1~9단)
//		원하는 단을 입력받아 아래와 같이 구구단 수식을 출력하시오.
//		입력 : 3
//		출력 : . . . 
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단의 단을 입력하십시오.");
		int level = sc.nextInt();
//		9회 반복
//		(입력 단) x (반복변수 : 1~9) = 결과
		for (int i=1; i<=9;i++) {
			System.out.println(level+"x"+i+"="+(level*i));
		}
		sc.close();
	}
}
