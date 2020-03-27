/*
 �߻� Ŭ����
 >>�̿ϼ� Ŭ����(���赵)
 1. �ϼ��� �ڵ� + �̿ϼ� �ڵ� 
 2. �ϼ�(�Լ�) ���� ���� �ִ� �Լ� + �̿ϼ�(�Լ�) ������� ���� �Լ�(public void run(); >> {x} �߻��Լ�)
 3. �ϼ��� �̿ϼ� ���� (new ��ü ���� �Ҽ��ֳ� ������ ����(�ϼ��� Ŭ������ ��ü���� ����),�̿ϼ�(��ü�����Ұ�))
 
 ����
 1.�߻�Ŭ����(�̿ϼ�) ������ ��ü ������ �Ұ� (new ��� �Ұ�)
 2.�߻�Ŭ������ �ᱹ �ϼ��� Ŭ������ �Ǵ� ���� ���� >> ����� ���� (������)
 3.��Ӱ��迡�� �̿ϼ��� �ڿ�(�߻��ڿ�) �ϼ��ض� (�����ض�) >> ������ �ض�(override)
 
  ������ ���忡�� �߻�Ŭ������ �ٶ󺸴� �ð�
 ���࿡ �߻� Ŭ������ ����ٸ� > ���� �ǵ��� ���� �ϱ�?  >> ������ ������ �������� (������ ������) 
 */
abstract class Abclass{
	//�߻� Ŭ���� �߻� �ڿ��� ���� �ڴ�
	int pos;
	void run(){
		pos++;
	}
	//�̿ϼ�
	abstract void stop(); //�߻��ڿ� {} >> ���� ���� ����
}

//����� �������� ������ >> �߻� Ŭ������ �¾���� �ʾҴ�..
class Child extends Abclass{
	@Override
	void stop() { //���� ���� ������ �ȴ�. �� �ȿ� ������ ������ ����� ����.		
		this.pos = 0;
		System.out.println("stop : " + this.pos);
	}
}
class Child2 extends Abclass{
	@Override
	void stop() { //���� ���� ������ �ȴ�. �� �ȿ� ������ ������ ����� ����.		
		this.pos = -1;
		System.out.println("stop : " + this.pos);
	}
}

public class Ex01_abstract_class {

	public static void main(String[] args) {
		//Abclass ab = new Abclass(); �Ұ�
		Child ch = new Child();
		ch.run();
		ch.run();
		System.out.println(ch.pos);
		ch.stop();
		
		Child2 ch2 = new Child2();
		ch2.run();
		ch2.run();
		System.out.println(ch2.pos);
		ch2.stop();
		
		//������
		Abclass ab = ch; //�θ�Ÿ���� ���������� �ڽ� Ÿ���� ��ü �ּҸ� ������ �ִ�.
		                 //�θ�� �ڽ��� Ÿ�� �ڿ��鸸 Ȱ��
		                 //********** �θ�� ���� �ϴ��� �� �ڿ��� ������ �Ǿ��ִٸ� �ڽ� �ڿ����� ���� �Ѵ�.*********
		ab.run();
		ab.stop();
		//�׷��� ���� �θ� �ʿ� �����ϰ� ������ (super)

	}

}
