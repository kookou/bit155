package day02;

/*���ǹ� �ι�°- if else ����*/
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		int age = 20;
		if (age > 18) {
			System.out.println("Ȧ���Դϴ�.");
		} else {
			System.out.println("�̼����Դϴ�.");
		}

		/*
		 * ����ڷκ��� �Է��� �޾Ƽ� Ȧ������ ¦������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ��Է����ּ���:");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		scanner.close();
	}
}
