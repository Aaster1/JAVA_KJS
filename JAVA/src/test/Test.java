package test;

import java.util.Scanner;

public class Test{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("입력>>");
		int N = sc.nextInt();
		sc.nextLine();
		
		if( N != 0) {
			System.out.println("0이 아님");
		}else {
			System.out.println("0임");
			
		}
		
		}
	
	}
