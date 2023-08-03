package Aster.leveling;

import java.util.Scanner;

import Aster.leveling.Dun.PlayerEnermyStateData;

public class PlayingClassCreateUser implements Playing{

	
	@Override
	public void createUser() {
		PlayerEnermyStateData state = new PlayerEnermyStateData("Unknown",100,100,80,80,1,0,10,5,5,5,5,0);
		Scanner sc = new Scanner(System.in);
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
				System.out.println("DICE 1 : DICE2");
				System.out.println(" "+dice1+" : "+dice2+" ");
				System.out.println();
				System.out.println("");

				state.POINT = diceTotal;
				
				
				continue;
			}else if(answer.equals("N")) {
				
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			
			
			
			
		}while(on);
		sc.close();
	}

	@Override
	public void playing() {
		
	}

	@Override
	public void endScore() {
		
	}

		
}