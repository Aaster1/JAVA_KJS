package Day08.Ex01_UpDownCasting;

public class Person {
	String NAME;
	int age;
	public Person() {
		this("이름없음",0);
	}
	public Person(String nAME, int age) {
		NAME = nAME;
		this.age = age;
	}
	public String work() {
		return "일을 합니다.";
	}
	@Override
	public String toString() {
		return "Person [NAME=" + NAME + ", age=" + age + "]";
	}
	
}
