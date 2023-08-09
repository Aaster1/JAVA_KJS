package test;

class S{
	
}

class A extends S{
	
}
class B extends A{
	
}

class C extends B{
	
}


class Box<T>{
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public 
	}
	
	
	
	
}
public class Test{
	
	
	
	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		Box<B> box2 = new Box<>();

		box1.setT("문자열저장소1");
		System.out.println(box1.getT());
		
		box2.setT(1131);
		System.out.println(box2.getT());
		
		box2.setT((B)new A());
		
		
		
		
		
		
	}
}