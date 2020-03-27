package kr.or.bit;
//디자인 패턴(생성패턴) >> new >> 객체를 만드는 방법
//객체 하나를 만들어서 공유해서 쓰겠다
//회사 : 공유 프린터

//보장 : 객체의 주소가 항상 동일하다 >>하나의 객체를 공유하겠다

//활용 : JDBC :JAVA < (JDBC : CRUD) > DB


//Singleton singleton = new Sinlgeton(); >> 생성자 호출 >>노출(private)
class Single{
	private Single s;
	private Single(){
		
	}
	
	
}
public class Singleton {
    private static Singleton p;
	private Singleton(){ //생성자(dsfault) //직접 객체 생성 불가
		
	}
	public static Singleton getInstance(){
		if(p == null){
			p = new Singleton(); 
			//singleton = new Sinlgeton(); 
			//같은 클래스 내부에서는 private 과 public을 구별 하지 않는다.
		}
		return p;
	}
	

}
