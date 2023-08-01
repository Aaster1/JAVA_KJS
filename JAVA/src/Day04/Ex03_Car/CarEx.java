package Day04.Ex03_Car;

public class CarEx {
	public static void main(String[] args) {
//		객체 생성
		Car car=new Car();
		car.model="제네시스";
//		car.speed = -100;
//		private 으로 지정한 변수는 외부에서 접근 불가능
		car. setSpeed(200);		
		System.out.println("model : "+car.getModel());
		System.out.println("speed : "+car.getSpeed());
		
		car. setSpeed(-100);
		System.out.println("model : "+car.getModel());
		System.out.println("speed : "+car.getSpeed());
		
		car. setSpeed(500);
		System.out.println("model : "+car.getModel());
		System.out.println("speed : "+car.getSpeed());
		
		car. setSpeed(80);
		System.out.println("model : "+car.getModel());
		System.out.println("speed : "+car.getSpeed());

		
//		보시다시피, speed라는 메소드 자체에는 접근이 불가하여 주석 처리하였나 line 8
//		허나, setName을 클래스에 메소드로 정의하고, 해당 setName이 getName메소드를 갱신하니,
//		set 변경 후 get으로 가져올 수 있다. is working
		
	}
}
