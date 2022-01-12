package day08;

public class ArrayTest {
	public static void main(String[] args) {
		
		// int 배열을 ar이라는 이름으로 안에 {10,20,30,...4,6}을 널어라
		int[] ar = { 10, 20, 30, 5, 6, 8, 9, 4, 5, 6, 1, 2, 4, 5, 7, 0, 5, 1, 6, 8, 4, 6 };

//		System.out.println(ar);
//		[I@626b2d4a
//		↑배열의 int타입의 시작하는 열만 알고 있다

//		System.out.println(ar[0]);	// 배열 ar의 0번째 출력
//		System.out.println(ar[1]);	// 배열 ar의 1번째 출력
//		System.out.println(ar[2]);	// 배열 ar의 2번째 출력
//		System.out.println(ar[3]); 	// 오류 발생, 배열 인데스 범위를 벗어남
		System.out.println("ar.length : " + ar.length); // ar.length 길이 출력

		// 배열 안에 데이터 변환
		ar[1] = 1000; // 배열 ar의 1번째에 1000을 넣어주세요

		for (int i = 0; i < ar.length; i++) { // i가 0부터; i가 ar의 데이터길이 미만동안; i++
			System.out.println("ar[" + i + "] :" + ar[i]); // ar[i]출력
		}
	}
}
