package day10;

public class ClassTest {
	public static void show(Student s) {	// show라는 메소드에 Student타입의 s값을 받아옴
		System.out.println("---학생정보---");
		System.out.println("이름 : " + s.name);
		System.out.println("국어 : " + s.kor);
		System.out.println("영어 : " + s.eng);
	}
	
	
	public static void main(String[] args) {
		String name = "이주홍";
		// kim : 객체, 인스턴스 혹은 참조변수라고 하기도 함
		// new : 메모리에 할당시켜주는 연산자
		// Student() : 저장될 위치를 알려준다, 생성자
		Student kim = new Student();	// 객체화
		Student park = new Student();	// 객체화
		
		
		// Student타입 kim(객체/인스턴스)에는 name, kor, eng가 있음
		kim.name = "김철수";	// 하위연산자 : kim(객체) 안에있는 name에 "김철수"를 입력
		kim.kor = 90;	//	하위연산자 : kim(객체) 안에있는 kor에 90을 입력
		kim.eng = 80;	//	하위연산자 : kim(객체) 안에있는 eng에 80을 입력
		
		
		park.name = "박영희";	// 하위연산자 : kim(객체) 안에있는 name에 "김철수"를 입력
		park.kor = 100;	//	하위연산자 : kim(객체) 안에있는 kor에 90을 입력
		park.eng = 70;	//	하위연산자 : kim(객체) 안에있는 eng에 80을 입력
		
		System.out.println("[클래스안에 메소드로 출력]");
		kim.introduce();
		park.introduce();
		System.out.println();
		
		ClassTest.show(park);
		ClassTest.show(kim);
		
//		System.out.println("--- 학생정보---");
//		System.out.println("이름 : "+kim.name);	// kim(객체) 안에있는 name 출력
//		System.out.println("국어 : "+kim.kor);		// kim(객체) 안에있는 kor 출력
//		System.out.println("영어 : "+kim.eng);	// kim(객체) 안에있는 eng 출력
//		
//		System.out.println("--- 학생정보---");
//		System.out.println("이름 : "+park.name);	// park(객체) 안에있는 name 출력
//		System.out.println("국어 : "+park.kor);		// park(객체) 안에있는 kor 출력
//		System.out.println("영어 : "+park.eng);		// park(객체) 안에있는 eng 출력
	}
}


class Student{	// 우리만의 자료형(type)을 만들었다
	String name;		// 멤버, 멤버 변수, 인스턴스 변수(인스턴스 마다 달라짐)
	int kor;				// 멤버, 멤버 변수, 인스턴스 변수(인스턴스 마다 달라짐)
	int eng;				// 멤버, 멤버 변수, 인스턴스 변수(인스턴스 마다 달라짐)
	
	public void introduce( ) {	// 멤버, 멤버 함수 == 메소드
		System.out.println("---학생정보출력---");
		System.out.println("이름 : " + this.name);	// this() : 누가 실행했는지 알고 있음
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
	}
}
















