package kr.or.bit;

public class Notebook {
	public String color;
	private int year;
	//���� �Ҵ��� ���� ���� �Ҵ��� ���ؼ� �ڷḦ ��ȣ�ϰڴ�
	
	public void setYear(int y){  //year��� ������ write �� ����ϴ�
		if(y<0) {
			year = 1999;
		}else{
			year = y;
		}
	}
	public int getYear(){   //year��� ������ read �� ����ϴ�
		return year;
	}
	
	public Mouse handle(Mouse m) { //Point >> �ּҰ� >> mouse
		m.x=100;
		m.y=200;
		return m;
	}

}
