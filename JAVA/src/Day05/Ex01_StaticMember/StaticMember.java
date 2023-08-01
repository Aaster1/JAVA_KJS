package Day05.Ex01_StaticMember;

public class StaticMember {
	
//	static 변수
	static int a;
	static int b;
	int c;
	static final double PI= 3.141592;
	
//	static 메소드
	public static int sum(int x,int y) {
		int sum = a+b+x+y;		
		
//		sum+=c;				//<-- 에러가 나는 이유? a, b는 값 없이도 되는데 왜 너만? =>스태틱 a,b 는 static 차원에서 먼저 생성, 하지만 c는 아니기 때문에.
		
		return sum;
		
		
	}
	public static void main(String[] args) {
		int sum = sum(10,20);
		a=100;
		StaticMember sm1 = new StaticMember();
		StaticMember sm2 = new StaticMember();
		
		int a1 = sm1.a;
		int c1 = sm1.c =10;
		int a2 = sm2.a;
		int c2 = sm2.c - 20;
		
//		PI = 100;			//<--『final 로 정의된 변수』(=상수)은 변경할 수 없다.
		
		
		System.out.println("a1 : "+a1);
		System.out.println("c1 : "+c1);
		System.out.println("a2 : "+a2);
		System.out.println("c2 : "+c2);
	}
}
