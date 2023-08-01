package Day02;

import java.util.Scanner;

public class Ex11_Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		String grade = sc.next().toUpperCase();
		
		switch (grade) {
		case "A":
			System.out.println("90~100점");
			break;
		case "B":
			System.out.println("80~90점");
			break;
		case "C":
			System.out.println("70~80점");
			break;
		case "D":
			System.out.println("60~60점");
			break;
		case "F":
			System.out.println("60점 미만입니다.");
			break;

		default:
			System.out.println("A~F 사이의 문자를 입력해주십시오.");
			break;
		}
		sc.close();
	}
}
