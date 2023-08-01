package Day02;

public class Ex14_WhileSum {
	public static void main(String[] args) {
//		1부터 100까지의 합계를 구하시오.
//		1+2+3+4+...+100 = 5050
		int num = 1;
		int total = 0;	//합계
		while (num<=100) {
			total += num++;		//sum = sum +a;
								//a = a+1
		}
		System.out.println("total : "+total);
	}
}
