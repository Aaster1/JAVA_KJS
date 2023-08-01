package Day03.Class;

public class Jiwoo {
	public static void main(String[] args) {
//		객체 생성
//		클래스타입 객체명 = new 클래스명();
		Pikachu pikachu = new Pikachu();
		
		System.out.println("######### 피카츄 ##########");
		System.out.println("에너지 : "+ pikachu.energy);		//-->int 기본 타입이라 0이 나오는데
		System.out.println("타입 : "+ pikachu.type);			// -->String 참조 타입이라 null이 나오는거임 ㅇㅋ?
		System.out.println("레벨 : "+ pikachu.level);			
		System.out.println("공격 A : "+ pikachu.aAttack());
		System.out.println("공격 B : "+ pikachu.bAttack());
		System.out.println();
		
		
		Pikachu pikachu2 = new Pikachu(150,"전귀",20);
		
		System.out.println("######### 피카츄 ##########");
		System.out.println("에너지 : "+ pikachu2.energy);		
		System.out.println("타입 : "+ pikachu2.type);			
		System.out.println("레벨 : "+ pikachu2.level);			
		System.out.println("공격 A : "+ pikachu2.aAttack());
		System.out.println("공격 B : "+ pikachu2.bAttack());
		System.out.println();
		
		Raichu raichu = new Raichu();
		System.out.println("######### 라이츄 ##########");
		System.out.println("에너지 : "+ raichu.energy);		
		System.out.println("타입 : "+ raichu.type);			
		System.out.println("레벨 : "+ raichu.level);			
		System.out.println("공격 A : "+ raichu.aAttack());
		System.out.println("공격 B : "+ raichu.bAttack());
		System.out.println("공격 C : "+ raichu.cAttack());
		System.out.println();
		
		Raichu raichu2 = new Raichu(400, "존귀",40);
		System.out.println("######### 라이츄 Lv.40 ##########");
		System.out.println("에너지 : "+ raichu2.energy);		
		System.out.println("타입 : "+ raichu2.type);			
		System.out.println("레벨 : "+ raichu2.level);			
		System.out.println("공격 A : "+ raichu2.aAttack());
		System.out.println("공격 B : "+ raichu2.bAttack());
		System.out.println("공격 C : "+ raichu2.cAttack());
		System.out.println();
	}
}
