package Day09.Ex01_TryCatch;

public class NumberFormat {
	public static void main(String[] args) {
		
		
		String strNum ="10";
		int num = 10;
		
		System.out.println("10+20="+(strNum+20));
		System.out.println("10+20="+(num+20));
		
		String numberString = "10";
		String numberAndString = "a10";
		
//		Integer.parseInt("문자열숫자")
//			:	문자열 숫자를 int 타입의 숫자로 변환하는 메소드
		
		int num1 = Integer.parseInt(numberString);				//<-변환 가능
		int num2 = 0;
		
//		예외 메시지 : java.lang.NumberFormatException	:	For input string: "a10"
		try {
			num2 = Integer.parseInt(numberAndString);			//<--변환 불가!!!!!!!! 아스키로 변환되는게 아니라 그냥 NumberFormatException 으로 되어버리기
			
		} catch (NumberFormatException e) {
			System.err.println("지정된 변수(문자열숫자가 아닌 문자열)를 숫자로 변환할 수 없습니다.");
		}

		System.out.println("num1 : "+(num1+10));
		System.out.println("num2 : "+num2);						//<--try에 실패하면 try 실행문은 실행되지 않는다. 따라서, num2는 선언 시 초기화 되었던 0의 값.
		
	}

}