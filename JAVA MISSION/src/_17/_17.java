package _17;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

 class Use{
	 int seatNum = 0;
	 int userNum = 0;
	 String name = "";
	 
	 
	 
	public Use(int seatNum, int userNum) {
		this.seatNum = seatNum;
		this.userNum = userNum;
	}
	 
	 
 }

class F1 {

	String[][] seat = new String[4][10];
	int num = 01;
	int countSeat = 0;
	DecimalFormat df = new DecimalFormat("00");
	ArrayList<Use> usingf1 = new ArrayList<>();
	
	F1() {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = df.format(num++);
				countSeat++;
			}
		}
	}
	public void catchSeat(int seatN) {
		if(seat[seatN/10][seatN%10-1]!="--") {
			seat[seatN/10][seatN%10-1]="--";
			countSeat--;
		}else if(seat[seatN/10][seatN%10-1]=="--"){
			System.out.println("\t이미 이용 중인 좌석입니다. 다른 자리를 이용해주세요.");
		}
	}

}

class F2 {
	String[][] seat = new String[5][4];
	int num = 01;
	int countSeat = 0;
	DecimalFormat df = new DecimalFormat("00");
	ArrayList<Use> usingf2 = new ArrayList<>();

	F2() {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = df.format(num++);
				countSeat++;

			}
		}
	}
	public void catchSeat(int seatN) {
		if(seat[seatN/4][seatN%4-1]!="--") {
			seat[seatN/4][seatN%4-1]="--";
			countSeat--;
		}else if(seat[seatN/4][seatN%4-1]=="--"){
			System.out.println("\t이미 이용 중인 좌석입니다. 다른 자리를 이용해주세요.");
		}
	}

}

class F3 {
	String[][] seat = new String[6][5];
	int countSeat = 0;
	int num = 01;
	DecimalFormat df = new DecimalFormat("00");
	ArrayList<Use> usingf3 = new ArrayList<>();

	F3() {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = df.format(num++);
				countSeat++;

			}
		}
	}
	public void catchSeat(int seatN) {
		if(seat[seatN/5][seatN%5-1]!="--") {
			seat[seatN/5][seatN%5-1]="--";
			countSeat--;
		}else if(seat[seatN/5][seatN%5-1]=="--"){
			System.out.println("\t이미 이용 중인 좌석입니다. 다른 자리를 이용해주세요.");
		}
	}

}
public class _17 {
	static F1 f1 = new F1();
	static F2 f2 = new F2();
	static F3 f3 = new F3();
	static Scanner sc = new Scanner(System.in);
	static Use use = new Use(0,0);
	static DecimalFormat df = new DecimalFormat("00");
	
	static int menu() {
		System.out.println();
		System.out.println();
		System.out.println("#################### 조은의 스터디카페 ##########################################");
		System.out.println();
		System.out.println("1. 이용하기");
		System.out.println("2. 반납하기");
		System.out.println("3. 좌석현황");
		System.out.println("0. 종료하기");
		System.out.println();
		System.out.println("===========================================================================");
		System.out.println();
		System.out.println(">>입력 : ");
		int N = sc.nextInt();
		sc.nextLine();
		return N;
	}
	
	static void take() {
		if(use.seatNum==0&&use.userNum==0) {
			System.out.println(">>수강번호 : ");
			use.userNum = sc.nextInt();
			sc.nextLine();
			System.out.println(">>이름 : ");
			use.name = sc.nextLine();
		}
		System.out.println("(1) 1F - 오픈라운지");
		System.out.println("(2) 2F - 미디어실");
		System.out.println("(3) 3F - 프로젝트실");
		System.out.println(">> 입력 : ");
		int N = sc.nextInt();
		sc.nextLine();
		switch (N) {
		case 1:
			System.out.println();
			System.out.println("===================== 이용현황============================================");
			System.out.println();
			System.out.println("======================= 1층 ==============================================");
			for (String[] f11 : f1.seat) {
				for (String f12 : f11) {
					System.out.print(f12 + "\t");
				}
				System.out.println();
			}
			System.out.println("===========================================================================");
			System.out.println("\t\t\t\t\t\t 이용가능 : \t"+f1.countSeat+"석");
			System.out.println(">>좌석번호 : ");
			int seatN = sc.nextInt();
			sc.nextLine();
			f1.catchSeat(seatN);
			
			break;
			
		case 2:
			System.out.println();
			System.out.println("===================== 이용현황==============================================");
			System.out.println();
			System.out.println("======================= 2층 ================================================");
			for (String[] f11 : f2.seat) {
				for (String f12 : f11) {
					System.out.print(f12 + "\t");
				}
				System.out.println();
			}
			System.out.println("===========================================================================");
			System.out.println("\t\t\t\t\t\t 이용가능 : \t"+f2.countSeat+"석");
			System.out.println(">>좌석번호 : ");
			int seatN2 = sc.nextInt();
			sc.nextLine();
			f2.catchSeat(seatN2);
			
			break;
		case 3:
			System.out.println();
			System.out.println("===================== 이용현황=============================================");
			System.out.println();
			System.out.println("======================= 3층 ===============================================");
			for (String[] f11 : f3.seat) {
				for (String f12 : f11) {
					System.out.print(f12 + "\t");
				}
				System.out.println();
			}
			System.out.println("===========================================================================");
			System.out.println("\t\t\t\t\t\t 이용가능 : \t"+f3.countSeat+"석");
			System.out.println(">>좌석번호 : ");
			int seatN3 = sc.nextInt();
			sc.nextLine();
			f3.catchSeat(seatN3);

			break;

		}
	}
	
	static void returnSeat() {
		System.out.println("(1) 1F - 오픈라운지");
		System.out.println("(2) 2F - 미디어실");
		System.out.println("(3) 3F - 프로젝트실");
		System.out.println(">> 입력 : ");
		int N = sc.nextInt();
		sc.nextLine();
		switch (N) {
		case 1:
			System.out.println();
			System.out.println("===================== 이용현황===============================================");
			System.out.println();
			System.out.println("======================= 1층 =================================================");
			for (String[] f11 : f1.seat) {
				for (String f12 : f11) {
					System.out.print(f12 + "\t");
				}
				System.out.println();
			}
			System.out.println("===========================================================================");
			System.out.println("\t\t\t\t\t\t 이용가능 : \t"+f1.countSeat+"석");
			System.out.println(">>좌석번호 : ");
			int seatNum = sc.nextInt();
			sc.nextLine();
			System.out.println(">>수강번호 : ");
			int userNum = sc.nextInt();
			sc.nextLine();
			if(f1.seat[seatNum/10][seatNum%10-1]=="--"&&userNum==use.userNum) {
				f1.seat[seatNum/10][seatNum%10-1]= df.format(seatNum);
				f1.countSeat++;
			}else if(f1.seat[seatNum/10][seatNum%10-1]=="--"&&userNum!=use.userNum) {
				System.out.println("이용 회원번호가 일치하지 않습니다.");
			}else if(f1.seat[seatNum/10][seatNum%10-1]!="--"&&userNum==use.userNum){
				System.out.println("선택하신 좌석은 비어있습니다.");
			}else {
				System.out.println("잘못된 입력입니다. 회원번호 비일치 / 비선점 좌석");
			}
				

			break;
		case 2:
			System.out.println();
			System.out.println("===================== 이용현황================================================");
			System.out.println();
			System.out.println("======================= 2층 ==================================================");
			for (String[] f11 : f2.seat) {
				for (String f12 : f11) {
					System.out.print(f12 + "\t");
				}
				System.out.println();
			}
			System.out.println("===========================================================================");
			System.out.println("\t\t\t\t\t\t 이용가능 : \t"+f2.countSeat+"석");

			System.out.println(">>좌석번호 : ");
			int seatNum2 = sc.nextInt();
			sc.nextLine();
			System.out.println(">>수강번호 : ");
			int userNum2 = sc.nextInt();
			sc.nextLine();
			if(f2.seat[seatNum2/4][seatNum2%4-1]=="--"&&userNum2==use.userNum) {
				f2.seat[seatNum2/4][seatNum2%4-1]= df.format(seatNum2);
				f2.countSeat++;
			}else if(f2.seat[seatNum2/4][seatNum2%4-1]=="--"&&userNum2!=use.userNum) {
				System.out.println("이용 회원번호가 일치하지 않습니다.");
			}else if(f2.seat[seatNum2/4][seatNum2%4-1]!="--"&&userNum2==use.userNum){
				System.out.println("선택하신 좌석은 비어있습니다.");
			}else {
				System.out.println("잘못된 입력입니다. 회원번호 비일치 / 비선점 좌석");
			}

			break;
		case 3:
			System.out.println();
			System.out.println("===================== 이용현황==============================================");
			System.out.println();
			System.out.println("======================= 3층 ================================================");
			for (String[] f11 : f3.seat) {
				for (String f12 : f11) {
					System.out.print(f12 + "\t");
				}
				System.out.println();
			}
			System.out.println("===========================================================================");
			System.out.println("\t\t\t\t\t\t 이용가능 : \t"+f3.countSeat+"석");

			System.out.println(">>좌석번호 : ");
			int seatNum3 = sc.nextInt();
			sc.nextLine();
			System.out.println(">>수강번호 : ");
			int userNum3 = sc.nextInt();
			sc.nextLine();
			if(f3.seat[seatNum3/5][seatNum3%5-1]=="--"&&userNum3==use.userNum) {
				f3.seat[seatNum3/5][seatNum3%5-1]= df.format(seatNum3);
				f3.countSeat++;
			}else if(f3.seat[seatNum3/5][seatNum3%5-1]=="--"&&userNum3!=use.userNum) {
				System.out.println("이용 회원번호가 일치하지 않습니다.");
			}else if(f3.seat[seatNum3/5][seatNum3%5-1]!="--"&&userNum3==use.userNum){
				System.out.println("선택하신 좌석은 비어있습니다.");
			}else {
				System.out.println("잘못된 입력입니다. 회원번호 비일치 / 비선점 좌석");
			}

			break;

		default:
			break;
		}
		

	}
	
	static void selectAll() {
		
	}
	
	public static void main(String[] args) {


		boolean on = true;
		do {
			switch (menu()) {
			case 0:
				on=false;
				break;
			case 1:
				take();
				break;
			case 2:
				returnSeat();
				break;
			case 3:
				System.out.println();
				System.out.println("===================== 이용현황==============================================");
				System.out.println();
				System.out.println("======================= 1층 ================================================");
				for (String[] f11 : f1.seat) {
					for (String f12 : f11) {
						System.out.print(f12 + "\t");
					}
					System.out.println();
				}
				System.out.println("===========================================================================");
				System.out.println("\t\t\t\t\t\t 이용가능 : \t"+f1.countSeat+"석");
				System.out.println();
				System.out.println("======================= 2층 ================================================");
				for (String[] f11 : f2.seat) {
					for (String f12 : f11) {
						System.out.print(f12 + "\t");
					}
					System.out.println();
				}
				System.out.println("===========================================================================");
				System.out.println("\t\t\t\t\t\t 이용가능 : \t"+f2.countSeat+"석");
				System.out.println();
				System.out.println("======================= 3층 ================================================");
				for (String[] f11 : f3.seat) {
					for (String f12 : f11) {
						System.out.print(f12 + "\t");
					}
					System.out.println();
				}
				System.out.println("===========================================================================");
				System.out.println("\t\t\t\t\t\t 이용가능 : \t"+f3.countSeat+"석");
				break;
			default:
				System.out.println();
				System.out.println("===========================================================================");
				System.out.println();
				System.out.println("\t잘못된 입력입니다.");
				System.out.println();
				System.out.println("===========================================================================");
				break;
			}
		}while(on);
		
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("\t시스템을 종료합니다.");
		System.out.println();
		System.out.println("================================================================================");
		
		
	}

}