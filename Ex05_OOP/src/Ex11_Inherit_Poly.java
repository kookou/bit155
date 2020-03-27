//자바 다형성 (상속)
class Pbase {
	int p = 100;
}

class Cbase extends Pbase {
	int c = 200;
}

class Dbase extends Pbase {

}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());

		Pbase p = cbase; // 다형성
		// 부모타입의 참조변수 p 는 자식 타입의 자식타입 참조변수 class 가 가지는 주소값을 받을 수 있다.
		// 단 부모 타입의 참조변수 생성된 무도 객체만 사용가능 자식은 접근 불가
		Dbase dbase = new Dbase();

		p = dbase; // 기능
		//부모타입 p 는 자식 타입 cbase 의 주소도 가질수 있고 Dbase 의 주소도 가질수 있다.
		//p 라는 변수는 여러개의 자식 타입의 주소를 가질 수 있다 (조건 : 상속관계에서)
		//하나의 부모타입은 자신을 참조하는 여러개의 자식 타입의 주소를 가질 수 있다.

	}

}
