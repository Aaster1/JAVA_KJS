package _18_27._27;

public class Drone extends RcCar implements RemoteControl{

	String name = "드론";
	String battery = "배터리";
	int speed;

	@Override
	public void powerOn() {
		System.out.println(name + "의 전원이 켜졌습니다.");
	}

	@Override
	public void powerOff() {

		System.out.println(name + "의 전원이 꺼졌습니다.");
	}

	@Override
	public void setSpeed(int speed) {
		if(speed> max_Speed) this.speed = max_Speed;
		else if(speed<min_Speed) this.speed = min_Speed;
		else this.speed = speed;
	}

	@Override
	public void changeBattery() {
		 System.out.println(battery+"를 교체합니다.");
	}

}
