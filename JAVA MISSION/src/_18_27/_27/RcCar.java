package _18_27._27;

public class RcCar implements RemoteControl{
	String name = "RC카";
	String battery = "배터리";
	int speed;
	
	public RcCar() {
		this("RC카","배터리",5);
	}
	
	public RcCar(String name, String battery, int speed) {
		this.name = name;
		this.battery = battery;
		this.speed = speed;
	}

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
