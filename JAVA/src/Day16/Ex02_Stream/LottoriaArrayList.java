package Day16.Ex02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LottoriaArrayList {
	
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			
			ArrayList<Integer> lottoList = new ArrayList<>();
//			System.out.print("["+(i+1)+" 게임] : ");
//			lottoList.stream().map(n->(int)Math.random()*45+1).sorted().distinct().forEach(n->System.out.print(n+" "));
//			System.out.println();
			
			for (int j = 0; j < 6; j++) {
				int rand = (int) (Math.random()*45+1);
				
				if(lottoList.contains(rand)) {
					j--;
				}
				else {
					lottoList.add(rand);
				}
				
			}
			Collections.sort(lottoList);
			
			for (Integer integer : lottoList) {
				System.out.print(integer + " ");
			}
			System.out.println();
			
			
			
			
		}
	}
	
}
