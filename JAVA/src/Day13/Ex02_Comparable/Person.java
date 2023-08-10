package Day13.Ex02_Comparable;

public class Person implements Comparable<Person>{

	String name;
	int age;
	
	
	public Person() {
		this("이름없음",0);
	}
	
	
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
	public int compareTo(Person o) {	//<-Comparable 을 구현하여 CompareTo를 작성하면 Collections.sort사용가능
//		this : 해당객체
//		o	: 비교 객체
//		나이순으로 오름차순
		
		int thisAge = this.getAge();	//해당객체의 나이
		int comAge = o.getAge();		//비교객체의 나이

//			이것의 나이가 큰 사람이 큰 객체라 우리가 정의하는 느낌!
//		방법1
//		if(thisAge > comAge) {
//			return 1;
//		}else if (thisAge <comAge){
//			return -1;
//		}
		
//		방법2
		int gapAge = thisAge -comAge;			//오름차순
		int gapAge2 = (thisAge -comAge)*-1;	//내림차순
//		음수든 양수든 숫자의 크기는 중요 ㄴㄴ 양수인지 음수인지가 중요
		
		
		return gapAge2;
	}
}
