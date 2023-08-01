package Day05.Review;

import java.util.Scanner;

public class Ex04_Lotto{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lotto[] = new int[6];
		
		
//		1~45 사이의 6개 랜덤 수를, 중복을 제거하고 오름차순으로 정렬
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random()*45+1);
			lotto[i] = num;
			
//			중복제거
			for(int j =0;j<i;j++) {
				if(num ==lotto[j]) i--;
			}
			
		}
		
//		오름차순 정렬
		/*
		 	1. i번째 요소를 선택, 나머지 요소들과 비교
		 	
		 	2. (선택요소) > (비교요소) -> 교환
		 */
		for (int i = 0; i < lotto.length-1; i++) {			//<--선택요소 [i]는 마지막번째까지 갈 필요가 없다.
			for (int j = i+1; j < lotto.length; j++) {		//ㅡ--비교요소 [j]는 첫번째 부터 시작할 이유가 없다.
															//이해가 안되면 그림 그려보기
				
//				선택 요소 : lotto[i]
//				비교 요소 : lotto[j]
				if(lotto[i]>lotto[j]){
//					두 요소를 교환
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp; 
					
					
				}
			}
			
		}
		
		
		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j]+" ");
		}
		System.out.println();
		sc.close();
	}
}