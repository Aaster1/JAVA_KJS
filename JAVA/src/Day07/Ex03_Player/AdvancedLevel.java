package Day07.Ex03_Player;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빠르게 달려갑니다.");
	}

	@Override
	public void jump() {
		System.out.println("도약합니다.");
	}

	@Override
	public void turn() {
		System.out.println("허리 힘이 약합니다.");
	}

	@Override
	public void showLevel() {
		System.out.println("레벨 : 중급자");
	}

}
