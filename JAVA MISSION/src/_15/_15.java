package _15;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class LottoNum{
	char code = 0;
	String name = "자  동";
	int[] lottoNum = new int[6];
	String chum = "(낙첨)";
	public LottoNum() {
		
	}
}

class Lottoria{
	Scanner sc = tempScanner.getInstance();
	String auto = "자  동";
	ArrayList<LottoNum> resultList = new ArrayList<LottoNum>();
	public Lottoria() {
	}
	
	public void play(int games) {
		char tempCode = 64;
		int[] lottArray = new int[6];
		for (int i = 0; i < games; i++) {
			LottoNum ln = new LottoNum();
			System.out.println("["+(i+1)+" 게임] (1.자동 / 2.수동)");
			int answer1 = sc.nextInt();
			sc.nextLine();
			if(answer1 ==1) {
				ln.name = "자  동";
				System.out.println();
				for (int j = 0; j < lottArray.length; j++) {
					lottArray[j] = (int) ((Math.random()*45)+1);
					if(j>0&&lottArray[j]==lottArray[j-1]) j--;
				}
				for (int j = 0; j < lottArray.length; j++) {
					for (int j2 = 0; j2 < lottArray.length; j2++) {
						if(lottArray[j]<lottArray[j2]) {
							int temp = lottArray[j];
							lottArray[j] = lottArray[j2];
							lottArray[j2] = temp;
						}
					}
				}
				for (int j = 0; j < lottArray.length; j++) {
					System.out.print(lottArray[j]+"\t");
				}
				System.out.println();
			}else if(answer1 ==2) {
				ln.name = "수  동";
				char tempChar = '\u2460';
				for (int j = 0; j < lottArray.length; j++) {
					System.out.println(tempChar++ +" : ");					
					int tempN = sc.nextInt();
					sc.nextLine();
					lottArray[j]=tempN;
				}
				
			}else {
				System.out.println("WrongNumber!");
			}
			for (int j = 0; j < lottArray.length; j++) {
				ln.lottoNum[j] = lottArray[j];
			}
			ln.code = ++tempCode;
			resultList.add(ln);
//			lottArray
			
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
	

static Lottoria lotto = new Lottoria();
	public static void main(String[] args) {
		Scanner sc = tempScanner.getInstance();

		System.out.println("몇 게임?");
		int games = sc.nextInt();
		sc.nextLine();
		lotto.play(games);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd (E) HH:mm:ss");
		int year = cal.get(Calendar.YEAR);
		int month= cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String daay = "";
		switch (dayOfWeek) {
		case 1:
			daay = "(일)";
			break;
		case 2:
			daay = "(월)";
			break;
		case 3:
			daay = "(화)";
			break;
		case 4:
			daay = "(수)";
			break;
		case 5:
			daay = "(목)";
			break;
		case 6:
			daay = "(금)";
			break;
		case 7:
			daay = "(토)";
			break;

		}
		System.out.println("################################ 인생역전 Lottoria ################################");
		System.out.println("발행일\t: "+ sdf.format(cal.getTime()));
		cal.set(Calendar.HOUR,21);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND,0);
			if(dayOfWeek==7&&hour>21) {
			cal.add(Calendar.DATE, 7);
			}else {
				cal.add(Calendar.DATE, (7-dayOfWeek));
			}
		System.out.println("추첨일\t: "+ sdf.format(cal.getTime()));
		cal = Calendar.getInstance();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd (E)");
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println("지급기한\t: "+sdf2.format(cal.getTime()));
		System.out.println("--------------------------------------------------------------------------------");
		for (LottoNum re : lotto.resultList) {
			System.out.print(re.code + " "+ re.name);
			for (int i = 0; i < re.lottoNum.length; i++) {
				System.out.print("\t" +  re.lottoNum[i]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------------------");
		DecimalFormat df = new DecimalFormat("#,###");
		char won = '\u20A9';
		System.out.println("금액\t\t\t\t\t"+won+df.format((1000*games)));
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println();		
		System.out.println();
		int[] lotResult = new int[6];
		for (int i = 0; i < lotResult.length; i++) {
			lotResult[i] = (int)((Math.random()*45)+1);
			if(i>0&&lotResult[i]==lotResult[i-1]) i--;
		}
		for (int i = 0; i < lotResult.length; i++) {
			for (int j = 0; j < lotResult.length; j++) {
				if(lotResult[i]<lotResult[j]) {
					int temp = lotResult[i];
					lotResult[i] = lotResult[j];
					lotResult[j] = temp;
				}
			}
		}
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < lotResult.length; i++) {
			System.out.print(lotResult[i]+ " ");
		}
		int bonus = (int)((Math.random()*45)+1);
		System.out.println("보너스 번호 : "+ bonus);
		System.out.println();
		System.out.println("################################ 당첨 결과 ################################");
		for (LottoNum re : lotto.resultList) {
			System.out.print(re.code + " "+ re.name);
			for (int i = 0; i < re.lottoNum.length; i++) {
				System.out.print("\t" + re.lottoNum[i] );
				for (int j = 0; j < lotResult.length; j++) {
					if(re.lottoNum[i]==lotResult[j]) {
						re.chum = "(당첨)";
					}
					
				}
			}
			System.out.print("\t"+re.chum);
			System.out.println();
		}
		System.out.println("###########################################################################");

	}
}
