
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// ���а� �л����� �⸻��� ��������
		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };
		int max = score[0]; // max =79
		int min = score[0]; // min = 79
		/*
		 * ����� ����ؼ� max ��� ������ �������� �ִ밪��, min ������ �ּҰ��� �������� ��µǴ� ����� : max = 97
		 * , min = 54 �� for���� �ѹ��� ����ϼ���
		 */

		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
			
			/*
			 max = (score[i]) > max) ? score[i]:max;   //?������ > ?���� ������ true ��� > �޹��� ����
			 min = (score[i]) < min) ? score[i]:min;
			 */
		}
		System.out.println("�ִ밪" + max + "�ּҰ�" + min);
		
		int[] number = new int[10];
		//10�� ���� ���� 1~10���� ������ �ʱ�ȭ �ϼ���
		//number[0] >> 1 ..... number[9] >>10
		for(int i =0; i<number.length;i++){
			number[i] = i+1;
			System.out.println(number[i]);
		}
		//��� �л��� �⸻��� �������� (5����)
		int sum = 0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		/*
		 1.�� �����
		 2.������ ��
		 3.������ ���
		 ��)2,3�� ������ �ϳ��� for ������ �ذ�
		 */
		
		System.out.println(jumsu.length);
		
		
		for(int i = 0; i < jumsu.length; i++){
			sum += jumsu[i];
			//average = sum/(float)jumsu.length;
			//��������� ����� ���ϸ� �ɱ�
			if(i == jumsu.length-1){
				average = sum/(float)jumsu.length;
			}
		}
		System.out.println("��: " + sum + "���:" + average);
		
		
		
		
		
		

	}

}
