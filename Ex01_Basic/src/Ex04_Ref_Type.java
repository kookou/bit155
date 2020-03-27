// 참조타입 연습

/*
 * 클래스는 설계도이다. 클래스는 작은 타입들이 모인 큰 타입이다.
 * 클래스 == 설계도 == 타입
 * 클래스는 구체화(집을 짓는 행위)를 통해서 사용한다.
 * 프로그램 세계에서 집을 짓는 행위는 new 연산자를 통해서 memory에 만들어진다. >> 객체(인스턴스)
 * 
 * 설계도
 * 클래스는 2가지 종류가 있다.
 * 1. main 함수를 가지는 설계도 >> 독자적 실행 가능.
 * 2. main 함수가 없는 설계도 >> 도와주는 역할. main 함수 안에서 실행해야한다. > 라이브러리(lib)
 * 
 * 
 */
class Apt2{ //현업에서는 class안에 class를 만들지 않는다. 따로 파일을 만들어야 한다. 수업의 편의성을 위해 이렇게 하는 것.
//	The type Apt is already defined. 같은 폴더 내에 같은 클래스는 존재할 수 없다.
	
//	modifier 접근제한자
//	하나의 자바파일에는 하나의 클래스가 있는 것이 원칙이다.
//	public이 붙을 수 있는 클래스는 하나만 가능하다.
	
	int door = 10;
	int window = 20;
}

public class Ex04_Ref_Type { 

	public static void main(String[] args) {
		// Apt2는 설계도이다. new연산자를 사용하여 구체화를 통해 메모리에 올려줘야 사용가능하다.
		Apt2 lgapt = new Apt2();
//		lgapt 변수(참조변수 = 객체변수(주소를 가지고 있는 변수))
		System.out.println("lgapt : " + lgapt); // lgapt : Apt2@15db9742
		
//		new를 사용하지 않고 주소값을 가지는 방법
		Apt2 ssapt = lgapt; //할당도 주소를 가지는 방법중 하나이다.
		ssapt.door = 555;

	}

}
