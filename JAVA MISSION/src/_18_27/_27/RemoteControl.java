package _18_27._27;

public interface RemoteControl {
	int max_Speed = 10;
	int min_Speed = 1;

	void powerOn();

	void powerOff();

	void setSpeed(int speed);

	void changeBattery();

	default void run(int cnt) {
		powerOn();
		for (int i = 0; i < cnt; i++) {			
			changeBattery();
			setSpeed(i);
		}
		powerOff();
	}
}
