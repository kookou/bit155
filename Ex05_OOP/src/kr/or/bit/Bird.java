package kr.or.bit;
//새 : 공통(일반적이고 추상화된 내용) : 새는 날수있다, 새는 빠르다 
public class Bird {
	//공통기능
	public void fly(){
		System.out.println("flying");
	}
	
	//나를 상속하는 녀석은 moveFast 를 재정의 했으면 좋겠다(90% 재정의)
	protected void moveFast(){
		fly();
	}

}
