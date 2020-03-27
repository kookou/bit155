/*
 추상 클래스 : 인터페이스  (표준, 약속, 규칙, 규약 만드는 행위) 실제 구현이 없다
 추상클래스와 인터페이스의 공통점
 1.스스로 객체생성 불가능 (new 연산자 사용 불가능)
 추상클래스(미완성),인터페이스(완벽한 미완성, 모든것이 추상자원)
 
 2.상속(extends),구현(implements)을 통해서만 사용가능 (heap 적재 가능)
 3.재정의(override) 를 통한 강제적 구현 목적
 
 추상클래스와 인터페이스의 다른점
 1.인터페이스는 다중 구현 가능(약속(표준))작게 만들어요(범용화 될 수 있게) : 작은 약속들을 만들고 모아서 크게 만든다
   class Test extends Object implements Ia, Ib, Ic
 2.추상클래스는 단일 상속이 원칙 (여러가지를 상속받고 싶다면 계층적 상속을 통해)
 3.추상클래스는 완성된 코드+미완성코드
 4.인터페이스는 상수를 제외한 나머지는 모두 미완성(100% 추상자원을 가지고 있다.) JDK 8 (Default값, Static 구현)
 
 
 인터페이스 : 소프트웨어 설계 최상위 단계
 어떤 프로젝트를 진행..
 쇼핑몰 정의 
 
 **개발자(초급)
 1.인터페이스를[ 다 형 성 ] 입장으로 접근하자(인터페이스를 부모타입으로 사용하는 방법을 찾아보자)
 2.서로 연관성이 없는 클래스를 하나로 묶어주는 기능을 하는 측면에서 바라보자 (부모르 동일하게 만들자)
 3.인터페이스는 만들지 않아도 JAVA API 거의 제공 (만들지 않고 사용해도 된다)
 4.인터페이스는 (~able) : 날수 있는, 수리할 수 있는(설계)
 5.객체간의 연결고리 (객체 소통 역할)
 
 소프트웨어 설계
 1.개발단계의 최상위 >> 요구사항 >> 설계(고려 인터페이스)
 2.설계 표준  >> 강제 이행 (구현) .. >> 재정의
 
 Interface
 1.실제 구현부가 없다 : 실행 블럭이 없다 : 약속(시스템에서 이동 : move , 좌표값 받자)
                                 void move(int x, int y); 추상 메소드
JavaAPI (개발에 필요한 수 많은 인터페이스를 설계 : 인터페이스를 기방으로 생성된 클래스 .. )
>>Collection (동적배열) >> Vector, ArrayList , HashSet, HashMap
>>여러개의 inteface 구현 

생성방법
1. 상수 (final) : public static final int VERSTION = 1 >> [public static final] >> int VERSTION = 1
2. 함수(method) : public abstract void run(); >> [public abstract] >> void run();
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
	int AGE = 100; // public static final 생략 되어있다
	String GENDER = "남";
	
	String print();  //public abstract 생략 되어있다
	void message(String str); //public abstract 생략 되어있다
}
interface Ib{
	int AGE = 10;  // public static final 생략 되어있다
	void info();   //public abstract 생략 되어있다
	String val(String s); //public abstract 생략 되어있다
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
		Ia ia = t;  //다형성 
		System.out.println(ia.AGE);
		Ib ib = t;
		System.out.println(ib.AGE);
	}

}
