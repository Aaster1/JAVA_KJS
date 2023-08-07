package Day10.Ex02_Object;

class Student{
	
	int studentId;
	String studentName;				//학번
									//이름
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
	
}

public class StudentEquals {

	public static void main(String[] args) {
		
		Student student = new Student(1001,"김조은");
		Student student2 = student;
		Student student3 = new Student(1001, "김조은");

		
		if(student ==student2) {
			System.out.println("student 와 student2 의 주소가 같습니다");
			
		}else {
			System.out.println("student 와 student2 의 주소가 다릅니다");
		}
		if(student.equals(student2)) {
			System.out.println("student 와 student2 의 이름은 같습니다");
			
		}else {
			System.out.println("student 와 student2 의 이름이 다릅니다");
		}
		
		
//=======================================================================
		
		
		if(student ==student3) {
			System.out.println("student 와 student3 의 주소가 같습니다");
			
		}else {
			System.out.println("student 와 student3 의 주소가 다릅니다");
		}
		if(student.equals(student3)) {
			System.out.println("student 와 student3 의 이름은 같습니다");
//			equals는 문자열을 비교하는 것인데 어째서 이 결과가 나오지 않는걸까!
//			그 이유에 대해서 다시 생각해보자
//			equals는 단순히 보이는 문자열만 완벽하게 쏙 빼내는 기능이 아니다.
//			해당 값이 보이는 장소로 타고 들어가 내부의 값을 지금의 값과 비교하는 역할일 뿐이다.
//			따라서, 정확한 비교를 위해서는 student.name.equals(student3.name)따위의 식으로
//			세부적으로 잡아야한다.
			
//			또는 ex01의 오브젝트 이퀄스, 다운캐스팅 방법 참조
			
		}else {
			System.out.println("student 와 student3 의 이름이 다릅니다");
		}
//=======================================================================
		
		
		if(student.studentName.equals(student3.studentName)) {
			System.out.println("student 와 student3 의 이름은 같습니다");
			
		}else {
			System.out.println("student 와 student3 의 이름이 다릅니다");
		}
		
		
	}
	
	
}
