/*
 생성자 함수 (Constructor)
 1. 함수(특수한 목적)
 2. 특수한 목적 (member field 초기화)
 
 Tip) static {}, {]
 3. 일반함수와 다른점
 3.1 함수의 이름이 고중 (class 이름 동일)
 3.2 실행시점 때문에 return Type (x) >> void (x) >> 명시(씀) default void 생략
 3.3 실행시점 : 객체생성(new) 되고 변수가 만들고 [자동] 으로 [호출되는 함수] >> 생성자 함수
 
 4 목적 : 생성되는 객체마다 강제적으로 다른 member field 값을 (초기값을)부여하는 방법
 class Car {String color;}
 >> Car c = new Car(); 이사람이 차를 만들때 무조건 색상을 가지고 갔으면 좋곘는데
 
 5. 생성자 함수 >> overloading 가능
 
 당신이 만약 overloading 된 생성자 함수를 하나라도 구현했다면
 default 생성자 함수는 반드시 구현을 통해서만 생성된다

 */
//설계자의 의도 : 자동차를만들땐 반드시 자동차 이름을 넣어라
class Car7 {
	String carname;
	// 생략되어 있었어요
	// 직접 코딩하지 않으면 컴파일러가 자동으로 코드를 만들어요
	// Car(){

	// }

}

class Car8 {
	String carname;

	Car8() { // void 생략
		System.out.println("나는 defualt 생성자 입니다(자동호출)");
		carname = "포니"; // 생성자 member field 의 초기값..

	}
}

class Car9 {
	int door;
	int wheel;

	Car9() {
		System.out.println("default");
	}

	// method overloading (함수)
	// 오버로딩
	Car9(int num) {
		door = num;
		System.out.println("overloading door : " + door);
	}

	Car9(int num, int num2) {
		door = num;
		wheel = num2;
		System.out.println("overloading door : " + door + " / " + "wheel : "+ wheel);
	}
}


class Car {
	
	
	
}
public class Ex16_Constructor_Overloading {

	public static void main(String[] args) {
		// Car c1 = new Car();

		//Car2 c2 = new Car2(); // 내부적으로 Car2() 생성자 함수를 호출...
		//System.out.println(c2.carname);
		
		//원칙적으로는 객체를 생성할때 생성자 함수는 1개만 호출할 수 있다
		//Car4 c4 = new Car4();
		//Car4 c4 = new Car4(100);
		//Car4 c4 = new Car4(10,20);
		
		//**자동차 주문 제작**
		//Case
		//Case 기본자동차
		//Case1 자동차의 색상
		//Case2 자동차의 색상, 썬팅
		//Case3 자동차의 색상, 썬팅, 네비장착
		
		//생성자 overloading 활용 (강제성)
		
		
		
		
		
	}

}
