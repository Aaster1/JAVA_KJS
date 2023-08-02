package _06;

import java.util.Scanner;


public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 게임?");
		int N = sc.nextInt();
		int arr[][] = new int[N][6];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 6; j++) {
				int num = (int) ((Math.random() * 45) + 1);
				arr[i][j] = num;
				for (int k = 0; k < j; k++) {
					if (arr[i][k] == arr[i][j]) {
						j--;
						break;
					}
					if (arr[i][j] < arr[i][k]) {
						int temp = arr[i][j];
						arr[i][j]= arr[i][k];
						arr[i][k] =temp;

					}
				}
			}

		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}