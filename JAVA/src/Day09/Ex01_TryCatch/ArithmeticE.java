package Day09.Ex01_TryCatch;

import java.util.Scanner;

public class ArithmeticE {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("a : ");
		a=sc.nextInt();
		System.out.print("b : ");
		b=sc.nextInt();
		
//		예외 메시지 : java,lang.ArithmeticException:	/	by zero
//		예외 처리문	:	try ~ catch
//		try	:	ctrl + space
		
		try {
//			에외 발생 가능성이 있는 문장
		System.out.println("a/b = "+ a/b);
		}
//		catch(예외타입 객체명(명칭변경가능)
		catch(ArithmeticException e){
//			e.printStackTrace()			//<--따위를 확인할 때 e를 이용함 
			System.err.println("a를 b로 나눌 수 없습니다.");
			
			
		}
//		finally 블록 생략가능
//		어차피 실행은 결과와 상관없이 되지만, 구분짓는 용도
//		sc.close()를 해제하기 위해. 관습적.
		finally {
//			예외 발생과 무관하게 실행하는 문장
//			주로 예외 처리와 관련된 문장을 작성( 메모리 해제 등 )
			System.out.println("a를 b로 나눕니다.");
			sc.close();
		}
	}
}
