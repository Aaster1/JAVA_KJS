package Day07.Ex03_Player;

public class BeginnerLevel extends PlayerLevel{
	
	@Override
	public void run() {
		System.out.println("춴춴히 달료요옹");
	}

	@Override
	public void jump() {
		System.out.println("다리 힘이 약합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("허리 힘이 약합니다.");
	}

	@Override
	public void showLevel() {
		System.out.println("레벨 : 입문자");
	}

}
