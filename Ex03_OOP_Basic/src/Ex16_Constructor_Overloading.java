/*
 ������ �Լ� (Constructor)
 1. �Լ�(Ư���� ����)
 2. Ư���� ���� (member field �ʱ�ȭ)
 
 Tip) static {}, {]
 3. �Ϲ��Լ��� �ٸ���
 3.1 �Լ��� �̸��� ���� (class �̸� ����)
 3.2 ������� ������ return Type (x) >> void (x) >> ���(��) default void ����
 3.3 ������� : ��ü����(new) �ǰ� ������ ����� [�ڵ�] ���� [ȣ��Ǵ� �Լ�] >> ������ �Լ�
 
 4 ���� : �����Ǵ� ��ü���� ���������� �ٸ� member field ���� (�ʱⰪ��)�ο��ϴ� ���
 class Car {String color;}
 >> Car c = new Car(); �̻���� ���� ���鶧 ������ ������ ������ ������ ���ٴµ�
 
 5. ������ �Լ� >> overloading ����
 
 ����� ���� overloading �� ������ �Լ��� �ϳ��� �����ߴٸ�
 default ������ �Լ��� �ݵ�� ������ ���ؼ��� �����ȴ�

 */
//�������� �ǵ� : �ڵ��������鶩 �ݵ�� �ڵ��� �̸��� �־��
class Car7 {
	String carname;
	// �����Ǿ� �־����
	// ���� �ڵ����� ������ �����Ϸ��� �ڵ����� �ڵ带 ������
	// Car(){

	// }

}

class Car8 {
	String carname;

	Car8() { // void ����
		System.out.println("���� defualt ������ �Դϴ�(�ڵ�ȣ��)");
		carname = "����"; // ������ member field �� �ʱⰪ..

	}
}

class Car9 {
	int door;
	int wheel;

	Car9() {
		System.out.println("default");
	}

	// method overloading (�Լ�)
	// �����ε�
	Car9(int num) {
		door = num;
		System.out.println("overloading door : " + door);
	}

	Car9(int num, int num2) {
		door = num;
		wheel = num2;
		System.out.println("overloading door : " + door + " / " + "wheel : "+ wheel);
	}
}


class Car {
	
	
	
}
public class Ex16_Constructor_Overloading {

	public static void main(String[] args) {
		// Car c1 = new Car();

		//Car2 c2 = new Car2(); // ���������� Car2() ������ �Լ��� ȣ��...
		//System.out.println(c2.carname);
		
		//��Ģ�����δ� ��ü�� �����Ҷ� ������ �Լ��� 1���� ȣ���� �� �ִ�
		//Car4 c4 = new Car4();
		//Car4 c4 = new Car4(100);
		//Car4 c4 = new Car4(10,20);
		
		//**�ڵ��� �ֹ� ����**
		//Case
		//Case �⺻�ڵ���
		//Case1 �ڵ����� ����
		//Case2 �ڵ����� ����, ����
		//Case3 �ڵ����� ����, ����, �׺�����
		
		//������ overloading Ȱ�� (������)
		
		
		
		
		
	}

}
