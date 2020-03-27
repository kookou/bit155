/*
 ������(��Ӱ��迡�� ����)
 ������ : �������� ����(��ä)�� ���� �� �ִ� �ɷ�
 
 c# : ������ (overloading , override)�ɷ�
 JAVA : [��Ӱ���]���� [�ϳ��� ��������]�� [�������� Ÿ��]�� ���� �� �ִ�
                  ��, �ϳ��� ����������[�θ�Ÿ��] �̾�� �Ѵ�
 �θ� Ÿ���� ���� ������ �������� �ڽ� Ŭ���� ��ü�� ���� �� ���ִ�.
 
 --������ : ���� ����� �ݴ�
  ���� : �θ�� �ڽĿ��� ���� ���� �ش�
  �ڹ� : �ڽ��� �θ𿡰� ���Ǿ��� �ش�
 */
class Tv2 { // �θ�Ÿ��(�Ϲ�ȭ, �߻�ȭ)�� �����ڿ�
	boolean power;
	int ch;

	void power() {
		this.power = !this.power;
	}

	void chUp() {
		this.ch++;
	}

	void chDown() {
		this.ch--;
	}
}

class CapTv extends Tv2 { // CapTv Ư��ȭ, ��üȭ �� ������ ǥ��
	String text;

	String captionText() {
		return this.text = "���� �ڸ� ó����";
	}

}

public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("����: " + captv.power);

		captv.chUp();
		System.out.println("ä������: " + captv.ch);
		System.out.println("�ڸ�ó��: " + captv.captionText());
		//���� ����
		//���� Ÿ�� ������ �Ҵ�
		//Car c = new Car();
		//Car c2 = c;
		Tv2 tv2 = captv; //[��Ӱ���]���� [�θ�Ÿ��]�� �ڽ� Ÿ���� �ּҸ� ���� �� �ִ�(������)
		//�� �θ�� �ڽ��� ��ü�� �� �� �ִ�.
		//�� �����Ǹ� �����ϰ�
		//Tv2 tv = new Tv2(); �޸𸮸� �� ���� �ϴ°�(�̹� �ڽ���new �ϸ鼭 �޸𸮿� ������)
		System.out.println(tv2.toString());
		System.out.println(captv.toString());
		//�ڽ��� �ڿ��� �����ִ�. 

	}

}
