/*
 User 사용자 : Provier 제공자
 
 class A {} , class B {}
 관계 : A 는 B를 사용합니다
 1.상속 : A estends B
 2.포함 : A class 안에서 Member Field B사용 >> class A { B b; }
 (부분과 전체)
 class B{}
 class A{
    int i;
    B b; //A는 B를 사용합니다 포함관계
    A(){
    b = new B();
    }
 }
 >> A a = new A(); >> A객체가 만들어지면 B객체도 같이 생성
 ------------------------------------------------
 class B{}
 class A{
 int i;
 B b; //A는 B를 사용합니다 포함
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
 //member field B 라는 타입을 가지는 변수가 없다.
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
 
 ***parameter 사용되는 타입을 직접 명시했다***
 
 */

interface Icall{
	void m ();
}
class D implements Icall{
	@Override
	public void m(){
		System.out.println("D Icall 인터페이스의 m()구현");
	}
}
class F implements Icall{
	@Override
	public void m(){
		System.out.println("F Icall 인터페이스의 m()구현");
	}
}

//interface 활용 >> 현대에 있어서 프로그램을 유연하게 짜는것을 좋아함(대충)
class C{
	void method(Icall ic){ //interface 타입의 ic 라는 변수는 어떤 타입의 객체를 받을 수 있을까요
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
