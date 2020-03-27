package day02;
/*if문 세번째 - if else if else 구조*/

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int age = 20;
		if(age > 18) {
			System.out.println("성인입니다.");
		}else if(age > 13) {
			System.out.println("청소년입니다.");
		}else if(age > 3) {
			System.out.println("어린이입니다.");
		}else { 
			System.out.println("영아입니다.");
		}
		
		/*사용자로부터 점수를 입력받아서 A,B,C,D,F 를 출력 하는 프로그램을 작성하세요.*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력해주세요:");
		int score = scanner.nextInt();
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}else if(score >= 80 && score <= 89) {
			System.out.println("B");
		}else if(score >= 70 && score <= 79) {
			System.out.println("C");
		}else if(score >= 60&& score <= 69) {
			System.out.println("D");
		}else if(score >= 0&& score <= 59) {
			System.out.println("F");
		}else {
			System.out.println("조건을 잘못 입력하셨습니다.");
		}
		scanner.close();

	
	
	}
	
}

