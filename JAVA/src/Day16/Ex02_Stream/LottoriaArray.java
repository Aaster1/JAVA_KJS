package Day16.Ex02_Stream;

import java.util.Arrays;
import java.util.Scanner;

public class LottoriaArray {
	
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			
			int lotto[] = new int[6];
			Arrays.stream(lotto).map(n->(int)Math.random()*45+1).sorted().distinct().forEach(n->System.out.print(n+" "));
			System.out.println("["+(i+1)+" 게임] : ");
			
			
			
			
			
			
		}
	}
	
}
