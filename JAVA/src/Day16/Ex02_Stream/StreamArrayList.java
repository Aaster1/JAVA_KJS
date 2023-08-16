package Day16.Ex02_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person{
	String name;
	int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "name = " + name +  "\tage = " + age;
	}


	
}




public class StreamArrayList {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김조은",20));
		persons.add(new Person("이조은",30));
		persons.add(new Person("박조은",25));
		persons.add(new Person("최조은",35));
		persons.add(new Person("조은",28));
		persons.add(new Person("김조",22));
		
		
		
//		매핑
//		- 스트림 요소를 사용하려는 형태로 매핑하는 변환하는 연산
		persons.stream().map(p ->p.name).forEach(n->System.out.print(n+" "));		//<-요소 Person을 Person.name으로 바꿔버린것임!
		System.out.println();
		
//		필터
//		- 스트림 요소에서 조건에 맞는 요소만 선택하는 연산
		persons.stream().filter(p->p.name.length()>=3).forEach(n->System.out.print(n.name+ " "));	//<--name의 길이 3이상인것만 걸러서 Person객체를 거르는거임
		System.out.println();
		
//		정렬
//		- 메소드 레퍼런스 (::)
//		클래스명 ::메소드명 = 메소드를 참조하는 주소	=	 메소드 레퍼런스를 지정하는 문법
//		**메소드 호출 시, 전달인자로 메소드 레퍼런스를 지정하여 넘겨줄 수 있다.
//		***메소드를 통해 메소드를 전달하는 람다식을 대체하는 문법
		
//		이름 순으로 정렬
//		persons.stream().sorted(Comparator.comparing(p->p.getName())).forEach(p->System.out.print(p+ " "));
		persons.stream().sorted(Comparator.comparing(Person::getName)).forEach(p->System.out.print(p+ "\t"));
		System.out.println();
//		나이 순으로 정렬 -> 은 내림차순
//		reversed()붙이는 위치좀 보셈 예술임 ㅋㅋ
//		reverseOrder()메소드와 구별되어 쓰임. 차이점을 기억합시다.
		persons.stream().sorted(Comparator.comparing(Person::getAge).reversed()).forEach(p->System.out.print(p+ "\t"));
		System.out.println();
		
//		이름이 3글자 이상인 사람이 몇 명인지
		long count = persons.stream().filter(p->p.name.length()>=3).count();
		System.out.println("count : " + count);
	}
	
}
