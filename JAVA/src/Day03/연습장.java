package Day03;

import java.util.Scanner;

class Book{
	String title,author;
	Book(){
		this("제목없음","저자없음");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}

public class 연습장{
	public static void main(String[] args) {
		Book[] bookArrays = new Book[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < bookArrays.length; i++) {
			System.out.println((i+1)+"번째 책의 제목을 입력하십시오.");
			String title = sc.nextLine();
			System.out.println((i+1)+"번째 책의 제목을 입력하십시오.");
			String author = sc.nextLine();
			bookArrays[i]= new Book(title,author);
			
		}
		for (Book book : bookArrays) {
			System.out.println(book);
		}
		sc.close();
	}
}