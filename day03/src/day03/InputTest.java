package day03;

//java.util 패키지 안에있는 Scanner라는 클래스 사용한다고 컴퓨터에게 알려줌
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		// 전체화면 단축키 ctrl + m
		// System.out.println();	//시스템 클래스 안에 존재함
		// next() 라는 입력메소드가 존재함, Scanner 클래스 안에 만들어져 있다
		
		Scanner sc = new Scanner(System.in);
		// Scanner라는 클래스를 sc라고 부를 것이다.
		// 콘솔창에서 입력, 변수명 sc로 되어있는나 바꾸어도 상관없음
		// String str = "안녕";
		
		System.out.print("이름을 입력해주세요. >> ");	// 출력문
		
		// 사용자가 콘솔창에서 입력한 값을 String(문자열)타입으로 받아옴
		// 입력한 값을 String타입으로 name이라는 변수에 저장함
		// 띄어쓰기 혹은 엔터로 구분하여 String 타입으로 받아온다.
		// String name = sc.next();
		
		// nextLine : 사용자가 입력한 값을 통채로 String타입으로 받아온다.
		// Enter로만 문자를 구분함
		String name = sc.nextLine();
		
		System.out.printf("%s님 환영합니다.",name);	//변수 name에 저장한 값을 %s 위치에 출력함
		
	}
}