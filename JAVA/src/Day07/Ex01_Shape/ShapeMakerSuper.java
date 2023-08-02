package Day07.Ex01_Shape;

import java.util.Scanner;

public class ShapeMakerSuper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		do {
		System.out.println("================도형 입력================");
		System.out.println("1. 정삼각형");
		System.out.println("2. 직사각형");
		System.out.println("3. 원");
		System.out.println("================ 번호 입력 : ");
		int N = sc.nextInt();
		if(N==1) {
			Triangle tri = new Triangle();
			System.out.println();
			System.out.println("밑변 : ");
			tri.setWidth(sc.nextInt());
			sc.nextLine();
			System.out.println();
			System.out.println("높이 : ");
			tri.setHeight(sc.nextInt());
			sc.nextLine();

			double area = tri.area();
			double round= tri.round();
			System.out.println("정삼각형의 둘레 : "+round);
			System.out.println("정삼각형의 넓이 : "+area);
			
		}
		else if(N==2) {
			Rectangle rec = new Rectangle();
			System.out.println();
			System.out.println("밑변 : ");
			rec.setWidth(sc.nextInt());
			sc.nextLine();
			System.out.println();
			System.out.println("높이 : ");
			rec.setHeight(sc.nextInt());
			sc.nextLine();
			double area = rec.area();
			double round= rec.round();
			System.out.println("사각형의 둘레 : "+round);
			System.out.println("사각형의 넓이 : "+area);

			
		}
		else if(N==3) {
			Circle cir = new Circle();
			System.out.println();
			System.out.println("반지름 : ");
			cir.setRadius(sc.nextInt());
			sc.nextLine();

			double area = cir.area();
			double round= cir.round();
			System.out.println("원의 둘레 : "+round);
			System.out.println("원의 넓이 : "+area);

			
		}
		else if(N==0) {
			on = false;
			System.out.println("프로그램을 종료합니다.");
		}
		} while(on);
		sc.close();
	}
}
