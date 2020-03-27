
import java.util.Scanner;

public class Study_200313_u {
	static Scanner sc = new Scanner(System.in);
	static String num;

	public static void main(String[] args) {
		while (true) {
			System.out.println("주민번호를 입력하세요");
			num = sc.nextLine();
			NumLengthCheck(num);
		}
	}

	static void NumLengthCheck(String num) {
		if (num.length() == 14) {
			numFirstCheck(num);
			// System.out.println(num.length()); //<< 14자리 들어오면 프린트 함 (제대로 작동함)
		} else {
			System.out.println("잘못 입력 하셨습니다.");
			System.out.println("다시 입력해 주세요");
			sc.nextLine();
		}
	}

	static void numFirstCheck(String num) {
		if (num.substring(7, 8).equals("1") || num.substring(7, 8).equals("2") || num.substring(7, 8).equals("3")
				|| num.substring(7, 8).equals("4")) {
			NumSexCheck(num);
		} else {
			System.out.println("잘못 입력 하셨습니다.");
			System.out.println("다시 입력해 주세요");
			sc.nextLine();
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
}
