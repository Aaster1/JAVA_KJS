package Day01;

import java.util.Scanner;

public class Ex03_InputOperator_Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 과목의 랜덤 시험을 받겠습니까?(숫자만 입력)");
		int N = sc.nextInt();
		double avg = 0.0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			int a = (int)((Math.random()*100)+1);
			System.out.println((i+1)+"과목 : "+a);
			avg +=a;
			count++;
		}
		avg /= count;
		System.out.printf("%3.1f",avg);
		
		sc.close();
}
}
