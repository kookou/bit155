import javax.swing.plaf.synth.SynthSpinnerUI;

//static method �Լ� :
//Math.Random()
//Systsm.out static
//����, ���� ����ϴϱ�. ���ϰ� ���� ���ٰ� new ���� �ʾƵ�..
class StaticClass{
	int iv;
	
	
	static int cv;
	
	void m(){ //�Ϲ��Լ�
		//1. iv ���� ������ ��� �ִ� (o) 
		iv = 100;
		//2. cv ���� ������ ��� �ִ� (o) >> ��������
		//[****static �ڿ��� �׻� �Ϲ� �ڿ����� �޸𸮿� ���� �����ȴ�****]
		//StaticClass.cv = 100; ��Ģ
		cv = 200;
		
	}
	
	static void sm(){ //����ƽ �Լ���
		//1.�Ϲ� ������ iv ���� ������ ��� �ִ�(x) //memory ���� ����
		//iv = 200;
		//2.static ������ cv ���� ������ ��� �ִ� (o)
		cv = 500;
		//error �������� �������� ��ƶ� (static�� static ���� ��ƶ�)
	}
}

public class Ex09_Static_Method {
	public static void main(String[]args){
		//��Ģ���� ���
		//StaticClass sc = new StaticClass();
		//sc.�Լ��̸�...
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		//�Ϲ� �ڿ� ���
		StaticClass sc = new StaticClass();
		sc.m();
		System.out.println(sc.iv);
		System.out.println(sc.cv);
		System.out.println(StaticClass.cv);


	}

}
