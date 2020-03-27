import java.util.Scanner;


//���� ���� �޴���?..



public class Ex11_do_while_Menu {
	// ��� ���� �Ϲ������� ����(instance)�� ����� (����, ����, ��ǰ,(����:Ŭ����))
	static Scanner sc = new Scanner(System.in); // ��ǰ (����:Ŭ����)

	// ���
	static void inputRecord() {
		System.out.println("���� ������ �Է� : ");
	}

	static void deleteRecord() {
		System.out.println("���������� ���� : ");
	}

	static void sortRecord() {
		System.out.println("���������� ���� : ");
	}

	static int displayMenu(){
		System.out.println("****************");
		System.out.println("*****��������*****");
		System.out.println("1.�л����� �Է��ϱ�");
		System.out.println();
		System.out.println("2.�л����� �����ϱ�");
		System.out.println();
		System.out.println("3.�л����� �̸��� �����ϱ�");
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
					//1���� �۰ų� 4���� ū ��.. ���α׷��� ���� (x)
					//���� ������ ���ڴ�(������� ����)
					//System.out.println("�߸��Է� �ϼ̽��ϴ�.");
					throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
				}
			}catch (Exception e){
				System.out.println(e.getMessage());
				System.out.println("�޴����� ���� �߻�");
				System.out.println("�޴� 1~4������ �Է�");
			
			}
			
		}while(true);
		//���� : ����ڰ� 1~4���� ��ȣ�߿��� �ϳ��� ����
		
		return menu;
		
	}

	public static void main(String[] args) {
		
		//Ex11_do_while_Menu ex11 = new Ex11_do_while_Menu();
		
		while(true){
			switch(Ex11_do_while_Menu.displayMenu()){
			case 1: inputRecord();
				break;
			case 2: deleteRecord();
				break;
			case 3: sortRecord();
				break;
			case 4: System.out.println("���α׷�����");
			        //return;  //main �Լ� ���� 
			        System.exit(0); //���α׷� �������� (kill)
				
			}
		}
	}

}
