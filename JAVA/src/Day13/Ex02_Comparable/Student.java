package Day13.Ex02_Comparable;

public class Student implements Comparable<Student>{

	String name;		//이름
	int age;			//나이
	
	public Student() {
		this("이름없음",0);
	}
	
	
	public Student(String name, int age) {
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
	public int compareTo(Student o) {		//<--해당 클래스 자료형을 매개변수로 받아옴
//		학생을 이름순으로 정렬 (오름차순)
		String thisName = this.getName();
		String comName = o.getName();
		int gap = thisName.compareTo(comName);	//<--역순으로 하려면 comName.compareTo(thisName)로 접근
		
//		String의 compareTo()메소드로 문자열 크기 비교
//		해당객체명.compareTo(비교객체명)
//		*해당객체 > 비교객체 : 양수
//		*해당객체 = 비교객체 : 0
//		*해당객체 < 비교객체 : 음수
		
		return gap;
	}
	
	
	
	
	
	
}
