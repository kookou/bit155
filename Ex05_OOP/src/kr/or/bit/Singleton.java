package kr.or.bit;
//������ ����(��������) >> new >> ��ü�� ����� ���
//��ü �ϳ��� ���� �����ؼ� ���ڴ�
//ȸ�� : ���� ������

//���� : ��ü�� �ּҰ� �׻� �����ϴ� >>�ϳ��� ��ü�� �����ϰڴ�

//Ȱ�� : JDBC :JAVA < (JDBC : CRUD) > DB


//Singleton singleton = new Sinlgeton(); >> ������ ȣ�� >>����(private)
class Single{
	private Single s;
	private Single(){
		
	}
	
	
}
public class Singleton {
    private static Singleton p;
	private Singleton(){ //������(dsfault) //���� ��ü ���� �Ұ�
		
	}
	public static Singleton getInstance(){
		if(p == null){
			p = new Singleton(); 
			//singleton = new Sinlgeton(); 
			//���� Ŭ���� ���ο����� private �� public�� ���� ���� �ʴ´�.
		}
		return p;
	}
	

}
