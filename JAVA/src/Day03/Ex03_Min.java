package Day03;

import java.util.Scanner;

public class Ex03_Min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if(min > arr[i])
					min = arr[i];
				
			}
			System.out.println("츄ㅚ솟값 : "+min);
			sc.close();
		}
	}
