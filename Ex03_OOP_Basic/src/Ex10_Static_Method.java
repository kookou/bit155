
public class Ex10_Static_Method {
	
	public void method (){
		System.out.println("�� �Ϲ� �Լ���");
	}
	
	public static void smethod(){
		System.out.println("�� static �Լ���");
	}

	public static void main(String[] args) {
		//�� �Ϲ� �Լ��� �� ����� ������
		Ex10_Static_Method.smethod();
		smethod();
		Ex10_Static_Method m = new Ex10_Static_Method();		
		m.method();
	
	}

}
