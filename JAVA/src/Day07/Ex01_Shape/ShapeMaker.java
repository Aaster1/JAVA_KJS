package Day07.Ex01_Shape;

import java.util.Scanner;

public class ShapeMaker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;			//<--추상 클래스 생성
		double width = 0.0;
		double height= 0.0;
		double radius= 0.0;
		
//		총합
		double roundSum = 0.0;
		double areaSum = 0.0;
		
//		입력 받은 도형 정보 배열
		Shape[] shapeList = new Shape[3];
		int index = 0;
		
		while(true) {
			if(index ==3)break;
			System.out.println("1. 정삼각형\t2. 직사각형\t3. 원형");
			System.out.print("> >");
			String input = sc.next();
			
			if(input.equals("그만"))break;
			switch(input){
				case "1":
					System.out.print("가로>>");
					width = sc.nextDouble();
					System.out.print("세로>>");
					height = sc.nextDouble();
					
					shape = new Triangle(width,height);		//<--추상 클래스를 상속받은 구현 클래스
					shapeList[index++] = shape;
					break;
				case "2":
					System.out.print("가로>>");
					width = sc.nextDouble();
					System.out.print("세로>>");
					height = sc.nextDouble();
					
					shape = new Rectangle(width,height);
					shapeList[index++] = shape;
					break;
				case "3":
					System.out.print("반지름>>");
					radius= sc.nextDouble();
					
					shape = new Circle(radius);
					shapeList[index++] = shape;
					break;
			}
		}
		for(Shape s : shapeList) {
			if(s==null)continue;
			
//			instanceof	: 인스턴스를 비교하는 연산
			if(s instanceof Triangle)
				System.out.println("[정삼각형]");
			if(s instanceof Rectangle)
				System.out.println("[직사각형]");
			if(s instanceof Circle)
				System.out.println("[원형]");
			
			double area = s.area();
			double round = s.round();
			
			areaSum = areaSum +area;
			roundSum = roundSum + round;
			
			System.out.print("넓이 : " + area+"\t");
			System.out.print("둘레 : " + round+"\t");
			System.out.println();
		}
		System.out.println("넓이 총합 : "+areaSum);
		System.out.println("둘레 총합 : "+roundSum);
	}
}
