import java.util.Scanner;

/*
 �ֹι�ȣ �޹�ȣ ù�ڸ� 1,3 ����, 2,4 ����
 main �Լ� scanner ��� �ֹι�ȣ �Է� �ޱ�
 �� 6�ڸ� �� 7�ڸ�
 �Է°� 123456-1234567
 1.�ڸ��� üũ ��� �Լ� 14�ڸ��� ���
 2.�޹�ȣ ù° �ڸ��� 1~4 ������ ���
 3.�޹�ȣ ù° �ڸ����� ������ 1,3 �ϰ�� ���� ��� 2,4 �ϰ�� ���� ���
 3���� �Լ� static
 
 */

public class Study_200313 {
	static Scanner sc = new Scanner(System.in);
	static String num;

	static void NumLengthCheck(String num) {
		while(true){
			if (num.length() == 14) {
				break;
				//System.out.println(num.length());  //<< 14�ڸ� ������ ����Ʈ �� (����� �۵���)
			}else{
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				System.out.println("�ٽ� �Է��� �ּ���");
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
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				System.out.println("�ٽ� �Է��� �ּ���");
				sc.nextLine();
			}
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

	public static void main(String[] args) {

		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		num = sc.nextLine();
		NumLengthCheck(num);

		

	}

}
