/*
 this : ��ü �ڽ��� ����Ű�� this (this.empno, this.ename)
 this : �����ڸ� ȣ���ϴ� this (this(100,"ȫ�浿"))
 
 ��� 
 �θ� : �ڽ� 
 super (���� �ڽ��� �θ� �����Ҽ� �ִ� �ּҰ�) : ��Ӱ��迡�� �θ��� ���ٹ�� : super(�θ��� �ּ�)
 
 super
 1.��Ӱ��迡�� �θ��ڿ��� ����(�ڽ�)
 2.��Ӱ��迡�� �θ��� �����ڸ� ȣ�� ���������
 3.
 c# >> base()
 */

class Base {
	String basename;

	Base() {
		System.out.println("Base �⺻ ������ �Լ�");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("dname : " + this.basename);
	}
	void method (){
		System.out.println("�θ� method");
	}
}

class Derived extends Base {
	String dname;

	Derived() {
		System.out.println("Derived �⺻ ������ �Լ�");
	}
	Derived(String dname){
		//�ڽ� ���忡�� �θ��� ���� �θ��� �ּҰ� �ʿ�
		super(dname); //�θ����� overloding ������ ȣ��  << this�� ������ ȣ��� ���� ����
		
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	@Override
	void method(){
		System.out.println("�ڽ� method");
		//System.out.println(super.basename);  // this �� �ڿ� ȣ��� ���� ����
	}
	//����� �θ��� �ڿ��� �׸����� (method �Լ�) �����Ǹ� �ع��ȴ�
	//������ ��� : �θ��� �ּҷ� ���� super (�ڽ��� �Լ� ���ο����� ���)
	void p_method(){
		super.method();
	}
	
}

public class Ex06_Inherit_super {

	public static void main(String[] args) {
		//Derived d = new Derived();
		Derived d = new Derived("Hello");
		d.method();
		d.p_method();
	
		
	}

}
