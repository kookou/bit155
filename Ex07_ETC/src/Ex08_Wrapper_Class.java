import java.util.ArrayList;

/*
 8가지 기본타입이 있다(값타입):JAVA API 에서 제공
 
 8가지 기본타입에 대해서 객체 형태로 사용 가능하도록 만든것 을 wrapper class라고 한다
 기본타입이 떄로는 객체 형태로 다루어 져야 할때가 있다.
 1. 매개변수로 객체가 요구될때
 2. 기본형 값이 아닌 객체로 저장 되어야 할때
 3. 객체간의 값 비교 필요할때
 4. 타입 변환시 처리 
 
 */
public class Ex08_Wrapper_Class {

	public static void main(String[] args) {
		int i = 100;
		Integer n = new Integer(500); //int 의 wrapperclass 타입
		System.out.println("n: "+n); // 사실 주소값이 나오는게 맞지만 ovveride 되어서 값이 나옴(toString 처럼)
		System.out.println(n.MAX_VALUE);
		System.out.println(n.MIN_VALUE);
		
		
		//Point 활용
		//parameter 활용
		//generic
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		for(int value : li){
			System.out.println(value);
		}
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); //주소값 비교 (false)
		System.out.println(i2.equals(i3) ); //실제 값을 비교 (true)
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4 == i5);
		
		Integer t = new Integer(500);
		intMethod(t);   //t 라는 참조 변수가 가지는 값
		integerMethod(t); // t 라는 참조변수의 주소값


	}
	static void integerMethod(Integer i){ //parameter 를 참조타입으로 쓸때가 있다
		System.out.println("integer param : "+i); //toString() 재정의 값 출력
		System.out.println(i.MAX_VALUE);

	}
	static void intMethod(int i){
		System.out.println("integer param : "+i);
	}

}
