// �ΰ��� ���赵
class Tv{
	boolean power;
	int ch;
	
	void power(){
		this.power = !this.power; //<��۸� true �� false �� ���� ���� �¿��� ���� ���� �ʿ� ����
	}
	void chUp(){
		this.ch++;
	}
	void chDown(){
		this.ch--;
	}
}
class Vcr{ //���� �÷��̾�
	boolean power;
	void power(){
		this.power = !this.power;
	}
	void play(){
		System.out.println("����ϱ�");
	}
	void stop(){
		System.out.println("�����ϱ�");
	}
	void rew(){}
	void ff(){}
}
//Tv ���赵, Vcr ���赵
//TvVr ��� ���赵 ������ּ���
//���� Tv, Vcr ���赵 �̿�
//���, ����
//class TvVcr extends Tv, Vcr ���߻�� ����
//class Tv extends Vcr
//class TvVcr extends Tv ������ ���  ���� �̸��� ��ɵ��� ������ �����

//TvVcr �ֱ��: ���� ��� >>������ ���� Ŭ������ ��ӹ޴´�
//�������� �������� ����

class TvVcr extends Tv{
	Vcr vcr;
	TvVcr(){
		vcr = new Vcr();
	}
}

public class Ex03_Inherit_Single {

	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();       
		System.out.println("TV �������� : "+t.power);
		t.chUp();
		System.out.println("TV ä�λ��� : "+t.ch);
		
		
		
		//����
		t.vcr.power();
		System.out.println("���� �������� : " + t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power();
		System.out.println();
		

	}

}
