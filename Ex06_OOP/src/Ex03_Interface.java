/*
 �߻� Ŭ���� : �������̽�  (ǥ��, ���, ��Ģ, �Ծ� ����� ����) ���� ������ ����
 �߻�Ŭ������ �������̽��� ������
 1.������ ��ü���� �Ұ��� (new ������ ��� �Ұ���)
 �߻�Ŭ����(�̿ϼ�),�������̽�(�Ϻ��� �̿ϼ�, ������ �߻��ڿ�)
 
 2.���(extends),����(implements)�� ���ؼ��� ��밡�� (heap ���� ����)
 3.������(override) �� ���� ������ ���� ����
 
 �߻�Ŭ������ �������̽��� �ٸ���
 1.�������̽��� ���� ���� ����(���(ǥ��))�۰� ������(����ȭ �� �� �ְ�) : ���� ��ӵ��� ����� ��Ƽ� ũ�� �����
   class Test extends Object implements Ia, Ib, Ic
 2.�߻�Ŭ������ ���� ����� ��Ģ (���������� ��ӹް� �ʹٸ� ������ ����� ����)
 3.�߻�Ŭ������ �ϼ��� �ڵ�+�̿ϼ��ڵ�
 4.�������̽��� ����� ������ �������� ��� �̿ϼ�(100% �߻��ڿ��� ������ �ִ�.) JDK 8 (Default��, Static ����)
 
 
 �������̽� : ����Ʈ���� ���� �ֻ��� �ܰ�
 � ������Ʈ�� ����..
 ���θ� ���� 
 
 **������(�ʱ�)
 1.�������̽���[ �� �� �� ] �������� ��������(�������̽��� �θ�Ÿ������ ����ϴ� ����� ã�ƺ���)
 2.���� �������� ���� Ŭ������ �ϳ��� �����ִ� ����� �ϴ� ���鿡�� �ٶ��� (�θ� �����ϰ� ������)
 3.�������̽��� ������ �ʾƵ� JAVA API ���� ���� (������ �ʰ� ����ص� �ȴ�)
 4.�������̽��� (~able) : ���� �ִ�, ������ �� �ִ�(����)
 5.��ü���� ����� (��ü ���� ����)
 
 ����Ʈ���� ����
 1.���ߴܰ��� �ֻ��� >> �䱸���� >> ����(��� �������̽�)
 2.���� ǥ��  >> ���� ���� (����) .. >> ������
 
 Interface
 1.���� �����ΰ� ���� : ���� ���� ���� : ���(�ý��ۿ��� �̵� : move , ��ǥ�� ����)
                                 void move(int x, int y); �߻� �޼ҵ�
JavaAPI (���߿� �ʿ��� �� ���� �������̽��� ���� : �������̽��� ������� ������ Ŭ���� .. )
>>Collection (�����迭) >> Vector, ArrayList , HashSet, HashMap
>>�������� inteface ���� 

�������
1. ��� (final) : public static final int VERSTION = 1 >> [public static final] >> int VERSTION = 1
2. �Լ�(method) : public abstract void run(); >> [public abstract] >> void run();
3.            : String move(int x , int y);

interface Ia{
int VERSTION = 1;
void run();
String move(int x, int y);
}
 interface Ia {
	void run();
}
interface Ib{}
interface Ic{}

class Test implements Ia, Ib, Ic{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
 
 
 */

interface Ia {
	int AGE = 100; // public static final ���� �Ǿ��ִ�
	String GENDER = "��";
	
	String print();  //public abstract ���� �Ǿ��ִ�
	void message(String str); //public abstract ���� �Ǿ��ִ�
}
interface Ib{
	int AGE = 10;  // public static final ���� �Ǿ��ִ�
	void info();   //public abstract ���� �Ǿ��ִ�
	String val(String s); //public abstract ���� �Ǿ��ִ�
}

class Test2 extends Object implements Ia, Ib{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


public class Ex03_Interface {

	public static void main(String[] args) {
		Test2 t = new Test2();
		Ia ia = t;  //������ 
		System.out.println(ia.AGE);
		Ib ib = t;
		System.out.println(ib.AGE);
	}

}
