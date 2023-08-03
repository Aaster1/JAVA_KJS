package Aster.leveling.Dun;

public class Enermy extends PlayerStateData{
	
	public Enermy() {
		this("",0,0,0,0,0,0);
	}
	public Enermy(String name,int hp, int exp, int atk, int matk, int def, int mdef) {
		super(name,hp,exp,atk,matk,def,mdef);
	}
	
}