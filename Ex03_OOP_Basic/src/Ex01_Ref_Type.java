import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person; // �ȿ� Ŭ���� 200��  >> ������ ��������
import kr.or.bit.Tv;

//import kr.or.bit.a; aŬ���� �� ��� �߱��� >> ����ؼ� �������� ���δ�.

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		
		
		//��Ÿ�� (������� : �޸�)
		int i = 100;
		i = 200;
		System.out.println("i : " + i);
		
		//����Ÿ��
		Person person; //����  >> stack �̶�� �޸� ������ ������ ����� ���� 
		person = new Person(); //person �̶�� ������ ��(�ּҰ�) �� �Ҵ� 
		System.out.println(person); //kr.or.bit.Person@15db9742
		
		//�ʱⰪ �Ҵ�
		Person person2 = null; //null (��ü�� �ʱⰪ >> ���� ����, ��� �ִ�)
		System.out.println(person2); //������ �ִ� �޸𸮸� ������ ���� �ʴ�.
		
		//person2 �� �޸𸮸� ���� �����
		//1.person2 = new Person();  //new ������
		//2.person2 = person;        //���� Ÿ���� �ּҰ��� �Ҵ��ϴ� ���
		
		person2 = person;
		System.out.println(person==person2);  //true �������� ���
		
		person2.name = "ȫ�浿";
		person2.age = 100;
		person2.print();
		
		System.out.println(person.name);
		
		//����� �Ҵ��� ���ÿ�
		Person myperson = new Person();
		myperson.name = "�ƹ���";
	    myperson.print();
	    System.out.println(myperson.power);  //default : false
		
		//Tv ����� ä���� 5���� �÷� ������
	    //Tv �귣��� ��Ʈ��� �ϼ���
	    Tv mytv = new Tv();
	    mytv.brandname = "��Ʈ";
	    System.out.println("���� ä������ : " + mytv.ch);
	    
	    mytv.ch_Up();
	    mytv.ch_Up();
	    mytv.ch_Up();
	    mytv.ch_Up();
	    mytv.ch_Up();
	    
	    System.out.println("���� ä������ : " + mytv.ch);
	    
	    mytv.ch_Down();
	    mytv.ch_Down();
	    mytv.ch_Down();
	    
	    System.out.println("���� ä������ : " + mytv.ch);
	    System.out.println("�귣�� �̸� : " + mytv.brandname);
	    mytv.tv_Infor();
	    
	    //��� �Ѹ� ����
	    
	    Emp emp = new Emp();
	    emp.empnum = 7788;
	    emp.empname = "������";
	    emp.job = "IT";
	    
	    System.out.println(emp.bodyinfo); //null
	    
	    BodyInfo bodyinfo = new BodyInfo ();
	    bodyinfo.height = 190;
	    bodyinfo.weight = 90;
	    emp.bodyinfo = bodyinfo; //�Ҵ�(�ּҰ� �Ҵ�)
	    
	    System.out.println(emp + "/" + emp.bodyinfo);
	    System.out.println(emp.empnum + "/" + emp.bodyinfo.height);
	    System.out.println(emp.empnum + "/" + emp.bodyinfo.weight);
	    

	    

		
		
		
		
		

	

	}

}
