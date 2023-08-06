package Aster.leveling.Dun;

import java.util.Scanner;

import Aster.leveling.TempInventory;

public class FightClass {
	public void fc(int n) {
		PlayInDun pid = new PlayInDun();
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		int dice = (int)((Math.random()*10)+1);
		if(dice==1&&n<=3) {
			EventClass ec = new EventClass();
			ec.getBooty(n);
		}
		else if(dice>2) {
			if(n==1) {
				int encounterDice = (int)((Math.random()*6)+1);
				EnermyStateData esd = new EnermyStateData(encounterDice);
				PlayerStateData psd = new PlayerStateData();
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t"+esd.NAME+"이/가 나타났다!");
				int esdMAXHP = esd.HP;
				int turn = 1;
				int tempTurn=1;
				int tempDef= psd.AGI;
				do {
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println(esd);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(psd);
				System.out.println();
				if(turn==tempTurn+2) {
					System.out.println("\t단단해지기 효과가 사라졌다!");
					psd.AGI=tempDef;
				}
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t1. 공격\t2. 단단해지기\t3. 슬라임 포션 사용\t4. 전력도주!");
				System.out.println();
				System.out.println("\t행동을 선택하십시오 (1 ~ 4)");
				int fcAnswer = sc.nextInt();
				sc.nextLine();
				switch (fcAnswer) {
				case 1:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t"+psd.NAME+"의 공격!");
					System.out.println();
					double tempPA=psd.STR/100;
					double tempPMA=psd.INT/100;
					int pDamage = (int)(tempPA*esd.DEF)+(int)(tempPMA*esd.MDEF);
					if(pDamage<1) pDamage=0;
					System.out.println("\t"+psd.NAME+"이/가 "+esd.NAME+"에게 "+pDamage+"의 데미지를 입혔습니다");
					esd.HP -=pDamage;
					if(esd.HP<1) {
						System.out.println();
						System.out.println("======================================================================================");
						System.out.println();
						System.out.println("\t"+esd.NAME+"을/를 쓰러트렸습니다!");
						System.out.println();
						System.out.println("\t"+esd.EXP+"의 경험치를 습득했습니다!");
						psd.EXP +=esd.EXP;
						while(psd.EXP/psd.NEXTEXP>=1) {
							System.out.println("LEVEL UP!");
							psd.LEVEL+=1;
							psd.EXP-=psd.NEXTEXP;
							psd.NEXTEXP=(int)(psd.NEXTEXP*1.5);
							psd.MAXHP+=10;
							psd.HP=psd.MAXHP;
							psd.MAXMP+=5;
							psd.MP=psd.MAXMP;
							psd.POINT+=1;
						}
						System.out.println();
						System.out.println("\t"+esd.EBN+"을/를 습득했습니다!");
						TempInventory ti = new TempInventory();
						ti.getItem(encounterDice);
						System.out.println();
						System.out.println("======================================================================================");
						System.out.println();
						on=false;
					}
					break;
				case 2:
					psd.AGI=tempDef;
					tempDef = psd.AGI;
					tempTurn = turn;
					psd.AGI = (int)(psd.AGI*1.2);
					System.out.println();
					System.out.println("======================================================================================");					
					System.out.println();
					System.out.println("단단해지기를 사용했다!");
					System.out.println();
					System.out.println("1턴 동안 물리방어력이 20% 올랐다!");
					System.out.println();
					System.out.println("======================================================================================");		
					break;
				case 3:
					TempInventory ti = new TempInventory();
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					ti.useItem(23);
					System.out.println("\t슬라임 포션을 사용했습니다");
					int heal = (int)(psd.MAXHP*0.3);
					System.out.println();
					System.out.println("\t체력을 "+heal+" 회복했습니다!");
					break;
				case 4:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t전력으로 도주했다!!");
					System.out.println();
					on= false;
					break;

				default:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t잘못된 입력입니다 (1 ~ 4)");
					break;
				}
				if(1<=fcAnswer&&fcAnswer<=3&&esd.HP>1){
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t"+esd.NAME+"의 공격!");
				System.out.println();
				int eDamage = (esd.ATK-psd.AGI)+(esd.MATK-psd.INT);
				if(eDamage<1) eDamage=0;
				System.out.println("\t"+esd.NAME+"이/가 "+psd.NAME+"에게 "+eDamage+"의 데미지를 입혔습니다");
				psd.HP -=eDamage;
				turn +=1;
				}
				if(psd.HP<1) {
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.err.println("\t"+psd.NAME+"은/는 죽었습니다");
					System.out.println();
					pid.life=false;
					on = false;
				}
				}while(on);
				esd.HP = esdMAXHP;
				psd.AGI=tempDef;
			}
			else if(n==2) {

				int encounterDice = (int)((Math.random()*7)+7);
				EnermyStateData esd = new EnermyStateData(encounterDice);
				PlayerStateData psd = new PlayerStateData();
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t"+esd.NAME+"이/가 나타났다!");
				int esdMAXHP = esd.HP;
				int turn = 1;
				int tempTurn=1;
				int tempDef= psd.AGI;
				do {
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println(esd);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(psd);
				System.out.println();
				if(turn==tempTurn+2) {
					System.out.println("\t단단해지기 효과가 사라졌다!");
					psd.AGI=tempDef;
				}
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t1. 공격\t2. 단단해지기\t3. 슬라임 포션 사용\t4. 전력도주!");
				System.out.println();
				System.out.println("\t행동을 선택하십시오 (1 ~ 4)");
				int fcAnswer = sc.nextInt();
				sc.nextLine();
				switch (fcAnswer) {
				case 1:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t"+psd.NAME+"의 공격!");
					System.out.println();
					double tempPA=psd.STR/100;
					double tempPMA=psd.INT/100;
					int pDamage = (int)(tempPA*esd.DEF)+(int)(tempPMA*esd.MDEF);
					if(pDamage<1) pDamage=0;
					System.out.println("\t"+psd.NAME+"이/가 "+esd.NAME+"에게 "+pDamage+"의 데미지를 입혔습니다");
					esd.HP -=pDamage;
					if(esd.HP<1) {
						System.out.println();
						System.out.println("======================================================================================");
						System.out.println();
						System.out.println("\t"+esd.NAME+"을/를 쓰러트렸습니다!");
						System.out.println();
						System.out.println("\t"+esd.EXP+"의 경험치를 습득했습니다!");
						psd.EXP +=esd.EXP;
						while(psd.EXP/psd.NEXTEXP>=1) {
							System.out.println("LEVEL UP!");
							psd.LEVEL+=1;
							psd.EXP-=psd.NEXTEXP;
							psd.NEXTEXP=(int)(psd.NEXTEXP*1.5);
							psd.MAXHP+=10;
							psd.HP=psd.MAXHP;
							psd.MAXMP+=5;
							psd.MP=psd.MAXMP;
							psd.POINT+=1;
						}
						System.out.println();
						System.out.println("\t"+esd.EBN+"을/를 습득했습니다!");
						TempInventory ti = new TempInventory();
						ti.getItem(encounterDice);
						System.out.println();
						System.out.println("======================================================================================");
						System.out.println();
						on=false;
					}
					break;
				case 2:
					psd.AGI=tempDef;
					tempDef = psd.AGI;
					tempTurn = turn;
					psd.AGI = (int)(psd.AGI*1.2);
					System.out.println();
					System.out.println("======================================================================================");					
					System.out.println();
					System.out.println("단단해지기를 사용했다!");
					System.out.println();
					System.out.println("1턴 동안 물리방어력이 20% 올랐다!");
					System.out.println();
					System.out.println("======================================================================================");		
					break;
				case 3:
					TempInventory ti = new TempInventory();
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					ti.useItem(23);
					System.out.println("\t슬라임 포션을 사용했습니다");
					int heal = (int)(psd.MAXHP*0.3);
					System.out.println();
					System.out.println("\t체력을 "+heal+" 회복했습니다!");
					break;
				case 4:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t전력으로 도주했다!!");
					System.out.println();
					on= false;
					break;

				default:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t잘못된 입력입니다 (1 ~ 4)");
					break;
				}
				if(1<=fcAnswer&&fcAnswer<=3&&esd.HP>1){
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t"+esd.NAME+"의 공격!");
				System.out.println();
				int eDamage = (esd.ATK-psd.AGI)+(esd.MATK-psd.INT);
				if(eDamage<1) eDamage=0;
				System.out.println("\t"+esd.NAME+"이/가 "+psd.NAME+"에게 "+eDamage+"의 데미지를 입혔습니다");
				psd.HP -=eDamage;
				turn +=1;
				}
				if(psd.HP<1) {
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.err.println("\t"+psd.NAME+"은/는 죽었습니다");
					System.out.println();
					pid.life=false;
					on = false;
				}
				}while(on);
				esd.HP = esdMAXHP;
				psd.AGI=tempDef;
			}
			else if(n==3) {

				int encounterDice = (int)((Math.random()*5)+13);
				EnermyStateData esd = new EnermyStateData(encounterDice);
				PlayerStateData psd = new PlayerStateData();
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t"+esd.NAME+"이/가 나타났다!");
				int esdMAXHP = esd.HP;
				int turn = 1;
				int tempTurn=1;
				int tempDef= psd.AGI;
				do {
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println(esd);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(psd);
				System.out.println();
				if(turn==tempTurn+2) {
					System.out.println("\t단단해지기 효과가 사라졌다!");
					psd.AGI=tempDef;
				}
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t1. 공격\t2. 단단해지기\t3. 슬라임 포션 사용\t4. 전력도주!");
				System.out.println();
				System.out.println("\t행동을 선택하십시오 (1 ~ 4)");
				int fcAnswer = sc.nextInt();
				sc.nextLine();
				switch (fcAnswer) {
				case 1:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t"+psd.NAME+"의 공격!");
					System.out.println();
					double tempPA=psd.STR/100;
					double tempPMA=psd.INT/100;
					int pDamage = (int)(tempPA*esd.DEF)+(int)(tempPMA*esd.MDEF);
					if(pDamage<1) pDamage=0;
					System.out.println("\t"+psd.NAME+"이/가 "+esd.NAME+"에게 "+pDamage+"의 데미지를 입혔습니다");
					esd.HP -=pDamage;
					if(esd.HP<1) {
						System.out.println();
						System.out.println("======================================================================================");
						System.out.println();
						System.out.println("\t"+esd.NAME+"을/를 쓰러트렸습니다!");
						System.out.println();
						System.out.println("\t"+esd.EXP+"의 경험치를 습득했습니다!");
						psd.EXP +=esd.EXP;
						while(psd.EXP/psd.NEXTEXP>=1) {
							System.out.println("LEVEL UP!");
							psd.LEVEL+=1;
							psd.EXP-=psd.NEXTEXP;
							psd.NEXTEXP=(int)(psd.NEXTEXP*1.5);
							psd.MAXHP+=10;
							psd.HP=psd.MAXHP;
							psd.MAXMP+=5;
							psd.MP=psd.MAXMP;
							psd.POINT+=1;
						}
						System.out.println();
						System.out.println("\t"+esd.EBN+"을/를 습득했습니다!");
						TempInventory ti = new TempInventory();
						ti.getItem(encounterDice);
						System.out.println();
						System.out.println("======================================================================================");
						System.out.println();
						on=false;
					}
					break;
				case 2:
					psd.AGI=tempDef;
					tempDef = psd.AGI;
					tempTurn = turn;
					psd.AGI = (int)(psd.AGI*1.2);
					
					System.out.println();
					System.out.println("======================================================================================");					
					System.out.println();
					System.out.println("단단해지기를 사용했다!");
					System.out.println();
					System.out.println("1턴 동안 물리방어력이 20% 올랐다!");
					System.out.println();
					System.out.println("======================================================================================");					
					break;
				case 3:
					TempInventory ti = new TempInventory();
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					ti.useItem(23);
					System.out.println("\t슬라임 포션을 사용했습니다");
					int heal = (int)(psd.MAXHP*0.3);
					System.out.println();
					System.out.println("\t체력을 "+heal+" 회복했습니다!");
					break;
				case 4:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t전력으로 도주했다!!");
					System.out.println();
					on= false;
					break;

				default:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t잘못된 입력입니다 (1 ~ 4)");
					break;
				}
				if(1<=fcAnswer&&fcAnswer<=3&&esd.HP>1){
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t"+esd.NAME+"의 공격!");
				System.out.println();
				int eDamage = (esd.ATK-psd.AGI)+(esd.MATK-psd.INT);
				if(eDamage<1) eDamage=0;
				System.out.println("\t"+esd.NAME+"이/가 "+psd.NAME+"에게 "+eDamage+"의 데미지를 입혔습니다");
				psd.HP -=eDamage;
				turn +=1;
				}
				if(psd.HP<1) {
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.err.println("\t"+psd.NAME+"은/는 죽었습니다");
					System.out.println();
					pid.life=false;
					on = false;
				}
				}while(on);
				esd.HP = esdMAXHP;
				psd.AGI=tempDef;
			}
			else if(n==4) {

				int encounterDice = (int)((Math.random()*4)+19);
				EnermyStateData esd = new EnermyStateData(encounterDice);
				PlayerStateData psd = new PlayerStateData();
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t"+esd.NAME+"이/가 나타났다!");
				int esdMAXHP = esd.HP;
				int turn = 1;
				int tempTurn=1;
				int tempDef= psd.AGI;
				do {
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println(esd);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(psd);
				System.out.println();
				if(turn==tempTurn+2) {
					System.out.println("\t단단해지기 효과가 사라졌다!");
					psd.AGI=tempDef;
				}
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t1. 공격\t2. 단단해지기\t3. 슬라임 포션 사용\t4. 전력도주!");
				System.out.println();
				System.out.println("\t행동을 선택하십시오 (1 ~ 4)");
				int fcAnswer = sc.nextInt();
				sc.nextLine();
				switch (fcAnswer) {
				case 1:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t"+psd.NAME+"의 공격!");
					System.out.println();
					double tempPA=psd.STR/100;
					double tempPMA=psd.INT/100;
					int pDamage = (int)(tempPA*esd.DEF)+(int)(tempPMA*esd.MDEF);
					if(pDamage<1) pDamage=0;
					System.out.println("\t"+psd.NAME+"이/가 "+esd.NAME+"에게 "+pDamage+"의 데미지를 입혔습니다");
					esd.HP -=pDamage;
					if(esd.HP<1) {
						System.out.println();
						System.out.println("======================================================================================");
						System.out.println();
						System.out.println("\t"+esd.NAME+"을/를 쓰러트렸습니다!");
						System.out.println();
						System.out.println("\t"+esd.EXP+"의 경험치를 습득했습니다!");
						psd.EXP +=esd.EXP;
						while(psd.EXP/psd.NEXTEXP>=1) {
							System.out.println("LEVEL UP!");
							psd.LEVEL+=1;
							psd.EXP-=psd.NEXTEXP;
							psd.NEXTEXP=(int)(psd.NEXTEXP*1.5);
							psd.MAXHP+=10;
							psd.HP=psd.MAXHP;
							psd.MAXMP+=5;
							psd.MP=psd.MAXMP;
							psd.POINT+=1;
						}
						System.out.println();
						System.out.println("\t"+esd.EBN+"을/를 습득했습니다!");
						TempInventory ti = new TempInventory();
						ti.getItem(encounterDice);
						System.out.println();
						System.out.println("======================================================================================");
						System.out.println();
						on=false;
					}
					break;
				case 2:
					psd.AGI=tempDef;
					tempDef = psd.AGI;
					tempTurn = turn;
					psd.AGI = (int)(psd.AGI*1.2);
					System.out.println();
					System.out.println("======================================================================================");					
					System.out.println();
					System.out.println("단단해지기를 사용했다!");
					System.out.println();
					System.out.println("1턴 동안 물리방어력이 20% 올랐다!");
					System.out.println();
					System.out.println("======================================================================================");		
					break;
				case 3:
					TempInventory ti = new TempInventory();
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					ti.useItem(23);
					System.out.println("\t슬라임 포션을 사용했습니다");
					int heal = (int)(psd.MAXHP*0.3);
					System.out.println();
					System.out.println("\t체력을 "+heal+" 회복했습니다!");
					break;
				case 4:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t전력으로 도주했다!!");
					System.out.println();
					on= false;
					break;

				default:
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.out.println("\t잘못된 입력입니다 (1 ~ 4)");
					break;
				}
				if(1<=fcAnswer&&fcAnswer<=3&&esd.HP>1){
				System.out.println();
				System.out.println("======================================================================================");
				System.out.println();
				System.out.println("\t"+esd.NAME+"의 공격!");
				System.out.println();
				int eDamage = (esd.ATK-psd.AGI)+(esd.MATK-psd.INT);
				if(eDamage<1) eDamage=0;
				System.out.println("\t"+esd.NAME+"이/가 "+psd.NAME+"에게 "+eDamage+"의 데미지를 입혔습니다");
				psd.HP -=eDamage;
				turn +=1;
				}
				if(psd.HP<1) {
					System.out.println();
					System.out.println("======================================================================================");
					System.out.println();
					System.err.println("\t"+psd.NAME+"은/는 죽었습니다");
					System.out.println();
					pid.life=false;
					on = false;
				}
				}while(on);
				esd.HP = esdMAXHP;
				psd.AGI=tempDef;
			}
		}
		sc.close();
	}

}