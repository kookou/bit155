import java.util.Random;
import java.util.Scanner;
public class Quiz_0227_do_while_Menu_02 {
	static Scanner sc = new Scanner(System.in);
	static Random ran = new Random ();
	static void RestaurantChina() {
		int c = 0;
		System.out.println("�޴��� ������ �ּ���");
		System.out.println("1.¥���   2.«��   3.����  4.�ٸ���� ����");
		c = Integer.parseInt(sc.nextLine());
		test(c);
	}
	static public void test(int c) {
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
			c = ran.nextInt(3)+1;
			test(c);
			break;
		case 4:
			
			break;
		default :
			System.out.println("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
			RestaurantChina();
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
			case 4: System.out.println("���α׷�����");
			        System.exit(0);
			}
		}
	}
}