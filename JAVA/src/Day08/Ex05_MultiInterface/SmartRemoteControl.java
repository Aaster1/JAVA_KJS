package Day08.Ex05_MultiInterface;


//	인터페이스 다중 상속
//	public interface 인터페이스명 extends interA, interB, interC, . . .{}
public interface SmartRemoteControl extends RemoteControl, Microphone{			//<--상속받는 순간 인터페이스는 메소드를 그대로 이어받는다.(인터페이스는 객체 생성이 안됨. static이거든)

//	터치패드 기능
//	- x,y 좌표 위치에 터치패드를 클릭
	
	void touch(int x,int y);
}
