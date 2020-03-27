import kr.or.bit.Pclass;

/*
 public, default, private,  ��� ���迡�� >> protected
 
 ��鼺 : ���� (default, public)
 >>����� ���� Ŭ���� �ȿ��� protected �����ڴ� default �� ���ƿ�
 >>Why : ����� ���� ��Ȳ������ protected �����ڴ� �ǹ̰� �����
 //����� ���� ���� ���赵�� ��� �޾Ƽ� ����Ѵٸ� �����Ǹ� ������ ���ڴ� (�ٷ�)
 */

class Dclass {
	public int j;
	private int o;
	int p; // default
	protected int k;
}
class Child2 extends Pclass{
	void mathod(){
		this.k = 1000;   //��� ���迡�� �ڽ��� �θ��� protected �������� �ڿ��� public ó�� ����Ҽ� �ִ� 
		System.out.println(this.k);
	}
}
public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Dclass dc = new Dclass();
	    //dc.j  ok >> public
		//dc.p  ok >> default (���������ȿ����� ��밡��)
		//dc.k  ok >> protected ���� �����ȿ����� default �� �Ȱ��� ȿ��
		//dc.o  no >> private �����Ҽ� ����.
		//�ᱹ protected �� ��Ӱ��迡���� ���ȴ�.
		
		
		
		//�ٸ� ����(package)
		Pclass pc = new Pclass();
		//pc.j ok
		//pc.p
		//pc.k
		//pc.o
		
		
		Child2 ch = new Child2();
		ch.mathod();
		
	}

}
