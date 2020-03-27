import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		//��� 1���� ���弼��
		Emp emp = new Emp(100,"������","����");
		System.out.println(emp.toString());

		//Array(�����迭)
		//��� 2�� ���弼��
		Emp[] emplist = {new Emp(100,"�达","�Ϲ���"), new Emp(200,"�ھ�","�л�")};
		for(Emp e : emplist) {
			System.out.println(e.toString());
		}
		//�Ѹ��� �Ի縦 �� �߳׿� ... �߰� ��Ű���� (x)
		
		//Collection
		ArrayList list = new ArrayList();
		list.add(new Emp(1,"��","IT"));
		list.add(new Emp(2,"ȫ","IT"));
		System.out.println(list);
		//System.out.println(list.toString());
		//[xx����.toString() , yy����.toString()]
		System.out.println(list.get(0)); //Emp [empno=1, ename=��, job=IT]
		//toString .....
		//toString Ȱ������ ���� ��� ����� ������
		//�Ϲ� for��
		for(int i = 0 ; i < list.size() ; i++) {
			//list.get(i)
			//Object obj = list.get(i);
			//Emp e = (Emp)obj;
			//System.out.println(obj);
			
			
			Emp e = (Emp)list.get(i); //�θ� >> �ڽ� >> �ڽ�Ÿ�Կ� �°� casting
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
		}
		
		//toString ������� ���� ������ for ������ ����ϼ���
		//��¥�� ... ĳ���� ..... �ٿ� .... ������ .....
		//���ʸ� (Ÿ���� ������ )
		for(Object obj : list) {
			Emp e = (Emp)obj;
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
		}
		
		//Object ������ .. generic
		ArrayList<Emp> list2 = new ArrayList<Emp>(); //���� ������ ���� Ÿ���� Emp Ÿ��
		list2.add(new Emp(1,"A","IT"));
		list2.add(new Emp(2,"B","IT"));
		
		for(Emp e : list2) {
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
		}
		
		//�׷��� ... �ű� ��� �Ի� ....
		list2.add(new Emp(3,"New","New")); 
	}

}













