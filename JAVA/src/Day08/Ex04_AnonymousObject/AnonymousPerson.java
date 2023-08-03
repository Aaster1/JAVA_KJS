package Day08.Ex04_AnonymousObject;

public class AnonymousPerson {
	
//	익명 자식 객체 생성
	Person person = new Person() {					//<-중괄호를 묶어서 임시로 사용!!!!!
		
		void work() {
			System.out.println(name + "("+age+")");
			System.out.println("프로그래밍을 합니다.");
			System.out.println();
		}
	};				//<--세미콜론으로 종료지점 세팅하는 중괄호 형태는 처음보나?
	
	Person person2 = new Person() {
		
		void work() {
			System.out.println(name+"("+age+")");
			System.out.println("요리를 합니다.");
			System.out.println();
		}
	};
	
	//↑↑↑↑↑↑ {} 안의 내용은 실행되지만 외부로의 반영 x
	
	//↓↓↓↓↓↓ 하지만 person 자체의 변수명은 Person자료형으로 생성되어 활용 가능.
	
	
	void method() {
		person.name = "김조은";
		person.age = 20;
		person.work();
		
		person2.name = "백종원";
		person2.age = 40;
		person2.work();
		
		
	}
}
