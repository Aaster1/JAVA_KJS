package Day13.Ex01_Collection;

import java.util.Stack;

/*
	Stack
	:	"쌓다"
	데이터를 한 쪽 방향에서만 추가하고 삭제할 수 있는 자료구조 (!=큐 : 한쪽 방향에서 추가, 다른 한 쪽 방향에서 삭제)
	최상위 데이터 : TOP
	
	자료추가 - Push : Top 위에 데이터를 추가
	자료삭제 - Pop  : Top 의 데이터를 삭제
	
	LIFO / 후입선출
	
*/
public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("empty : " + stack.isEmpty());
		
		
//		push(요소) 	: 	요소를 TOP 위에 추가
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("empty : "+stack.isEmpty());
		System.out.println("1 포함 여부 : "+stack.contains(1));
		
		for (Integer integer : stack) {
			System.out.println("item : "+integer);		}
	
//	peek()	:	TOP의 데이터를 반환
	System.out.println("TOP : "+stack.peek());
	System.out.println("size : "+stack.size());
	
//	pop() 	:	TOP의 요소를 삭제
	stack.pop();
	stack.remove(1);			// index로 삭제
	stack.remove((Integer)3);	// 객체를 지정하여 삭제
	
	for (Integer integer : stack) {
		System.out.println("item + "+integer);
	}
	
	stack.clear();			//전체 요소 삭제
	
	System.out.println("empty : "+stack.isEmpty());
	
}

}