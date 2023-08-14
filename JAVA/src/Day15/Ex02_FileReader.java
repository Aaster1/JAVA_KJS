package Day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_FileReader {

	public static void main(String[] args) {
		/*
		 * FileReader - 문자 스트림 클래스 
		 *	new FileReader("파일경로");
		 *	
		 */
		
		
		try(FileReader fr = new FileReader("./src/Day15/test.txt");) {	//<--경로 지정 ./src/test.txt 형태
			int data = 0;
			
//			read()	:	한 문자씩 읽어와서 int 타입으로 반환
//						더 이상 읽어올 문자가 없으면 -1  반환
			while((data = fr.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println("인코딩 타입 : " + fr.getEncoding());
			System.out.println("텍스트 파일이 갱신되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		} catch(IOException f) {			//<--위 캐치문과 순서가 바뀌면, 위 예외에서 해당 FNFE까지 잡아버리기 때문에 순서가 중요
			f.printStackTrace();
			System.out.println("문자 입력 시 예외가 발생하였습니다.");
			
		}
	}
	
}
