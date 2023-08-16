package Day16.Ex02_Stream;

import java.util.Arrays;

public class StreamArraySort {

	public static void main(String[] args) {
		int arr[] = {10,5,2,3,4};
		
//		Arrays.sort(arr);		//<-파괴적형태. arr자체의 형태를 바꿔버림
		
//		Stream 생성 시엔, 기존의 것을 그대로 냅두고 복사한 개체를 생성하여 사용.
//		그래서 '생성' 이라고 부름.
		int sortedArr[] = Arrays.stream(arr).sorted().toArray();
//		스트림생성().정렬().배열형태로 변환()
		for (int i : sortedArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("==================================================");
		System.out.println("복사된 배열에 정렬을 적용 O");
		
		Object reversedArr[]= 
				Arrays.stream(arr).boxed().sorted((a,b)-> (a-b)*-1).toArray();
				//기본sorted()는 따로 Integer변환 없이 수행되지만,
				//sorted() 괄호 내부에 람다식을 작성하기 위해서는 boxed()를 진행해야한다.
		for (Object object : reversedArr) {
			System.out.print((Integer) object+ " ");
		}
		System.out.println();
		
		
		
//		sorted + foreach
		Arrays.stream(arr).sorted().forEach((n)->System.out.print(n+" "));
	}
	
	
	
}
