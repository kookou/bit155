package day02;
/*���� ����
 * ����ڷκ��� ������ �Է¹�����
 * �ش翬���� �������� ������� ����ϴ� ���α׷�
 * ������ ���� : 
 * 1.400 ���� ������������ ������ ����
 * 2.4�� ��������������100���� �ȳ��� �������� ����
 * 
 */
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("�⵵�� �Է����ּ���: ");
	int year = scanner.nextInt();
	//400���� ���� �������°�?
	if (year % 400 == 0 ||(year % 100 != 0 && year % 4 == 0)) {
		System.out.println("�����Դϴ�.");
	}else {
		   System.out.println("����Դϴ�.");
	}
	scanner.close();
  }

}
