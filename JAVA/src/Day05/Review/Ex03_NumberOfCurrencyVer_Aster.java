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

public class Ex03_NumberOfCurrencyVer_Aster {
	
	/*		『순서도』
	 * 
	* 1. 필요한 변수 선언
	* 	- (입력금액),(화폐매수),(화폐단위)
	* 
	* 2. (입력금액) 입력	=> 임시로 536720 으로 지정.
	* 
	* 3. 화폐매수 계산
	* [조건] : 큰 화폐단위부터 계산한다.
	* 
	* 3-1. 화폐매수 계산.
	* 		537620	/	50000 = 10;
	* 
	* 3-2. 잔액계산
	* 		37620 = 537620 - (50000*10)
	* 		or
	* 		37620 = 536720 % 50000
	* 	i)	(잔	액) = (입력금액) - (화폐단위&화폐매수)
	* 	ii)	(잔	액) = (입력금액) % (화폐단위 
	* 
	* 3-3. 화폐단위 변환
	*		화폐단위 첫 자리가 5일 때, /5,
	*				첫 자리 2일 때, /2,
	*				.	.	.	.
	*				반복
	*				
	*
	*		(화폐단위) = (화폐단위) /5
	*		(화폐단위) = (화폐단위) /2
	*
	*	4. 3번까지의 조건을 반복
	*		- 반복조건 : (화폐단위)가 1보다 크거나 같으면 반복)
	*
	*	5. 3-1에서 구한 화폐매수를 출력한다.
	 */
	
	public static void main(String[] args) {
		int input;			//입력금액
		int count;			//화폐매수
		int money = 50000;			//화폐단위 --> 큰 단위부터 시작
		boolean sw = true;
		
//		입력!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 : ");
		input = sc.nextInt();
		
//		화폐매수 계산
		while(input>=10) {
		
		count = input / money;
		System.out.println(money+"\t: "+count+" 개");
		
		input = input - (money*count);
		
		if(sw) {
			money = money/5;
			sw=false;
		}
		else {
			money = money/2;
			sw=true;
		}
		}
		System.out.println("나머지 : "+input+"원");
		sc.close();
	}
}
