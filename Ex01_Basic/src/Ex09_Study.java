
public class Ex09_Study {
	public static void main(String[] args){
		int num = 0;
		for(int i = 1; i <= 100; i ++){
			num+=i;
		}
		/*
		 -> num �� 0 �̴�
		 -> i�� 1�̴�
		 -> i�� 100 ���� �۰ų� ������������ (<=)
		 -> i��  1�� ���Ѵ� (++)
		 num = num + i
		 num =  0 + 1 = 1
		 num =  1 + 2 = 3
		 num =  3 + 3 = 6
		 num =  6 + 4 = 10
		 num = 10 + 5 = 15
		 .
		 .
		 .
		 .
		 */
		 
		System.out.println(num);
		
		
		//1~10 ������ Ȧ���� ���� ���ϼ���
		
		int num2 = 0;
		for(int i = 1; i <=10; i = i+2){
			num2 = num2+i;
		}
		System.out.println(num2);
				
		/*
		 -> num2 �� 0 �̴�
		 -> i�� 1�̴�
		 -> i�� 10 ���� �۰ų� ������������ (<=)
		 -> i��  2�� ���Ѵ� (i+2)
		 num2 = num2 + i
		 num2 =  0 + 1 = 1
		 num2 =  1 + 3(1+2) = 4
		 num2 =  4 + 5(3+2) = 9
		 num2 =  9 + 7(5+2) = 16
		 num2 = 16 + 9(7+2) = 25
		 9+2�� 11 �� 10 ���� ũ�� ������ if�� ����		 
		 */
		
		
		//1~100���� ¦���� ���� ���ϼ���
		
		int num3 = 0;
		for(int i = 1; i <=100; i++){
			if(i % 2 == 0) {
				num3 = num3 + i;
			}
			
			/*
			 -> num3 �� 0 �̴�
			 -> i�� 1�̴�
			 -> i�� 100 ���� �۰ų� ������������ (<=)
			 -> i��  1�� ���Ѵ� (++)
			 -> ��� (if) i�� 2�� �������� 0�� ���ö��� (�����Ѵ� num3 + i)
			 num3 = num3 + i
			 num3 =  0 + 2 = 2
			 num3 =  2 + 4 = 6
			 num2 =  6 + 6 = 12
			 num3 = 12 + 8 = 20
			 num3 = 20 + 10 = 30
			 num3 = 30 + 12 = 42
			 .
			 .
			 .
			 .
			 */
			
		}System.out.println(num3);
	}

}
