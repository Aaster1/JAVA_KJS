package Day12.Ex03_Generic;

public class LimitedTypeMethod {

	
//	제네릭 메소드 타입 제한
//	Number : 자식클래스(Integer, Double 등 숫자관련 클래스)
	public <T extends Number> void method(T t) {
		System.out.println(t.intValue());				//<-Number의 상속을 받는지라, Number의 메소드는 이미 숙지한 단계
		System.out.println(t.doubleValue());
	}
	
	
	public static void main(String[] args) {
		
		LimitedTypeMethod ltm = new LimitedTypeMethod();
		ltm.method(1234);;
		ltm.method(12.34);
		
		
//		Number 클래스와 그 자식 클래스들로 타입이 제한된다.
//		ltm.method("12.34");	//문자열은 당연히 제한된다
		
		
	}
	
	
}
