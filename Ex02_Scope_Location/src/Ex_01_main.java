import kr.or.bit.common.Car;

/*
Ŭ���� == ���赵 == Ÿ��

Ŭ���� ���� ��� : [�ʵ� + �Լ�] + ������
*����(field) >> ��������, ��������,����(��ǰ)���� �ڿ� >>����
*�Լ�(function) >> ���(��������)
*�߰� ������ ������ >> �ʵ��� �ʱ�ȭ�� �������� �ϴ� �Լ�

 Ŭ����, �ʵ�, ������, �Լ� : �ڽ��� ����(����) ���� (������,������,������)
>> public , private, default, protected ..

1. public class Test{}

2. class Test{}  >> �����Ϸ��� ���������� default ��� �����ڸ� �ٿ��� ����մϴ�.
>> ���������� �����Ϸ��� �����ϴ� �ڵ� : default class Test {}
>> default �����ڰ� ���� �������� �ʴ´�.
>>**default �����ڴ� : ���� �������� ���� ����, �ٸ� ������ ������ ���� ���� ���� �Ұ�
>>**default �����ڴ� : ���� �������� (package)������ ���� ��������

3. �ϳ��� �������� �ڹ� ������ �������� Ŭ������ ������ �ִ�.(Test.java) (o)
       ��, public Ŭ������ �ϳ��� ���� .. �������� default  

�ǽ�
Src ���� >> Ex_01_main
kr.or.bit.common >> public Bitmain
kr.or.bit.common >> public Car
kr.or.bit.common >> (default) Person

 
*/

//������ �տ� default �����Ǿ� �ִ�. (���� ���� �������� ���� ����, �ٸ� ���������� ���� �Ұ�)
class Test {  //defalit Test  >> �������� 
	int d_iv;             // �����Ϸ��� �ڵ����� default int d_iv �ؼ�
	public int p_iv;      // ��𿡼��� ���� ����
	private int pri_iv;   // �������� ���߾��� ����
}

public class Ex_01_main {

	public static void main(String[] args) {
		//import kr.or.bit.common.Car;
		Car car = new Car();
		//car.door ���� ���� �� �ȵɱ�..
		
		//kr.or.bit.common.Person p = new Parson();
		
		
		Test t = new Test();
		t.d_iv = 100;  //default
		t.p_iv = 200;  //public
		//private �ڿ� ���� �Ұ�

	}

}
