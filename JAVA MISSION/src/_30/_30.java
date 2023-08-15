package _30;

import java.util.Scanner;

public class _30 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		수식 입력
		System.out.println("수식을 입력하십시오.");
//		입력한 수식을 문자열로 저장
		String a = sc.nextLine();
//		split으로 분해하여 바로 배열에 저장하려 했으나,
//		곧바로 부호를 단위로 분해하기가 애매한 부분이 2곳 존재.
//		1. (으로 시작하는 문자열을 분리하기가 애매함.
//		2. 부호 2개 이상이 뭉친 부분이 있을 시, 배열의 빈 값으로 들어감
//			하지만 2번 사항은 정규표현식 + 를 통해 해결 가능.
//		
//		따라서, replaceAll을 이용해 모든 부호를 공백으로 치환한 다음
//		trim()을 통해 양 끝단의 공백 제거 후,
//		공백을 기준으로 split 실행
		a= a.replaceAll("[^0-9]+"," ");
		String[] arr= a.trim().split(" ");
//		생성된 배열의 크기와 각 칸의 값이 의도한 바와 맞는지에 대한 확인 과정
		System.out.println(arr.length);
		for (String string : arr) {
			System.out.print(string + " ");
		}
//		Integer.parseInt를 통한 문자열 -> 정수형으로 변환. 후 계산
		
		System.out.println((Integer.parseInt(arr[0])+Integer.parseInt(arr[1]))*Integer.parseInt(arr[2])+Integer.parseInt(arr[3]));
	}
}
