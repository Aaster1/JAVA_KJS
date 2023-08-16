package Day16.Ex02_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduce {

	
	
	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(90);
		list.add(60);
		list.add(80);
		list.add(70);
		
		Stream<Integer> s = list.stream();		//<-스트림 타입으로 변수선언하면 조금 더 편함
		s.sorted().forEach(n->System.out.print(n+ " "));
		
//===============================================================================================		
		List<String> wordList = new ArrayList<String>();
		
		wordList.add("안녕하세요~!");
		wordList.add("1시간 뒤면");
		wordList.add("집에 갈 시간입니다!");
		wordList.add("reduce()를 알아보아요!");
		
		String msg = wordList.stream().reduce("", (a,b)->a+" "+b);		//<- 출력 결과에서 초기값 ""이 a로 지정되기에, 한칸 띄고 출력됨.
		System.out.println(msg);
//		=============================================================================================
		List<Integer> numList = new ArrayList<Integer>();
		
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		
		int result = numList.stream().reduce(0,(sum,item)->sum+item);
		
		System.out.println(result);
		
		
//		첫번째 짝수를 찾아서, 존재하면 출력하시오
		
		Optional<Integer> firstEven = numList.stream().filter(n->n%2==0).findFirst();
		
		if(firstEven.isPresent()) {
			System.out.println("첫번째 짝수 :" +firstEven.get());
		}else {
			System.out.println("노짝수");
		}
//		더 간단하게 한 줄로 표기
		numList.stream().filter(n->n%2==0).findFirst().ifPresent(n->System.out.println(n));
	}
}
