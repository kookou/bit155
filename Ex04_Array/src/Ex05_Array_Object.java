import kr.or.bit.Emp;

public class Ex05_Array_Object {
	public static void main(String[] args) {
		// 1. ��� 3���� ���弼�� (�� �迭�� ����ϼ���)
		// 1000,ȫ�浿
		// 2000,������
		// 3000,������
		// ������ ������ ����ϼ���

		Emp[] emp = new Emp[3];
		emp[0] = new Emp();
		emp[0].setEmpno(1000);
		emp[0].setEname("ȫ�浿");

		emp[1] = new Emp();
		emp[1].setEmpno(2000);
		emp[1].setEname("������");

		emp[2] = new Emp();
		emp[2].setEmpno(3000);
		emp[2].setEname("������");

		// 2.��� 3���� �����, �̸��� ����ϼ���
		for (int i = 0; i < emp.length; i++) {
			emp[i].empInfoPrint();
		}

		// int[]arr = new int[]{10,20,30}
		// ��� 2�� ���弼��
		Emp[] emplist = new Emp[]{new Emp(1,"�̾�"),new Emp(2,"�ھ�")};
		for (int i = 0; i < emplist.length; i++) {
			emplist[i].empInfoPrint();
		}
		
		//int[] arr = {10,20}
		Emp[] emplist2 = {new Emp(3,"�达"),new Emp(4,"�ھ�")};
		for (int i = 0; i < emplist2.length; i++) {
			emplist2[i].empInfoPrint();
		}
		
		
		

	}

}
