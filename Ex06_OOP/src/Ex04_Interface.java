//���� �ٸ� Ŭ������ �ϳ��� �θ�� �����ִ� ����
interface Irepairable{   //�� �� �ִ� 
	
}

class Unit2 {
	int hitpoint; // �⺻������
	final int MAX_HP;

	Unit2(int hp) {
		this.MAX_HP = hp;
	}
}

// ��������
class GroundUnit extends Unit2 {
	GroundUnit(int hp) {
		super(hp);
	}
}

// ��������
class AirUnit extends Unit2 {
	AirUnit(int hp) {
		super(hp);
	}
}

class CommandCenter implements Irepairable{ //Scv ����
	
	
}
class Tank2 extends GroundUnit implements Irepairable{
	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank2";
	}
}

class Marine2 extends GroundUnit {
	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine2";
	}
}

class Scv extends GroundUnit implements Irepairable  {
	Scv() {
		super(60);
		this.hitpoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Scv";
	}

	// Scv ��üȭ, Ư��ȭ ������ ���
	// repair (�����ϴ�)
	/*
	void repair(Tank2 tank) {
		if (tank.hitpoint != tank.MAX_HP) {
			tank.hitpoint += 5;
		}
	}
	
	void repair(Scv scv){
		if(scv.hitpoint != scv.MAX_HP){
			scv.hitpoint += 5;
		}
	}
	*/
	/*
	 Scv �� repair Unit �� �����ϸ� Unit ������ŭ repair �Լ� �߰� 
	 ��� : �ϳ��� repair �Լ��� ��� repair ������ Unit�� ������ �� ������
	 ������ ��Ӱ��迡�� �θ�Ÿ���� �ڽ� ��ü�� �ּҰ��� ������.
	 �츮�� ������ �ִ� ��� Unit �� repair �� ����� �ƴϴ�
	 
	  �ᱹ���� ���� �������� ����~
	   �ذ�� : Interface 
	 1. ���� �������� ���� Ŭ������ ���ؼ� �ϳ��� ���� ������� (���� �θ� )
	   �������̽�(interface) �ϳ��� Ÿ�� ....
	 
	 
	 */
	/*interface Irepairable{   }
		class CommandCenter implements Irepairable
		class Tank2  extends GroundUnit implements Irepairable
		*/
	void repair(Irepairable repairunit) {
		//repairunit ������ � ��ü�� �ּ� : Tank2 , CommandCenter ,  Scv
		
		//repair �ϴ� ����� CommandCenter �� �� �ִ� �� Unit �ƴϴ�
		//���� ����� �ٸ��� 
		
		
		//repairunit �� �ڱ���� .... ����� ....
		//�θ�� �ڽ��� �͸� 
		
		//Unit2 >> hitpoint , MAX_HP
		
		//(Irepairable repairunit)  >> Tank2
		//downcasting  -> Tank2 tank = (Tank2)repairunit (���� Ÿ���� >> ���� Ÿ������)
		//downcasting  -> Scv scv = (Scv)repairunit (���� Ÿ���� >> ���� Ÿ������)
		
		//���
		//Tank2 > GroundUnit > Unit2
		//Scv   > GroundUnit > Unit2
		//������ : Unit2
		
		//CommandCenter > Unit2(x)
		//���������� ���ָ� parameter �޴µ� ..
		//�� parameter �� �ٸ� ������ĵ� ����
		if(repairunit instanceof Unit2) {
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP) { 
				unit.hitpoint = unit.MAX_HP;
			}
		}else {  //Unit2�� �θ�� ������ ���� ������
			     //�ڵ� ����
			     System.out.println("Unit2 �� �ƴϿ��� ,, �ٸ� ������� repair �մϴ�");
		}
	}
}

public class Ex04_Interface {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//����
		tank.hitpoint -=20;
		System.out.println("��ũ : " + tank.hitpoint);
		System.out.println("Scv  ���� ��û");
		scv.repair(tank);
		System.out.println("��ũ ���� �Ϸ� : " + tank.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);


	}

}
