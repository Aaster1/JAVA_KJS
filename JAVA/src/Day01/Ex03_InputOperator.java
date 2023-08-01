package Day01;

import java.util.Scanner;

public class Ex03_InputOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("y : ");
		int y = sc.nextInt();
		System.out.print("z : ");
		int z = sc.nextInt();
//		합계, 평균
		int sum = x+y+z;
		float avg = sum / 3;
		
		System.out.println("합계 : " + sum);
		System.out.print("합계 : " + avg);
//		avg 평균 변수가 정수형(int)이라서 소수부분을 표현할 수 없다.
//		실수형 변수로 변환하여 소수부분 표현가능
		sc.close();
	}
}