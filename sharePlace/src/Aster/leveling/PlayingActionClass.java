package Aster.leveling;

import java.util.Scanner;

import Aster.leveling.Dun.PlayInDun;
import Aster.leveling.rest.PlayingActionRest;

public class PlayingActionClass{
	Scanner sc = LevelingExcute.getSc();

	public void playing() {
		PlayInDun pid = new PlayInDun();
		int N;
		boolean on = true;
		do {
			if(pid.life==false) {
				on=false;
				break;
			}
	System.out.println();
	System.out.println("==============================================================================================================================================");
	System.out.println();
	System.out.println("\t1. 휴식\t2. 상태창 열람\t3. 탐험하기\t4. 가챠돌리기(미구현)");
	System.out.println();
	System.out.println("==============================================================================================================================================");
	System.out.println();
	System.out.println("\t행동을 선택해주십시오 (1 ~ 4)");
	System.out.println();
	
	N=sc.nextInt();
	sc.nextLine();
	switch (N) {
	case 1:
		PlayingActionRest par = new PlayingActionRest();
		par.rest();
		break;
	case 2:
		Status status = new Status();
		status.status();
		break;
	case 3:
		pid.pid();
		break;
	case 4:
		System.out.println();
		System.out.println("==============================================================================================================================================");
		System.out.println();
		System.err.println("\t미구현된 기능입니다");
		System.out.println();
		System.out.println("==============================================================================================================================================");
		break;
//	case 5:
//		System.out.println();
//		System.out.println("==============================================================================================================================================");
//		System.out.println();
//		System.err.println("\t저장하시겠습니까? (Y/N)");
//		System.out.println();
//		System.out.println("==============================================================================================================================================");
//		String answer = sc.nextLine();
//		if(answer.equals("Y")) {
//			Save save = new Save();
//		}
//		else if(answer.equals("N")) {
//			break;
//		}else {
//			System.out.println();
//			System.out.println("==============================================================================================================================================");
//			System.out.println();
//			System.err.println("\t잘못된 입력입니다 (Y/N)");
//			System.out.println();
//			System.out.println("==============================================================================================================================================");
//		}
//		
//		break;

	default:
		System.out.println();
		System.out.println("==============================================================================================================================================");
		System.out.println();
		System.out.println("\t잘못된 입력입니다 (1 ~ 4)");
		break;
	}
		}while(on);
	}
		
//	public void rest() {
//		rest();
//	}
//	
//	public void  status() {
//		status();
//	}
//	
//	public void inDungeon() {
//		
//	}
//	
//	public void randGetItem() {
//		
//	}
	
	
	
}
