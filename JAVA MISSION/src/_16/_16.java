package _16;

import java.io.File;
import java.util.Scanner;

public class _16 {
	public static void main(String[] args) {
		System.out.print("번호\t이름\t성적\t반");
		Scanner sc =  null;

		try {
			File file = new File("C:\\Users\\tj-bu\\Documents\\230725 2th JInSu\\JAVA\\git\\JAVA_KJS\\JAVA MISSION\\src\\_16\\student.txt");
			sc = new Scanner(file);
			String line = "";
			System.out.println();
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				String arr[] = line.split("\\/");
				for (String i : arr) {
					System.out.print(i + "\t");
				}
				System.out.println();
				
			
		}
				sc.close();
		}catch (Exception e) {
			System.err.println("에러남ㅋㅋ");
			e.printStackTrace();
		}
////			1. Scanner closed 가 문제였다. 기존의 위치(try문 마지막열)에서 닫아버리면 객체가 해제되므로, 사용할 수 없다.
////			2. File 자료형으로 file을 받아올 때는 경로명으로 받아오자.
//				3. 나의 경우, sc.close()가 try문의 마지막순번으로, while문 밖에 있는줄로만 알았는데 알고보니 while문 안쪽에 있었더라. 
//				4. 그리고 그런 간단한 실수도 깨닫지 못했던 이유는 예외명을 확인하지 않아서다. 꼭 printStackTrace()를 작성하자.
//			
	}
}
