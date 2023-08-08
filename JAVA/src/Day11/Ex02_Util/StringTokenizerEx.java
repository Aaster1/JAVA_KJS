package Day11.Ex02_Util;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	
	public static void main(String[] args) {
		/*
			StringTokenizer
			:	구분 문자를 기준으로 문자열을 분리하는 클래스
			- 구분 문자 			: (탭) / . 등등
			- 토큰(token)			: 구분 문자로 분리된 문자열
		*/
		
		String java = "클래스,생성자,상속,오버로딩,오버라이딩,추상클래스,인터페이스";
		StringTokenizer st = new StringTokenizer(java,",");			//<-import해서 불러와야함. 이제 util이잖슴?
		
//		countTokens() - 분리한 토큰의 개수
		System.out.println("토큰의 수 : "+st.countTokens());
		
//		hasMoreTokens()	:	토큰이 남아있는지 확인 (true/false)
		while(st.hasMoreTokens()) {		//<-- 다음 토큰이 남아있으면 true로 while이 진행됨
//			enxtToken()	:	다음 토큰을 반환
			System.out.println(st.nextToken()+ " ");		//<--이 과정에서 hasMoreTokens가 false로 바뀌는거러 보아, nextToken은 Token클래스 내부의 수치를 바꾸고 has ~ 또한 이를 기반으로 동작하는듯 하다
			// StringTokenizer클래스 내부에서 nextToken() 을 사용하면 포인터가 이동하고, 그 포인터를 기반으로 hasMoreTokens가 동작한다.
		}
		System.out.println();
		
	}
	
}
