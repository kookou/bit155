package kr.or.bit;
// class == ���赵 == Type
//���赵�� ��üȭ (�޸𸮿� �÷��� ����ϴ°�)�� ���ؼ� ��ä�� �����Ǿ�� �Ѵ�
//��üȭ �Ȱ� >> ��ü, �ν��Ͻ�

//���赵 �⺻���� ������� (�ʵ� + �Լ�) + ������

//class Car {} >> default class Car{}  >> ���� ����������
//public class Car {public String color; int door; >> default int door}

public class Person {
	                     //String �� default ���� ����Ÿ�� (Class)�̱� ������ >> null 
	public String name;  //member field >> instance variable 
	                     //�ʱ�ȭ�� ���� �ʾƵ� �ȴ� (�ʱ�ȭ : ������ ���� �Ҵ� �ϴ°�)
	                     //�����Ǵ� ��ü (���) ���� �ٸ� �̸��� ������ ������..
	                     //Person p = new Person (); p.name = "ȫ�浿"
	                     //Person p2 = new Person (); p2.name = "������"
	                     //default ���� ������ 
	                     //public int age;  //default -> 0
	                     //public boolean power //default -> false
	public int age;
	public boolean power;
	//���(����)  >> method
	public void print(){ //���� ���� ����ϴ� ���
		System.out.println("name:"+name+ "/"+ "age:"+age);
		
		
	}

}
