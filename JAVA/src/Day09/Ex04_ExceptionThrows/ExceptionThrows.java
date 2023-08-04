package Day09.Ex04_ExceptionThrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {
	static Scanner sc = new Scanner(System.in);		//<-닫을 필요 없음. static의 경우, 실행 종료 시 알아서 종료.
	
	public static void main(String[] args) {
		try {
			input();
		}catch(InputMismatchException e){
			e.printStackTrace();
			System.err.println("정수를 입력해주세요");
		}
	}
	
	
//	예외전가 (예외 던지기, 예외 떠넘기기) - Throws
//	:	예외 처리에 대한 책임을 메소드를 호출한 곳으로 떠넘기는 것. 이 경우, 예외가 발생하는 라인이 10번 라인이 된다.
	public static void input() throws InputMismatchException{
		System.out.print("입력 : ");
		int input = sc.nextInt();					//<--InputMismatchException 발생 가능성 존재
		System.out.println(input);
	}
}
