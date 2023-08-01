package Day05.Review;

public class Ex02_ThreeSixNine {
	public static void main(String[] args) {
//		정수 1~ 100까지 반복하면서,
//		해당 수가 3또는6또는9일 때,,
//		369가 되는 개수만큼 "*"을 출력하는 프로그램을 작성하시ㅗㅇ.
//		Ex) 3	-->	"*";
//			39 --> "**";
//			40 --> "40";
		
		
		for (int i = 1; i <= 100; i++) {
			int ten = i/10;
			int one = i%10;
			boolean ten369 = ten ==3||ten ==6||ten==9;
			boolean one369 = one ==3||one ==6||one==9;
		 if((one369&&ten369)) {
			System.out.println("**");
		}
			else if ((one369)||(ten369)) {
				System.out.println("*");
			}else {
				System.out.println(i);
			}
		}
	}
}
		
	