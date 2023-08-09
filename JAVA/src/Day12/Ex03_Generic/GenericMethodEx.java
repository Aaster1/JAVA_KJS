package Day12.Ex03_Generic;

class GenericMethod{
	
//	제네릭 메소드
//	- 반환타입, 매개변수에 타입 매개변수를 사용
	public <T> T method(T t) {			//<--클래스에 붙이는 <T>의 위치와 메소드에 붙이는 T위치의 차이점 주시
		return t;
	}
	
//	매개변수를 타입매개변수로 사용
	public <T> boolean method2(T t1, T t2) {		//<--두 경우 다 반환 타입 앞에 <T>이 위치한걸 볼 수있다
		return t1.equals(t2);
	}
	
//	매개변수 2개를 타입 매개변수로 사용
	public <K,V> void method3(K k, V v) {
		System.out.println(k+" : " +v);
	}
}





public class GenericMethodEx {


	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		
//		제네릭 메소드 호출
//		- 객체.<타입>메소드명(인자);
		String str1 = gm.<String>method("제네릭 메소드");		//<--아까 메소드명 앞에다 붙였지? ㅋㅋ
		System.out.println("str1 : "+ str1);
		
		
//		전달인자의 값으로 타입을 유추할 수 있으면,
//		제네릭 메소드 호출 시, 제네릭 타입 생략 가능
		String str2 = gm.method("제네릭 메소드");		//<--<>를 생략해도 제네릭 메소드 과정에서 알아서 유추해 알맞는 타입 반환
		System.out.println("str1 : "+ str2);

		boolean bool1 = gm.<Double>method2(10.5,10.5);
		System.out.println("bool1 : "+bool1);
		
		boolean bool2 = gm.<Double>method2(10.5,20.5);
		System.out.println("bool1 : "+bool2);
		
		gm.<String,Integer>method3("자바 점수", +90);
		gm.method3("DB점수", 100);
	}
	
}
