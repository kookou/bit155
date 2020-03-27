import java.util.ArrayList;

/*
 8���� �⺻Ÿ���� �ִ�(��Ÿ��):JAVA API ���� ����
 
 8���� �⺻Ÿ�Կ� ���ؼ� ��ü ���·� ��� �����ϵ��� ����� �� wrapper class��� �Ѵ�
 �⺻Ÿ���� ���δ� ��ü ���·� �ٷ�� ���� �Ҷ��� �ִ�.
 1. �Ű������� ��ü�� �䱸�ɶ�
 2. �⺻�� ���� �ƴ� ��ü�� ���� �Ǿ�� �Ҷ�
 3. ��ü���� �� �� �ʿ��Ҷ�
 4. Ÿ�� ��ȯ�� ó�� 
 
 */
public class Ex08_Wrapper_Class {

	public static void main(String[] args) {
		int i = 100;
		Integer n = new Integer(500); //int �� wrapperclass Ÿ��
		System.out.println("n: "+n); // ��� �ּҰ��� �����°� ������ ovveride �Ǿ ���� ����(toString ó��)
		System.out.println(n.MAX_VALUE);
		System.out.println(n.MIN_VALUE);
		
		
		//Point Ȱ��
		//parameter Ȱ��
		//generic
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		for(int value : li){
			System.out.println(value);
		}
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); //�ּҰ� �� (false)
		System.out.println(i2.equals(i3) ); //���� ���� �� (true)
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4 == i5);
		
		Integer t = new Integer(500);
		intMethod(t);   //t ��� ���� ������ ������ ��
		integerMethod(t); // t ��� ���������� �ּҰ�


	}
	static void integerMethod(Integer i){ //parameter �� ����Ÿ������ ������ �ִ�
		System.out.println("integer param : "+i); //toString() ������ �� ���
		System.out.println(i.MAX_VALUE);

	}
	static void intMethod(int i){
		System.out.println("integer param : "+i);
	}

}
