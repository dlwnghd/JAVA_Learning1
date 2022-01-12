package day10;

public class VariableLifeCycle {
	public static int change(int a) {
		int num;	// 지역변수
		
		a += 100;	// change() 지역변수 a의 값이 변경됨
		return a;	// 변수 속에 저장된 값을 돌려줌
	}	// 메소드 호출이 끝나면 메모리에서 해제됨
	
	public static void main(String[] args) {
		int a = 10;		// main() 영역 지역변수,
		a = VariableLifeCycle.change(a);	// a에 저장된 값만 복사되서 넘어감
		System.out.println(a);	// main() 지역변수 a를 출력함
	}
}
