package _13;

import java.util.Scanner;

class ModooDriver {
	static int power=0;

	public ModooDriver() {
		this(0);
	}
	public ModooDriver(int power) {
		this.power = power;
	}
	public void drive(DeliveryType a) {
		
	}
	public void drive(DeliveryType a,DeliveryType b) {
		
	}
	public void powerUp(Drink a) {
		
	}
	
}


class DeliveryType {
	static Scanner sc = new Scanner(System.in);
	static String name = "배달수단";

	public DeliveryType() {
		this("배달수단");
	}

	public DeliveryType(String name) {
		this.name = name;
	}

	public void work() {
		boolean on = true;
		String workName=null;
		do {
			System.out.println("================" + name + "================");
			System.out.println("1. " + Walker.name);
			System.out.println("2. " + Bicycle.name);
			System.out.println("3. " + Kickboard.name);
			System.out.println("4. " + MotorCycle.name);
			System.out.println("=======================================");
			System.out.println("입력> >");
			int workNo = sc.nextInt();
			if (workNo == 1) {
				workName = Walker.name;
				on = false;
			} else if (workNo == 2) {
				workName = Bicycle.name;
				on = false;
			} else if (workNo == 3) {
				workName = Kickboard.name;
				on = false;
			} else if (workNo == 4) {
				workName = MotorCycle.name;
				on = false;
			} else {
				System.out.println("잘못된 입력입니다. (1 ~ 4)");
				continue;
			}
		} while (on);
		Drink.getPower();
		System.out.println(workName +"(으)로 배달을 수행중입니다.");
		System.out.println("활력 : "+ModooDriver.power);
		System.out.println();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Drink {
	static String name = "드링크";

	public Drink() {
		this("드링크");
	}

	public Drink(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void getPower() {
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		String drinkName = null;
		do {
			System.out.println("================" + name + "================");
			System.out.println("1. " + VitaminDrink.name);
			System.out.println("2. " + Coffee.name);
			System.out.println("3. " + EnergyDrink.name);
			System.out.println("0. " + "안마쉼");
			System.out.println("=======================================");
			System.out.println("입력> >");
			int workNo = sc.nextInt();
			if (workNo == 1) {
				drinkName = VitaminDrink.name;
				on = false;
				ModooDriver.power = 150;
			} else if (workNo == 2) {
				drinkName = Coffee.name;
				on = false;
				ModooDriver.power = 150;
			} else if (workNo == 3) {
				drinkName = EnergyDrink.name;
				on = false;
				ModooDriver.power = 150;
			} else if (workNo == 0) {
				drinkName = null;
				on = false;
				ModooDriver.power = 100;
			}
			else {
				System.out.println("잘못된 입력입니다. (0 ~ 3)");
				continue;
			}
		} while (on);
		if(drinkName !=null) {
			System.out.println(drinkName+"을/를 마셨습니다.");
		}
		
	}

}

class Walker extends DeliveryType {
	static String name = "도보";

	public Walker() {
		this("도보");
	}

	public Walker(String name) {
		this.name = name;
	}

	public void work() {
		this.work();
	}
}

class Bicycle extends DeliveryType {
	static String name = "자전거";

	public Bicycle() {
		this("자전거");
	}

	public Bicycle(String name) {
		this.name = name;
	}

	public void work() {
		super.work();
	}
}

class Kickboard extends DeliveryType {
	static String name = "킥보드";

	public Kickboard() {
		this("킥보드");
	}

	public Kickboard(String name) {
		this.name = name;

	}

	public void work() {
		super.work();
	}
}

class MotorCycle extends DeliveryType {
	static String name = "오토바이";

	public MotorCycle() {
		this("오토바이");
	}

	public MotorCycle(String name) {
		this.name = name;

	}

	public void work() {
		super.work();
	}
}

class VitaminDrink extends Drink {
	static String name = "비타민음료";

	public VitaminDrink() {
		this("비타민음료");
	}

	public VitaminDrink(String name) {
		super();
		this.name = name;
	}

	public int getPower(int a) {
		return a;
	}

}

class Coffee extends Drink {
	static String name = "커피";

	public Coffee() {
		this("커피");
	}

	public Coffee(String name) {
		super();
		this.name = name;
	}

	public int getPower(int a) {
		return a;
	}

}

class EnergyDrink extends Drink {
	static String name = "에너지드링크";

	public EnergyDrink() {
		this("에너지드링크");
	}

	public EnergyDrink(String name) {
		super();
		this.name = name;
	}

	public int getPower(int a) {
		return a;
	}
}

public class Driver {
	public static void main(String[] args) {
		DeliveryType dType = new DeliveryType();
		Walker walk = new Walker();
		boolean on = true;
		System.out.println(walk.name);
		int count = 0;
		do {
			count += 1;
			System.out.println("//"+count+"번째 실행");
			dType.work();

		} while (on);
	}
}
