//�ڹ� ������ (���)
class Pbase {
	int p = 100;
}

class Cbase extends Pbase {
	int c = 200;
}

class Dbase extends Pbase {

}

public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase.toString());

		Pbase p = cbase; // ������
		// �θ�Ÿ���� �������� p �� �ڽ� Ÿ���� �ڽ�Ÿ�� �������� class �� ������ �ּҰ��� ���� �� �ִ�.
		// �� �θ� Ÿ���� �������� ������ ���� ��ü�� ��밡�� �ڽ��� ���� �Ұ�
		Dbase dbase = new Dbase();

		p = dbase; // ���
		//�θ�Ÿ�� p �� �ڽ� Ÿ�� cbase �� �ּҵ� ������ �ְ� Dbase �� �ּҵ� ������ �ִ�.
		//p ��� ������ �������� �ڽ� Ÿ���� �ּҸ� ���� �� �ִ� (���� : ��Ӱ��迡��)
		//�ϳ��� �θ�Ÿ���� �ڽ��� �����ϴ� �������� �ڽ� Ÿ���� �ּҸ� ���� �� �ִ�.

	}

}
