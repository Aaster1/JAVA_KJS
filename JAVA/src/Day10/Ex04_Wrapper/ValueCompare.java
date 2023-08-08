package Day10.Ex04_Wrapper;


//	그래서 Wrapper를 왜 박싱 & 언박싱 해야하는가?

public class ValueCompare {
	
	public static void main(String[] args) {
		
		Integer intObj1 = 10;
		Integer intObj2 = 10;
		
		System.out.println("intObj1==intObj2");
		System.out.println("결과 : " + (intObj1 ==intObj2));
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj1.intValue() == intObj2.intValue()));
		
//		equals()	: 래퍼객체가 가진 내부의 값을 비교하는 메소드
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : "+intObj1.equals(intObj2));
		
		System.out.println("-------------------------------------------");
		
		Integer intObj3 = 200; 
		Integer intObj4 = 200;
		
		
//		Integer는 클래스다. 단순비교만 하면 그냥 클래스를 냅다 비교하는것과 같다
		
//		==, != 기호로 래퍼객체를 비교하면,
//		아래의 범위에서는 내부의 값을 바로 비교해줄 수 있다.
//		Boolean			: true, false
//		정수 타입		: -128 ~ 127			
//		char				:\u0000 ~ \007f
//		이 과정이, 혹여 다른 인스턴스여도 범주 안에서 비교한다란 느낌이랑은 다르다.
//		위의 범위 안에서의 값비교에서 인스턴스가 동일한 취급을 당하게 되는 셈이다.
//		System.identityHashCode(class)를 이용해 해시코드를 비교해본다면 동일한 값이 나온다.
		System.out.println("intObj3==intObj4");
		System.out.println("결과 : " + (intObj3 ==intObj4));
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj3.intValue() == intObj4.intValue()));
		
		System.out.println("equals() 메소드로 비교");
		System.out.println("결과 : "+intObj3.equals(intObj4));
	}
	
}
