package Day02;

import java.util.Scanner;

public class Ex20_Continue {
	public static void main(String[] args) {
//	5개의 정수를 입력받아
//		입력받은 수 중 양수(+)만 합계를 구하여 출력하시오.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("정수를 입력하세요(사이 공백)");
			int n =sc.nextInt();
//			음수일 때만, 합계에 누적하지 않고 넘어가기
			if (n<0) {
				continue;		//다음 반복으로. 남은 반복문 무시
			}else {
				sum +=n;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
