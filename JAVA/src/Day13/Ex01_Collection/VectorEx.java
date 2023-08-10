package Day13.Ex01_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
	public static void printList(List<?> list){		//<-상위문서인List를 와일드카드 기준으로 사용
		
		if(list ==null || list.isEmpty()) {
			System.out.println("요소가 없습니다.");
			return;
		}
		
		Iterator<?> it = list.iterator();		//<-vector.iterator 메소드가 해당 자료형을 가져오는 형태인거임. 그래서 객체 생성 x
		while(it.hasNext()) {
			Object item = it.next();
			System.out.print(item);
			if(it.hasNext())System.out.print(", ");
			else System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
//		컬렉션 객체 생성
//		컬렉션타입<요소타입> 변수명 = new 클래스명<요소타입>();
		
//		벡터 객체 생성
		Vector<String> vector = new Vector<String>(10);
		
//		요소 추가
		vector.add("아메리카노");
		vector.add("청포도에이드");
		vector.add("인크레드불");		//체리 + 레드불
		vector.add("초코우유");
		vector.add("딸기우유");
		vector.add("자두쿠러쉬");
		vector.add("민트초코프라푸치노");
		vector.add("쿠키앤크림 프라페노");
		vector.add("딸기라떼");
		vector.add("바닐라라떼");
		vector.add("에스프레소");
		
//		개수, 용량 확인
		System.out.println("개수 : "+vector.size());
		
		System.out.println("용량 : "+vector.capacity());
		
		
		
//		검색
//		반복 방법1
		System.out.println(">> 반복 1");
		
		for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i);
			System.out.println("메뉴 이름: "+item);
		}

		System.out.println();
		
//		반복 방법2
		for (String string : vector) {
			System.out.println("메뉴 이름: "+string);
		}
		System.out.println();
		
//		반복 방법3
		System.out.println(">>반복 3");
//		Iterator를 이용한 반복
//		Iterator : 『반복하다』, iterator : 『반복자』
//		해당 리스트 컬렉션으로부터 Iterator 객체를 가져와 반복기능 수행
		
//		Iterator 메소드
//		hasNext()	:	다음 요소의 존재여부
//		next()		:	다음 요소를 반환
//		컬렉션객체.iterator()	:	해당 컬렉션에 대한 iterator 객체를 반환
		
		Iterator<String> it = vector.iterator();		//<-vector.iterator 메소드가 해당 자료형을 가져오는 형태인거임. 그래서 객체 생성 x
		while(it.hasNext()) {
			String item = it.next();
			System.out.print(item);
			if(it.hasNext())System.out.print(", ");
			else System.out.println();
		}
		
//		삭제
//		- 삭제할 때, index 앞으로 한 칸씩 당겨진다
//									0	1	2	3	
//									아메	청에	인크	초코
									
		vector.remove(0);
		vector.remove(1);
		vector.remove("청포도에이드");
		vector.remove("초코우유");
		
		

//		삭제 후 출력
		printList(vector);
		
//		컬렉션.isEmpty() : 요소가 하나도 없으면 true, 비어있지 않으면 false
		if(vector.isEmpty()) {
			System.out.println("메뉴가 없지롱");
		}else {
			printList(vector);
		}
		
		Scanner sc = new Scanner(System.in);
		
		List<String> newMenuList = new Vector<String>();
		//List 인터페이스로 변수자료형을 설정하게되면, 그 아래로 자료형 변환이 자유롭겠지?
		
		System.out.println("메뉴 추가하기 ( 종료 : 0)");
		do {
			System.out.print("추가 메뉴 : ");
			String menu = sc.nextLine();
			if(menu.equals("0")) break;
			newMenuList.add(menu);
		}while(true);
		
		System.out.println("##### [vector] #####");
		printList(vector);
		System.out.println("##### [newMenuList] #####");
		printList(newMenuList);
		
		vector.addAll(newMenuList);
		System.out.println("##### [vector] #####");
		printList(vector);
		
		sc.close();
		
		
	}
	
}
