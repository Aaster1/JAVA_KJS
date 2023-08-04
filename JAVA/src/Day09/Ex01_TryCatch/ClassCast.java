package Day09.Ex01_TryCatch;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}


public class ClassCast {

//	(부모 클래스)		(자식 클래스)
//	Animal		<--	Dog,Cat
//	Animal 	= Cat으로 업캐스팅한 이후에
//	다시 Animal을 Dog로 다운캐스팅할 수 없다.
//	- Cat 을 Dog로 타입 변환할 수 없다.
	
	static void changeToDog(Animal animal) {		//<--요 부분이 업캐스팅임ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		try {
			Dog dog = (Dog) animal;					//<--이게 Down
			
		} catch (ClassCastException e) {
			System.err.println("Cat을 Dog로 변환할 수 없습니다.");
		}
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeToDog(dog);
		
		Cat cat = new Cat();
		changeToDog(cat);					//<--이건 안됨. Cat -> Animal {{->}} Dog			예외 : ClassCasttException
	}
}
