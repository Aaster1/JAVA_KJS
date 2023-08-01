package Day02;

import java.util.Scanner;

public class Ex08_elseIf {
	public static void main(String[] args) {
//		학생의 성적을 입력받아, 학점을 출력하시오.
//		90점 이상이면, A
//		80점 이상이면, B
//		70점 이상이면, C
//		60점 이상이면, D
//		60점 미만이면, F
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해보세요!");
		int grade = sc.nextInt();
		
		if (grade >=90) System.out.println("학점 : A");
		else if(grade >=80) System.out.println("학점 : B");
		else if(grade >=70) System.out.println("학점 : C");
		else if(grade >=60) System.out.println("학점 : D");
		else System.out.println("학점 : F");
		sc.close();
	}
}
