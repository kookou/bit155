import java.util.Scanner;

/*
 주민번호 뒷번호 첫자리 1,3 남자, 2,4 여자
 main 함수 scanner 사용 주민번호 입력 받기
 앞 6자리 뒷 7자리
 입력값 123456-1234567
 1.자리수 체크 기능 함수 14자리만 허용
 2.뒷번호 첫째 자리값 1~4 까지만 허용
 3.뒷번호 첫째 자리값을 가지고 1,3 일경우 남자 출력 2,4 일경우 여자 출력
 3개의 함수 static
 
 */

public class Study_200313 {
	static Scanner sc = new Scanner(System.in);
	static String num;

	static void NumLengthCheck(String num) {
		while(true){
			if (num.length() == 14) {
				break;
				//System.out.println(num.length());  //<< 14자리 들어오면 프린트 함 (제대로 작동함)
			}else{
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println("다시 입력해 주세요");
				sc.nextLine();
			}
		}
	}

	static void NumFirstCheck(String num) {
		while (true) {
			if (num.substring(7, 8).equals("1") || num.substring(7, 8).equals("2") || num.substring(7, 8).equals("3")
					|| num.substring(7, 8).equals("4")) {
				break;
			} else {
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println("다시 입력해 주세요");
				sc.nextLine();
			}
		}
	}

	static void NumSexCheck(String num) {
		if (num.substring(7, 8).equals("1") || num.substring(7, 8).equals("3")) {
			System.out.println("남자입니다");
		}
		if (num.substring(7, 8).equals("2") || num.substring(7, 8).equals("4")) {
			System.out.println("여자 입니다");
		}
	}

	public static void main(String[] args) {

		System.out.println("주민번호를 입력하세요");
		num = sc.nextLine();
		NumLengthCheck(num);

		

	}

}
