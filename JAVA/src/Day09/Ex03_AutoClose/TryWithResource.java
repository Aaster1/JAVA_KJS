package Day09.Ex03_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {
		public static void main(String[] args) {
			
			
//			test.txt 파일을 입력받는 객체
			
//			try( 자동으로 자원해제할 객체 생성){}
//				:	finally 구문에서 close()하지 않아도 자동으로 자원해제를 해준다.			//<-- 눈에 보이진 않음!!!!
//			★★★★★AutoClosable 인터페이스를 구현한 클래스이어야 자동으로 자원해제 가능 ★★★★★
			
			try (FileInputStream fis = new FileInputStream("test.txt");) {
				
				int read = 0;
				while((read=fis.read())!=-1) {					//<--서라운드  머시기 클릭하면 예상 에러명으로 캐치 가능
					System.out.print((char)read);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();						//<-- 에러 발생 원인을 1단계씩 추적하는 메소드
				System.err.println("파일을 찾을 수 없습니다.");
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("입출력 관련 예외 발생");
			}
			
			
		}
}
