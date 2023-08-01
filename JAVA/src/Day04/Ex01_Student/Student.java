package Day04.Ex01_Student;

public class Student {
//		학생의 속성 : 이름, 나이, 학번, 전공
//		학생의 행동 : 공부하기, 성적 평균 구하기
	
//		변수
	String name; 
	int age;
	String stdNo;
	String major;
	
//	생성자
//	- 기본  생성자
	public Student() {
		this("이름없음", 1, "00000000","없음");
	}
//	- 모든 매개변수를 포함하는 생성자

public Student(String name, int age, String stdNo, String major) {
	this.name = name;
	this.age = age;
	this.stdNo = stdNo;
	this.major = major;
}
	
//	메소드
	public void study(String subject) {
		System.out.println(subject + "을/를 공부합니다.");
//		반환타입이 void이면, return 을 생략 가능
	}
	
	public double getAverage(int score1, int score2) {
//		2 개의 성적을 입력받아 평균 구하기
		double avr = (double)((score1+score2)/2);		//-> double 로 변환 안하면 자동형변환이 안이루어짐. 크기 문제. 	
		return avr;
	}

	public double getAverage(int score1, int score2, int score3) {
		double avr = (double)((score1+score2+score3)/3);		//-> double 로 변환 안하면 자동형변환이 안이루어짐. 크기 문제. 	
		return avr;

	}
	public double getAverage(int[] scores) {		//-->형태 기억하기
		double average=0;
		for (int score : scores) {
			average += (double)score;
		}
		average /=scores.length;			 
		return average;
	}
}
