package Day16.Ex01_Lambda;

class Television{
	void turnon() {
		System.out.println("전원켜기");
	}
	void volumeUp() {
		System.out.println("");
	}
	void volumeDown() {
		System.out.println("");
	}

}

interface RemoteControl{
	void volumeUp();
	void volumeDown();
}

@FunctionalInterface		//<--인터페이스가 함수형 인터페이스인지 체크(추상 메소드가 1개인지 체크)
interface Calculator{
	int Calc(int a, int b);
//	추상 메소드가 2개 이상 있으면 에러 발생
//	double calc(double a, double b);
}




public class TestLambda {

	public static void main(String[] args) {
//		익명 자식 객체
//		변수는 {} 안에서만 효력.
//		메소드는 오버라이딩됨. {}안의 영역이 끝나도 오버라이딩 됨.
//		안쪽의 메소드가 오버라이딩될 뿐.
		Television tv = new Television() {
			int channel = 0;
			
			void volumeUp() {
				System.out.println("UP");
			}
			void volumeDown() {
				System.out.println("DOWN");
			}
		};	//<--중괄호 끝에 세미콜론 들어감 ㅋㅋㅋㅋㅋㅋㅋ
		
		tv.volumeUp();
	
		
		
		
		
		
//		익명 구현 객체
		
//		없는 클래스명을 구현 객체로 생성
		RemoteControl rc = new RemoteControl() {

			@Override
			public void volumeUp() {
				System.out.println("UP");
			}

			@Override
			public void volumeDown() {
				System.out.println("DOWN");
			}
			
		};
		
		rc.volumeUp();
		rc.volumeDown();
		
		
		
		
//		자, 그래서 람다식은 무엇인가!!
//		위 과정을 더욱 간결하게 만들어준 개념
		
		
//		람다식
//		Calculator 인터페이스를 람다식으로 구현
		Calculator calSum = (a,b) -> {return a+b;};
		Calculator calSub = (a,b)->{return a-b;};
		Calculator calMult = (a,b)->{return a*b;};
		Calculator calDiv = (a,b)->{return a/b;};
		Calculator calRemain = (a,b)->{return a%b;};
		
//		구현할 자료형의 Calc 메소드를 호출하면,
//		람다식으로 구현된 메소드의 형태를 호출해옴.
		
		System.out.println(calSum.Calc(20,10));
		System.out.println(calSub.Calc(20,10));
		System.out.println(calMult.Calc(20,10));
		System.out.println(calDiv.Calc(20,10));
		System.out.println(calRemain.Calc(20,10));
		
//		int가 아닌 더블형으로 변환
		
//		Calculator dCalSum = (double a,double b) -> a+b;
//		↑↑↑구현불가
		
		
		
		
	}
	
}
