package Aster.leveling.Dun;

import java.util.Scanner;

public class PlayerStateData {
	public String NAME;
	public int HP,MAXHP,MP,MAXMP,LEVEL,EXP,NEXTEXP,STR,AGI,INT,LUCK,ATK,MATK,DEF,MDEF,POINT;
		public PlayerStateData() {
			this("Unknown",100,100,80,80,0,10,5,5,5,5,0,0,0,0,0);
		}
	
	
		public PlayerStateData(String nAME, int hP, int mAXHP, int mP, int mAXMP, int eXP, int nEXTEXP, int sTR, int aGI, int iNT,
				int lUCK, int aTK, int mATK, int dEF, int mDEF,int pOINT) {
			NAME = nAME;
			HP = hP;
			MAXHP = mAXHP;
			MP = mP;
			MAXMP = mAXMP;
			EXP = eXP;
			NEXTEXP = nEXTEXP;
			STR = sTR;
			AGI = aGI;
			INT = iNT;
			LUCK = lUCK;
			ATK = aTK;
			MATK = mATK;
			DEF = dEF;
			MDEF = mDEF;
			POINT = pOINT;
		}
		
	public PlayerStateData(String nAME, int hP, int mAXHP, int mP, int mAXMP,int lEVEL, int eXP, int nEXTEXP, int sTR, int aGI, int iNT,
			int lUCK,int pOINT) {
		NAME = nAME;
		HP = hP;
		MAXHP = mAXHP;
		MP = mP;
		MAXMP = mAXMP;
		EXP = eXP;
		NEXTEXP = nEXTEXP;
		STR = sTR;
		AGI = aGI;
		INT = iNT;
		LUCK = lUCK;
		POINT = pOINT;
	}
	
	public PlayerStateData(String nAME, int hP,int eXP,int aTK, int mATK, int dEF, int mDEF) {
		NAME = nAME;
		HP = hP;
		EXP = eXP;
		ATK = aTK;
		MATK = mATK;
		DEF = dEF;
		MDEF = mDEF;
	}


	public int getHP() {
		return HP;
	}


	public void setHP(int hP) {
		HP = hP;
	}


	public int getMAXHP() {
		return MAXHP;
	}


	public void setMAXHP(int mAXHP) {
		MAXHP = mAXHP;
	}


	public int getMP() {
		return MP;
	}


	public void setMP(int mP) {
		MP = mP;
	}


	public int getMAXMP() {
		return MAXMP;
	}


	public void setMAXMP(int mAXMP) {
		MAXMP = mAXMP;
	}


	public int getEXP() {
		return EXP;
	}


	public void setEXP(int eXP) {
		EXP = eXP;
	}


	public int getNEXTEXP() {
		return NEXTEXP;
	}


	public void setNEXTEXP(int nEXTEXP) {
		NEXTEXP = nEXTEXP;
	}


	public int getSTR() {
		return STR;
	}


	public void setSTR(int sTR) {
		STR = sTR;
	}


	public int getAGI() {
		return AGI;
	}


	public void setAGI(int aGI) {
		AGI = aGI;
	}


	public int getINT() {
		return INT;
	}


	public void setINT(int iNT) {
		INT = iNT;
	}


	public int getLUCK() {
		return LUCK;
	}


	public void setLUCK(int lUCK) {
		LUCK = lUCK;
	}


	public int getATK() {
		return ATK;
	}


	public void setATK(int aTK) {
		ATK = aTK;
	}


	public int getMATK() {
		return MATK;
	}


	public void setMATK(int mATK) {
		MATK = mATK;
	}


	public int getDEF() {
		return DEF;
	}


	public void setDEF(int dEF) {
		DEF = dEF;
	}


	public int getMDEF() {
		return MDEF;
	}


	public void setMDEF(int mDEF) {
		MDEF = mDEF;
	}

	public void training() {
		Scanner sc = new Scanner(System.in);
		int turn = 1;
		boolean on = true;
		do {
			if(turn >5) on =false;
		System.out.println();
		System.out.println("================\t훈련\t=====================================================================================================");
		System.out.println();
		System.out.println("================\t턴 : "+turn+"\t=====================================================================================================");
		System.out.println();
		System.out.println("\t훈련은 멈출 수 없습니다.");
		System.out.println();
		System.out.println("\t훈련할 종목을 선택하십시오.");
		System.out.println();
		System.out.println("\t1. 벌크업(STR)\t||\t2. 크로스핏(AGI)\t||\t3. 코드업(INT)\t||\t4. 손 모으고 기도하기(LUCK)");
		System.out.println();
		System.out.println("===================================================================================================================================");
		int answer = sc.nextInt();
		sc.nextLine();
		if(answer ==1) {
			turn+=1;
			int dice = (int)(int)((Math.random()*10)+1);
			if(dice==1) {
				System.out.println();
				System.out.println("\t!!!!!성공!!!!!");
				System.out.println();
				System.out.println("\t!!!온 몸에 힘이 철철 넘쳐 흐릅니다!!!");
				System.out.println();
				System.out.println("STR +1");
				this.STR +=1;
				System.out.println();
				System.out.println("===================================================================================================================================");
				System.out.println();
				continue;
			}else {
				System.out.println();
				System.out.println("훈련 실패!");
				System.out.println();
				continue;
				
			}
		}
		else if(answer ==2) {
			turn+=1;
			int dice = (int)(int)((Math.random()*10)+1);

			if(dice==1) {
				
				System.out.println();
				System.out.println("\t!!!!!성공!!!!!");
				System.out.println();
				System.out.println("\t!!!몸이 더욱 가벼워졌습니다!!!");
				System.out.println();
				System.out.println("AGI +1");
				this.AGI +=1;
				System.out.println();
				System.out.println("===================================================================================================================================");
				System.out.println();
				continue;
			}else {
				System.out.println();
				System.out.println("훈련 실패!");
				System.out.println();
				continue;
				
			}

		}
		else if(answer ==3) {
			turn+=1;
			int dice = (int)(int)((Math.random()*10)+1);

			if(dice==1) {
				System.out.println();
				System.out.println("\t!!!!!성공!!!!!");
				System.out.println();
				System.out.println("\t!!!더욱 스마트해졌습니다!!!");
				System.out.println();
				System.out.println("INT +1");
				this.INT +=1;
				System.out.println();
				System.out.println("===================================================================================================================================");
				System.out.println();
				continue;
			}else {
				System.out.println();
				System.out.println("훈련 실패!");
				System.out.println();
				continue;
				
			}

		}
		else if(answer ==4) {
			turn+=1;
			int dice = (int)(int)((Math.random()*10)+1);
			if(dice==1) {
				System.out.println();
				System.out.println("\t!!!!!성공!!!!!");
				System.out.println();
				System.out.println("\t!!!알 수 없는 기운이 온 몸을 휘감습니다!!!");
				System.out.println();
				System.out.println("LUCK +1");
				this.LUCK +=1;
				System.out.println();
				System.out.println("===================================================================================================================================");
				System.out.println();
				continue;
			}else {
				System.out.println();
				System.out.println("훈련 실패!");
				System.out.println();
				continue;
				
			}

		}
		else {
			System.out.println("\t잘못된 입력입니다 (1 ~ 4)");
			continue;
		}
		
		}while(on);
		System.out.println("훈련을 종료합니다.");
		sc.close();
	}
	
}
