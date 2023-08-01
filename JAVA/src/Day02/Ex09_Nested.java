package Day02;

import java.util.Scanner;

public class Ex09_Nested {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		정보처리기사 자격증 합격기준
//		4학년, 60점 이상 - 두 조건 동시 달성 시 합격
		System.out.print("학년 : ");
		int year = sc.nextInt();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if (year == 4) {
			if(score >=60) System.out.println("홥굑");
			else System.out.print("ㄴㄴ");
		} else {
			System.out.println("ㄴㄴ");
		}
//		위와 같은 조건문 내 조건문, 즉 중첩 조건문은 추천하쥐 않숩네다. 가독성이 넘 안좋아영
		
//		중첩하지 않고 논리연산자로 작성하는 방법
		
		if(year == 4 && score>=60) System.out.print("홥굑");
		else System.out.print("ㄴㄴ");
		sc.close();
	}
}
