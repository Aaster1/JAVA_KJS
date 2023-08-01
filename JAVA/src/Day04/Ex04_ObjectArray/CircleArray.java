package Day04.Ex04_ObjectArray;

/*반지름이 1~5인 Circle객체를 5개 가지는 배열을 생서하고,
 * 배열요소에 있는 모든 CIrcle 객체의 넓이를 출력하시오.
 */

class Circle{
	
//	변수		:반지름
//	메소드	:넓이
	
	int radius;
	
//	생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	
	
//	메소드
	public double getArea() {
//		원의 넓이 = 원주율 * (반지름^2)
		return Math.PI*Math.pow(radius, 2);
	}
}

public class CircleArray{
	public static void main(String[] args) {
		Circle[] c;
		c=new Circle[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i]=new Circle(i+1);
		}
		for(Circle circle : c) {
		System.out.println("넓이 : "+circle.getArea());}
	}
}