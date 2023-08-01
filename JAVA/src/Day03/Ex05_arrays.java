package Day03;

public class Ex05_arrays {
	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

//		[][][]
//		[][][]
		
//		arr.length 			:첫번째 차원 배열요소의 개수
//		따라서, 아래 반복문에서의 조건문이 1차원요소의 개수인 arr.length로 작성하게된다면
//		차원의 갯수를 조건으로 설정하기에 다음 차원의 개수와 맞지 않는 현상이 나타난다.
		for(int i = 0; i< arr[0].length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
		}
		System.out.println();
		
		int arr2[][]= {{1,2,3},{4,5,6}};
		
		for(int i =0; i<arr2.length; i++) {
			for(int j =0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
