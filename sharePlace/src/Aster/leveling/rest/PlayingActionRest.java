package Aster.leveling.rest;

import java.util.Scanner;

import Aster.leveling.LevelingExcute;
import Aster.leveling.TempInventory;
import Aster.leveling.Dun.PlayerStateData;

public class PlayingActionRest{

	public void rest() {
		TempInventory ti = new TempInventory();
		Scanner sc = LevelingExcute.getSc();
		PlayerStateData state = new PlayerStateData();
		boolean on = true;
		do {
		System.out.println();
		System.out.println("================\t휴식\t=====================================================================================================");
		System.out.println();
		System.out.println("\t1. 연금\t||\t2. 잠자기\t||\t3. 훈련하기\t||\t4. 연금영약 사용\t5. 이전메뉴로");
		System.out.println("===================================================================================================================================");
		System.out.println();
		System.out.println("\t행동을 선택하십시오 (1~3)");
		int answer = sc.nextInt();
		sc.nextLine();
		if(answer ==1) {
			do {
			System.out.println();
			System.out.println("1. 『슬라임 포션』\t 슬라임 점액(1)||만질 수 없는 헝겊(1)");
			System.out.println();
			System.out.println("2. 『잔혹한 냉기』\t부식된 뼈(1)||섬뜩한손뼈(1)");
			System.out.println();
			System.out.println("3. 『프로틴2007』\t찢어진 천조각(1)||악취 나는 살점(1)");
			System.out.println();
			System.out.println("4. 『바람의 가호』\t따듯한 털가죽(1)||리자드맨의 비늘(1)");
			System.out.println();
			System.out.println("5. 『수호자의 증언』\t흉흉한 두개골(1)||오우거의 뿔(1)");
			System.out.println();
			System.out.println("6. 『투사의 유언』\t장식용 글레이브(1)||이형의 이빨(1)");
			System.out.println();
			System.out.println("7. 『검붉은 은총』\t뱀파이어의 로브(1)||지배자의 왕관(1)");
			System.out.println();
			System.out.println("8. 『마공학 핵』\t골렘의 코어(1)||빛나는 생명의 베슬(1)");
			System.out.println();
			System.out.println("9. 『창공의 수혜』\t위대한 뿔(1)||태양에 그을린 날개깃(1)");
			System.out.println();
			System.out.println("10. 『가공된 용의 심장』\t용의 심장(3)");
			System.out.println();
			System.out.println("11. 『용의 정수』\t용의 심장(1)||세계의 심장(1)");
			System.out.println();
			System.out.println("12. 『절대자의 재림』\t마왕의 옥쇄(1)||고대의 비문(1)");
			System.out.println();
			System.out.println("===================================================================================================================================");
			System.out.println();
			System.out.println("\t 연금 항목을 선택해주십시오\t(0. 종료)");
			int N = sc.nextInt();
			sc.nextLine();
			if(1<=N&&N<=12) {
				ti.getPotionAction(N);
				break;
			}else if(N==0){
				break;
			}
			else {
				continue;
			}
			}while(true);
		}else if(answer ==2){
			System.out.println();
			System.out.println("================\t잠자기\t=====================================================================================================");
			System.out.println();
			System.out.println("\t잠자리에 듭니다 ");
			System.out.println();
			state.HP=state.MAXHP;
			state.MP=state.MAXMP;
			System.out.println("\tHP/MP 전회복\t||\t DAY +1");
			System.out.println();
			System.out.println("===================================================================================================================================");
			System.out.println();
			
		}else if(answer ==3){
			state.training();
		}else if(answer ==4) {
			System.out.println();
			System.out.println("================\t영약 사용\t=====================================================================================================");
			System.out.println();
			ti.invenOpen();
			System.out.println();
			System.out.println("===================================================================================================================================");
			System.out.println();
			System.out.println("\t사용할 영약의 이름을 입력하십시오");
			String answerPotion= sc.nextLine();
			if(answerPotion.equals("잔혹한 냉기")) {
				if(ti.useItem(24)) {
				System.out.println("\tSTR +10");
				state.STR+=10;
				System.out.println("===================================================================================================================================");
				}
			}
			else if(answerPotion.equals("프로틴2007")) {
				if(ti.useItem(25)) {
					System.out.println("\tSTR +5\t||\tAGI+3");
					state.STR+=5;
					state.AGI+=3;
					System.out.println("===================================================================================================================================");
					}
			}
			else if(answerPotion.equals("바람의 가호")) {
				if(ti.useItem(26)) {
					System.out.println("\tAGI +5\t||\tINT+3");
					state.AGI+=8;
					state.INT+=3;
					System.out.println("===================================================================================================================================");
					}
			}
			else if(answerPotion.equals("수호자의 증언")) {
				if(ti.useItem(27)) {
					System.out.println("\tAGI +10\t||\tSTR +3");
					state.STR+=3;
					state.AGI+=10;
					System.out.println("===================================================================================================================================");
					}
			}
			else if(answerPotion.equals("투사의 유언")) {
				if(ti.useItem(28)) {
					System.out.println("\tSTR +20\t||\tAGI +5");
					state.STR+=20;
					state.AGI +=5;
					System.out.println("===================================================================================================================================");
					}
			}
			else if(answerPotion.equals("검붉은 은총")) {
				if(ti.useItem(29)) {
					System.out.println("\tINT +25\t||\tAGI +5");
					state.INT+=25;
					state.AGI +=5;
					System.out.println("===================================================================================================================================");
					}
			}
			else if(answerPotion.equals("마공학 핵")) {
				if(ti.useItem(30)) {
					System.out.println("\tINT +20");
					state.INT+=20;
					System.out.println("===================================================================================================================================");
					}
			}
			else if(answerPotion.equals("창공의 수혜")) {
				if(ti.useItem(31)) {
					System.out.println("\tAGI +30");
					state.AGI+=30;
					System.out.println("===================================================================================================================================");
					}
			}
			else if(answerPotion.equals("가공된 용의 심장")) {
				if(ti.useItem(32)) {
					System.out.println("\tAllStat +20");
					state.STR+=20;
					state.AGI+=20;
					state.INT+=20;
					state.LUCK+=20;
					System.out.println("===================================================================================================================================");
					}
			}
			else if(answerPotion.equals("용의 정수")) {
				if(ti.useItem(33)) {
					System.out.println("\tAll Stat +50");
					state.STR+=50;
					state.AGI+=50;
					state.INT+=50;
					state.LUCK+=50;
					System.out.println("===================================================================================================================================");
					}
			}
			else if(answerPotion.equals("절대자의 재림")) {
				if(ti.useItem(34)) {
					System.out.println("\tAll Stat +200");
					state.STR+=200;
					state.INT+=200;
					state.AGI+=200;
					state.LUCK+=200;
					System.out.println("===================================================================================================================================");
					}
			}else {
				System.out.println();
				System.out.println("===================================================================================================================================");
				System.out.println();
				System.err.println("\t잘못된 입력입니다 || 공백과 철자를 확인해주세요");
				System.out.println();
				System.out.println("===================================================================================================================================");
			}
			
			on=false;
			break;
			
		}else if(answer ==5) {
			System.out.println();
			System.out.println("================\t휴식\t=====================================================================================================");
			System.out.println();
			System.out.println("\t이전메뉴로 돌아갑니다.");
			System.out.println();
			System.out.println("===================================================================================================================================");
			System.out.println();
			on=false;
			break;

		}else {
			System.out.println();
			System.out.println("===================================================================================================================================");
			System.out.println();
			System.err.println("\t잘못된 입력입니다 (1~5)");
		}
		}while(on);
	}
}
