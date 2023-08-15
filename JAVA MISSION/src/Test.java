import java.util.Scanner;


	public class Test {
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
//			수식 입력
			System.out.println("수식을 입력하십시오.");
//			입력한 수식을 문자열로 저장
//			String a = sc.nextLine();
			String a = "( 10 + 2 ) * 2 + 100";
//			split으로 분해하여 바로 배열에 저장하려 했으나,
//			숫자를 제외한 부호들을 많은 공백으로 치환하는 결과로 인해-
//			배열에 공백이 들어가버림.
//			따라서, replaceAll을 이용해 모든 부호를 공백으로 치환한 다음
//			공백을 기준으로 split 실행
			a = a.trim().replace(" ", "");
			System.out.println(a);
			String[] arr = a.split("[^0-9]+");
			System.out.println(arr.length);
			
//			생성된 배열의 크기와 각 칸의 값이 의도한 바와 맞는지에 대한 확인 과정
			System.out.println(arr.length);
			for (String string : arr) {
				System.out.print(string + " ");
			}
//			Integer.parseInt를 통한 문자열 -> 정수형으로 변환. 후 계산
			
			System.out.println((Integer.parseInt(arr[0])+Integer.parseInt(arr[1]))*Integer.parseInt(arr[2])+Integer.parseInt(arr[3]));
		}
	}
