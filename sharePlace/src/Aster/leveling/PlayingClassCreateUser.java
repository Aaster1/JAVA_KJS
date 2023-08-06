package Aster.leveling;


import java.util.Scanner;

import Aster.leveling.Dun.PlayerStateData;

public class PlayingClassCreateUser{
	Scanner sc = LevelingExcute.getSc();
	
	
	public void createUser() {
		PlayerStateData state = new PlayerStateData("Unknown",100,100,80,80,1,0,10,5,5,5,5,0);
		boolean on = true;
		System.out.println();
		System.out.println("================\t캐릭터 생성\t========================================================================================");
		System.out.println();
		System.out.println("이름을 입력해주세요! > >");
		state.NAME = sc.nextLine();
		do {
			int dice1 = 0;
			int dice2 = 0;
			int diceTotal = 0;
			System.out.println("================\t기본 능력치\t========================================================================================");
			System.out.println("\t이름 : "+state.NAME);
			System.out.println();
			System.out.println("\t레벨 : "+state.LEVEL);
			System.out.println();
			System.out.println("\t스탯 : ");
			System.out.println("\tSTR : "+state.STR+"||"+"\tAGI : "+state.AGI+"||"+"\tINT : "+state.INT+"||"+"\tLUCK : "+state.LUCK);
			System.out.println();
			System.out.println("Stat Point : "+state.POINT);
			System.out.println();
			System.out.println("================\t기본 능력치\t========================================================================================");
			System.out.println();
			System.out.println("주사위를 던집니까? Y/N");
			String answer = sc.next().toUpperCase();
			System.out.println();
			if(answer.equals("Y")){
				dice1 = (int)((Math.random()*6)+1);
				dice2 = (int)((Math.random()*6)+1);
				System.out.println();
				System.out.println("================\t주사위결과\t========================================================================================");
				diceTotal = dice1+dice2;
				System.out.println();
				System.out.println("\tDICE 1 : DICE2");
				System.out.println("\t "+dice1+" : "+dice2+" ");
				System.out.println();
				System.out.println("\t주사위 총합 : "+diceTotal);
				System.out.println();
				System.out.println("Stat Point - 『"+diceTotal+"』점이 주어집니다.");
				state.POINT = diceTotal;
				continue;

				
				
			}else if(answer.equals("N")) {
				 System.out.println();
				 System.out.println("==============================================================================================================================");
				 System.out.println();
				 System.out.println("캐릭터 생성을 완료하시겠습니까?");
				 answer = sc.next().toUpperCase();
				 if(answer.equals("Y")) {
					 System.out.println();
					 System.out.println("==============================================================================================================================");
					 System.out.println("캐릭터 생성을 완료합니다.");
					 System.out.println("==============================================================================================================================");
					 on=false;
				 }
				 else {
					 continue;
				 }
			}else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			
			
			
		}while(on);
	}


		
}