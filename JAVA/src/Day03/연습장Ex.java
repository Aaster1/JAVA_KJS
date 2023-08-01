package Day03;

import java.util.Scanner;

public class 연습장Ex{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RpgSet state = new RpgSet();
		boolean on = true;
		do{
			System.out.println(state);
			System.out.println("주사위를 굴려 『초기능력치』를 설정하십시오.");
			System.out.println("[Y/N]");
			String answer = sc.next().toUpperCase();
			if(answer.equals("Y")) {
				int dice = (int)((Math.random()*20)+1);
				if(1<=dice&&dice<=12) {
					state.STR =6;
					state.AGI =6;
					state.INT =6;
					state.LUCK =6;
				}
				else if(13<=dice&&dice<=19) {
					state.STR =7;
					state.AGI =7;
					state.INT =7;
					state.LUCK =7;

				}
				else{
//					가차 버그 갓겜ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
//					1/20 ^N 확률로 사기캐 탄생 버그
//					역시 게임은 버그가 있어야 제맛
					System.out.println("Congratulations!");
					state.STR +=10;
					state.AGI +=9;
					state.INT +=11;
					state.LUCK +=13;
				}
			}else if(answer.equals("N")) {
				System.out.println("능력치 설정을 완료하시겠습니까?");
				String answer2=sc.next().toUpperCase();
				if(answer2.equals("Y")) {
					on = false;
					System.out.println("메이플스토리지2007에 오신 것을 환영합니다.");
					System.out.println("당신의 능력치는 다음과 같습니다.");
					System.out.println(state);
				} else if(answer2.equals("N")) {
					continue;
				}
			} else {
				System.out.println("잘못된 입력입니다");
				continue;
				
			}
			
		} while(on);
			sc.close();
	}
}