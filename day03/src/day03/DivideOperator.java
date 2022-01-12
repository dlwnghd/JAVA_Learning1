package day03;

public class DivideOperator {
	public static void main(String[] args) {
		System.out.println(7 / 2);	// int / int --> int
		System.out.println(7 / 2.0);	// int / double --> double
		System.out.println(97 / 'a');	// int / char --> int
		System.out.println("String은 나눗셈 불가능\n");
		
		System.out.println(7.0 / 2.0);	// double / double --> double
		System.out.println(97.0 / 'a');	// double / char --> double
		System.out.println("String은 나눗셈 불가능");
		
		System.out.println('b' / 'a');	// char / char --> int
		System.out.println("String은 나눗셈 불가능");
		
//		System.out.println(10 / 0);	// 0으로 나누면 오류 발생
	}
}
