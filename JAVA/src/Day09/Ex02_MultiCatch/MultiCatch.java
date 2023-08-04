package Day09.Ex02_MultiCatch;

import java.util.Scanner;

//다 트라이로 묶어버리기!!!!!!!!!!!!!!!!!!!!

public class MultiCatch {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("두 자리수인 정수 2개를 입력해주세요");
			try {
				
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			
			
			//눈치챘는지 모르겠지만, 기본자료형은 소문자로 시작함 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
			char[] char1 = str1.toCharArray(); 					//<-- String --> char[] 변환
			char[] char2 = str2.toCharArray(); 					//<-- "10" --> char2[0] = "1", char2[1] = "0"

			String[] input1 = new String[char1.length];
			String[] input2 = new String[char2.length];
			
//			char1 --> ['1']['0']
//			input1 -->["1"]["0"]
			for (int i = 0; i < char1.length; i++) {
				input1[i] = char1[i] +"";
			}
			for (int i = 0; i < char2.length; i++) {
				input2[i] = char2[i]+"";
			}
			
			System.out.println(input1[0]+input2[1]);		//<--indexoutofboundException
			System.out.println(input2[0]+input1[1]);
			
			int value1 = Integer.parseInt(str1);			//<--NumberFormatException
			int value2 = Integer.parseInt(str2);
			int result = value1 + value2;
			
			System.out.println(str1+" + "+str2+" = "+result);
			
			
//			멀티 catch
//			: 하나의 catch 블록에서 처리하고 싶은 예외를 | 기호로 연결하여 사용한다
			} catch (ArrayIndexOutOfBoundsException |NumberFormatException e) {
				System.err.println("접근할 수 없는 배열 index 범위입니다.(한 자리수만 입력한 경우");
				System.err.println("숫자로 변환할 수 없는 값입니다. (문자를 입력한 경우");
			}
			
			
//			다중 catch
//			:	여러 예외를 각각 다른 catch 블록으로 처리하는 것
//			★★★★★★★★상위 예외클래스가 하위 예외 클래스보다 아래쪽에 위치해야한다★★★★★★			<--실제로 위 캐치와 아래 캐치 바꾸면 아래 예외 사항이 '무용지물됨 = 『컴파일에러』'
																							//	<--해당 부분의 상, 하위는 그림 참조 'aster's super document'
			catch(Exception e) {
				System.err.println("이 외의 알 수 없는 예외 발생");
			}			
			sc.close();
		}
}
