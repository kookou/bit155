/*
 this : 객체 자신을 가르키는 this (this.empno, this.ename)
 this : 생성자를 호출하는 this (this(100,"홍길동"))
 
 상속 
 부모 : 자식 
 super (현재 자식이 부모에 접근할수 있는 주소값) : 상속관계에서 부모의 접근방법 : super(부모의 주소)
 
 super
 1.상속관계에서 부모자원에 접근(자식)
 2.상속관계에서 부모의 생성자를 호출 명시적으로
 3.
 c# >> base()
 */

class Base {
	String basename;

	Base() {
		System.out.println("Base 기본 생성자 함수");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("dname : " + this.basename);
	}
	void method (){
		System.out.println("부모 method");
	}
}

class Derived extends Base {
	String dname;

	Derived() {
		System.out.println("Derived 기본 생성자 함수");
	}
	Derived(String dname){
		//자식 입장에서 부모쪽 제어 부모의 주소가 필요
		super(dname); //부모쪽의 overloding 생성자 호출  << this의 생성자 호출과 같은 문법
		
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	@Override
	void method(){
		System.out.println("자식 method");
		//System.out.println(super.basename);  // this 의 자원 호출과 같은 문법
	}
	//어느날 부모의 자원이 그리워요 (method 함수) 재정의를 해버렸다
	//유일한 방법 : 부모의 주소로 접근 super (자식의 함수 내부에서만 사용)
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
