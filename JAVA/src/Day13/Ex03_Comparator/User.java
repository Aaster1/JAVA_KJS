package Day13.Ex03_Comparator;

import java.util.Comparator;

public class User implements Comparator<User>{
	String id;
	String name;
	int age;
	
	public User() {
		this("null","이름없음",0);
	}

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) {

//		오름차순 나이, 같으면 이름순

//		내림촤순으로 정렬하려면 * -1 로 반환하면 된다.
		
		int gap = o1.age - o2.age;
		if(gap ==0) gap = o1.name.compareTo(o2.name);
		
		return gap;
		
//		방법1
//		if(o1.age > o2.age) return 1;		//해당문자열이 비교 문자열보다 사전순으로 더 뒤에 있음
//		if(o1.age < o2.age) return -1;		//해당문자열이 비교 문자열보다 사전순으로 더 앞에 있음
//		if(o1.age==02.age) {				//사전순 같은 위치
//			gap = o1.name.compareTo(02.name);
//			return gap;
		
//		방법2
//		int result1 = o1.age - o2.age;
//		int result2 = o1.name.compareTo(o2.name);
//		
//		return result1 ==0? result2 : result1;
		}
	}
	

