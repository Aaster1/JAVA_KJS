package Day05.Review;

import java.util.Scanner;


/*
 * 화폐 매수 구하기
 * 
 * 금액		:537620
 * 50000	:개
 * 10000	:개
 * 5000		:개
 * 1000		:개
 * 500		:개
 * 100		:개
 * 50		:개
 * 10		:개
 */

public class Ex03_NumberOfCurrency {
	public static void main(String[] args) {
		System.out.print("얼마?");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nTemp = N;
		int m5= 50000;
		int m5c= 0;
		int m = 10000;
		int mc = 0;
		int tt5 = 5000;
		int tt5c = 0;
		int tt = 1000;
		int ttc = 0;
		int h5 = 500;
		int h5c = 0;
		int h = 100;
		int hc = 0;
		int t5 = 50;
		int t5c = 0;
		int t = 10;
		int tc = 0;
		while(N>=50000) {
			N -= m5;
			m5c+=1;
		}
		while(N>=10000) {
			N -= m;
			mc+=1;
		}
		while(N>=5000) {
			N -= tt5;
			tt5c+=1;
		}
		while(N>=1000) {
			N -= tt;
			ttc+=1;
		}
		while(N>=500) {
			N -= h5;
			h5c+=1;
		}
		while(N>100) {
			N -= h;
			hc+=1;
		}
		while(N>=50) {
			N -= t5;
			t5c+=1;
		}
		while(N>=10) {
			N -= t;
			tc+=1;
		}
		System.out.println(nTemp+"원 : ");
		System.out.println("50000원 : "+m5c);
		System.out.println("10000원 : "+mc);
		System.out.println("5000원 : "+tt5c);
		System.out.println("1000원 : "+ttc);
		System.out.println("500원 : "+h5c);
		System.out.println("100원 : "+hc);
		System.out.println("50원 : "+t5c);
		System.out.println("10원 : "+tc);
		
		sc.close();
	}
	
}
