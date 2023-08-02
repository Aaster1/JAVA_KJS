package _18_27._27;

public class Driver{
	public static void main(String[] args) {
		RemoteControl remote = new RcCar();
		
		for (int i = 0; i < 5; i++) {
			remote.run(i);			
		}
	}
}
