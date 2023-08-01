package Day03.Class;

public class Pikachu {
//		클래스 정의 해버리기
//		클래스 	: 객체를 정의하는 설계도
//		멤버 		: 변수, 메소드

//		변수
	public int energy;
	public String type;
	public int level;
//		생성자		: 클래스 내부에 아래와 같이 클래스명과 같은 입력.
//		지우 main 기능에서 따로 값을 정하지 않을 경우, 생성자 내부의 값으로 생성됨.
//		alt + shift + s 키의 바로가기메뉴를 통해 o 단축키로 호출 가능.

	
//	기본생성자
	public Pikachu() {
		this(100,"전기",1);
		this.energy = 100;
		this.type = "전기";
		this.level = 1;
	}
	
//	자동완성 생성자
	
	public Pikachu(int energy, String type, int level) {
		this.energy = energy;
		this.type = type;
		this.level = level;
	}
	

@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}

	//		메소드
	public String aAttack() {
		return "십만볼트";
	}

	public String bAttack() {
		return "전광석화";
	}
}
