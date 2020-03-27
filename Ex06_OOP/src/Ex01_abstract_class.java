/*
 추상 클래스
 >>미완성 클래스(설계도)
 1. 완성된 코드 + 미완성 코드 
 2. 완성(함수) 실행 블럭이 있는 함수 + 미완성(함수) 실행블럭이 없는 함수(public void run(); >> {x} 추상함수)
 3. 완성과 미완성 차이 (new 객체 생성 할수있냐 없냐의 차이(완성된 클래스만 객체생성 가능),미완성(객체생성불가))
 
 정리
 1.추상클래스(미완성) 스스로 객체 생성이 불가 (new 사용 불가)
 2.추상클래스는 결국 완성된 클래스가 되는 것이 목적 >> 상속이 목적 (재정의)
 3.상속관계에서 미완성된 자원(추상자원) 완성해라 (구현해라) >> 재정의 해라(override)
 
  설계자 입장에서 추상클래스를 바라보는 시각
 만약에 추상 클래스를 만든다면 > 나의 의도는 무엇 일까?  >> 강제적 구현을 목적으로 (재정의 강제성) 
 */
abstract class Abclass{
	//추상 클래스 추상 자원을 만들 겠다
	int pos;
	void run(){
		pos++;
	}
	//미완성
	abstract void stop(); //추상자원 {} >> 실행 블럭이 없다
}

//상속이 존재하지 않으면 >> 추상 클래스는 태어나지도 않았다..
class Child extends Abclass{
	@Override
	void stop() { //실행 블럭만 있으면 된다. 그 안에 내용을 강제할 방법이 없다.		
		this.pos = 0;
		System.out.println("stop : " + this.pos);
	}
}
class Child2 extends Abclass{
	@Override
	void stop() { //실행 블럭만 있으면 된다. 그 안에 내용을 강제할 방법이 없다.		
		this.pos = -1;
		System.out.println("stop : " + this.pos);
	}
}

public class Ex01_abstract_class {

	public static void main(String[] args) {
		//Abclass ab = new Abclass(); 불가
		Child ch = new Child();
		ch.run();
		ch.run();
		System.out.println(ch.pos);
		ch.stop();
		
		Child2 ch2 = new Child2();
		ch2.run();
		ch2.run();
		System.out.println(ch2.pos);
		ch2.stop();
		
		//다형성
		Abclass ab = ch; //부모타입의 참조변수는 자식 타입의 객체 주소를 가질수 있다.
		                 //부모는 자신의 타입 자원들만 활용
		                 //********** 부모로 접근 하더라도 그 자원이 재정의 되어있다면 자식 자원으로 접근 한다.*********
		ab.run();
		ab.stop();
		//그런데 만약 부모 쪽에 접근하고 싶으면 (super)

	}

}
