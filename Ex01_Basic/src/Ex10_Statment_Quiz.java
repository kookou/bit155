import java.util.Scanner;

public class Ex10_Statment_Quiz {
	public static void main(String[] args) {
		
		/*
		 1������ ���ĺ� A~Z���� ����ϱ� (for�� �̿�)
		 */
		for(int i = 'A' ; i <= 'Z'; i++){
			System.out.println((char) i );			
		}		
		
		/*
		 2������  1~100���� 10�� 10��������ϴ� ���α׷��� �ۼ� (for�� �̿�)
		 */
		
		for(int i = 1; i<=100; i++){
			System.out.print(i+" ");
			if(i % 10 == 0){
			System.out.println();
			}
		}
		
		/*
		 �������� 1������
		 1���� 20 ������ ���� �߿� 2�Ǵ� 3�� ����� �ƴ� ���� ����
		 */
		int num = 0;
		for(int j = 1; j<=20; j++){
			if(j%2 !=0 && j%3!=0){
				num+=j;
			}
		}System.out.println(num);
		
		/*
		 2������
		 �ֻ��� �ΰ��� �������� ���� ���� 6�̵Ǵ� ����� ���� ���ϱ�
		 */
		for(int j = 1; j<=6; j++){
			for(int i = 1; i<=6; i++){
				if(j+i == 6){
				System.out.printf("[%d]*[%d]=[%d]\t",j,i,i+j);	
				}
			}
		}
		System.out.println();
		/*
		 3������
		 ����, ����, ������ (����� ���� )
		 ��ǻ�Ͱ� �ڵ����� ���� ���������� �� ����ڰ� ���� �Է��� ó��
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = (int)((Math.random() * 10)+1)*100;
		System.out.println("��ȣ�� �Է��� �ּ��� (1.���� 2.���� 3.��)");
		num1 = sc.nextInt();
		

		
	}

}
