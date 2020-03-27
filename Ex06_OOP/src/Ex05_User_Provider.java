/*
 User ����� : Provier ������
 
 class A {} , class B {}
 ���� : A �� B�� ����մϴ�
 1.��� : A estends B
 2.���� : A class �ȿ��� Member Field B��� >> class A { B b; }
 (�κа� ��ü)
 class B{}
 class A{
    int i;
    B b; //A�� B�� ����մϴ� ���԰���
    A(){
    b = new B();
    }
 }
 >> A a = new A(); >> A��ü�� ��������� B��ü�� ���� ����
 ------------------------------------------------
 class B{}
 class A{
 int i;
 B b; //A�� B�� ����մϴ� ����
 A(B b){
 this.b = b;
 }
 }
 >> B b = new B();
 >> A a = new A(b); 
 -----------------------------------------------
 class B{}
 class A{
 int i;
 //member field B ��� Ÿ���� ������ ������ ����.
 void print(B b){
 }
 B print(){
 B b = new B();
 return B;
 }
 }   
 >> B b = new B();
 >> A a = new A();
 >> a.print(b);
 >> B b2 = a.print();
 
 ***parameter ���Ǵ� Ÿ���� ���� ����ߴ�***
 
 */

interface Icall{
	void m ();
}
class D implements Icall{
	@Override
	public void m(){
		System.out.println("D Icall �������̽��� m()����");
	}
}
class F implements Icall{
	@Override
	public void m(){
		System.out.println("F Icall �������̽��� m()����");
	}
}

//interface Ȱ�� >> ���뿡 �־ ���α׷��� �����ϰ� ¥�°��� ������(����)
class C{
	void method(Icall ic){ //interface Ÿ���� ic ��� ������ � Ÿ���� ��ü�� ���� �� �������
		ic.m();
	}
}


public class Ex05_User_Provider {

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();
		c.method(d);
		c.method(f);

	}

}
