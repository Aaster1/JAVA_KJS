package Day16.Ex01_Lambda;

/**
 * @Lambda
	람다식은 일반적으로 인터페이스에서의 1개 추상메소드의 내용을 세부적으로 구성하는데 사용된다.
	그리고 void 함수의 변수화가 가능하다.   -> 자세한 내용은 LambdaToParameter에서
	
*/	
	
@FunctionalInterface
	interface FuncInterface1{
		void method();
	}
@FunctionalInterface
	interface FuncInterface2{
		void method(String a,String b);

}
@FunctionalInterface
	interface FuncInterface3{
		String method();
	
}
@FunctionalInterface
	interface FuncInterface4{
		String method(String a,String b);
	
}
	
public class LambdaFormat {
	
	public static void main(String[] args) {
		
//		매개변수, 반환타입 없는 람다식
		FuncInterface1 f1 = () ->System.out.println("람다식");	//<--한 문장이면 {} 생략가능
		f1.method();
		
//		매개변수가 있고, 반환타입이 없는 람다식
		
		FuncInterface2 f2 = (a,b) ->System.out.println(a+b);
		f2.method("Java", "람다식");
		
//		매개변수가 없고, 반환타입이 있는 람다식
		
		FuncInterface3 f3 = () -> "자바"+"너무 재밌다.";
		System.out.println(f3.method());
		
		FuncInterface4 f4 = (a,b) -> a+a+b;
		System.out.println(f4.method("진짜", "재밌다!"));
		
		
		
		
	}
	
	
	
}
