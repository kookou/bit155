import kr.or.bit.Emp;

public class Ex01 {

	public static void main(String[] args) {
//		System.out.println("Hello World �߿� :<"); �����ּ�
		Emp emp = new Emp();
//		class�� �̸� = new class��();
		
//		kr.or.bit.Emp emp = new kr.or.bit.Emp(); import�� ���ٸ� �̷������� ������ ��θ� �ٿ���� �Ѵ�.
		
		emp.empno = 1000;
//		�̸�. �ش� �̸��� ������ �ִ� �ڿ��� ���.
		emp.ename = "ȫ�浿";
		emp.job = "����";
//		emp.data = 100;
		
		emp.setData(19582);
		System.out.println(emp.getData());
		
		emp.getEmpInfo();
		
//		����� �Ѹ� �� �߰��ϰ�ʹٸ� �̸��� �ٲ㼭 �� ���� �����ϸ� �ȴ�.
		Emp emp2 = new Emp();
		emp2.empno = 2000;
		emp2.ename = "������";
		emp2.job = "����";
		emp2.getEmpInfo();
		
		
	}

}
