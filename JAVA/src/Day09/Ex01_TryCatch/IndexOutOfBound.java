package Day09.Ex01_TryCatch;

import java.util.Scanner;

public class IndexOutOfBound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\t배열 요소의 개수 : ");
		int N = sc.nextInt();
		int[] arr= new int[N];
		
		System.out.print("\t접근할 index : ");
		int index = sc.nextInt();
		System.out.print("\t입력할 값: ");
		int input = sc.nextInt();
		
		try {
//			예외 메시지 :
//			java.lang.ArrayIndexOutOfBoundsException
//			Index 5 out of bounds for length 5
			arr[index] = input;
			System.out.println("\tarr["+index+"} : "+arr[index]);
			
		} catch (IndexOutOfBoundsException e) {
			System.err.println("\t해당 index의 범위를 초과하여 접근하였습니다.");
			System.err.println("\tindex에 "+"(0~"+(N-1)+") 범위의 정수를 입력해주세요");
		}
		System.out.println("\t프로그램을 종료합니다.");
		sc.close();
		
	}
}
