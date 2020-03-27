import java.util.Scanner;
public class Ex07_Cinema {
	Scanner sc = new Scanner(System.in);    //��������� �Է¹ޱ����� Scanner class ����
	String[][] seat = new String[3][5];     //3��5���� String �迭 ����
	public void menu() {                    
		//�¼� �����
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "___";
			}
		}
		while(true) {
			System.out.println("*************");
			System.out.println("1. �¼� ���� ����");
			System.out.println("2. �� ��     �� ��");
			System.out.println("3. �� ��     �� ��");
			System.out.println("4. �� ��     �� ��");
			System.out.println("0. ��            ��");
			System.out.println("*************");
			System.out.print("������ �޴���ȣ�� �Է��ϼ���: ");
			int menuNum = Integer.parseInt(sc.nextLine());
			switch(menuNum) {
				case 1: seatInfo(); break; //�¼� ��������
				case 2: selectSeat(); break; //�¼� ����
				case 3: updateSeat(); break; //�¼� ����
				case 4: deleteSeat(); break; //�¼� ���
				case 0: System.exit(0); break;
				default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	public void updateSeat() {
		int row, col;
		outer:
			while(true) {
				System.out.print("������ ������ ������ �Է��ϼ���: ");
				String name = sc.nextLine();
				System.out.print("������ �¼� ��ġ�� �Է��ϼ���(ex:2,1): ");
				String inputSeat = sc.nextLine();
				String[] seatArr = inputSeat.trim().replace(" ", "").split(",");
				row = Integer.parseInt(seatArr[0]);
				col = Integer.parseInt(seatArr[1]);
				if (!seat[row][col].equals("___")) {
					System.out.println("�̹� ����� �ڸ��Դϴ�");
				} else {
					for (int i = 0; i < seat.length; i++) {
						for (int j = 0; j < seat[i].length; j++) {
							if(seat[i][j].equals(name)) {
								seat[i][j] = "___";
								seat[row][col] = name;
								System.out.println(name + "���� �����Ͻ� �¼��� �����Ǿ����ϴ�.");
								break outer;
							}
						}
					}
				}
				System.out.println("�Է��Ͻ� �̸����� ����� �¼��� �����ϴ�.");
			}
		//�¼� ���� �����ֱ�
		seatInfo();
	}
	public void deleteSeat() {
		outer:
		while(true) {
			System.out.print("����� ������ ������ �Է��ϼ���: ");
			String name = sc.nextLine();
			for (int i = 0; i < seat.length; i++) {
				for (int j = 0; j < seat[i].length; j++) {
					if(seat[i][j].equals(name)) {
						seat[i][j] = "___";
						System.out.println(name + "���� �����Ͻ� �¼��� ��ҵǾ����ϴ�.");
						break outer;
					}
				}
			}
			System.out.println("�Է��Ͻ� �̸����� ����� �¼��� �����ϴ�.");
		}
		//�¼� ���� �����ֱ�
		seatInfo();
	}
	public void selectSeat() {
		int row, col;
		String name;
		System.out.print("������ ������ �Է��ϼ���: ");
		name = sc.nextLine();
		do {
			try {
				System.out.print("������ �¼� ��ġ�� �Է��ϼ���(ex:2,1): ");
				String inputSeat = sc.nextLine();
				String[] seatArr = inputSeat.trim().replace(" ", "").split(",");
				row = Integer.parseInt(seatArr[0]);
				col = Integer.parseInt(seatArr[1]);
				if(row > 2 || col > 4) {
					throw new Exception("�¼��� �߸� �Է��ϼ̽��ϴ�.");
				} else {
					break;
				}
			} catch (Exception e) {
				e.getMessage();
				System.out.println("(0,0)���� (2,4)���� �ڸ������� �����մϴ�.");
			}
		} while(true);
		if (seat[row][col].equals("___")) {
			//���� ��ġ�� ����
			seat[row][col] = name;
			System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�̹� ����� �ڸ��Դϴ�");
		}
		//�¼� ���� �����ֱ�
		seatInfo();
	}
	public void seatInfo() {
		//�¼� ���� �����ֱ�
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j].equals("___") ? "�ڸ�" : "����");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Ex07_Cinema cinema = new Ex07_Cinema();
		cinema.menu();
	}
}