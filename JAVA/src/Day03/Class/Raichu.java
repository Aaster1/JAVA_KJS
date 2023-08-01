package Day03.Class;


//		상속
//		-키워드: 자식 클래스 extends 부모클래스{}
public class Raichu extends Pikachu {

//	생성자 자동 완성
//	alt + shift + s ->  	밑에서 두번째, superclass 어쩌구
	public Raichu() {		// -->부모 클래스의 매개변수가 없는 기본생성자 호출
		super(200, "슈퍼전기",20);			// --> this, super 등의 것들은 첫번째로 입력하자!		
//		energy = 200;
//		type = "슈퍼전기";
//		level = 20;
	}

	public Raichu(int energy, String type, int level) {
		super(energy, type, level);		// -->부모 클래스의 매개변수가 있는 생성자 호출
	}

	@Override
	public String aAttack() {
		return "백만볼트!";
	}

	@Override
	public String bAttack() {
		return "볼트체인지!";
	}
	
	public String cAttack() {
		if(level >=40) return "아이언테일";
		else return "(사용불가)";
	}
	
	
	
}
