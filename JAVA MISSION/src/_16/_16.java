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
//			finally {
////			1. Scanner closed 가 문제였다. 기존의 위치(try문 마지막열)에서 닫아버리면 객체가 해제되므로, 사용할 수 없다.
////			2. File 자료형으로 file을 받아올 때는 경로명으로 받아오자.
//			
//			if(sc != null)
//			sc.close();
//		}
	}
}
