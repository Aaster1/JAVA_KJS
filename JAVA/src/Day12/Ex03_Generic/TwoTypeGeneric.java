package Day12.Ex03_Generic;


//제네릭 기법으로 타입 매개변수 2개 지정
class KeyValue<K,V>{
	
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
public class TwoTypeGeneric {

	public static void main(String[] args) {
		
//		제네릭으로 객체 생성
//		클래스타입<타입1,타입2> 객체명 = new 클래스<타입1, 타입2>();
//		-객체 생성하는 클래스명 뒤의 타입은 생략가능
//		-new 클래스<>();
		KeyValue<String, Integer> kv = new KeyValue<String,Integer>(); 
		//클래스 객체 생성 때의 뒷 <> 는 메소드처럼 생략 가능
		
		kv.setKey("Java");
		kv.setValue(100);
		
		KeyValue<Integer, String> kv2 = new KeyValue<>(); 
		kv2.setKey(100);
		kv2.setValue("Java");
		
		System.out.println("kv - key : "+kv.getKey());
		System.out.println("kv - value: "+kv.getValue());
		
		System.out.println("kv2 - key : "+kv2.getKey());
		System.out.println("kv2 - value: "+kv2.getValue());
		
//		void : 해당 타입에는 변수를 사용하지 않도록 지정
		KeyValue<String, Void> kv3 = new KeyValue<>();		//<--공허
		kv3.setKey("키 값만");
		String key3 = kv3.getKey();
		System.out.println("key3 : "+key3);
		
//		toString의 오버라이딩이 지금껏 무엇을 오버라이딩했는지 느낌이 온다.
//		해시코드는 클래스에 저장된 그것을 불러오는 과정에서 짜여진 형식이란 느낌
		
		
		
		
	}
	

}