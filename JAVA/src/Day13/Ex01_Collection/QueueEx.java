package Day13.Ex01_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
//		offer()		:	요소 추가
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		for (Integer integer : queue) {
			System.out.println("item : " + integer);
		}
		
//		poll()		:	head에서 데이터를 삭제하고 삭제된 값을 반환
//		스택과 다르게 이 녀석은 반환을 할 수 있다!!!
		queue.poll();						//	값 1 삭제
		queue.poll();						//	값 2 삭제
		
//		peek()		:	head에 있는 값을 반환
		System.out.println("Last item : "+queue.peek());
	}
	
}
