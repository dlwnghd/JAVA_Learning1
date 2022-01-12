package day03;

public class Casting {
	public static void main(String[] args) {
		// 명시적 형변환
		System.out.println("명시적 형변환");
		System.out.println((int)3.14);	// 3.14 --> 3
		System.out.println((double)3);
		System.out.println((char)97);
		
		// String --> int
		// parseInt(), Integer라는 클래스 안에 만들어져 있다
		int num = Integer.parseInt("100");
		
		//String --> double
		// parseDouble(), Double이라는 클래스 안에 만들어져 있다
		double d = Double.parseDouble("3.14");
		
		// 암묵적 형변환
		System.out.println(10 * 1.0);	//암묵적
		System.out.println('a' * 1);	//암묵적
		System.out.println((double)'a');	//명시적
		
		// int --> String		double --> String
		String test = 10 + "";
		
	}
}