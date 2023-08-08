package Day11.Ex02_Util;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random random = new Random();
//		
//		nextInt()			:	int 랜덤수(난수)를 반환하는 메소드
//		nextBoolean():	boolean 랜덤수(난수)를 반환하는 메소드
//		nextDouble()	:	double 랜덤수(난수)를 반환하는 메소드
//		
		boolean randomTF = random.nextBoolean();				//<-결과값 2중 1의 경우 사용.
		System.out.println(randomTF);
		
//		동전 던지기
		System.out.println("동전을 던집니다...");
		
//		true	:	앞면, false : 뒷면
		if(randomTF) System.out.println("앞면");
		else {
			System.out.println("뒷면");
		}
		
//		nextInt() : 4Byte 범위	(-21억xxx ~ 21djrxxx) 사이의 난수를 반환
		
		int fourByteRandom = random.nextInt();
		System.out.println("4Byte 랜덤 정수: "+fourByteRandom);
		
		
//		nextInt(N)	:	0 ~ N-1 까지의 난수를 반환
//		enxtInt(N) +1	:	1 ~ N까지의 난수를 반환
		
//		[공식]
//		random.nextInt(개수) + 시작숫자
		
		int dice = random.nextInt(6) +1;
		System.out.println("주사위 : "+dice);
		
		
		
		int lotto = random.nextInt(45)+1;
		System.out.println("로오또" + lotto);
		
		double randomDouble = random.nextDouble();
		System.out.println("실수 랜덤 수 : "+randomDouble);
	}
	
}
