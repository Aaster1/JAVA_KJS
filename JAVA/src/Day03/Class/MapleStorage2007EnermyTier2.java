package Day03.Class;

class Goblin extends Slime{
	String name;
	int hp,ATK,MATK,DEF,MDEF;
	
	Goblin(){
		super("고블린",100,15,1,10,1,20);
	}

	public Goblin(String name, int hp, int aTK, int mATK, int dEF, int mDEF) {
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
		return "Goblin";
	}
	
}
class Ghost{
	String name;
	int hp,ATK,MATK,DEF,MDEF;
	
	Ghost(){
		this("Ghost",50,1,15,100,1);
	}

	public Ghost(String name, int hp, int aTK, int mATK, int dEF, int mDEF) {
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
		return "Ghost";
	}
	
}
class SkeletonWalker{
	String name;
	int hp,ATK,MATK,DEF,MDEF;
	
	SkeletonWalker(){
		this("스켈레톤",80,20,5,1,1);
	}

	public SkeletonWalker(String name, int hp, int aTK, int mATK, int dEF, int mDEF) {
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
		return "SkeletonWalker";
	}
	
}
class Zombie{
	String name;
	int hp,ATK,MATK,DEF,MDEF;
	
	Zombie(){
		this("좀비",150,7,1,1,1);
	}

	public Zombie(String name, int hp, int aTK, int mATK, int dEF, int mDEF) {
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
		return "Zombie";
	}
	
}
class WildWolf{
	String name;
	int hp,ATK,MATK,DEF,MDEF;
	
	WildWolf(){
		this("야생늑대",90,15,1,1,10);
	}

	public WildWolf(String name, int hp, int aTK, int mATK, int dEF, int mDEF) {
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
		return "WildWolf";
	}
	
}