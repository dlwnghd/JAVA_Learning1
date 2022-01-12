package day09;

public class Calc {		// Calc라는 메소드 생성
	public static int add(int num1, int num2) {	// 메소드명 : add로 int값으로 num1, num2를 받아오면 실행
		return num1 + num2;		// 메소드 사용의 결과를 값으로 되돌려준다
	}
	
	public static void main(String[] args) {
		int num = Calc.add(80, 20);		// int값 num은 Calc클래스에 add메소드를 사용(80, 20)을 받음 값을 int값 num에 입력
		System.out.println(num);		// num출력
		System.out.println(Calc.add(20, 50) / 2);	// Calc클래스에서 add메소드를 사용(50, 50)을 받고 받은 값을 / 2 하여 출력
	}
}