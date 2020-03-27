/*
OOP (��ü ���� ���α׷���)
1.��� (���뼺)
2.ĸ��ȭ(����ȭ) : private : �����Ҵ��� ���� ���� �Ҵ��� �Ѵ�(�ڿ��� ��ȣ) :setter,getter(Ư�����Լ�)
3.������

�������� �Ѻκ� ���� [�����ε�]�� �ִ�

>> method overloading 
>> �ϳ��� �̸����� �������� ����� �ϴ� �Լ�
>> System.out.println() println overloading �����ϰ� �ִ� �Լ�
Ư¡ : �����ε��� ���� ��� ������ �ش� (x)
     why > ���ϰ� ����Ϸ��� > ������
           ��� > �Լ��� Ȱ�� > �������� �Լ��� ����(x) > �ϳ��� �Լ�(parameter �޸�)
     
���� : �Լ� �̸��� ���� parameter�� [����] �� [Ÿ��] �� �޸��ϴ� ���
1. �Լ��̸��� ���ƾ� �Ѵ�
2. [parameter] ���� �Ǵ� [Type] �� �޶�� �Ѵ�
3. return type �����ε��� �Ǵ� ������ �ƴϴ� (x)
4. parameter ������ �ٸ��� �����Ѵ�
 */

class Human {
	String name;
	int age;

}

class OverTest {
	int add(int i) {
		return 100 + i;
	}

	int add(int i, int j) {
		return i + j;
	}
	//String add(int k) {} == int add(int i) {}
	String add(String s){  //parameter �� ������ ������ Ÿ���� �ٸ���
		return s +"hello";
	}
	
	
	void add(int i , String s){
		System.out.println("�����ε� : " + i +"/"+ s);
	}
	void add(String s , int i){  //Ÿ���� ������ �ٸ��� �����Ѵ�
		System.out.println("���� �����ε� : " + s +"/"+ i);
	}
	void add(Human h){ //�����ε�
		h.name = "ȫ�浿";
		h.age = 20;
		System.out.println(h.name + "/" + h.age);
	}
}

public class Ex14_Method_Overloading {

	public static void main(String[] args) {
		OverTest ot = new OverTest();
		int result = ot.add(10, 20);
		System.out.println("result : " + result);
		
		//ot.add(new Human()); ok
		Human h = new Human ();
		ot.add(h);

	}

}
