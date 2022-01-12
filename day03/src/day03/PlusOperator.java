package day03;

public class PlusOperator {
	public static void main(String[] args) {
		System.out.println("[연산자(operator)]");
		System.out.println("--- int + ? ---");
		System.out.println(10 + 10);	// int + int --> int
		System.out.println(10 + 3.0);	// int + double--> double
		System.out.println(10 + 'b');	// int + char --> int 
		// ↑(아스키코드표를 통해 char를 10진수로 바꾸어 계산)
		System.out.println(10 + "이주홍");	// int + String --> String, 연결
		
		System.out.println("");
		System.out.println("--- double + ? ---");
		System.out.println(10.5+2);	// double + int --> double
		System.out.println(10.5+0.5);	// double + double --> double
		System.out.println(10.5+'a');	// double + char --> double
		System.out.println(10.5+"이주홍");	// double + String --> String, 연결
		
		System.out.println("");
		System.out.println("--- char + ? ---");
		System.out.println('a'+2);	// char + int --> int
		System.out.println('a'+0.5);	// char + double --> double
		System.out.println('a'+'a');	// char + char --> int
		System.out.println('a'+"이주홍");	// char + String --> String, 연결
		
		System.out.println("");
		System.out.println("--- String + ? ---");
		System.out.println("이주홍"+2);	// String + int --> String, 연결
		System.out.println("이주홍"+0.5);	// String + double --> String, 연결
		System.out.println("이주홍"+'a');	// String + char --> String, 연결
		System.out.println("이주홍"+"이주홍");	// String + String --> String, 연결
		
		System.out.println("");
		System.out.println("+연산자가 여러개 사용되었을 경우");	//순서대로 연산이 됨
		System.out.println(10 + "20" + 90 + 'a');	// String 102090a
		
		System.out.println(10 + 'a' + "" + "A");	// ★★★★★String 107A
		
		String day = "10";
		System.out.println(10 + day + 1);	// String 10101
	}

}