package day03;

public class MinusOperator {
	
	public static void main(String[] args) {
		System.out.println("[연산자(operator)]");
		System.out.println("--- int - ? ---");
		System.out.println(10 - 5);	// int - int --> int
		System.out.println(10 - 3.0);	// int - double--> double
		System.out.println(10 - 'b');	// int - char --> int 
		// ↑(아스키코드표를 통해 char를 10진수로 바꾸어 계산)
//		System.out.println(10 - "이주홍");	// String은 뺄셈 불가능, 오류발생
		
		System.out.println("");
		System.out.println("--- double - ? ---");
		System.out.println(10.5-2);	// double - int --> double
		System.out.println(10.5-0.5);	// double - double --> double
		System.out.println(10.5-'a');	// double - char --> double
//		System.out.println(10.5-"이주홍");	// String은 뺄셈 불가능, 오류발생
		
		System.out.println("");
		System.out.println("--- char - ? ---");
		System.out.println('a'-2);	// char - int --> int
		System.out.println('a'-0.5);	// char - double --> double
		System.out.println('a'-'a');	// char - char --> int
//		System.out.println('a'-"이주홍");	// String은 뺄셈 불가능, 오류발생
		
		System.out.println("");
		System.out.println("--- String - ? ---");
		System.out.println("전체 불가능");
//		System.out.println("이주홍"-2);	// String은 뺄셈 불가능, 오류발생
//		System.out.println("이주홍"-0.5);		// String은 뺄셈 불가능, 오류발생
//		System.out.println("이주홍"-'a');	// String은 뺄셈 불가능, 오류발생
//		System.out.println("이주홍"-"이주홍");	// String은 뺄셈 불가능, 오류발생
		
		System.out.println("");
	}
}