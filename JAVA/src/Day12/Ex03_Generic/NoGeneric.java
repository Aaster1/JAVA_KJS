package Day12.Ex03_Generic;


class Cloth{
	
	
	
	
}
class Computer{
	
}



class Product1 {
	
	private Cloth cloth = new Cloth();

	public Cloth getCloth() {
		return cloth;
	}

	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}

	
	
	
	
}
class Product2 {
	
	private Computer computer = new Computer();

	public Computer getComputer() {
		return computer;
	}
	
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
}





public class NoGeneric {

	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Product1 product1 = new Product1();
		product1.setCloth(new Cloth());
		System.out.println(product1.getCloth());
		
		product2 product2 = new Croduct2();
		product2.setComputer(new Computer());
		System.out.println(product2.getComputer());
		
//		클래스를 정의할 때, 타입을 이미 결정함
//		product1.setCloth(new Computer());		//불가능
//		product2.setComputer(new Cloth());		//불가능
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
	}

}