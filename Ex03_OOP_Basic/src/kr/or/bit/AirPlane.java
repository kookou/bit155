package kr.or.bit;
/*
�츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ� �ϴ� ȸ���Դϴ�
�츮 ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ� �Ϸ��� �մϴ�
�䱸����
1.����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ� �մϴ�
2.����Ⱑ ����Ǹ� ������� �̸��� ��ȣ �°� �ο��Ǿ��� Ȯ�� �ϴ� �۾��� �ʿ��մϴ� (������� Ȯ��)
3.�������� ������� ������� ������� �Ѵ�� (����)�� Ȯ�� �� �� �ֽ��ϴ�

AirPlane air = new AirPlane();
AirPlane air2 = new AirPlane();
AirPlane air3 = new AirPlane();

*/

public class AirPlane {
	private int number;
	private String name;
	private static int total; //��� ��ü�� �����ϴ� �ڿ�
	
	//public  AirPlane (){}
	
	
	public AirPlane(int number ,String name) { //����� �ݵ�� ��ȣ, �̸��� �־��
		this.number = number;
		this.name = name;
		total ++;
	}


	public static void AirPlanePrint(){
		System.out.printf("���� ������� ���� ������ %d�� �Դϴ�.",total);
	}
	public void airPlaneInfo(){
		System.out.printf("�� �������  ��ȣ�� %d, �̰� �̸��� %s �Դϴ�.\n",number,name);
	}
	
	

}
/*
 public class AirPlane {
	private int airnum;
	private String airname;
	private static int airtotalcount; //��� ��ü�� �����ϴ� �����ڿ�

	public void makeAirPlane(int num , String name) {
		airnum = num;
		airname = name;
		//����
		airtotalcount++;
		System.out.printf("��ȣ:[%d] , �̸�:[%s]\n",airnum,airname);
	}
	
	public void airPlaneTotalCount() {
		System.out.printf("�� ����� ���� �� �� :[%d]\n",airtotalcount);
	}
}


 */
