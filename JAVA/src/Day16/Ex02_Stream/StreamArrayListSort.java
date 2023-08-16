package Day16.Ex02_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamArrayListSort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(4);
//		Collectors.의 변환 메소드는 toList,toSet,toMap
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList()); //<-오름차순 리스트 생성
		List<Integer> reversedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());	//<-내림차순 리스트 생성
		for (Integer item : sortedList) {
			System.out.print(item + " ");
		}
		for (Integer item : reversedList) {
			System.out.print(item + " ");
		}
		System.out.println();
//		오름차순 정렬
		list.stream().sorted().forEach(n->System.out.print(n+ " "));
		System.out.println();
//		내림차순 정렬
		list.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n+ " "));
	}
	
}
