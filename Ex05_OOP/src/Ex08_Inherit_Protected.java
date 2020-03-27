import kr.or.bit.Pclass;

/*
 public, default, private,  상속 관계에서 >> protected
 
 양면성 : 박쥐 (default, public)
 >>상속이 없는 클래스 안에서 protected 접근자는 default 와 같아요
 >>Why : 상속이 없는 상황에서는 protected 접근자는 의미가 없어요
 //당신이 내가 만들 설계도를 상속 받아서 사용한다면 재정의를 했으면 좋겠다 (바램)
 */

class Dclass {
	public int j;
	private int o;
	int p; // default
	protected int k;
}
class Child2 extends Pclass{
	void mathod(){
		this.k = 1000;   //상속 관계에서 자식은 부모의 protected 접근자의 자원을 public 처럼 사용할수 있다 
		System.out.println(this.k);
	}
}
public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Dclass dc = new Dclass();
	    //dc.j  ok >> public
		//dc.p  ok >> default (같은폴더안에서는 사용가능)
		//dc.k  ok >> protected 같은 폴더안에서는 default 와 똑같은 효과
		//dc.o  no >> private 접근할수 없다.
		//결국 protected 는 상속관계에서만 사용된다.
		
		
		
		//다른 폴더(package)
		Pclass pc = new Pclass();
		//pc.j ok
		//pc.p
		//pc.k
		//pc.o
		
		
		Child2 ch = new Child2();
		ch.mathod();
		
	}

}
