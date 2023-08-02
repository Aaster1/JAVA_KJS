package Day07.Ex02_Computer;

public class User {
	public static void main(String[] args) {
		Computer com = new DeskTop();
//		Computer com2 = new LapTop();
//		추상클래스는 객체로 생성할 수 없다.
		Computer com2 = new Gram();
		LapTop lap = new Gram();
		Gram gr = new Gram();
		
		com.turnOn();
		com.display();
		com.typing();
		com.turnOff();
		
		com2.turnOn();
		com2.display();
		com2.typing();
		com2.turnOff();
		
		lap.turnOn();
		lap.display();
		lap.typing();
		lap.turnOff();
		
		gr.turnOn();
		gr.display();
		gr.typing();
		gr.turnOff();
		
		
		
	}
}
