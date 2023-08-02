package 얀쑵장;

import java.util.Scanner;

public class 얀쑵장 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 게임?");
		int N = sc.nextInt();
		int lotto[][] = new int[N][6];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 6; j++) {
				lotto[i][j] = (int)((Math.random()*45)+1);
				for (int k = 0; k < i; k++) {
					if(lotto[i][j] == lotto[i][k]) {		//<--중복제거
						i--;								//<--중복제거
					}
					if(lotto[i][j] < lotto[i][k]) {			//<--정렬
						int temp = lotto[i][j];				//<--정렬
						lotto[i][j] = lotto[i][k];			//<--정렬
						lotto[i][k] = temp;					//<--정렬
					}
				}
			}
		}
		for (int  i= 0;  i< N; i++) {
			System.out.print("["+(+1)+"게임] : ");
			for (int j = 0; j < 6; j++) {
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
