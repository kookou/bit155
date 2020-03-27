/*
 OOP특징
 1. 상속
 2. 캡슐화(은닉화) >> private
 3. 다형성
 
 1.상속표현
 java : child extends Base
 c# : child : Base 
 
 2.상속특징
 2.1 다중 상속은 불가능
 2.2 단일 상속 (계층적 상속 지원 을 통해서 여러개의 클래스를 상속 받는다)
 2.3 다중 상속을 지원(유일한 지원 :Interface)
 
 3.상속의 의미
 3.1 진정한 의미 : 재사용성 (장점)
 3.2 단점 : 초기 비용이 많이 든다 (설계)
 재사용성 >> 설계 >> 비용 (시간,공통자원(분모,추상화))
 4. 상속관계에서 Memory 를 갖는 시점
    GrandFather > Father > Child
         사용자가 만드는 모든 클래스는 default Object 클래스 상속
    class Car{} >> 내부적으로 >> class Car extends Object{}
    Object는 모든 클래스의 root (최상위) : 모든 클래스의 부모 클래스
    
 */
class Car {
}

class GrandFather {  //GrandFather extends Object 생략
	public GrandFather() {
		System.out.println("G");
	}

	public int gmoney = 5000;
	private int pmoney = 10000; //private 상속관계에서 어떤의미인가 :접근불가 내부에서 활용
}

class Father extends GrandFather {
	public Father() {
		System.out.println("F");
	}

	public int fmoney = 1000;

}

class Child extends Father {
	public Child() {
		System.out.println("C");
	}

	public int cmoney = 500;
}

public class Ex01_Inherit {

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.gmoney); //할아버지돈도 내돈
		System.out.println(ch.fmoney); //아버지돈도 내돈
		System.out.println(ch.cmoney); //내돈도 내돈
		Car c = new Car();

	}

}
