package day02;
/*����ڷκ��ͳ���, ����, ��ü����� �Է¹޾Ƽ�
 * ����,����,������ ����ϴ� ���α׷��� ������
 */
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̸� �Է����ּ���: ");
		int age = scanner.nextInt();
		if(age >= 18) {
			/*������ �Է¹޴´�.*/
			System.out.println("������ �Է����ּ���.(���ڴ�1 ���ڴ�2)");
			int sex = scanner.nextInt();
			if(sex == 1) {
				/*��ü����� �Է¹޴´�*/
				System.out.println("��ü ����� �Է����ּ���: ");
				int category = scanner.nextInt();
				if(category <= 3) {
					System.out.println("�����Դϴ�.");
				}else if(category == 4) {
					System.out.println("�����Դϴ�.");
				}else {
					System.out.println("�����Դϴ�.");
				}
		}else {
			System.out.println("���� �ǹ������ �ƴմϴ�.");
		}
			
		scanner.close();
	}
  }
}