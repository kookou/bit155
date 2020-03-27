import javax.swing.plaf.synth.SynthSpinnerUI;

//static method 함수 :
//Math.Random()
//Systsm.out static
//많이, 자주 사용하니까. 편하게 쓸게 해줄게 new 하지 않아도..
class StaticClass{
	int iv;
	
	
	static int cv;
	
	void m(){ //일반함수
		//1. iv 값을 가지고 놀수 있다 (o) 
		iv = 100;
		//2. cv 값을 가지고 놀수 있다 (o) >> 생성시점
		//[****static 자원은 항상 일반 자원보다 메모리에 먼저 생성된다****]
		//StaticClass.cv = 100; 원칙
		cv = 200;
		
	}
	
	static void sm(){ //스태틱 함수가
		//1.일반 변수인 iv 값을 가지고 놀수 있다(x) //memory 생성 시점
		//iv = 200;
		//2.static 변수인 cv 값을 가지고 놀수 있다 (o)
		cv = 500;
		//error 없을려면 끼리끼리 놀아라 (static은 static 끼리 놀아라)
	}
}

public class Ex09_Static_Method {
	public static void main(String[]args){
		//원칙적인 방법
		//StaticClass sc = new StaticClass();
		//sc.함수이름...
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		//일반 자원 사용
		StaticClass sc = new StaticClass();
		sc.m();
		System.out.println(sc.iv);
		System.out.println(sc.cv);
		System.out.println(StaticClass.cv);


	}

}
