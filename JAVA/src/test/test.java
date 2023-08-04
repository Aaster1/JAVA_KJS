package test;

import java.util.Scanner;

public class test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[3];
		System.out.println("입력");
		arr = sc.nextLine().split(".");
		
		for (String string : arr) {
			System.out.println(string);
		}
		sc.close();
		
		
	}
}