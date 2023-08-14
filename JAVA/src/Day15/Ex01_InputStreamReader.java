package Day15;

import java.io.InputStreamReader;

public class Ex01_InputStreamReader {

	public static void main(String[] args) {
//		문자 스트림 클래스
//		System.in	:	키보드로부터 문자 입력
		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.println("입력");
		while(true) {
			char ch = 0;		
			
			try {
				ch= (char) isr.read();		//입력 스트림으로부터 한 글자씩 읽어옴 , int로 반환받아 char 문자타입으로 변환
			} catch (Exception e) {				//바이트 스트림으로 읽어왔기 때문에 변환이 필요한거임
			}
//			read()로 더 이상 읽어올 문자가 없으면 -1을 반환(ctrl + Z 입력)
			if(ch==-1) {
				break;
			}
			System.out.println(ch);
		}
	}
}
