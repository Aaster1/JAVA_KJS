package Day08.Ex03_NestedInterface;

//아우터클래스
public class I {

	J j;		//<--인터페이스 선언
	
	
	void setInterface(J j) {
		this.j = j;
		
	}
	
	static interface J {		//<--이너인터페이스 
		void method1();
		void method2();
	}

	void method() {
		j.method1();
		j.method2();
	}
}
