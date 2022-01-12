package day09;

public class ForEachTest {
	public static void main(String[] args) {
		String[] fruits = {"사과", "딸기", "오렌지", "포도"};		// String배열 fruits에 {}안의 값 입력
		for(int i = 0; i < fruits.length; i++) {		// int값 i는 0; i가 fruits데이터 길이 미만동안; i++
			System.out.println(fruits[i]);		// fuits[i]값 출력
		}
		// 값을 대입하거나 수정할 때, 인덱스번호가 필요할때 일반 for문을 사용하면 편리하다
		fruits[0] = "바나나";		// fruits[0]에 "바나나" 입력
		
		System.out.println("----------------------------------------");
		// fruits라는 배열 속의 요소를 name이라는 변수가 받아온다
		for(String name : fruits) {		// String타입 name값에 : fruits값을 차례대로 입력
			System.out.println(name);	// name 출력
		}
		
		int[] nums = {10,20,30};		// int배열 nums에 {}안의 값 입력
		for(int num : nums) {		// int타입 num갑에 : nums값을 차례대로 입력
			System.out.println(num);		// num 출력 + 줄바꿈
		}
	}
}