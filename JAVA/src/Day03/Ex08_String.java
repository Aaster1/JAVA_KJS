package Day03;

public class Ex08_String {
	public static void main(String[] args) {
//		String은 참조자료형
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		String d = new String ("Hello");
		String e = new String ("Java");
		String f = new String ("Java");
		
		System.out.println(a==c);		//--> T : 같은 주소로 저장되는 문자열 리터럴
		System.out.println(a==d);		//--> F : d의 경우 힙 영역에 객체 생성.
		System.out.println(a.equals(d));	//--> T : equals 의 경우 문자내용이 같으면 T도출 가능
		
		System.out.println(e==f);		//--> F : 서로 다른 객체 생성
		System.out.println(e.equals(f));	//--> T : equals 의 경우 문자내용이 같으면 T도출 가능 
		
//		==			: 해당 변수의 레퍼런스(참조정보)를 비교
//		equals()	: 해당 변수의 문자열 자체를 비교
		
	}
}
