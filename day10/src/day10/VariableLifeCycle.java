package day10;

public class VariableLifeCycle {
	// 만약 이해하기 어렵다면 change 메소드에 있는 모든 a를 하나씩 A로 바꾸어 보면 
	// 오류가 나는 장소가 있을 것이다 그 범위가 지역변수가 값을 가지고 값이 바뀔 수 있는 곳이다.
	public static int change(int a) {		// int값을 돌려주는 change라는 이름의 메소드 생성 (int a)값을 받아옴, change() 지역변수 a의 값이 변경됨
		int num;	// 지역변수
		
		a += 100;	// a = a + 100, change() 지역변수 a의 값이 변경됨
		return a;	// 변수 속에 저장된 값을 돌려줌
	}	// 메소드 호출이 끝나면 메모리에서 해제됨
	
	// main안에 있는 지역변수도 동일하다
	public static void main(String[] args) {
		int a = 10;		// main() 영역 지역변수,
		a = VariableLifeCycle.change(a);	// a는 VariableLifeCycle클래스에서 change메소드에 (a값)을 받고 나온 값을 저장함 
		System.out.println(a);	// main() 지역변수 a를 출력함
	}
}