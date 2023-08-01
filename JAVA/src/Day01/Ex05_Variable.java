package Day01;

public class Ex05_Variable {
	public static void main(String[] args) {
//		변수 선언
		//- 자료형 변수명;
		
//		변수 선언 및 초기화;
//		- 자료형 변수명 = 값;
		int x; //int 형 변수 x 선언
		int y; //int 형 변수 y 선언
//		int x,y 와 같은 형태로, 같의 자료형의 경우 한 줄로 나열 가능.
		// = (대입 연산자)
		// Ex) A = B;
		x = 10;
		y = 20;
//		Ex) x + y;
//		피연산자 : x,y;
//		연산자 : +, -, *, / 등;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("x + y : " + (x + y));
		System.out.println("(x + y) / 2 : " + (x + y)/2);
	}
}
