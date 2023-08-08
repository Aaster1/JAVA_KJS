package Day11.Ex01_Lang;

public class MathEx {
public static void main(String[] args) {
	
	System.out.println(Math.PI);			// 3.141592653589793 (원주율)
	System.out.println(Math.ceil(3.125));	//올림 : 해당 수보다 큰 정수 중 가장 작은 수까지 올림
	System.out.println(Math.floor(3.125));//내림 : 해당 수보다 작은 정수 중 가장 큰 수까지 내림
	System.out.println(Math.sqrt(9)); // 제곱근(루트)
	System.out.println(Math.pow(3, 2)); 	// 3의 2승(제곱)
	System.out.println(Math.exp(2)); 		//e의 2승
	System.out.println(Math.round(3.14)); // 반올림
	
	System.out.println("-----------------------------------------");
	
//	로또 번호 6/45 
//	[1,45] 사이의 정수형 난수 6개 만들기
//	Math.random()		: 0.0보다 크거나 같고, 1.0보다 작은 임의의 실수
//	Math.random()		: 0.xxx ~ 0.9xx
//	(0.xxx ~ 0.9xx) * 10: 0.xxx ~ 0.9xx (0 ~ 9 ) -  정수변환 시 10 개
//	(0.xxx ~ 0.9xx) * 20: 0.xxx ~ 1.9xx (0 ~ 19 ) -  정수변환 시 20 개
//	(0.xxx ~ 0.9xx) * 45: 0.xxx ~ 1.9xx (0 ~ 45 ) -  정수 변환 시 45 개
//	(int)(Math.random())*45+1 : 1 ~ 45 사이의 정수
	
//	[공식]
//	(int)(Math.random() * [개수] + [시작숫자])
	
	for (int i = 0; i < 6; i++) {
		int random = (int)((Math.random() *45) +1);
		System.out.print(random+" ");
		
	}
	System.out.println();
	
//	-50 ~ 50 사이의 랜덤 정수 1개를 출력하시오.
	
	System.out.println(Math.random()*101-50);
	
	
	System.out.println("============================");
	
	
	double max = Double.MIN_VALUE;
	double[] arr = {98.45,65.33,44.22,85.12,70.45};
	
	for (int i = 0; i < arr.length; i++) {
		max= Math.max(max,arr[i]);			//<- Math.max : 두 매개변수 중 큰 수를 반환.....
	}
	System.out.println("max : "+max);
}
	
}
