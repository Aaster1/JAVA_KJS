package Aster.leveling;

import Aster.leveling.Dun.PlayerStateData;

public class PlayingClass implements Playing{

	@Override
	public void createUser() {
		PlayingClassCreateUser cu = new PlayingClassCreateUser();
		cu.createUser();
	}

	@Override
	public void playing() {
		PlayingActionClass pac = new PlayingActionClass();
		pac.playing();
	}

	@Override
	public void endScore() {
		
		PlayerStateData psd = new PlayerStateData();
		psd.HP=psd.MAXHP;
		psd.MP=psd.MAXMP;
		System.out.println();
		System.out.println("===================================================================================================================================================");
		System.out.println();
		System.out.println("========\t기 록\t========");
		System.out.println();
		System.out.println("\t"+psd.NAME);
		System.out.println("\tLv."+psd.LEVEL+"");
		System.out.println();
		System.out.println("\t STR : "+psd.STR+"\t AGI : "+psd.AGI+"\t INT: "+psd.INT+"\t LUCK : "+psd.LUCK);
		System.out.println();
		System.out.println("===================================================================================================================================================");
		
		
	}

}
