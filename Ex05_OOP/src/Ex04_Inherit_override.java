/*
 Today Point
 [��� ����] override : ��� ���迡�� �޼ҵ� [������] *����� ������ �������̵尡 �������� �ʴ´�
 [��Ӱ��迡]�� [�ڽ� Ŭ����]�� [�θ� Ŭ����]�� [�޼ҵ�]�� ������(���� �ٲ۴�)
 ������ : Ʋ�Ǻ�ȯ(�Լ��� �̸�, Ÿ��) �ϴ� ���̾ƴϰ� ���븸 {��Ⱑ ��ȭ}
 ����)
 1.�θ� �Լ� �̸� ����
 2.�θ� �Լ� parameter ����
 3.�θ� �Լ� return Type ����
 4.�ᱹ���� {����� ���� ���븸 �ٲܼ� �־��}
 �����ε�  �ϳ��� �̸����� �������� ����� �մϴ�
 �������̵� ��Ӱ��迡�� �޼ҵ� ������
 */

class Point2 {
	int x = 4;
	int y = 5;

	String getPosition() {
		return "x : " + this.x + "y : " + this.y;
	}
}

class Point3D extends Point2 {
	int z = 6;
	//�θ��� �Լ��� Ʋ�� �Ȱ��� >> ���븸 �ٸ���
	//������..
	
	//Annotation�� Java code ������ �����Ҽ����� [�ΰ����� ����]�� �����Ϸ�, �������� ����
	//@Override  >> Annotation >> ������ �˻縦 �ض�
	@Override
	String getPosition(){
		return "x : " + this.x + "y : " + this.y+"z : " + this.z;
	}

}

public class Ex04_Inherit_override {

	public static void main(String[] args) {
		Point3D po = new Point3D();
		System.out.println(po.getPosition()); //�������� �Լ��� ȣ��ȴ�
		
	}

}
