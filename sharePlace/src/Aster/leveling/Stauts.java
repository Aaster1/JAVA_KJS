package Aster.leveling;

import java.util.Scanner;

import Aster.leveling.Dun.PlayerStateData;

public class Stauts extends PlayingActionClass{
	PlayerStateData state = new PlayerStateData();

	@Override
	public void status() {
		boolean on = true;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("================\t기본 능력치\t=====================================================================================================");
		System.out.println("\t이름 : "+state.NAME);
		System.out.println();
		System.out.println("\t레벨 : "+state.LEVEL);
		System.out.println();
		System.out.println("\t스탯 : ");
		System.out.println("\tSTR : "+state.STR+"||"+"\tAGI : "+state.AGI+"||"+"\tINT : "+state.INT+"||"+"\tLUCK : "+state.LUCK);
		System.out.println();
		System.out.println("\tStat Point : "+state.POINT);
		System.out.println();
		System.out.println("===================================================================================================================================");
		System.out.println();
		if(state.POINT >=1) {
			System.out.println("\t투자 가능한 Stat Point가 있습니다.");
			System.out.println();
			System.out.println("\t1. Stat Point 사용\t||\t2. 상태창 열람 종료");
			int answer = sc.nextInt();
			sc.nextLine();
			if(answer ==1) {
				boolean on2 = true;
				do {
					
				System.out.println();
				System.out.println("===================================================================================================================================");
				System.out.println();
				System.out.println();
				}while(on2);
				
			}else if(answer ==2) {
				System.out.println();
				System.out.println("===================================================================================================================================");
				System.out.println("\t상태창 열람을 종료합니다.");
				System.out.println("===================================================================================================================================");
				System.out.println();
				on = false;
				break;
			}else {
				System.out.println();
				System.out.println("===================================================================================================================================");
				System.out.println("\t잘못된 입력입니다. (1 ~ 2)");
				System.out.println("===================================================================================================================================");
				System.out.println();
				continue;
			}
		} else {
			System.out.println();
			System.out.println("\t 아무 키나 입력해, 상태창 열람 종료");
			System.out.println();
			System.out.println("===================================================================================================================================");
			int answer = sc.nextInt();
			sc.nextLine();
			if(answer== 1) {
				on=false;
				break;
			} else {
				on=false;
				break;				
			}
			
		}
		sc.close();
		}while(on);
	}


}
