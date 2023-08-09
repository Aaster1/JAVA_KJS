package Day12.Ex03_Generic;

class Student{
	
}
class Developer{
	
}

class Person{
	
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}


public class ObjectProduct {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.setObject(new Student());					//<- 이 경우는 가능하다. 최상위 클래스인 Object로 자동 업캐스팅하는 거라. 하지만 아무래도 문제가 생긴다.
		person1.setObject(new Developer());
		
		Student student = (Student) person1.getObject();	//<--그래서 다운캐스팅 진행
		
//		다양한 타입을 사용하기 위해서
//		Object 타입으로 인스턴스를 저장할 수는 있지만,
//		타입 변환이 불가한 상황이 발생할 수 있다.
//		ClassCastException 이 발생할 수 있다.
		
		
	}
	
}
