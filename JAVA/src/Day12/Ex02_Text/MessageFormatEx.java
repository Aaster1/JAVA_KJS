package Day12.Ex02_Text;

import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormatEx {

	
	public static void main(String[] args) {
//		문자열 형식을 만들고,
//		문자열에 데이터가 들어갈 자리를 {k}로 표시한다.(k : 0~)
//		\n : 한줄 개행(엔터)
//		\t : 탭
		
		String text = "아이디 : {0}\n비밀번호 : {1}";
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String pw = sc.next();
		
		String login = MessageFormat.format(text,id,pw);			//<--가변 매개변수 메소드 매개변수의 자료형 매개명 사이에 ...을 붙여 사용
		
		System.out.println(login);
		
		
		
		
		String[] studentInfo = {"김조은","24학번","컴퓨터공학과","20살"};
		String studentFormat = "이름 : {0} \n"
								+"학번 : {1}\n"
								+"전공 : {2}\n"
								+"나이 : {3}\n";
		
		String student = MessageFormat.format(studentFormat, studentInfo);		//<--대체할 내용은 배열로도 인식된다.
		System.out.println(student);
		sc.close();
		
		
		
		
		
		
	}
	
}
