package Day12.Ex04_WildCard;


public class WildCardEx {
	
//	수강생들이, 교육과정(Course)에 수강등록을 합니다.
	
//	?(와일드 카드)
//	: 알 수 없는 타입을 대체하기 위해 사용하는 기호
//	Ex) 매개변수나 값(= 뒤에 오는 것 등)따위의, 어떤 것이 입력으로 받아들여질지 알 수 없는 상황에서 포괄적으로 입력을 열어놓거나,
//		범위를 지정할 때 사용
	
	
	
	
//	일반 과정
	
	public static void joinCourse(Course<?> course) {
		System.out.println("과정명 : "+course.getName());
		System.out.println(course.getStudents());
	}
	
	
	
	
	
//	직장인 과정
	public static void joinCourseWorker(Course<? super Worker> course) {		//<--위쪽 방향으로  제한 - <? super Worker>
		System.out.println("과정명 : "+course.getName());
		System.out.println(course.getStudents());
	}
	
//	학생 과정
	public static void joinCourseStudents(Course<? extends Student> course) {
		System.out.println("과정명 : "+course.getName());
		System.out.println(course.getStudents());
	}
	
	
	
	public static void main(String[] args) {
//		일반과정, 정원5명
		Course<Person> perCourse = new Course<Person>("일반과정", 5);
		
		perCourse.add(new Person("일반인"));
		perCourse.add(new Person("직장인"));
		perCourse.add(new Person("학생"));
		perCourse.add(new Person("중학생"));
		perCourse.add(new Person("고등학생"));
		
//		직장인 과정, 정원 5명
		Course<Worker> workCourse = new Course<Worker>("직장인과정", 5);
		workCourse.add(new Worker("직장인"));
//		workCourse.add(new Student("학생"));			//<- 불가능. 생성된 객체는 Worker 타입으로 생성되어있다. 학생은 아무런 상관이 없기에 불가능
		
//		학생 과정, 정원 5명
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		studentCourse.add(new MiddleStudent("중학생"));
		
		
//		고등학생 과정, 정원 5명
		Course<HighStudent> hiCourse = new Course<HighStudent>("고등학생 과정", 5);
//		HiCourse.add(new Student("학생"));  		//<--불가능. 상속 과정을 보면 앎. 

		
//		일반과정에 수강등록
		joinCourse(perCourse);

//		직장인과정에 수강등록
		joinCourseWorker(perCourse);
		joinCourseWorker(workCourse);
//		joinCourseWorker(hiCourse); //<--제한당함. 메소드 정의 자체가, 매개변수를 worker 부터 상위 클래스만 받을 수 있음
		
//		학생과정에 수강등록
		joinCourseStudents(studentCourse);
		joinCourseStudents(hiCourse);
//		joinCourseStudents(workCourse);		//<-- 제한당함. 메소드 정의 자체가, 매개변수를 student부터 하위 클래스만 받을 수 있음 
		
	}
	
}
