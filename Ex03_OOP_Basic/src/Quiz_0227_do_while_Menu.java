import java.util.Random;
import java.util.Scanner;

public class Quiz_0227_do_while_Menu {
	
	static Scanner sc = new Scanner(System.in);
	static void RestaurantChina() {
		int c = 0;
		System.out.println("�޴��� ������ �ּ���");
		System.out.println("1.¥���   2.«��   3.�ٸ���� ����  4.����");
		//c = Integer.parseInt(sc.nextLine());
		Random r = new Random ();
		c = r.nextInt(3)+1;
		//**Random ���� **
		//c = (int)(Math.random()*3)+1;
		// Math.random ������ 0.0 <= Math.random() < 1.0
		// 0 <= Math.random() * 3 < 3.0
		// 1 <= (Math.random() * 3) + 1 < 4.0
		// 1 <= (int)(Math.random() * 3) + 1 < 4
		// >>1, 2, 3�� ���

		switch (c) {
		case 1:
			System.out.println("¥����� �ֹ��մϴ�.");
			System.out.println("�����մϴ�.");

			break;
		case 2:
			System.out.println("«���� �ֹ��մϴ�.");
			System.out.println("�����մϴ�.");
			break;
		case 3:
			break;
		case 4:
			c = r.nextInt(3)+1;
			
			break;
		default :
			System.out.println("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
			RestaurantChina();
		}
		
	}

	static void RestaurantUS() {
		int u = 0;
		System.out.println("�޴��� ������ �ּ���");
		System.out.println("1.������ũ   2.�Ľ�Ÿ   3.�ٸ���� ����");
		u = Integer.parseInt(sc.nextLine());
		switch (u) {
		case 1:
			System.out.println("������ũ�� �ֹ��մϴ�.");
			System.out.println("�����մϴ�.");
			break;
		case 2:
			System.out.println("�Ľ�Ÿ�� �ֹ��մϴ�.");
			System.out.println("�����մϴ�.");
			break;
		case 3:
			break;
		default :
			System.out.println("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
			RestaurantUS();
		}
	}

	static void RestaurantKorea() {
		int k = 0;
		System.out.println("�޴��� ������ �ּ���");
		System.out.println("1.��ġ�   2.�����   3.�ٸ���� ����");
		k = Integer.parseInt(sc.nextLine());
		switch (k) {
		case 1:
			System.out.println("��ġ��� �ֹ��մϴ�.");
			System.out.println("�����մϴ�.");
			break;
		case 2:
			System.out.println("������� �ֹ��մϴ�.");
			System.out.println("�����մϴ�.");
			break;
		case 3:
			break;
		default :
			System.out.println("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
			RestaurantKorea();
		}
	}

	static int displayMenu(){
		System.out.println("���ϴ� ����� ������ �ּ���");
		System.out.println("1.�߽Ĵ�");
		System.out.println();
		System.out.println("2.��Ĵ�");
		System.out.println();
		System.out.println("3.�ѽĴ�");
		System.out.println();
		System.out.println("4.���α׷� ����");
		System.out.println();	
		
		int menu = 0;
		
		do{
			try{
				menu = Integer.parseInt(sc.nextLine());
				if(menu >=1 && menu <=4) {
					break;
			}else {
				throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("�ٽ��ѹ� �Է��� �ּ���");
		}
		
		
	}while(true);
	
	return menu;
 }
	
	
	public static void main(String[] args) {
		
		while(true){
			switch(displayMenu()){
			case 1: 
				System.out.println("�߽�");
				RestaurantChina();
				break;
			case 2: 
				System.out.println("���");
				RestaurantUS();
				break;
			case 3: 
				System.out.println("�ѽ�");
				RestaurantKorea();
				break;
			case 4: System.out.println("���α׷�����");
			        System.exit(0);
				
			}
		}
	}
}
