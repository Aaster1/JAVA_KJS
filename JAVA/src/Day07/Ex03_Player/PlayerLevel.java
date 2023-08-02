package Day07.Ex03_Player;

public abstract class PlayerLevel{
	
	
//	달리기, 점프, 회전 = 추상클래스로 선언하는 이유 : 해당 메소드는 변경이 필요하기 때무네!!!!!!!!!!!!!!!
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
//	난이도 출력메세지
	public abstract void showLevel();
	
//	템플릿 메소드
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
