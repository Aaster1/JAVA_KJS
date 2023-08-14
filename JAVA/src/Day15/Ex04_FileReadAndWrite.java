package Day15;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_FileReadAndWrite {

	public static void main(String[] args) {
		
//		직접 입력한 문자를 텍스트 파일로 출력하는 프로그램
//		테스트 : 문자열을 입력하고 마지막에 ctrl + z 단축키 입력  = EOF = End of File
//		EOF = 파일의 끝을 알려주는 키워드
		InputStreamReader isr = new InputStreamReader(System.in);
		FileWriter fw = null;
		System.out.println("입력>>");
		int data = 0;
		
		try {
			fw = new FileWriter("./src/Day15/test2.txt");
			while((data = isr.read())!=-1) {
				fw.write(data);
			}
			isr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}catch(IOException f) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			f.printStackTrace();
			
//			다 동작하고 ctrl + z EOF 발동
		}
	}
	
}
