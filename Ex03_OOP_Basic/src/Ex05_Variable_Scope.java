/*
**instance variable >> class Car {public String color;}
**local variable >> class Car { public void move(){int speed}}
main �Լ� �ȿ� �ִ� ��� ������ : local variable >> �ʱ�ȭ
static variable > �����ڿ� (��ü��), ��ü ���� ������ memory �� �ö� ���� �ڿ�

 */

class Variable{
	int iv;
	/*
	 1.member field, instance variable
	 2.Variable v = new Variable();  heap �޸𸮿� iv ����
	   Variable v2 = new Variable();  heap �޸𸮿� iv ����
	 3.���� : ������ �������� �Ѵ� (������ �´� Type �� ������ �Ѵ�)
	   - ����(�Ӽ�) >> ����, ����, ��ǰ (��������)
	   - ������ �����Ǵ� ��ü���� �ٸ� ���� ���� �� �ִ�.
	   - �׷��� ������ ���� �ʱ�ȭ�� ���� �ʴ´�
	   - �⺻������ default �� : int > 0 , float > 0.0 , boolean > false , String > null , ����Ÿ�� : null
	 4. ���� �������� : new ��� �����ڸ� ���ؼ� heap ��ü�� ����� ���� �ٷ� ���� ����
	 */
	
	static int cv;
	/*
	 1. class variable (Ŭ���� ����), static variable (����(��ü��) ����)
	 2. ���� : ������ ��� �� *** ~~~(�����Ǵ� ��� ��ü�� �����ϴ� �ڿ� : ��ü�� �����ڿ�
	    heap ������ ������ [��ü]���� [����]�ڿ�(�����ڿ�)
	 3. Ư¡ : ���ٹ�� > Ŭ���� �̸� .static ������ (��ü�� ����� ���� ���� ��Ȳ������ ���� ����)
	    ex) Math.Random() >> ����ϱ� ���ؼ� >> Math m = new Math () -> m.Random(x)
	                    ���ٹ�� > ������ �͵� �ƴϱ⿡ > ��������.static ������
	    ex) Variable v = new Variable();
	        Variable v2 = new Variable();
	        1.variable.cv   Ŭ���� �̸�����
	        2.v.cv          ���� �ּҷ�
	        3.v2.cv         ���� �ּҷ�
	        
	        class Hello { public static void main(String[] args) { syso..}}
	 4. ������÷ : Hello.java > javac Hello.java > Hello.class
	 
	            > java.exe Hello ����.. ����
	            > class loader System �� ���ؼ�
	                           Ŭ���� ����(metadata : ����) class area (method area)�÷���
	            --�� class �� ���� ������� � �ڿ��� import �ϰ� �ְ� ������ ���.. ����ϴ°�
	            --�� class �ȿ� static variable �Ǵ� static method �� ������
	            --�� �༮�� memory (class area) �� �÷� ���´� 
	 */
	void method(){
		int lv = 0;
		/*
		 local variable (�Լ� �ȿ� �ִ� �������� : (������ ����) �ݵ�� ������� �ʱ�ȭ �ؾ��Ѵ�)
		  �����ֱ� : �Լ��� ȣ��Ǹ� �����Ǿ��ٰ� �Լ��� ������ �Ҹ�ȴ�
		        *�Լ� �ȿ��� ���
		        for (int i..) >> i ������ for ���� ����Ǹ� ���� �Ǿ��ٰ� for ���� ������ �Ҹ�
		        --������   
		 */
	}
}




public class Ex05_Variable_Scope {

	public static void main(String[] args) {
		int num=0;
		System.out.println(num);
		Variable.cv = 100;
		Variable v = new Variable();
		Variable v2 = new Variable();
		v2.cv = 500;
		
	}
}
