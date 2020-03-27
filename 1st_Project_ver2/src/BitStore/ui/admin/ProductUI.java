package BitStore.ui.admin;

import java.util.Scanner;

import BitStore.ui.LoginUI;
import BitStore.util.Product;

public class ProductUI {
	private Scanner sc;
	private Product product;
	
	public ProductUI() {
		sc = new Scanner(System.in);
		product = new Product();
	}

	// �������� ���
	public void admin() {
		while (true) {
			switch (adminMenu()) {
			case 1: product.insertProduct(); //��ǰ���� �Է�
				break;
			case 2: product.selectProduct(); //��ǰ��� ��ȸ
				break;
			case 3: // ��ǰ���� ����, ProductŬ������ updateProduct(Product) : boolean ȣ��
				break;
			case 4: // ��ǰ���� ����, ProductŬ������ deleteProduct(int) : boolean ȣ��
				break;
			case 5: // ����ǰ ���, DiscardProductŬ������ insertDiscardProduct(DiscardProduct) : void ȣ��
				break;
			case 6: // ����ǰ ��ȸ, DiscardProductŬ������ selectDiscardProduct(DiscardProduct) : Map<Integer, DiscardProduct> ȣ��
				break;
			case 7: // ���ư���
				LoginUI loginUI = new LoginUI();
				loginUI.admin();
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

	private int adminMenu() {
		System.out.println("-----------------");
		System.out.println("1. ��ǰ���� �Է�");
		System.out.println("2. ��ǰ��� ��ȸ");
		System.out.println("3. ��ǰ���� ����");
		System.out.println("4. ��ǰ���� ����");
		System.out.println("5. ����ǰ ���");
		System.out.println("6. ����ǰ ���");
		System.out.println("7. ���ư���");
		System.out.println("0. ����");
		System.out.println("-----------------");
		System.out.print("�޴� �� ó���� �׸��� �����ϼ��� : ");
		return Integer.parseInt(sc.nextLine());
	}
}
