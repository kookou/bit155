import java.util.Arrays;

//�迭 (Array) ��ü��
//1. �迭�� ��ü�� (new ���ؼ� ����)
//2. new heap �޸𸮿� �����ȴ�
//3. ���� �迭 (���� �迭) : �迭�� ũ��� �ѹ� �������� �����ȴ�.
//4. �ڷ� ������ �⺻
public class Ex01_Array_Basic {

	public static void main(String[] args) {
		int s, s1, s2, s3;
		int[] score = new int[3]; // ���� 2�� // ���ȣ (÷��,index)
		System.out.println(score[0]);
		score[0] = 101; // ������ �濡 (index)
		score[1] = 20;
		score[2] = 300;
		System.out.println(score[0]);
		
		//���� ������ �׻� index ������ 1ũ��.. (n-1 �Ѱ��� ������ index)
		//score[3] = 40;  //������ ���� index >> 2
		//java.lang.ArrayIndexOutOfBoundsException
		//���ܰ� �߻��߾��(������ ������)
		//�׷��� �����Ϸ��� ������ ���α׷��� ����
		//������ �߻��������� �ϴ� ���� ��ų�� �ִ� �溡�� �ִ�
		//(try ~catch) ������ �ذ��ϴ� ���� �ƴϰ�  ���α׷��� ���� ���� �Ǵ� ���� ���´�.
		
		
		//Array �迭 (���� : ��� : for)
		for(int i = 0; i < 3; i++){
			System.out.printf("[%d] = %d\t",i,score[i]);
		}
		System.out.println();
		
		for(int i = 0; i < score.length; i++){
			System.out.printf("[%d] = %d\t",i,score[i]);
		}
		System.out.println();
		
		//Tip Array �����ִ� Ŭ���� 
		String result = Arrays.toString(score); //����  ����������
		System.out.println(result);
		
		Arrays.sort(score);
		result = Arrays.toString(score); //����  ����������
		System.out.println(result);
		
		
		//�Ի���� �迭�� ���� ���� ���� ���� ���� 
		//Today Point
		//�迭3����
		//���� ��ħ�� ���� �ʰԿ��� ���� ĥ�ǿ� ���� ����
		int[]arr = new int[5]; //�⺻(���ǰ���)
		int[]arr2 = new int[]{100,200,300}; //�ʱⰪ�� ���ؼ� ���� ��������� �ʱ�ȭ
		int[]arr3 = {11,22,33,44,55}; //�����Ϸ��� �˾Ƽ� new �� �ڵ�����
		//javascript : (var)let cararr = [1,2,3,4,5];
		
		for(int i = 0; i <arr3.length; i++){
			System.out.println(arr3[i]);
		}
		
		//�迭�� ��ü�� (new memory >> heap) :����� �Ҵ��� �и��� �� �ִ�.
		int[] arr4;
		arr4 = new int[]{21,22,23,24,25};
		System.out.println(arr4);
		//�迭�� �Ҵ��� (�ּҰ� �Ҵ�)
		int[] arr5 = arr4;
		//����
		System.out.println(arr5 == arr4);
		
		//Car c = new Car();
		//Car c2 = c;
		
		String[] strarr = new String[] {"��","��","�ٶ�"};
		char[] ch = new char[10]; //���� '\u0000'
		for(int i = 0; i <ch.length; i++){
			System.out.println(">"+ch[i]+"<");
		}
		
		//8���� �⺻Ÿ�� +String > Array Ÿ�԰���
		//*****Ŭ���� Ÿ��(��������� Ÿ��) > Array Ÿ�� ����*****
		//Car c = new Car();
		//Car c2 = new Car();
		
		//Car[] cars = new Car[10];
		
		
		
		
		
		
		
		
		

		
	}

}
