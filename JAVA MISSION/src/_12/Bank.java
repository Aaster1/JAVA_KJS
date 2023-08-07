package _12;

import java.util.Scanner;

public class Bank {
	static Scanner sc = new Scanner(System.in);
	static String adminPassword = "123456";
	static int accCount = 0;
	static Account[] acc = new Account[1000];
	
	static void Accounts() {
		System.out.println("==========================================================================");
		System.out.print("관리자 비밀번호>> ");
		adminPassword.equals(sc.nextLine());
		System.out.println();
		System.out.println("==================== 계좌목록 =====================");
		System.out.println("예금주\t\t계좌번호\t\t잔고");
		for (int i = 0; i <= accCount; i++) {
			System.out.println(acc[i]);
		}
		System.out.println("==========================================================================");
		
	}

	static void seeBalance() {
		boolean on = true;
		while (on) {
			System.out.println("==================== 계좌조회 =====================");
			System.out.print("계좌번호>> ");
			String ansNum = sc.nextLine();
			System.out.println();
			System.out.print("비밀번호>> ");
			int tempPassword = sc.nextInt();
			sc.nextLine();
			for (Account account : acc) {
				if (account.accountNumber.equals(ansNum)) {
					if(account.password.equals(tempPassword)) {
						System.out.println("'"+account.accountHolder+"'님의 계좌잔액은 "+account.balance+"원입니다.");
						System.out.println("==========================================================================");
						on=false;
					}else {
						System.out.println();
						System.err.println("비밀번호가 다릅니다!");
						System.out.println("==========================================================================");

						on=false;
					}
				}
				
			}
		}
	}
	static void withdrawal() {
		boolean on = true;
		while (on) {
			System.out.println("==================== 출금 =====================");
			System.out.print("계좌번호>> ");
			String ansNum = sc.nextLine();
			System.out.println();
			System.out.print("비밀번호>> ");
			int tempPassword = sc.nextInt();
			sc.nextLine();
			for (Account account : acc) {
				if (account.accountNumber.equals(ansNum)) {
					if(account.password.equals(tempPassword)) {
						System.out.print("출금액>> ");
						int tempBalance=sc.nextInt();
						sc.nextLine();
						account.withdrawal(tempBalance);
						System.out.println("'"+account.accountHolder+"'님의 계좌에서 "+tempBalance+"원이 출금되었습니다.");
						System.out.println("==========================================================================");

						on=false;
					}else {
						System.out.println();
						System.err.println("비밀번호가 다릅니다!");
						System.out.println("==========================================================================");
						on=false;

					}
					}
					
				}
			}
		}
		
	static void deposit() {
		boolean on = true;
		while (on) {
			System.out.println("==================== 입금 =====================");
			System.out.print("계좌번호>> ");
			String ansNum = sc.nextLine();
			System.out.println();
			System.out.print("입금액>> ");
			int tempBalance = sc.nextInt();
			sc.nextLine();
			for (Account account : acc) {
				if (account.accountNumber.equals(ansNum)) {
					System.out.println("'"+account.accountHolder+"'님에게 입금하는게 맞으십니까?");
					System.out.println("1. 예");
					System.out.println("2. 아니오");
					System.out.print("입력>> ");
					int answer = sc.nextInt();
					sc.nextLine();
					if(answer ==1) {
						account.deposit(tempBalance);
						System.out.println("'"+account.accountHolder+"'님에게 "+tempBalance+"원이 입금되었습니다.");
						System.out.println("==========================================================================");
						on=false;
					}
					 
				}
			}
		}

	}

	static void create() {
		boolean on = true;
		while (on) {
			System.out.print("계좌번호>> ");
			acc[accCount].setAccountNumber(sc.nextLine());
			System.out.println();
			System.out.print("예금주>> ");
			acc[accCount].setAccountHolder(sc.nextLine());
			System.out.println();
			System.out.print("최초예금액>> ");
			boolean sb = acc[accCount].setBalance(sc.nextInt());
			sc.nextLine();
			System.out.println();
			System.out.print("비밀번호>> ");
			acc[accCount].setPassword(sc.nextLine());
			if (sb == false) {
				acc[accCount] = new Account();
			} else {
				System.out.println();
				System.out.println("'" + acc[accCount].accountHolder + "' 님의 계좌가 개설되었습니다.");
				accCount += 1;
				on = false;
			}
		}
	}

	static void base() {
		boolean on = true;
		do {
			System.out.println("==========================================================================");
			System.out.println("1. 계좌등록");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.println("==========================================================================");
			System.out.println("입력>> ");
			int n = sc.nextInt();
			sc.nextLine();
			switch (n) {
			case 1:
				create();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdrawal();
				break;
			case 4:
				seeBalance();
				break;
			case 5:
				Accounts();
				break;
			case 6:
				System.out.println();
				System.out.println("시스템을 종료합니다");
				System.out.println();
				on = false;
				break;

			default:
				System.out.println();
				System.out.println("잘못된 입력입니다 (1 ~ 6)");
				System.out.println();
				break;
			}
		} while (on);
	}

	public static void main(String[] args) {

		base();
	}
}
