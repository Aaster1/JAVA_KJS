package Day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex06_FileInputStream {

	
	public static void main(String[] args) {
		
//		문자열 파일을 바이트 스트림을 통해 불러올 때는, 파일이 깨지게된다.
//		그러니 순순히 Reader & Writer를 사용하자.
		byte[] data = new byte[100];
		
		try {
			FileInputStream fin = new FileInputStream("./src/Day15/test.out");
			int i = 0,b;
			while((b=fin.read())!=-1) {
				data[i] = (byte) b;
				i++;
			}
			for (byte a : data) {
				System.out.print((char)a);
			}
			System.out.println();
			
			fin.close();
			
			
		} catch(FileNotFoundException e) {
			System.err.println("파일을 찾이 못했습니다.");
			e.printStackTrace();
		}
		catch(IOException f) {
			System.out.println("입출력 시, 예외가 발생하였습니다.");
			f.printStackTrace();
		}
		
	}
}
