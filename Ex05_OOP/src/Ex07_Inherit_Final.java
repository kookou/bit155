/*
 ���� <-> ���
 ��� : �ѹ� ���� �ʱ�ȭ �Ǹ� ������ �Ұ���
 ��� �ڿ� : ������(�ֹι�ȣ),�������� �� : PI=3.1459...
 ����� ���������� [�빮�ڷ� ����]
 
 java : final int NUM = 10;
 c#   : const int NUM = 10;
 
 final Ű����
 Ŭ���� �տ� >> final class Car{ } >> final Math >> ��ӺҰ�
 �Լ��տ� >> public final void print () { } >> ��� >> ������ ������
         public static final void print() { }
         public final String KIND = "heart" //���
         
 */
class Vcard2{
	final String KIND;
	final int NUM;
	/*
	Vcard2(){
		this.KIND = "heart";
		this.NUM = 10;
	}
	*/
	//Vcard2(){}
	
	Vcard2(String kind, int num){
		this.KIND = kind;
		this.NUM = num;
	}
	@Override
	public String toString() {
		return "Vcard [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}
class Vcard {
	final String KIND = "heart";  //�ѹ� �ʱ�ȭ �� ���� ������ �Ұ��� �ϴ�
	final int NUM = 10;

	void method() {
		// �ڹ� API �ý��� ���
		System.out.println(Math.PI);

	}

	
}

//Vcard ī�� 53�� ����� ��� ī��� ��� >> KIND >> heart
//Ȥ�� 53���� ī�� KIND �� �� �ٸ��� ����� ������ ������ ����� ���� �ٲ����ʰ�

public class Ex07_Inherit_Final {

	public static void main(String[] args) {
		//Vcard v = new Vcard();
		//v.method();
		//v.NUM = 1000; //The final field Vcard.NUM cannot be assigned
		
		Vcard2 c = new Vcard2("spade",1);
		System.out.println(c.toString());
		Vcard2 c2 = new Vcard2("spade",2);
		System.out.println(c2.toString());
		Vcard2 c3 = new Vcard2("spade",3);
		System.out.println(c3.toString());
		//c.KIND = "heart"; //�ѹ� �ʱ�ȭ�� ���� �缳�� �Ҽ� ����. �̰��� �����
		
		
	}

}
