package Day04.Ex04_ObjectArray;

import java.util.Scanner;

	/*
	 * 책제목, 저자명을 갖는 Book 클래스를 정의하고, Book 클래스타입의 객체 배열을 생성하여 사용자로부터 책 3권을 입력받아 출력하는
	 * 프로그램을 작성하시오.
	 */
class Book{
	String title, author;
	public Book() {
		this("제목없음", "저자없음");
	}
		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		@Override		//어노테이션
						//메소드 오버라이딩을 할 때 붙습니다.
						//참조자료형에서 발생하므로, 최상위 클래스, java.lang.Object의 상속 과정에서 발생.
						
		public String toString() {
			return "Book [title=" + title + ", author=" + author + "]";
		}
		
}


		//객체도 배열로 만들 수 있다! ↓

public class BookArray {
	public static void main(String[] args) {
//			Book 타입의 객체 배열 선언 및 생성
		Book[] bookArray=new Book[3];
		Scanner sc = new Scanner(System.in);
//			사용자입력
		for(int i = 0; i<bookArray.length; i++) {
			System.out.println("제목 : ");
			String title =sc.nextLine();
			System.out.println("저자 : ");
			String author = sc.nextLine();
//				Book 객체를 생성하여 bookArray 배열요소에 삽입
			bookArray[i] = new Book(title,author);
		}
		for(Book book:bookArray) {
			System.out.println(book);
		}
		sc.close();
	}
}

//		@2fd66ad3  --> 아마 결과는 이와 같은 해쉬코드로 출력될 것이다.
