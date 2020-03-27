/*
 OOPƯ¡
 1. ���
 2. ĸ��ȭ(����ȭ) >> private
 3. ������
 
 1.���ǥ��
 java : child extends Base
 c# : child : Base 
 
 2.���Ư¡
 2.1 ���� ����� �Ұ���
 2.2 ���� ��� (������ ��� ���� �� ���ؼ� �������� Ŭ������ ��� �޴´�)
 2.3 ���� ����� ����(������ ���� :Interface)
 
 3.����� �ǹ�
 3.1 ������ �ǹ� : ���뼺 (����)
 3.2 ���� : �ʱ� ����� ���� ��� (����)
 ���뼺 >> ���� >> ��� (�ð�,�����ڿ�(�и�,�߻�ȭ))
 4. ��Ӱ��迡�� Memory �� ���� ����
    GrandFather > Father > Child
         ����ڰ� ����� ��� Ŭ������ default Object Ŭ���� ���
    class Car{} >> ���������� >> class Car extends Object{}
    Object�� ��� Ŭ������ root (�ֻ���) : ��� Ŭ������ �θ� Ŭ����
    
 */
class Car {
}

class GrandFather {  //GrandFather extends Object ����
	public GrandFather() {
		System.out.println("G");
	}

	public int gmoney = 5000;
	private int pmoney = 10000; //private ��Ӱ��迡�� ��ǹ��ΰ� :���ٺҰ� ���ο��� Ȱ��
}

class Father extends GrandFather {
	public Father() {
		System.out.println("F");
	}

	public int fmoney = 1000;

}

class Child extends Father {
	public Child() {
		System.out.println("C");
	}

	public int cmoney = 500;
}

public class Ex01_Inherit {

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.gmoney); //�Ҿƹ������� ����
		System.out.println(ch.fmoney); //�ƹ������� ����
		System.out.println(ch.cmoney); //������ ����
		Car c = new Car();

	}

}
