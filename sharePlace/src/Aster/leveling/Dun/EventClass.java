package Aster.leveling.Dun;

import Aster.leveling.TempInventory;

public class EventClass {
	
	public void getBooty(int n) {
		TempInventory ti = new TempInventory();
		switch (n) {
		case 1:
			int dice = (int)((Math.random()*6)+1);
			System.out.println();
			System.out.println("================================================================================================================================");
			System.out.println();
			System.out.println("\t바닥에 떨어진 무언가를 주웠습니다");
			System.out.println();
			System.out.println("\t"+ti.getItem(dice)+"을/를 획득했습니다!");
			System.out.println();
			break;
		case 2:
			int dice2 = (int)((Math.random()*7)+7);
			System.out.println();
			System.out.println("================================================================================================================================");
			System.out.println();
			System.out.println("\t바닥에 평범하지 않은 물건이 떨어져있습니다!");
			System.out.println();
			System.out.println("\t"+ti.getItem(dice2)+"을/를 획득했습니다!");
			System.out.println();
			break;
		case 3:
			int dice3 = (int)((Math.random()*5)+13);
			System.out.println();
			System.out.println("================================================================================================================================");
			System.out.println();
			System.out.println("\t터무니 없는 것이 바닥에 있습니다!!");
			System.out.println();
			System.out.println("\t"+ti.getItem(dice3)+"을/를 획득했습니다!");
			System.out.println();
			break;
		}
	}
}
