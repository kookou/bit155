import kr.or.bit.Bird;

//protected ������ ��Ӱ��迡����
//���� : ��Ӱ��迡�� �������� �ǰ�
//����� �ٸ� ����Ѵٸ� �� �ڿ�(�Լ�)�� ������ ������ ���ھ�
//������ �ܿ��� 
//��
class Ostrich extends Bird {
	// ��üȭ, Ư��ȭ
	void run() {
		System.out.println("run");
	}
	//��Ӱ���

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
