package _15;

import java.util.Calendar;
import java.util.Scanner;

class Lottoria{
	Scanner sc = tempScanner.getInstance();
	char AZ = 0;
	String auto = "자  동";
	int[] lottArray = new int[6];
	
	public Lottoria() {
	}
	
	public void play(int games) {
		for (int i = 0; i < games; i++) {
			System.out.println("["+(i+1)+" 게임] (1.자동 / 2.수동)");
			int answer1 = sc.nextInt();
			sc.nextLine();
			if(answer1 ==1) {
				for (int j : lottArray) {
					j=(int)((Math.random()*45)+1);
				}
			}else if(answer1 ==2) {
				char tempChar = '\u2460';
				for (int j = 0; j < 6; j++) {
					System.out.println(tempChar++ +" : ");					
					int tempN = sc.nextInt();
					sc.nextLine();
					lottArray[j]=tempN;
				}
				
			}else {
				
			}
			
		}
	}
}

class tempScanner {
	private static Scanner sc = new Scanner(System.in);
	
	public static Scanner getInstance() {
		if(sc==null) sc=new Scanner(System.in);
		return sc;
	}
	
	
}

public class _15 {
	
	
static Calendar cal = Calendar.getInstance();

	public static void main(String[] args) {
		Scanner sc = tempScanner.getInstance();

		System.out.println("몇 게임?");
		int games = sc.nextInt();
		sc.nextLine();
		lotto.play(games);
		System.out.println("############ 인생역전 Lottoria ############");
		System.out.println("발행일\t: ");
		System.out.println("추첨일\t: ");
		System.out.println("지급기한\t: ");
		System.out.println("----------------------------------------");
		System.out.println(lotto);
		System.out.println("----------------------------------------");
		char won = '\u20A9';
		System.out.println("금액\t\t\t\t\t\t\t\t "+won+(1000*games));
		System.out.println();
		int[] lotResult = new int[6];
		for (int i = 0; i < lotResult.length; i++) {
			lotResult[i] = (int)((Math.random()*45)+1);
		}
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < lotResult.length; i++) {
			System.out.print(lotResult[i]+ " ");
		}
		System.out.println("보너스 번호 : "+ (int)(Math.random()*45)+1);
		
	}
}
