/*
 다형성(상속관계에서 존재)
 다형성 : 여러가지 성질(형채)를 가질 수 있는 능력
 
 c# : 다형성 (overloading , override)능력
 JAVA : [상속관계]에서 [하나의 참조변수]가 [여러개의 타입]을 가질 수 있다
                  단, 하나의 참조변수는[부모타입] 이어야 한다
 부모 타입의 참조 변수로 여러개의 자식 클래스 객체를 참조 할 수있다.
 
 --다형성 : 현실 세계와 반대
  현실 : 부모는 자식에게 조건 없이 준다
  자바 : 자식은 부모에게 조건없이 준다
 */
class Tv2 { // 부모타입(일반화, 추상화)된 공통자원
	boolean power;
	int ch;

	void power() {
		this.power = !this.power;
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2 { // CapTv 특수화, 구체화 된 고유한 표현
	String text;

	String captionText() {
		return this.text = "현재 자막 처리중";
	}

}

public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("전원: " + captv.power);

		captv.chUp();
		System.out.println("채널정보: " + captv.ch);
		System.out.println("자막처리: " + captv.captionText());
		//기존 배운내용
		//같은 타입 끼리만 할당
		//Car c = new Car();
		//Car c2 = c;
		Tv2 tv2 = captv; //[상속관계]에서 [부모타입]은 자식 타입의 주소를 가질 수 있다(다형성)
		//단 부모는 자신의 객체만 볼 수 있다.
		//단 재정의만 제외하고
		//Tv2 tv = new Tv2(); 메모리를 또 생성 하는것(이미 자식이new 하면서 메모리에 생성됨)
		System.out.println(tv2.toString());
		System.out.println(captv.toString());
		//자신의 자원만 볼수있다. 

	}

}
