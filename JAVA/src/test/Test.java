package test;

import java.util.ArrayList;
import java.util.Scanner;

class Temp{
	
	String name;

	
	public Temp(String name) {
		this.name = name;
	}
	
}


public class Test{
	
	static Scanner sc = new Scanner(System.in);
	
	static void playing(){
		System.out.println("몇 게임?");
//		int N = 
	}
	static void auto(){
		
	}
	static void menual() {
		
	}
	static void result() {
		
	}
	
	
	public static void main(String[] args) {

		ArrayList<Temp> temp = new ArrayList<>();
		
		Temp temtemp = new Temp("안녕?");
		
		temp.add(temtemp);
		
		System.out.println(temp.get(0).name);
		
		
		temtemp.name = "잘가";
		
		System.out.println(temp.get(0).name);
		
	}
	
}