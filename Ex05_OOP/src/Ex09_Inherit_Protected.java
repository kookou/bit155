import kr.or.bit.Bird;

//protected 접근자 상속관계에서만
//목적 : 상속관계에서 재정의의 권고
//당신이 다를 상속한다면 이 자원(함수)를 재정의 했으면 좋겠어
//예제를 외워라 
//새
class Ostrich extends Bird {
	// 구체화, 특수화
	void run() {
		System.out.println("run");
	}
	//상속관계

	@Override
	protected void moveFast() {
		//super.moveFast();
		run();
	}
	

}
class Bi extends Bird{
	@Override
	protected void moveFast() {
		super.moveFast();
	}
	
}




public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Ostrich ostrich = new Ostrich();
		ostrich.run();
		ostrich.moveFast();
		
		Bi bi = new Bi();
		bi.fly();
		bi.moveFast();
	}

}
