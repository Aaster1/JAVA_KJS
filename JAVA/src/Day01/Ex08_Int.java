package Day01;

public class Ex08_Int {
	public static void main(String[] args) {
		
		//리터럴
		// : 프로그램에서 직접 표현 값
		int var1 = 10;
		
		int var2 = 0b10; //0b를 앞에 붙이면 2진수
		
		int var3 = 010; //0을 앞에 붙이면 8진수
		
		int var4 = 0x10; //0x을 앞에 붙이면 16진수
		
		System.out.println("var1 : 10진수 그대로 : " + var1);
		System.out.println("var2 : 2진수의 10 : " + var2);
		System.out.println("var3 : 8진수의 10 : " + var3);
		System.out.println("var4 : 16진수의 10 : " + var4);
	}
}
