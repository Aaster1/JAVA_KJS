package Day01;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
//		객체 생성 - new
//		클래스타입 객체명 = new 클래스명();
//		표준입력객체 - Scanner 
		Scanner sc = new Scanner(System.in); // 외부 클래스 포함시키기 "import ~ line 3"
//		노란색 밑줄은 경고입니다앙~ = 『추천』
//		빨간색 밑줄은 에러입니당~ = 『이 코드 못씀』
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.println("a : " + a);
//		"문자열" : 문자열은 큰 따옴표로 표현한다.
//		문자열과 숫자, 문자열과 문자열은 + 로 연결가능.
//		이 때, 숫자(int) 자료형이 문자열 자료형으로 변환되어 연결됨
		sc.close(); // Scanner 객체를 메모리에서 해제하는 메소드
	}
}
