package day02;
/*if�� ����° - if else if else ����*/

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int age = 20;
		if(age > 18) {
			System.out.println("�����Դϴ�.");
		}else if(age > 13) {
			System.out.println("û�ҳ��Դϴ�.");
		}else if(age > 3) {
			System.out.println("����Դϴ�.");
		}else { 
			System.out.println("�����Դϴ�.");
		}
		
		/*����ڷκ��� ������ �Է¹޾Ƽ� A,B,C,D,F �� ��� �ϴ� ���α׷��� �ۼ��ϼ���.*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է����ּ���:");
		int score = scanner.nextInt();
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}else if(score >= 80 && score <= 89) {
			System.out.println("B");
		}else if(score >= 70 && score <= 79) {
			System.out.println("C");
		}else if(score >= 60&& score <= 69) {
			System.out.println("D");
		}else if(score >= 0&& score <= 59) {
			System.out.println("F");
		}else {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}
		scanner.close();

	
	
	}
	
}

