package BitStore.ui.user;

import java.util.Scanner;

public class BitStoreUI {
	private Scanner sc = new Scanner(System.in);

	public void user() {
		while (true) {
			switch (menu()) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				quit();
			default:
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

	private void quit() {
		System.out.println("�ȳ��� ������^^!");
		System.exit(0);
	}

	private int menu() {
		System.out.println("-----------------");
		System.out.println("1. ��ǰ����");
		System.out.println("2. �α���");
		System.out.println("3. ���̵� ã��");
		System.out.println("4. ��й�ȣ ã��");
		System.out.println("0. ����");
		System.out.println("-----------------");
		System.out.print("�޴� �� ó���� �׸��� �����ϼ��� : ");
		return Integer.parseInt(sc.nextLine());
	}
}
