package Day03.Class;
class Mimic{
	String name;
	int hp,ATK,MATK,DEF,MDEF;
	
	Mimic(){
//		this();
	}

	public Mimic(String name, int hp, int aTK, int mATK, int dEF, int mDEF) {
		super();
		this.name = name;
		this.hp = hp;
		ATK = aTK;
		MATK = mATK;
		DEF = dEF;
		MDEF = mDEF;
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
		return "Mimic";
	}
	
}









