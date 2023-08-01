package Day05.Review;

import java.util.Scanner;

public class Ex01_Multiple {

		public static void main(String[] args) {
//			정수 하나 입력
//			입력 받은 수가 3의 배수 판단 후 여부 출력
//			ex : "3의 배수입니다."
//				"3의 배수가 아닙니다."
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 : ");
			int N =sc.nextInt();
			
//			3의 배수 : 3,6,9, . . . 
//			조건 : 3의 배수?
			
//			방법 1 : if 활용
			if(N%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
			
//			방법 2 : 3항 연산자 활용
			String answer = N%3 ==0 ? "3의 배수입니다." : "3의 배수가 아닙니다.";
			System.out.println(answer);
			
			
//			방법 3 : switch
			
			
			sc.close();
		}
}
