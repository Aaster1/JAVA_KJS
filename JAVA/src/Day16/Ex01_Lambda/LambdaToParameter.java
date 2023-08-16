package Day16.Ex01_Lambda;

@FunctionalInterface
	interface SmartCalc{
	int cal(int x, int y);
}


	class temp implements SmartCalc{

		@Override
		public int cal(int x, int y) {
			return x>y?x:y;
		}
		
	}


public class LambdaToParameter {

	public static void main(String[] args) {
//		최대값
		SmartCalc sc = (x,y) -> x>y?x:y;
		
//		x ~ y까지 합계
		SmartCalc sc2 = (x,y) ->{
			int sum = 0;
			for (int i = x; i <= y; i++) {
				sum+=i;
			}
			return sum;
		};
		
		smartCalc(sc,10,20);
		smartCalc(sc2,1,10);
		
		
//		다음과 같이, 인터페이스와 클래스만으로 구현하려했을 때는 한 인터페이스에 여러 방식의 실행문 구조를 짤 수가 없다.
//		하지만 위와 같이 람다식으로 하게될 경우, 여러 구현 방법을 통해 다른 메소드로 넘겨 인터페이스를 활용할 수 있다.
		SmartCalc sc3 = new temp();
		smartCalc(sc3, 25, 15);
	}
	
//	형태를 주시해라. 인터페이스를 매개변수로 넘기고 있으며, 해당 매개변수로 해당 인터페이스를 람다식으로 구현한 자료형이 넘어가고 있다.
	public static void smartCalc(SmartCalc sm,int a,int b) {
		System.out.println(sm.cal(a, b));
	}
}
