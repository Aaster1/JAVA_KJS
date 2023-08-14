package _14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _14 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("몇 게임?");
	int N = sc.nextInt();
	sc.nextLine();
	while(true) {
		int round = 1;
	try {
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> lottoList = new ArrayList<>();
			for (int j = 0; j < 6; j++) {
				Integer temp =  (int)(Math.random()*45+1);
				for (Integer a : lottoList) {
					if(a==temp&&a!=null) {
						lottoList.remove(j);
						j--;
					}
				}
				lottoList.add(temp);
				}
			Collections.sort(lottoList);
			System.out.print("["+ round++ + " 게임] : ");
			for (Integer integer : lottoList) {
				System.out.print(integer + " ");
						
			}
			
			
			
			
			
			
			
			
			System.out.println();
		}
		break;
	}
		 catch (Exception e) {
			 e.printStackTrace();
		continue;
	}
	}
		
	}
}
