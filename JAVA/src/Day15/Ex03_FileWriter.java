package Day15;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03_FileWriter {

	
	public static void main(String[] args) {
		
		
		String str = "텍스트 파일에 출력할 내용";
		
		try (FileWriter fw = new FileWriter("./src/Day15/test2.txt")) {	//<-파일명 test.txt 출력스트림 객체 생성
			fw.write(str,0,str.length());								//<-문자열 str을 index 0 ~ 끝까지 출력
//			fw.close();		<--오토 클로즈로 생략							//자원 해제
//			새로운 파일명을 지정하여 쓰면, 새 파일 생성.
//			기존 파일명을 지정하여 쓰면, 기존 파일 덮어쓰기.
		} catch (FileNotFoundException e) {
			System.err.println("파일을 불러오지 못했습니다.");
			e.printStackTrace();
		} catch(IOException f) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			f.printStackTrace();
			
		}
		
	}
}
