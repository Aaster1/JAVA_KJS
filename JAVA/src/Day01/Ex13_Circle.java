package Day01;

import java.util.Scanner;

public class Ex13_Circle {
	public static void main(String[] args) {
//		상수
//		-프로그램 실행 동안 값을 변경하지 않고 사용할 값
//		* 상수 선언 시 , 반드시 값을 초기화해야한다.
//		*선언 후에 값을 변경하면 에러가 발생한다.
//		-키워드 : final
		final double PI = 3.141592;
//		PI = 3.14; //-> 에러남. 상수는 변경 불가.
		Scanner sc = new Scanner(System.in);
//		쉬프트 엔터 : 커서랑 상관없이 다음줄 만들고 해당 줄로 가버리기
		System.out.print("반지름 : ");
		double radius =sc.nextDouble();
		double area = PI*radius*radius;
		
		System.out.println("원의 넓이 : " + area);
		sc.close();; // sc.까지 입력했을 때 나오는 목록은 위아래키와 ;로 선택가능
//		
	}
}
