package Day16.Ex01_Lambda;
/**
 * @LambdaToReturn
	람다식을 다른 메소드를 통해 넘나드는 흐름과 형태를 더 숙지해야함!
	return 값으로 람다식 결과값을 인터페이스 형태로 return하면,
	그 뒤 형태는 익히 알고 있는PrintString ps2 = msg->System.out.println("메시지 : " + smg);의 형태
*/


@FunctionalInterface
	interface PrintString{
	void showString(String msg);
}




public class LambdaToReturn {

	public static void main(String[] args) {
	
		PrintString ps1 = showMyString(1);
		PrintString ps2 = showMyString(2);
		PrintString ps3 = showMyString(3);
		ps1.showString("안녕하세요");
		ps2.showString("안녕하세요");
		ps3.showString("안녕하세요");
	}
	
	
	static PrintString showMyString(int code) {
		switch (code) {
		case 1:
			return msg ->System.out.println("메시지 : "+msg);
			
		case 2:
			return msg ->{
				System.out.println("메시지 : ");
				System.out.println(msg);
			};
		case 3:
			return msg -> System.out.println(msg);

		}
		return msg -> System.out.println(msg);
	}
	
}
