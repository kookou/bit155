import kr.or.bit.Emp;

class Test2 {
	int x = 100;
	void print() {
		System.out.println("�θ��Լ�(Test2)");
	}
}

class Test3 extends Test2 {
	int x = 300; //�θ� �����ϱ� //����������
	@Override
	void print() {
		System.out.println("�ڽ��� �θ��Լ� ������");
	}

	// �����ε�(��Ӱ� ����� ����)
	void print(String str) {
		System.out.println("�� �����ε� �Լ���" + str);
	}
}

public class Ex05_Inherit_override {

	public static void main(String[] args) {
		Emp emp = new Emp(1000, "������");
		System.out.println(emp.toString()); // kr.or.bit.Emp@15db9742
		// Object �� ������ �ִ� to String() �� ��ü�� �ּҸ� �����Ѵ�
		System.out.println(emp); // toString() default �� kr.or.bit.Emp@15db9742

		Test3 test3 = new Test3();
		test3.print();
		test3.print("�����ε�");
	}

}
