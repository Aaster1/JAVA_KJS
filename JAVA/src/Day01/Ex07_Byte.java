package Day01;

public class Ex07_Byte {
	public static void main(String[] args) {
//		byte 는 1byte 범위의 데이터를 표현
//		8bits (0000 0000) 2^8 : 256개
//		음수와 양수로 나누면, -128 ~ 0 ~ 127 (총 256개)
		
//		int의 경우 22억가지를 안넘는단 것만 기억하자.
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte) 129; //오버되면 -128부터 다시 남은 수만큼 차감(오버플로우)
//		(에러) byte var6 = 200;
//		- 에러 메세지 : Type mismatch - 타입 불일치, 데이터 범위를 벗어남(오버플로우)
		
		System.out.println("var1 : " +var1);
		System.out.println("var2 : " +var2);
		System.out.println("var3 : " +var3);
		System.out.println("var4 : " +var4);
		System.out.println("var5 : " +var5);
	}
}
