package Study_200321;

import java.util.ArrayList;

import kr.or.bit.Emp;

public class Study_020321_Emp {
	public static void main(String[] args) {
		// 3. Emp Ŭ������ ����ؼ� ��� 3���� ���弼��
		// �� ArrayList<> �� ����ϼ���
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(10, "��", 3000, "����"));
		emplist.add(new Emp(20, "��", 10000, "����"));
		emplist.add(new Emp(30, "��", 4000, "������"));
		emplist.add(2, new Emp(10, "��", 3000, "����")); // �ش� �ε����� �ִ´�

		// 4. ����� ���� (���, �̸� , ����) �� ������ for ���� ����ؼ� ����ϼ���
		// toString() ������

		for (Emp e : emplist) {
			System.out.println(e.getEname() + "/" + e.getEno() + "/" + e.getJob() + "/" + e.getSal());
		}

		// 5. ����� ���� (���, �̸� , ����) �� �Ϲ� for ���� ����ؼ� ����ϼ���
		// toString() ������
		for (int i = 0; i < emplist.size(); i++) {
			System.out.println(emplist.get(i).getEname() + "/" + emplist.get(i).getEno() + "/" + emplist.get(i).getSal()
					+ "/" + emplist.get(i).getJob());
		}
		// 6.CopyEmp ��� Ŭ������ ���弼��(Emp �� ������)
		// job member field ��ſ� >>
		// private int sal; �� �ٲپ ���弼��(getter ,setter ����)
		// kr.or.bit.CopyEmp �� �ϼ���
		// ArrayList<> ���ʸ� ����ؼ� ��� 3�� ���弼��
		// �Ʒ� ������ ���
		// 100,"��",1000,"����"
		// 200,"��",2000,"������"
		// 300,"��",3000,"��ȹ"
		ArrayList<Emp> eemp = new ArrayList<Emp>();
		eemp.add(new Emp(100, "��", 1000, "����"));
		eemp.add(new Emp(200, "��", 2000, "������"));
		eemp.add(new Emp(300, "��", 3000, "��ȹ"));

		// 7.200�� ����� �޿��� 5000���� �����ؼ� ����ϼ���(�Ϲ� for�� �ȿ��� ....)
		// set �Լ�

		for (int i = 0; i < eemp.size(); i++) {
			if (eemp.get(i).getEno() == 200) {
				eemp.get(i).setSal(5000);
				System.out.println(eemp.get(i).getSal());
			}
		}
		// 8.300�� ����� �̸��� "�ñ���" �� �����ؼ� ����ϼ���(������ for�� �ȿ��� ....)
		// set �Լ�
		for(Emp e2 : eemp){
			if(e2.getEno() == 300){
				e2.setEname("�ڹٰ��Ⱦ�");
				System.out.println(e2);
			}
		}
		

	}

}
