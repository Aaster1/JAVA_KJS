package Aster.leveling;

import java.util.Scanner;

public class LevelingExcute {
	
//	static으로 scanner를 전역에서 사용할 수 있게 하는 예. 꼭 기억해두자 ㅠㅠㅠㅠㅠ
	
	static public Scanner sc = new Scanner(System.in);
	
	public static Scanner getSc() {
		return sc;
	}
	
	public static void main(String[] args) {
		Playing play = new PlayingClass();
		
		play.createUser();
		play.playing();
		play.endScore();
	}
	
}