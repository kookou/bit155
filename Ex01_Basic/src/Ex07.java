package day02;
/*의도적으로 break를 생략해서
 * 우리가원하는 결과를 쉽게 얻는 switch문을 만들어보자
 * 사용자로부터 월을 입력받아서
 * 해당월의 마지막 날이 몇일인지 보여주는 프로그램
 */

import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해주세요: ");
		int month = scanner.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지 입니다.");
			break;
		case 2:
			System.out.println("28일까지 입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;		
		}
		scanner.close();
	}
}
