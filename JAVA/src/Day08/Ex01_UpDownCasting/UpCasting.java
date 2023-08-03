package Day08.Ex01_UpDownCasting;

public class UpCasting {
	public static void main(String[] args) {
		
//	업캐스팅(자동 타입 변환)
//	(부모클래스 ) = (자식 클래스)
	Person person = new Student();
	

	System.out.println("name : "+person.NAME);
	System.out.println("age : "+person.age);
	
//	Person 객체에서는 greade, agd 변수에 접근할 수 없다.
//	System.out.println("grade : "+person.grade);
//	System.out.println("major : "+person.major);
	
//	클래스를 업캐스팅 하면,
//	변수는 부모 클래스에 있는 변수만 접근 가능하고,
//	메소드는 자식 클래스의 메소드가 우선하여 실행된다.
	
	System.out.println(person);
	System.out.println(person.work());
	
//	바인딩 : Biding	: 연결하다.
//	: 	프로그램에서 사용되는 요소에 실제 값을 결정짓는 행위	=	요소에 값 할당 루트. 오버라이딩 시 누가 할당될까? 하는 논리식(?)
	
//	- 정적 바인딩
//	:	컴파일 과정에서 결정
//		변수 등								line 15 - 이 때, 이미 '너는 greade 랑 major는 모르는구나?' 하고 결정나버림
	
//	-동적 바인딩
//	:	실행 과정에서 결정
//		오버라이딩							line 23 - 오버라이딩의 경우 메모리판(정적바인딩) 과정이 깔린 다음 확인하기 때문에 해당요소를 불러올 수 있다.
	
}
}
