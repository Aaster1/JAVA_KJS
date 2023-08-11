package Day13.Ex01_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
	순차적으로 요소를 추가
	ArrayList 와 LinkedList의 속도비교
	- 결론 : ArraysList가 더 빠르다

*/

public class ArrayListLinkedList {

	public static void main(String[] args) {
		
//		데이터 삽입/삭제 는 LinkedList와 ArrayList의 속도 차이가 있다.
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		long startTime;
		long endTime;
		
//		밀리초 : 10^-3초		(0.001)
//		마이크로초 : 10^-6초	(0.000001초)
//		나노초 : 106^9초		(0.000000001초)
		
		System.out.println("어레이리스트 10000칸 배열 순차 생성 시작");
		startTime = System.nanoTime();
//		ArrayList에 데이터 삽입
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		long arrayListTime = (endTime - startTime);
	
		
		System.out.println(arrayListTime);
		
		System.out.println("---------------------------");
		
		System.out.println("링크드리스트 10000칸 배열 순차 생성 시작");
		startTime = System.nanoTime();
//		ArrayList에 데이터 삽입
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		long linkedListTime = (endTime - startTime);
		
		
		System.out.println(linkedListTime);
		
		System.out.println("---------------------------");
		
		if(arrayListTime > linkedListTime) System.out.println("LinkedList가 순차 삽입이 더 빠르다");
		else System.out.println("ArrayList가 순차 삽입이 더 빠르다");
		System.out.println("---------------------------");
	}
	
}
