package day09;

public class Calc {
	public static int add(int num1, int num2) {	// 메소드명 : add로 int값으로 num1, num2를 받아오면 실행
		return num1 + num2;		// 메소드 사용의 결과를 값으로 되돌려준다
	}
	
	public static void main(String[] args) {
		int num = Calc.add(80, 20);		// int값 num은 Calc클래스에 add메소드를 사용(num1, num2를 받음)
		System.out.println(num);
		System.out.println(Calc.add(20, 50) / 2);
	}
}