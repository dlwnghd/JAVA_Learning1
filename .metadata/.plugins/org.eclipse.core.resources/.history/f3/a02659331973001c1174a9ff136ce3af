package day08;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50 };
		// 해당 배열을 콘솔창에 {10, 20, 30, 40, 50}
		// 으로 출력하기
		System.out.print("{");	// { 출력
		for (int i = 0; i < ar.length; i++) {		// int값 i가 0부터; i가 ar데이터길이 미만동안; i++
			if (i == (ar.length) - 1) {		// i가 ((ar데이터길이)-1)과 동일하면
				System.out.print(ar[i]);	// ar[i] 출력
			} else {		// i가 ar데이터길이와 동일하지 않다면
				System.out.print(ar[i] + ", ");		// "ar[i], "를 출력
			}
		}
		System.out.println("}");		// } 출력

		// 해당 배열에서 짝수 인덱스번호에 해당하는 값들을 모두 100으로 변경하여
		// {100, 20, 100, 40, 100}
		// 출력하기
		for (int i = 0; i < ar.length; i++) {		// int값 i가 0부터; i가 ar데이터길이 미만동안; i++
			if (i % 2 == 0) {		// i % 2가 0이라면
				ar[i] = 100;		// ar[i]는 100
			}
		}

		System.out.print("{");		// { 출력
		for (int i = 0; i < ar.length; i++) {		// int값 i가 0부터; i가 ar데이터길이 미만동안; i++
			if (i == (ar.length) - 1) {		// i가 ((ar데이터길이)-1)과 동일하면
				System.out.print(ar[i]);	// ar[i] 출력
			} else {		// i가 ((ar데이터길이)-1)과 동일하지 않다면
				System.out.print(ar[i] + ", ");		// "ar[i], "를 출력
			}
		}
		System.out.println("}");		// } 출력

		// 사용자가 입력한 정수 5개를 배열에 넣어준 후 출력하기
		// 정수입력 >> 10
		// 정수입력 >> 36
		// 정수입력 >> 98
		// 정수입력 >> 5
		// 정수입력 >> 17
		// {10, 36, 98, 5, 17}
		// 출력하기
		Scanner sc = new Scanner(System.in);		// Scanner 클래스 호출
		int[] numbers = new int[5];		// int 배열을 numbers라는 이름에 새로넣을 공간을 int로 5개 만들어줘라

		for (int i = 0; i < numbers.length; i++) {		// int값 i가 0이고; i가 numbers데이터길이 미만동안; i++
			System.out.print("정수 입력 >>");		// 정수입력 출력
			numbers[i] = sc.nextInt();		// numbers[i]에 사용자 입력값 넣어줌
		}

		System.out.print("{");		// { 출력
		for (int i = 0; i < numbers.length; i++) {		// int값 i가 0부터; i가 numbers데이터길이 미만동안; i++
			if (i == (numbers.length) - 1) {		// i가 ((numbers데이터길이)-1)과 동일하면
				System.out.print(numbers[i]);		// numbers[i]출력
			} else {
				System.out.print(numbers[i] + ", ");		// "numbers[i], "출력
			}
		}
		System.out.println("}");		// } 출력

		// 사용자가 입력한 배열에서 최댓값을 출력하기
		// 최댓값 : 98
		int max = numbers[0];		// int값 max는 numbers배열의 0번째이다.
		for (int i = 1; i < numbers.length; i++) {		// int값 i가 0부터; i가 numbers데이터길이 미만동안; i++
			if (max < numbers[i]) {		// max가 numbers[i]보다 작다면
				max = numbers[i];		// max는 numbers[i]이다.
			}
		}
		System.out.println("최댓값 : " + max);		// 최댓값 출력

//		// 내풀이
//		// 진짜 멍청하다
//		for (int i = 0; i < numbers.length; i++) {
//			if(numbers[0]>=numbers[i]) {
//				System.out.println("최댓값"+numbers[0]);
//			}else if(numbers[1]>=numbers[i]) {
//				System.out.println("최댓값"+numbers[1]);
//			}else if(numbers[2]>=numbers[i]) {
//				System.out.println("최댓값"+numbers[2]);
//			}else if(numbers[3]>=numbers[i]) {
//				System.out.println("최댓값"+numbers[3]);
//			}else {
//				System.out.println("최댓값"+numbers[4]);
//			}
//		}

		// 사용자가 입력한 배열에서 최솟값 출력하기
		// 최솟값 : 5
		int min = numbers[0];		// int값 min은 numbers[0]이다.
		for (int i = 1; i < numbers.length; i++) {		// int값 i가 0부터; i가 numbers데이터길이 미만동안; i++
			if (min > numbers[i]) {		// min가 numbers[i]보다 크다면
				min = numbers[i];		// min는 numbers[i]이다.
			}
		}
		System.out.println("최솟값 : " + min);		// 최댓값 출력

		// 사용자에게 국어, 수학, 영어 점수를 입력 받아서
		// 평균 출력하기(배열 사용)
		int[] scores = new int[3];		// int 배열을 scores라는 이름에 새로넣을 공간을 int로 3개 만들어줘라
		String[] subjects = {"국어","수학","영어"};		// String배열을 subject라는 이름으로 {"국어"," 수학", "영어"}를 넣어줘라
		
		for (int i = 0; i < scores.length; i++) {		// int값 i가 0부터; i가 scores데이터길이 미만동안; i++
			System.out.print(subjects[i] + "점수 >> ");		// 사용자로부터 점수 입력 받기
			scores[i] = sc.nextInt();		// 사용자의 입력값 데이터를 scores[i]에 대입
		}
		
		int total = 0;		//int값 total은 0
		for (int i = 0; i < scores.length; i++) {			// int값 i가 0부터; i가 scores데이터길이 미만동안; i++
			total += scores[i];		// total = total + scores[i]
		}
		System.out.println("평균 : " + total / subjects.length);		// 평균 출력

		// 내가 낸 문제
		// 사용자에게 과목명을 입력 받고
		// 사용자에게 각 과목별 점수를 입력 받아서
		// 평균 출력하기(배열 사용)
		int count = 0;		// int값 count는 0
				
		System.out.println("입력할 과목 수 >> ");		// 사용자로부터 입력할 과목 수를 입력 받음
		count = sc.nextInt();		// count에 사용자가 입력한 데이터 입력
		
		String[] subject = new String[count];		// String 배열을 subject라는 이름에 새로넣을 공간을 String으로 count개 만들어줘라
		int[] score = new int[count];		// int 배열을 score라는 이름에 새로넣을 공간을 int으로 count개 만들어줘라
		
		for (int i = 0; i < count; i++) {		//  int값 i가 0부터; i가 count 미만동안; i++
			System.out.print("과목명 입력 >>");		// 사용자로부터 과목명 입력 유도
			subject[i] = sc.next();		// 사용자의 입력값을 subject[i]에 입력
		}
		
		for (int i = 0; i < score.length; i++) {		//  int값 i가 0부터; i가 count 미만동안; i++
			System.out.print(subject[i] + "점수 >> ");// 사용자로부터 과목별 점수 입력 유도
			score[i] = sc.nextInt();// 사용자의 입력값을 score[i]에 입력
		}
		
		int Total = 0;		// int값 Total은 0
		for (int i = 0; i < score.length; i++) {		//  int값 i가 0부터; i가 score데이터길이 미만동안; i++
			Total += score[i];		// Total = Total + score[i]
		}
		System.out.println("평균 : " + Total / subject.length);		// 평균 출력
	}
}