package Day07.Ex03_Player;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("바람과 같습니다!");
	}

	@Override
	public void jump() {
		System.out.println("새처럼 날아오릅니다!");
	}

	@Override
	public void turn() {
		System.out.println("현란하게 회전합니다!");
	}

	@Override
	public void showLevel() {
		System.out.println("레벨 : 고급자");
	}

}
