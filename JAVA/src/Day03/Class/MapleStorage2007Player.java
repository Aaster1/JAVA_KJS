package Day03.Class;
class RpgSet{
	String NAME;
	int HP,MP,LEVEL,STR,AGI,INT,LUCK,MAXHP,MAXMP,EXP,NEXTEXP;

	public RpgSet() {
		this("Unknown",100,50,1,5,5,5,5,100,50,0,10);
//		this.HP = 100;
//		this.MP = 50;
//		this.ST = 100;
//		this.LEVEL = 1;
//		this.STR = 5;
//		this.AGI = 5;
//		this.INT = 5;
//		this.LUCK = 5;
	}

	public RpgSet(String nAME,int hP, int mP, int lEVEL, int sTR, int aGI, int iNT, int lUCK,int mAXHP,int mAXMP,int eXP,int nEXTEXP) {
		this.NAME = nAME;
		this.HP = hP;
		this.MP = mP;
		this.LEVEL = lEVEL;
		this.STR = sTR;
		this.AGI = aGI;
		this.INT = iNT;
		this.LUCK = lUCK;
		this.MAXHP = mAXHP; 
		this.MAXMP = mAXMP;
		this.EXP = eXP;
		this.NEXTEXP = nEXTEXP;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}

	public int getLEVEL() {
		return LEVEL;
	}

	public void setLEVEL(int lEVEL) {
		LEVEL = lEVEL;
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

	@Override
	public String toString() {
		return "HP=" + MAXHP+"/"+HP +"\n"+ "MP=" + MAXMP +"/"+MP+"\n"+"LEVEL=" + LEVEL + "\n"+"STR=" + STR + "\n"+"AGI=" + AGI
				+ "\n"+"INT=" + INT + "\n"+"LUCK=" + LUCK;
	}
	void playerState() {
		System.out.println("["+NAME+"]"+"\n"+"HP : "+MAXHP+"/"+HP+"\nMP : "+MAXMP+"/"+MP+"\n");
	}
	
	
	
}

