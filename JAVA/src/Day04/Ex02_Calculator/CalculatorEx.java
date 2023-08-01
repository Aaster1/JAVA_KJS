package Day04.Ex02_Calculator;

public class CalculatorEx {
	public static void main(String[] args) {

//		연습띠
		//		Calculator cal = new Calculator();
//		
//		double arr[] = {1,2,3,4,5};
//		System.out.println(cal.plus(1,2));
//		System.out.println(cal.minus(1,2));
//		System.out.println(cal.multiple(1,2));
//		System.out.println(cal.divi(1,2));
//		System.out.println(cal.sum(arr));
//		System.out.println(cal.aver(arr));
		
		
		
		
//		계산기 객체 생성
		Calculator cal = new Calculator();
		int a= 10;
		int b= 5;
		double x = 10.25;
		double y = 5.4;
		double arr[] = {1,2,3,4,5};
		
		int plus = cal.plus(a,b);
		int minus = cal.minus(a,b);
		double multiple = cal.multiple(x,y);
		double divide = cal.divi(x,y);
		double sum = cal.sum(arr);
		double avg = cal.aver(arr);
		
		System.out.println("plus : "+plus);
		System.out.println("minus : "+minus);
		System.out.printf("multiple : %5.2f \n",multiple);
		System.out.printf("divide : %5.2f \n",divide);
//		printf("포맷, 변수) : %X.Y(리터럴)")
//		-형식기호를 사용하여, 값을 형식에 따라 표현하는 메소드
//			-X : 양수 - 크기만큼 칸을 지정하고 오른쪽으로 정렬
//				 음수 - 크기만큼 칸을 지정하고 왼쪽으로 정렬
//			-Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
//			-(리터럴) : %d(정수), %f(실수), %s(문자열)
		
// Ex)		%5.2f
//			5칸 오른쪽 정렬
//			소수점 아래 2자리
//		
//			%-5.3f
//			5칸 왼쪽 정렬
//			소수점 아래 3자리
		
//		여러 개를 쓰고 싶은 때!
//Ex)		printf("%d, %d",a,b);
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}
}
