package Aster.leveling.rest;

import java.util.Scanner;

import Aster.leveling.PlayingActionClass;
import Aster.leveling.Dun.PlayerStateData;

public class PlayingActionRest extends PlayingActionClass{

	@Override
	public void rest() {
		Scanner sc = new Scanner(System.in);
		PlayerStateData state = new PlayerStateData();
		boolean on = true;
		do {
		System.out.println();
		System.out.println("================\t휴식\t=====================================================================================================");
		System.out.println();
		System.out.println("\t1. 요리하기\t||\t2. 잠자기\t||\t3. 훈련하기\t||\t4. 이전메뉴로");
		System.out.println("===================================================================================================================================");
		System.out.println();
		System.out.println("\t행동을 선택하십시오 (1~3)");
		int answer = sc.nextInt();
		if(answer ==1) {
			
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
			System.out.println("================\t휴식\t=====================================================================================================");
			System.out.println();
			System.out.println("이전메뉴로 돌아갑니다.");
			System.out.println();
			System.out.println("===================================================================================================================================");
			System.out.println();
			on=false;
			break;
			
		}else {
			System.out.println();
			System.out.println("===================================================================================================================================");
			System.out.println();
			System.out.println("잘못된 입력입니다 (1~3)");
		}
		}while(on);
		sc.close();
	}
}
