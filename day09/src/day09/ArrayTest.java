package day09;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] arr = new int [3][2];
		
		int[][] ar = { 
						{ 10, 20 }, 
						{ 100, 200 }, 
						{ 1, 2 }
					};
		System.out.println("ar.length : " + ar.length);
		System.out.println("ar[0].length : " + ar[0].length);
		System.out.println("ar[1].length : " + ar[1].length);
		System.out.println("ar[2].length : " + ar[2].length);

		System.out.println("ar[1][0] : " + ar[1][0]);
		System.out.println("ar[2][1] : " + ar[2][1]);

//		System.out.println("{" + ar[1][0] + ", " + ar[1][1] + "}");
		
		
		for(int[] array : ar) {		// int타입의 배열을 array에 : ar배열 동안
			for(int num : array) {
				System.out.println(num);
			}
		}
		ar[0][1] = 2000;
		
		System.out.println("---------------------------------");
		System.out.print("{");		// "{" 출력, 제일 외부 배열의 여는 대괄호
		for (int i = 0; i < ar.length; i++) {		// int i가 0이고; i가 ar.length보다 미만동안; i++
			System.out.print("{");		// "{" 출력, 내부 배열의 여는 대괄호
			for (int j = 0; j < ar[i].length; j++) {		// int j가 0이고; j가 ar[i].length보다 미만동안; j++
				if (j == ar[i].length - 1) {		// j가 ar[i].length - 1일때
					System.out.print(ar[i][j]);		// "ar[i][j]"출력
				} else { // j가 1이 아니라면
					System.out.print(ar[i][j] + ",");		// "ar[i][j],"출력
				}
			}
			if(i == ar.length -1) {		// i가 ar.length -1일때		
				System.out.print("}");		// "}" 출력, 내부 마지막 배열의 닫는 대괄호
			}else {			// i가 2가 아니라면	
				System.out.print("}, ");		// "}, " 출력, 내부 배열의 닫는 대괄호
			}
		}
		System.out.print("}");		// "}" 출력, 제일 외부 닫는 대괄호
//		System.out.print(ar[0][0]);
//		System.out.print(", ");
//		System.out.print(ar[0][1]);
//		System.out.print("}");
	}
}