package Aster.leveling.Dun;

public class PlayerEnermyStateData {
	public String NAME;
	public int HP,MAXHP,MP,MAXMP,LEVEL,EXP,NEXTEXP,STR,AGI,INT,LUCK,ATK,MATK,DEF,MDEF,POINT;
		public PlayerEnermyStateData() {
			this("Unknown",100,100,80,80,0,10,5,5,5,5,0,0,0,0,0);
		}
	
	
		public PlayerEnermyStateData(String nAME, int hP, int mAXHP, int mP, int mAXMP, int eXP, int nEXTEXP, int sTR, int aGI, int iNT,
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
		
	public PlayerEnermyStateData(String nAME, int hP, int mAXHP, int mP, int mAXMP,int lEVEL, int eXP, int nEXTEXP, int sTR, int aGI, int iNT,
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
	
	public PlayerEnermyStateData(String nAME, int hP,int eXP,int aTK, int mATK, int dEF, int mDEF) {
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

	
}
