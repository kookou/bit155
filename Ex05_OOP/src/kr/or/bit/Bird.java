package kr.or.bit;
//�� : ����(�Ϲ����̰� �߻�ȭ�� ����) : ���� �����ִ�, ���� ������ 
public class Bird {
	//������
	public void fly(){
		System.out.println("flying");
	}
	
	//���� ����ϴ� �༮�� moveFast �� ������ ������ ���ڴ�(90% ������)
	protected void moveFast(){
		fly();
	}

}
