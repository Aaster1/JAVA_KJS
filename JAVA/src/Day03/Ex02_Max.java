package Day03;

import java.util.Scanner;

public class Ex02_Max {
	public static void main(String[] args) {
//		첫째 줄에 입력할 개수 N 입력받고,
//		둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
//		(입력예시)
//		5
//		90 60 70 100 55
//		(출력예시)
//		최댓값 : 100

//		순서도

		/*
		 * 1. 정수 하나를 입력받는다. 2. 입력 받은 정수를 변수N으로 지정한다. 3. N회의 정수를 공백사이로 입력받는다. 4. 입력받은 N개의
		 * 정수를 배열 arr에 저장한다. 5. 배열 arr를 반복하여, max 와 i번째 요소를 비교한다.
		 * 6.두 요소 중 더 큰 요소를 볍ㄴ수 max에 대입한다.
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 정수를 입력받으시겠습니까?");
		int N = sc.nextInt();
		int arr[] = new int[N];
		System.out.println("정수 " + N + "개를 입력해주십시오(사이 공백)");
		for (int i = 0; i < N; i++) {
			int m = sc.nextInt();
			arr[i] = m;

		}
		int max = 0;			// -->Integer.MIN_VALUE = int 타입의 최솟값 : -21억xxx
		for (int i = max; i < N; i++) {
			for (int j = i; j < N; j++) {
				if (max < arr[j]) {					
					max = arr[j];
					System.out.println(max);
				} else {
					continue;
				}
			}
		}
		System.out.println("최댓값 : "+max);
		sc.close();
	}
}