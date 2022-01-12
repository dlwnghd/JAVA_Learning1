package day06;

public class IncrementalOPerator {
	public static void main(String[] args) {
		// 전위형과 후위형의 차이 : 우선순위
		int num = 10;
//		++num; // num = num + 1;
//		System.out.println(++num);	// 출력전에 계산이 진행됨 --> 전위형, 출력
		System.out.println(num++);	// 출력후에 계산이 진행됨 --> 출력, 후위형
		System.out.println(num);
		
		int a = 10;
		int b = a++;		// a = a + 1이 진행 되었기 때문에 a는 11이다.
		System.out.println(a);
		System.out.println(b);		
	}

}
