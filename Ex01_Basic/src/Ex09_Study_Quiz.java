import java.util.Scanner;

public class Ex09_Study_Quiz {
/*���ǹ�
1. ���﷣�� �������� � �����ϴ�. ������ ����� 5�� �̸��� ����, 5 - 11�� ���� 2500��
12 ���ʹ� 5000�� �Դϴ�.
 ȭ�鿡�� ���̸� �Է� �޾� ����� ����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 ��¿���>
 ���̸� �Է��ϼ��� : 3
 ������ �����Դϴ�.
 ���̸� �Է��ϼ��� : 7
 ������ 2500�� �Դϴ�.
 ���̸� �Է��ϼ��� : 22
 ������ 5000�� �Դϴ�.
*/
/*	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int age = Integer.parseInt(s.nextLine());	
		
		if(age < 0){			
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}else if(age < 5){		 
			System.out.println("�����Դϴ�.");				
		}else if (age <=11){
			System.out.println("2,500�� �Դϴ�.");
		}else {
			System.out.println("5,000�� �Դϴ�.");
		}
		
	}

*/

/*
7. ���� ���迡�� ������ �ֽ��ϴ�. ����, ������ ������ �Ǵ� ������ 60���̶�� 1 - 100��
���� ���� ���ڸ� �����Ͽ� ������ ������ �հ����� ���հ����� �Ǵ��ϴ� ���α׷��� �ۼ�
�Ͻÿ�
��¿���>
96 ���� �հ��Դϴ�.
8���� ���հ��Դϴ�.

*/
/*
	public static void main(String[] args) {
		int dScore = (int)((Math.random() * 100));
		String f = "";
		
		if(dScore >= 60){
			System.out.println(dScore+"�հ��Դϴ�");
		}else {
			System.out.println(dScore+"���հ� �Դϴ�");
		}
	}
*/
	
/*
3. ȭ�鿡�� 3���� ���ڸ� �Է� �޾� �ִ밪�� �ּҰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 ��¿���>
 ù��° ���ڸ� �Է��ϼ��� : 7
 �ι�° ���ڸ� �Է��ϼ��� : 3
 ����° ���ڸ� �Է��ϼ��� : 10
 �ִ밪 : 10, �ּҰ� : 3
 */	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String m = "";
		int numf = 0;
		int nums = 0;
		int numt = 0;
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		numf = Integer.parseInt(s.nextLine());
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		nums = Integer.parseInt(s.nextLine());
		
		System.out.println("����° ���ڸ� �Է��ϼ���");
		numt = Integer.parseInt(s.nextLine());
		
		if(numf < nums){
			if(numf < numt){
				
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	

}


