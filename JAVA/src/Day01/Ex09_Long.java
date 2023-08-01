package Day01;

public class Ex09_Long {
	public static void main(String[] args) {
//		int (4byte : 32bits ) : 2^32 개 : 42억개
//		int 수 표현 범위 : -21억 xxx ~ 21억xxx
		
//		long(8byte : 64bites) : 2^64 --> 몬센다
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000L;
//		애당초 숫자 입력 시 int로 받기에 22억 언저리부터는 out.
//		뒤에 L 붙이면 long으로 인식함.
		
		System.out.println("ln1 : " +ln1);
		System.out.println("ln2 : " +ln2);
		System.out.println("ln3 : " +ln3);
		
	}
}
