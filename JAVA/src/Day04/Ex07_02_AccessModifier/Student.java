package Day04.Ex07_02_AccessModifier;

import Day04.Ex07_01_AccessModifier.Person;

public class Student extends Person {			//<--상속 받는거!!!!!! 잊지말자 extends
	public Student() {
		super();
	}

//	기본 매개변수 상속자와 다르게 super 자동 완성이 있음!!! 주의하기바람
	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	}
	public void defaultSetting() {
		name="이름없음";			//<public> 어디에서도 접근 가능
		height=160;				//<protected> 같은 패키지 또는 자식클래스에서만 접근 가능
//		age=20;					//<default> 같은 패키지에서만 접근가능
//		weight =40;				//<private> 같은 클래스에서만 접근가능
		setAge(20);
		setWeight(40);
	}

}
