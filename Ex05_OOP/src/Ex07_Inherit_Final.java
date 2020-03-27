/*
 변수 <-> 상수
 상수 : 한번 값이 초기화 되면 변경이 불가능
 상수 자원 : 고유값(주민번호),수학적인 값 : PI=3.1459...
 상수는 관용적으로 [대문자로 쓴다]
 
 java : final int NUM = 10;
 c#   : const int NUM = 10;
 
 final 키워드
 클래스 앞에 >> final class Car{ } >> final Math >> 상속불가
 함수앞에 >> public final void print () { } >> 상속 >> 재정의 하지마
         public static final void print() { }
         public final String KIND = "heart" //상수
         
 */
class Vcard2{
	final String KIND;
	final int NUM;
	/*
	Vcard2(){
		this.KIND = "heart";
		this.NUM = 10;
	}
	*/
	//Vcard2(){}
	
	Vcard2(String kind, int num){
		this.KIND = kind;
		this.NUM = num;
	}
	@Override
	public String toString() {
		return "Vcard [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}
class Vcard {
	final String KIND = "heart";  //한번 초기화 된 값은 변경이 불가능 하다
	final int NUM = 10;

	void method() {
		// 자바 API 시스템 상수
		System.out.println(Math.PI);

	}

	
}

//Vcard 카드 53장 만들면 모든 카드는 모양 >> KIND >> heart
//혹시 53장의 카드 KIND 를 다 다르게 만들순 없을까 하지만 만들어 지면 바꾸지않게

public class Ex07_Inherit_Final {

	public static void main(String[] args) {
		//Vcard v = new Vcard();
		//v.method();
		//v.NUM = 1000; //The final field Vcard.NUM cannot be assigned
		
		Vcard2 c = new Vcard2("spade",1);
		System.out.println(c.toString());
		Vcard2 c2 = new Vcard2("spade",2);
		System.out.println(c2.toString());
		Vcard2 c3 = new Vcard2("spade",3);
		System.out.println(c3.toString());
		//c.KIND = "heart"; //한번 초기화된 값은 재설정 할수 없다. 이것이 상수다
		
		
	}

}
