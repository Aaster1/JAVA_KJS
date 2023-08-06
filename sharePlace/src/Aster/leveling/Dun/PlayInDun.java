package Aster.leveling.Dun;

import java.util.Scanner;

import Aster.leveling.LevelingExcute;
import Aster.leveling.Status;

public class PlayInDun {
	public boolean life = true;

	public void pid() {
		Scanner sc = LevelingExcute.getSc();
		boolean on = true;
		do {
			if(life==false) {
				System.out.println();
				System.out.println("===================================================================================================");
				System.err.println();
				System.err.println("GAME OVER");
				on=false;
				System.out.println();
				System.out.println("===================================================================================================");
				break;
			}
			System.out.println();
			System.out.println("===================================================================================================");
			System.out.println();
			System.out.println("\t1. 마을 인근[초급]\t2. 평원 진출[하급]\t3. 미개척 던전[중급]");
			System.out.println();
			System.out.println("\t4. 금역 도전[위험]");
			System.out.println();
			System.out.println("===================================================================================================");
			System.out.println();
			System.out.println("\t행동을 선택하십시오 (1~4) (0. 이전메뉴로 돌아가기");
			int N = sc.nextInt();
			switch (N) {
			case 1:
				boolean on1 = true;
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				System.out.println("\t마을 인근을 탐색합니다");
				System.out.println();
				System.out.println("===================================================================================================");
				do {
				System.out.println();
				System.out.println("\t1. 탐색하기\t2. 상태창 열람\t3. 마을로 돌아가기");
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				System.out.println("\t행동을 선택하십시오 (1~3)");
				int N1 = sc.nextInt();
				sc.nextLine();
				switch (N1) {
				case 1:
					FightClass fc = new FightClass();
					fc.fc(N);				
					break;
				case 2:
					Status status = new Status();
					status.status();
					break;
				case 3:
					System.out.println();
					System.out.println("===================================================================================================");
					System.out.println();
					System.out.println("마을로 돌아갑니다");
					System.out.println();
					on1 = false;
					break;

				default:
					System.out.println();
					System.out.println("===================================================================================================");
					System.out.println();
					System.out.println("잘못된 입력입니다 (1 ~ 3)");
					break;
				}
				
				
				
				}while(on1);
				break;
			case 2:
				boolean on2 = true;
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				System.out.println("\t평원[하급]으로 진출합니다");
				System.out.println();
				System.out.println("===================================================================================================");
				do {
				System.out.println();
				System.out.println("\t1. 탐색하기\t2. 상태창 열람\t3. 마을로 돌아가기");
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				System.out.println("\t행동을 선택하십시오 (1~3)");
				int N1 = sc.nextInt();
				sc.nextLine();
				switch (N1) {
				case 1:
					FightClass fc = new FightClass();
					fc.fc(N);				
					break;
				case 2:
					Status status = new Status();
					status.status();
					break;
				case 3:
					System.out.println();
					System.out.println("===================================================================================================");
					System.out.println();
					System.out.println("마을로 돌아갑니다");
					System.out.println();
					on1 = false;
					break;

				default:
					System.out.println();
					System.out.println("===================================================================================================");
					System.out.println();
					System.out.println("잘못된 입력입니다 (1 ~ 3)");
					break;
				}
				
				
				
				}while(on2);
				break;
			case 3:
				boolean on3 = true;
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				System.out.println("\t미개척 던전[상급]을 탐색합니다");
				System.out.println();
				System.out.println("===================================================================================================");
				do {
				System.out.println();
				System.out.println("\t1. 탐색하기\t2. 상태창 열람\t3. 마을로 돌아가기");
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				System.out.println("\t행동을 선택하십시오 (1~3)");
				int N1 = sc.nextInt();
				sc.nextLine();
				switch (N1) {
				case 1:
					FightClass fc = new FightClass();
					fc.fc(N);				
					break;
				case 2:
					Status status = new Status();
					status.status();
					break;
				case 3:
					System.out.println();
					System.out.println("===================================================================================================");
					System.out.println();
					System.out.println("마을로 돌아갑니다");
					System.out.println();
					on1 = false;
					break;

				default:
					System.out.println();
					System.out.println("===================================================================================================");
					System.out.println();
					System.out.println("잘못된 입력입니다 (1 ~ 3)");
					break;
				}
				
				
				
				}while(on3);
				break;
			case 4:
				boolean on4 = true;
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				System.out.println("\t금역[위험]에 도전합니다");
				System.out.println();
				System.out.println("===================================================================================================");
				do {
				System.out.println();
				System.out.println("\t1. 탐색하기\t2. 상태창 열람\t3. 마을로 돌아가기");
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				System.out.println("\t행동을 선택하십시오 (1~3)");
				int N1 = sc.nextInt();
				sc.nextLine();
				switch (N1) {
				case 1:
					FightClass fc = new FightClass();
					fc.fc(N);				
					break;
				case 2:
					Status status = new Status();
					status.status();
					break;
				case 3:
					System.out.println();
					System.out.println("===================================================================================================");
					System.out.println();
					System.out.println("마을로 돌아갑니다");
					System.out.println();
					on1 = false;
					break;

				default:
					System.out.println();
					System.out.println("===================================================================================================");
					System.out.println();
					System.out.println("잘못된 입력입니다 (1 ~ 3)");
					break;
				}
				
				
				
				}while(on4);
				break;
			case 0:
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				System.out.println("\t이전메뉴로 돌아갑니다");
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				on=false;
				break;

			default:
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				System.out.println("\t잘못된 입력입니다");
				System.out.println();
				System.out.println("===================================================================================================");
				System.out.println();
				break;
			}
		}while(on);
	}
}
