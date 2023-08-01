package Day02;

public class Ex03_LogicalOperator {
	public static void main(String[] args) {
//		논리 연산자
//		AND(&&)
//		A AND B : A와 B 둘 다 true 일 때, 결과가 true
		
		
//		A		B		결과
////		------------------
//		F		F		F
//		F		T		F
//		T		F		F
//		T		T		T
		
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println();
		
//		OR(||)		--"|" 쓰는 법, 알지?
//		A OR B		: A와 B 둘 중 하나라도 true 이면, 결과가 true
//		A		B		결과
//		--------------------
//		F		F		F
//		T		F		T
//		F		T		T
//		T		T		T
		
		System.out.println(true||false);	// dead code 가 발생하는 이유 : or(||)의 경우, 앞 피연산자가 true인 순간 뒷 피연산자는 아무런 의미가 없는 셈이다.
		System.out.println(false||false);
		System.out.println(true||(100 <50));	
		System.out.println((50<20)||(100 <50));
		System.out.println();
		
//		XOR(^)
//		A XOR B		:A 와 B가 다를 때, true [[[[한쪽이 ture건 false건 관계 없음]]]
		System.out.println(true^true);
		System.out.println(true^true);
		System.out.println((9>=2) ^ (7>4));
		System.out.println();
		
//		NOT(!)
//		!A		:true 값을 false 로 반전. 반대의 경우 또한 반전
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
//		쇼트 서킷
//		 : 논리 연산의 결과를 미리 알아서, 남은 논리식을 확인하지 않는 것
		int value1 = 3;
		System.out.println(false && ++value1 >10);
		System.out.println(value1);
		System.out.println();
		
		int value2 = 3;
		System.out.println(true || ++value2>5);
		System.out.println(value2);
		System.out.println();
		
//		비트 연산자의 경우
//		**********쇼트 서킷의 영향을 받지 않음*************
		int value3 = 3;
		System.out.println(false & ++value1 >10);
		System.out.println(value1);
		System.out.println();
		
		int value4 = 3;
		System.out.println(true | ++value2>5);
		System.out.println(value2);
		System.out.println();
		}
}