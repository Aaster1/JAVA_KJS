package Day01;

import java.util.Scanner;

public class 연습띠{
	public static void main(String[] args) {
		final double PI = Math.PI;
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 : ");
		double radius = sc.nextDouble();
		double area = PI*(Math.pow(radius,2));
		
		System.out.printf("원의 넓이(소숫점 2자리) : %5.2f",area);
		sc.close();
	}
}