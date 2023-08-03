package Day08.Ex01_UpDownCasting;

public class DownCasting {
	public static void main(String[] args) {
		
//		다운 캐스팅(강제 형 변환)
//		:	전제 조건 - 업캐스팅
//				다운캐스팅은 업캐스팅된 부모 객체를 자식 객체로 변환하는 것
//		- 업캐스팅		: 	(부모)<-(자식)
//		- 다운캐스팅		: 	(자식)<--(부모)
		
//		업캐스팅
		Person person = new Student("김조은",20,1,"신재생에너지과");
		
		System.out.println(person);
		System.out.println(person.NAME);
		System.out.println(person.age);
		System.out.println(person.work());				
		
		
//		다운캐스팅(조건식 : Person person 이 Person 자료형이란 물음에 true일 때)
		
		if (person instanceof Person) {
			Student student = (Student) person;
			
			System.out.println(student);
			System.out.println(student.NAME);
			System.out.println(student.age);
			System.out.println(student.work()); 			//<--값이 변경 안됨.				

			
			System.out.println(student.grade);
			System.out.println(student.major);
			
		}

	}

}
