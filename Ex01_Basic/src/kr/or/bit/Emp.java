package kr.or.bit;

//����̶�� ���赵
//����� ������ ��� ����� ����ϴ� �Լ��� ������ ���赵�� ����� �ִ�.
//class 155th{ }
public class Emp {
//	Ŭ���� = ���赵. ��üȭ��Ű�� ������ �����ɰ����� ������ �ʴ´�.

	public int empno; 
	//������ ��� ����, ����� ����� ������ �ִ�. (��� : ����)
	
	public String ename;
//	������ ��� ����, ����� �̸��� ������ �ִ�. (�̸� : ���ڿ�)
	
	public String job;
//	����� ������ ������ �ִ�. (���� : ���ڿ�)
	
	
//	���� : ����(������)�� ���� �� �ִ� ����. ������ ��ȭ�� �� �ִ�. = instance variable(��ü ����), member field(�� ū ����)

	
	private int data;
//	ĸ��ȭ �� �ڿ��� ��ȣ�ϰڴ�.
//	���� �Ҵ��� ���� ���� �Ҵ��� ���ؼ� ������ ��ȣ.
	
//	���, �������� = �Լ� = method
//	�Ʒ��� �Լ��� read����̴�.
	public int getData(){ //getter
		return data; //data��� member field�� ������ ���� ������ ���̴�.
	}
	
	//���
//	write���
	public void setData(int input){ //setter
		if(input < 0){
			data = 0;
		}else{
			data = input;
		}
	}
//	private �����Ϳ� ���������� �����ؼ� Ư���� ������ �����ϴ� ���� �����ִ� �Լ�.
	
//	����ϴ� ���(�������� = �Լ� = method)
//	�Լ��� �ݵ�� ȣ�⿡ ���ؼ��� �����Ѵ�.
	public void getEmpInfo(){
		System.out.println(empno + "/" + ename + "/" + job);
	}
	
	
}
