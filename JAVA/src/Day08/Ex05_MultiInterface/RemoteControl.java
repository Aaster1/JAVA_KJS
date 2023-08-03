package Day08.Ex05_MultiInterface;

public interface RemoteControl {
	
////	상수
//	인터페이스 변수는 public static final 로 자동으로 선언된다.
	int MAX_VOLUME = 10;			//<-- 스태틱 영역으로 선언된 값들은 『기울임체』!!
	int MIN_VOLUME= 0;				//<--outLine 참조하여 어던 형태인지 확인하자!!
	
//	추상 메소드
//	:	(public abstract)를 생략하고 작성할 수 있다.
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setChannel(int channel);
	
//	디폴트 메소드  <-- 예외적으로 다른 메소드도 설정 가능
//	:	구현한 객체가 기본으로 사용할 수 있는 메소드
//	인터페이스에서는 본디 기본 추상메소드만 사용가능하도록 설계되었지만, default와 static에 한해서 허용.
	default void setMute(boolean mute) {		//<--앞에 접근지정자를 생략하고 void = 추상;
		if(mute) {
			System.out.println("음소거 설정");
			setVolume(0);
		}
		else {
			System.out.println("음소거 해제");
			setVolume(5);
		}
	}
	
	
//	static 메소드(정적 메소드)
//	:	 구현 객체가 없어도 인터페이스만으로도 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("배터리를 교환");
	}
}