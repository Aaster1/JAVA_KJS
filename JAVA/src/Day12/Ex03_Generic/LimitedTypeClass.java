package Day12.Ex03_Generic;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}

//	타입지정이 가능한 클래스 :
class D <T extends B>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
	
}


//	i)Integer 클래스로 제한 || extends Integer로 제한 (효용가치가 없음)
//	ii) Number 클래스로 제한	(숫자타입만 사용가능하도록 제한 (Double,Integer 등))
class E <T extends Number>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
	
}





public class LimitedTypeClass {


	
	
	
	public static void main(String[] args) {
		
		
		D<B> d1 = new D<B>();
		D<C> d2 = new D<C>();
//		D<A> d3 = new D<>();
//		D 클래스의 타입 매개변수를 B 클래스로 제한하고 있기 때문에,
//		B 클래스와 자식 클래스인 B와 C만 가능
		
//		B b = new B();
//		d1.setT(b);
		
		d1.setT(new B());
		d2.setT(new C());
		
		d1.setT(new C());			//<--업 오토캐스팅이 일어나고 있음.
//		d2.setT(new B());			//<-다운캐스팅해야 사용할 수 있는데, 다운 오토캐스팅이 안되기 때문이다.
		
		
//		타입지정을 생략하면,
//		제네릭 타입을 제한한 B클래스를 기본으로 생성한다.
		D d4 = new D();		//<--B클래스인거임.
		d4.setT(new B());
		d4.setT(new C());
		
		
//		Number 숫자타입 클래스만 타입매개변수로 사용가능한 E 객체
		E<Integer> e1 = new E<>();
		E<Double>e2 = new E<>();
		E<Byte> e3 = new E<>();
		
		e1.setT(100);
		System.out.println(e1.getT());
		
		e2.setT(12.34);
		System.out.println(e1.getT());
		
		e3.setT((byte)127);
		System.out.println(e1.getT());
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
