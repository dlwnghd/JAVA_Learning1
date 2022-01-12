package day09;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] arr = new int [3][2];		// int값 배열을 2차원배열에/ 이름은 arr로/ 새로운 값을/ int값으로/ 3행 2열의 크기로 받음
		
		int[][] ar = { 		// int값 배열을 2차원배열에/ 이름은 arr로
						{ 10, 20 }, 	// 0행 {10, 20}
						{ 100, 200 }, // 1행 {100, 200}
						{ 1, 2 }		// 2행 {1,2}
					};
		// length : 데이터의 길이 출력
		System.out.println("ar.length : " + ar.length);		// ar의 가장 외부에있는 데이터의 길이 출력 총 3행 이므로 3 출력
		System.out.println("ar[0].length : " + ar[0].length);		// ar[0]의 데이터의 길이 출력 0행에 열이 2개 이므로 2 출력
		System.out.println("ar[1].length : " + ar[1].length);		// ar[1]의 데이터의 길이 출력 1행에 열이 2개 이므로 2 출력
		System.out.println("ar[2].length : " + ar[2].length);		// ar[2]의 데이터의 길이 출력 2행에 열이 2개 이므로 2 출력

		System.out.println("ar[1][0] : " + ar[1][0]);		// ar[1][0]안에 있는 데이터 출력
		System.out.println("ar[2][1] : " + ar[2][1]);		// ar[2][1]안에 있는 데이터 출력

//		System.out.println("{" + ar[1][0] + ", " + ar[1][1] + "}");
		
		// [빠른(향상된) for문(foreach문)]
		for(int[] array : ar) {		// int타입의 배열 array에 : ar값을 차례대로 입력
			for(int num : array) {	// int타입 num값에 : array배열 동안
				System.out.println(num);		// num 출력 + 줄바꿈
			}
		}
		ar[0][1] = 2000;		// ar[0][1]값에 2000 입력
		
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