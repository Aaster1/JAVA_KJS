package test;

import Day03.Class.Pikachu;

class Arrays<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}


public class Test{
	
	public static void main(String[] args) {
	
		Arrays<Pikachu> pika = new Arrays<Pikachu>();
		pika.setT(new Pikachu());
		pika.setT(new Pikachu());
		System.out.println(pika.getT());
		
	}
}