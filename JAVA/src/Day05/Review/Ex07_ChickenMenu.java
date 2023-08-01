package Day05.Review;

import java.util.Scanner;

/*
 	##########	멘	유	판	##########
 	1. 굽네치킨 - 볼케이노
 	2. BBQ - 황금올리브 반반 치킨
 	3. 교촌치킨 - 허니콤보 치킨
 	4. BHC - 뿌링클 치킨
 	5. 레드락 치킨 - 양념치킨
 	0. 종료
 	##########	입력	:
 	
 	메뉴번호에 따라 메뉴 변수에 해당메뉴 저장해주고,
 	"(해당메뉴) 이 주문되었습니다."라고 출력하시오.
 	0을 입력하기 전까지 반복하고,
 	0을 입력하면 반복을 종료합니다.
 	종료 시, "?개의 주문을 완료합니다." 라고 출력하시오
 */

public class Ex07_ChickenMenu {

	static int cnt = 0;
	static String gc = "굽네치킨 - 불케이노";
	static String bbq = "황금올리브 반반 치킨";
	static String gch = "교촌치킨 = 허니콤보 치킨";
	static String bhc = "뿌링클 치킨";
	static String red = "레드락 치킨 - 양념치킨";
	static boolean on = true;
	static Scanner sc = new Scanner(System.in);

//	String str1,str2,str3,str4,str5;
//	str1 = "1. 굽네치킨 - 볼케이노";
//	str2 = "2. BBQ - 황금올리브 반반 치킨";
//	str3 = "3. 교촌치킨 - 허니콤보 치킨";
//	str4 = "4. BHC - 뿌링클 치킨";
//	str5 = "5. 레드락 치킨 - 양념치킨";
	static void mP(String str1, String str2, String str3, String str4, String str5) {
		System.out.println("##########	멘	유	판	##########");
		System.out.println("\t 	1." + str1);
		System.out.println("\t 	2." + str2);
		System.out.println("\t 	3." + str3);
		System.out.println("\t 	4." + str4);
		System.out.println("\t 	5." + str5);
		System.out.println("\t	0. 종료");
		System.out.println("##########\t입력\t:");
	}

	static void mS() {
		int menuNum = sc.nextInt();
		if (menuNum == 1) {
			mS2(gc);
			cnt += 1;
		} else if (menuNum == 2) {
			mS2(bbq);
			cnt += 1;
		} else if (menuNum == 3) {
			mS2(gch);
			cnt += 1;
		} else if (menuNum == 4) {
			mS2(bhc);
			cnt += 1;
		} else if (menuNum == 5) {
			mS2(red);
			cnt += 1;
		} else if (menuNum == 0) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println(cnt + "개의 주문을 완료합니다.");
			on = false;
			System.out.println("------------------------------------------------------------------------");

		} else {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("잘못된 입력입니다 (메뉴 : 1~5 // 종료 : 0");
			System.out.println("------------------------------------------------------------------------");
		}

	}

	public static void mS2(String str) {
		System.out.println("------------------------------------------------------------------------");
		System.out.println(str);
		System.out.println("------------------------------------------------------------------------");
	}

	public static void main(String[] args) {

		do {
			mP(gc, bbq, gch, bhc, red);
			mS();
		} while (on);
		sc.close();
	}
}
