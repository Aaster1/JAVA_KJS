package _16;

import java.io.File;
import java.util.Scanner;

public class _16 {
public static void main(String[] args) {
		System.out.print("번호\t이름\t성적\t반");
		
	try {
		 File file = new File("student.txt");
		Scanner sc = new Scanner(file);
		String line ="";
		while(sc.hasNextLine()) {
			 line= sc.nextLine();
			String arr[] = line.split("\\/");
			for (String i : arr) {
				System.out.print(i+"\t");
			}
			System.out.println();
			
			sc.close();
		}
	} catch (Exception e) {
		System.err.println("에러남ㅋㅋ");
	} 
	}
}
