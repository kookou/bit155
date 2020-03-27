package day02;

/*조건문 두번째- if else 구조*/
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		int age = 20;
		if (age > 18) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("미성년입니다.");
		}

		/*
		 * 사용자로부터 입력을 받아서 홀수인지 짝수인지 출력하는 프로그램을 작성하세요.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를입력해주세요:");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		scanner.close();
	}
}
