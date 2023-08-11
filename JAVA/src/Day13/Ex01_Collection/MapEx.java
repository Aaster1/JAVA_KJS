package Day13.Ex01_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	
	Map
	: 키(key), 값(value)을 쌓으로 구성한 요소를 다루는 컬렉션
	*key는 중복되지 않는다
	
	-요소 추가
		put(key,value)	:	키와 값을 추가
							-중복된 키가 추가되면, 마지막에 추가된 값이 저장된다
							
							
	-요소 검색
		get(key)				: 키에 해당하는 값 반환
		contains(key)			: 키 존재 여부
		contatinsValue(value)	: 값 존재 여부
		isEmpty()				: 비어있는지에 대한 여부
		keySet()				: 모든 키를 Set 객체로 반환
		size()					: 요소의 개수
		vlaues()				: 모든 값을 Collection 객체로 반환
	
	- 요소 삭제
		remove(key)				: 키에 해당하는 값 삭제
		clear()					: claer

*/

public class MapEx {

	public static void main(String[] args) {
//		Map 는 인터페이스
		Map<String,Integer> map = new HashMap<>();	//<--<>안의 순서는 상관있음.
		
//		요소 추가
		map.put("RM", 90);
		map.put("진", 100);
		map.put("슈가", 70);
		map.put("정국", 95);
		map.put("뷔", 60);
		map.put("제이홉", 50);
		map.put("지민", 80);
		
		map.put("RM", 99);		//<--기존의 키가 겹쳐서, 기존 키와 값을 삭제하고 새로운 키와 값을 입력한다. 결과는 수정과 같은 형태
		
		System.out.println("총 개수 : "+map.size());
		System.out.println();
		
		System.out.println("지민의 코딩실력 : " + map.get("지민"));		//<--키 명칭을 통해 값을 가져온다
		System.out.println("RM의 코딩실력 : " + map.get("RM"));
		
//		keySet() : 모든 키를 가져온다.
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key+ " : "+value);
		}
		System.out.println();
		
		map.remove("지민");
		System.out.println("총 개수 : "+map.size()+"\n");
		
		
//		Iterator를 이용한 반복
//		map.entrySet()				:	iterator() 메소드를 갖는 Set 객체를 반환
//		entrySet.iterator()			:	Map 컬렉션을 순차검색할 수 있는 iterator 객체를 가져옴
		Set<Map.Entry<String, Integer >> entrySet = map.entrySet();		//<--Entry가 키 벨류 한쌍 타입. 그렇기에 같은 형태로 접근할 필요가 있는 모양
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String,Integer>entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key+" : "+value);
		}
		map.clear();
		
		System.out.println("총 개수 : "+ map.size());
		System.out.println("empty 여부 : "+ map.isEmpty());
	}
	
}
