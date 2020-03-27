

//���� : unit(����)

//unit ������ (�̵���ǥ, �̵�, �����)
//unit �̵� ����� �ٸ��� (�̵� ����� unit ���� ������ ����) 
//abstract class �̸� {abstract �̵�();} << ��ӹ޴� ��� �ڿ����� ���� ���� �ϵ��� �ϰڴ�

abstract class Unit{
	int x,y;
	
	void stop(){
		System.out.println("Unit stop");
	}
	//�̵�(����)
	abstract void move(int x, int y); //�߻��ڿ� ������ ����(�߻��ڿ��� ��� �޴� Ŭ������ �θ� Ŭ���� ���� �߻��ڿ��� ������ �����ϵ��� �ϴ°�)
   
}

class Tank extends Unit{
	
	@Override
	void move(int x ,int y){
		this.x = x;
		this.y = y;
		System.out.println("Tank �̵� : " +this.x+","+this.y);
	}
	//Tank Ư��ȭ (��üȭ)
	void cangeMode(){
		System.out.println("��ũ��ȯ���");
	}
}

class Marine extends Unit{
	@Override
	void move(int x ,int y){
		this.x = x;
		this.y = y;
		System.out.println("Marine �̵� : " +this.x+","+this.y);
	}
	//Tank Ư��ȭ (��üȭ)
	void stimpack(){
		System.out.println("��������");
	}
	
}

class DropShip extends Unit{
	@Override
	void move(int x ,int y){
		this.x = x;
		this.y = y;
		System.out.println("DropShip �̵� : " +this.x+","+this.y);
	}
	void load(){
		System.out.println("Unit load");
	}
	void unload(){
		System.out.println("Unit unload");
	}
}



public class Ex02_abstract_class {

	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(500, 200);
		t.stop();
		t.cangeMode();
		
		Marine m = new Marine();
		m.move(500, 300);
		m.stop();
		m.stimpack();
		
		//1.��ũ 3�븦 ����� [���� ��ǥ]�� �̵� ��Ű���� (33,44)
		Tank[] tanklist = {new Tank(),new Tank(),new Tank()};
		for(Tank tank : tanklist){
			tank.move(33, 44);
		}
		
		//2.�������� Unit (Tank1, Marine1, DropShip1)�� ���� ��ǥ�� �̵� ��Ű����
		Unit[] unitlist = {new Tank(), new Marine(),new DropShip()};  //�θ�Ÿ���� �迭�� ����� �ڽ� Ÿ���� �ּҸ� ���� �� �ִ�.
		for(Unit unit : unitlist){
			unit.move(111, 222); //<<�θ�Ÿ������ �����ص� ������(override)�� �Ǿ��������� �ڽ� Ŭ���� �޼ҵ� ȣ�� ����
		}
		

	}

}
