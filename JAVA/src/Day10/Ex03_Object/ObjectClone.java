package Day10.Ex03_Object;

class Point{
	int x,y;
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}

//	clone() 메소들들 사용하려면, clone() 메소드를 사용할 Cloneable 인터페이스를 구현해야한다
	// - 구현하지 않으면, CloneNotSupportedException 예외 발생
class Circle implements Cloneable{
	
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.radius =radius;
		point = new Point(x,y);
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}

	
//		clone 메소드 오버라이딩
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

public class ObjectClone {

	
//	 clone이란, 한 객체를 복사해 또 다른 객체를 만드는 것이다.
//		같은 값을 지닌, 다른 주소에 복제품을 생성하는 느낌
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10,20,30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		if(circle.equals(copyCircle)) {
			System.out.println("circle 과 copyCircle 은 같은 객체입니다");
		}else {
			System.out.println("circle 과 copyCircle 은 다른 객체입니다");
			
		}
		
		
//		System.identityHasahCode(객체)		:	객체의 해시코드를 반환
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
	
}
