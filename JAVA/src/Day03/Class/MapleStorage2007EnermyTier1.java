package Day03.Class;

class Slime{
	String name;
	int hp,ATK,MATK,DEF,MDEF,EXP;
	
	Slime(){
		this("슬라임",50,1,1,10,10,5);
	}

	public Slime(String name, int hp, int aTK, int mATK, int dEF, int mDEF,int eXP) {
		this.name = name;
		this.hp = hp;
		ATK = aTK;
		MATK = mATK;
		DEF = dEF;
		MDEF = mDEF;
		EXP = eXP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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

	@Override
	public String toString() {
		return "Slime";
	}
	void enermyState() {
		System.out.println("["+name+"]"+"\n"+"HP : "+hp+"\n" +"ATK : "+ATK+"\nMATK : "+MATK+"\nDEF : "+DEF+"\nMDEF : "+MDEF);
	}
	
	
}
