
import java.util.Scanner;

public class Study_200313_u {
	static Scanner sc = new Scanner(System.in);
	static String num;

	public static void main(String[] args) {
		while (true) {
			System.out.println("�ֹι�ȣ�� �Է��ϼ���");
			num = sc.nextLine();
			NumLengthCheck(num);
		}
	}

	static void NumLengthCheck(String num) {
		if (num.length() == 14) {
			numFirstCheck(num);
			// System.out.println(num.length()); //<< 14�ڸ� ������ ����Ʈ �� (����� �۵���)
		} else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			System.out.println("�ٽ� �Է��� �ּ���");
			sc.nextLine();
		}
	}

	static void numFirstCheck(String num) {
		if (num.substring(7, 8).equals("1") || num.substring(7, 8).equals("2") || num.substring(7, 8).equals("3")
				|| num.substring(7, 8).equals("4")) {
			NumSexCheck(num);
		} else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			System.out.println("�ٽ� �Է��� �ּ���");
			sc.nextLine();
		}
	}

	static void NumSexCheck(String num) {
		if (num.substring(7, 8).equals("1") || num.substring(7, 8).equals("3")) {
			System.out.println("�����Դϴ�");
		}
		if (num.substring(7, 8).equals("2") || num.substring(7, 8).equals("4")) {
			System.out.println("���� �Դϴ�");
		}
	}
}
