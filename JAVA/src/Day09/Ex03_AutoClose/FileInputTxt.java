package Day09.Ex03_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTxt {

	public static void main(String[] args) {
		
//		★★★★★★★★★try 랑 같이 다니는 구현클래스 ★★★★★★★			<--얘는 받아오기 실패하잖슴 ㅋㅋ
		
		/*
		 * 스트림 : 실제 입력이나 출력이 표현된 데이터 흐름
		 * 
		 * 입력 받을 수 있는 데이터 : 키보드로부터 입력한 키, 파일 등
		 * 
		 * (키보드)(파일) --->[스트림] ---> [프로그램]
		 * 
		 * 입력 스트림 클래스	:	InputStream
		 * 파일 스트림 클래스 	: 	FileInputStream
		 */
		
//		char[] buf = new char[1024];
		int bufSize = 0;
		
		try (FileInputStream fis = new FileInputStream("test.txt");) {
			bufSize = fis.available();
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] buf = new byte[bufSize];
		
		
		try (FileInputStream fis = new FileInputStream("test.txt");){
			
			int read =0;
			
/*			fis.read()	:	.txt 파일의 데이터를 한 글자씩 읽어오는 메소드
							-더 이상 읽어올 데이터가 없으면 -1을 반환
							즉, 글자가 없을 때까지 반복한다.
*/			while((read=fis.read(buf))!=-1) {		//<----FIS의 read()메소드는 한글자씩 아스키 코드로 가져온다. 그리고 불러올 것이 없으면 -1를 반환한다. 그러니 이와 같은 반복문 조건이 성립 가능한 셈이다.
			System.out.print((char)read);		//<----아스키 코드 값을 char로 변환.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("파일을 찾을 수 없습니다.");
			} catch (IOException e) {
			e.printStackTrace();
			System.err.println("입출력 관련 예외가 발생했습니다.");
		}
		}
}
