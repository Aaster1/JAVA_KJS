package Day04.Ex01_Student;

public class StudentEx {
	public static void main(String[] args) {
//		Student 객체 생성
		Student student = new Student();
		student.name = "김조은";
		student.age = 20;
		student.stdNo ="20240001";
		student.major = "국어국문학과";
		
		int[] scores1 = {10,20,30,40,50,};
		int[] scores2 = {100,100,100,95,98,};
		
		System.out.println("###### 학생1 ######");
		System.out.println("학생1 - 이름 : "+student.name);
		System.out.println("학생1 - 나이 : "+student.age);
		System.out.println("학생1 - 학번 : "+student.stdNo);
		System.out.println("학생1 - 전공 : "+student.major);
		System.out.println("학생1 - 유튜브 편집 실습");
		student.study("유튜브 편집 실습");
		System.out.println("학생1  - 중간고사 점수 : "+student.getAverage(10,20));
		System.out.println("학생1  - 기말고사 점수 : "+student.getAverage(10,20,30));		// -->메소드 비생성시, 밑 줄에 커서 올리면 생성 리스트가 만들어짐.
		System.out.println("학생1  - 최종 점수 : "+student.getAverage(scores1));		//메소드 미완성.

//		매개변수 개수에 따른 메소드를 하나씩 만들다가,
//		매개변수의 개수에 따라 메소드가 매개변수를 자동으로 인식하고 계산하게끔 제작. Student-class 참조
		
		
//		Student2 객체 생성
		Student student2 = new Student("이용성",20,"20220002","컴퓨터공학");
		
		System.out.println("###### 학생2 ######");
		System.out.println("학생2 - 이름 : "+student2.name);
		System.out.println("학생2 - 나이 : "+student2.age);
		System.out.println("학생2 - 학번 : "+student2.stdNo);
		System.out.println("학생2 - 전공 : "+student2.major);
		System.out.println("학생2 - 유튜브 편집 실습");
		student.study("유튜브 편집 실습");
		System.out.println("학생2  - 중간고사 점수 : "+student.getAverage(10,20));
		System.out.println("학생2 - 기말고사 점수 : "+student.getAverage(10,20,30));		// -->메소드 비생성시, 밑 줄에 커서 올리면 생성 리스트가 만들어짐.
		System.out.println("학생2  - 최종 점수 : "+student.getAverage(scores2));		//메소드 미완성.

	}
}
