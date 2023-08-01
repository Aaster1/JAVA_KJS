package Day04.Ex07_01_AccessModifier;

public class Person {
	
	
	
	
	
//		이름, 키, 나이, 체중
	public String name;				//<==어디서도 접근 가능
	protected int height;			//<==같은 패키지 또는 자식클래스에서만 접근 가능
	int age;						//<==같은 패키지에서만 접근 가능
	private int weight;				//<==같은 클래스에서만 접근 가능
	
	
	
	
//	기본생성자
	public Person() {
		this("Unknown",160,57,43);
	}
	
	
	
	
	
//	매개변수 생성자
	public Person(String name, int height, int age, int weight) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
	}
	
	
	
	
//	getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
//	toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}
