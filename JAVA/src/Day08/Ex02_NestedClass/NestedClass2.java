package Day08.Ex02_NestedClass;

public class NestedClass2 {
 public static void main(String[] args) {
//	X
//		Y
//			Z
	X x = new X();
	
//	인스턴스 멤버 클래스 객체 생성
	
	X.Y y = x.new Y();
	
	y.value = 10;
	System.out.println("X의 Y객체 변수 : "+y.value);
	y.method1();
	
//	static 멤버 클래스 객체 생성
	X.Z z = new X.Z(); 						//<--잘 보면 new 앞에 x. 를 안붙임. 객체 생성할 때 붙이는 new가 아우터클래스인X에 접근할 이유가 없다는 뜻임
	
	
	z.value1 = 20;
	System.out.println("X의 Z객체 변수"+z.value1);
	
	X.Z.value2 = 30;
	System.out.println("X의 Z객체 static 변수 : "+X.Z.value2);		//<--스태틱이라서 객체 생성 없이 접근 가능
	z.method1();
	X.Z.method2();
	
//	로컬 클래스 객체 생성을 위한 메소드 호출
	x.method();      //내부에서 L객체 생성
}
}
