
public class Ex07_Cinema {
	public static void main(String[] args) {
		String[][] seat = new String[3][5];      //3�� 5���� 2���� �迭 ����
		for (int i = 0; i < seat.length; i++) {  //��
			for (int j = 0; j < seat[i].length; j++) { //�� 
				seat[i][j] = "___"; //2���� �迭�� ��� ����ŭ "___" ���ڿ��� �־��ش� 
			}
		}
		seat[2][1] = "ȫ�浿"; // 2�� 1�� ����
		seat[0][0] = "������"; // 0�� 0�� ����

		// �¼����� �����ֱ�
		for (int i = 0; i < seat.length; i++) { //��
			for (int j = 0; j < seat[i].length; j++) { //��
				System.out.printf("[%s]", seat[i][j].equals("___") ? "�ڸ�" : "����"); //2���� �迭�� ���ڿ�("___") �� ���Ͽ� true�� �ڸ� return false�� ���� return
			}
			System.out.println();
		}

		int row, col; // int Type�� ���� ����
		row = 0; //�ʱ�ȭ
		col = 0; //�ʱ�ȭ
		if (seat[row][col].equals("___")) { //2���� �迭 seat �� ���ڿ� ��
			System.out.println("���� �����մϴ�"); //true �� "���� �����մϴ�" ���
		} else {
			System.out.println("�̹� ���� �Ǿ����ϴ�"); //false �� "�̹� ���� �Ǿ����ϴ�" ���
		}

		// �¼��ʱ�ȭ
		for (int i = 0; i < seat.length; i++) { //��
			for (int j = 0; j < seat[i].length; j++) { //��
				seat[i][j] = "___";  //2���� �迭�� ��� ����ŭ "___" ���ڿ��� �־��ش� 
			}
		}
	}

}
