package Day01;

import java.util.Scanner;

public class Ex04_InputDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("y : ");
		int y = sc.nextInt();
		System.out.print("z : ");
		int z = sc.nextInt();
//		합계, 평균
		double sum = x+y+z;
		double avg = sum / 3;
//		(int) / (int) = (int)
//		(double) / (int) : (double)
//		-서로 다른 자료형 연산 시, 결과는 큰 자료형으로 반환된다.
//		ex) 숫자를 3 -> 3.0(실수형) or sum => double 자료형으로.
		
		System.out.println("합계 : " + sum);
		System.out.print("합계 : " + avg);
//		avg 평균 변수가 정수형(int)이라서 소수부분을 표현할 수 없다.
//		실수형 변수로 변환하여 소수부분 표현가능
		sc.close();
	}
}
