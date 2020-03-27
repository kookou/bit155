import java.util.ArrayList;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

class Product{
	int price;
	int bonuspoint;
	//Product() {
	//}
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price / 10.0);
	}
}
class KtTv extends Product{  //KtTv kttv = new KtTv() >> ������ ������ �Է�
	KtTv(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
	
}
class Audio extends Product{  //Audio audio = new Audio() >> ������ ������ �Է�
	Audio(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{  //NoteBook notebook = new NoteBook() >> ������ ������ �Է�
	NoteBook(){
		super(150);
	}
	@Override
	public String toString() {
		return "NoteBook";
	}
}
public class Ex07_Generic_Quiz {
	public static void main(String[] args) {
		//1. Array �迭�� ����ؼ� cart ����� ��ǰ�� �������� (tv, audio , notebook)
		Product[] cart = new Product[3]; // ������
		cart[0] = new KtTv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		//2. ArrayList �� ����ؼ� cart �� ����� ��ǰ�� ��������  (tv, audio , notebook)
		//�� generic ����ϼ���
		//��ǰ�� �̸��� ����ϼ���
		ArrayList<Product> pcart = new ArrayList<Product>();
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new NoteBook());

		for (Product product : pcart) {
			System.out.println(product.toString());
		}
		//3. Emp Ŭ������ ����ؼ� ��� 3���� ���弼��
		//��  ArrayList<> �� ����ϼ���
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(1000, "�达", "IT"));
		emplist.add(new Emp(2000, "�ھ�", "SALES"));
		emplist.add(new Emp(3000, "�̾�", "MANAGER"));
		
		//4. ����� ���� (���, �̸� , ����) �� ������ for ���� ����ؼ� ����ϼ���
		//toString() ������
		for (Emp emp : emplist) {
			System.out.println(emp.getEmpno() + "/" 
		                     + emp.getEmpname() + "/" 
					         + emp.getJob());
		}
		
		//5. ����� ���� (���, �̸� , ����) �� �Ϲ� for ���� ����ؼ� ����ϼ���
		//toString() ������
		for (int i = 0; i < emplist.size(); i++) {
			System.out.println(
					emplist.get(i).getEmpno() + "/" 
			      + emplist.get(i).getEmpname() + "/" 
				  + emplist.get(i).getJob());
			
		}
		
		// 6.CopyEmp ��� Ŭ������ ���弼��(Emp �� ������)
		// job member field ��ſ� >>
		// private int sal; �� �ٲپ ���弼��(getter ,setter ����)
		// kr.or.bit.CopyEmp �� �ϼ���
		// ArrayList<> ���ʸ� ����ؼ� ��� 3�� ���弼��
		// �Ʒ� ������ ���
		// 100,"��",1000
		// 200,"��",2000
		// 300,"��",3000
		ArrayList<CopyEmp> clist = new ArrayList<>();
		clist.add(new CopyEmp(100, "��", 1000));
		clist.add(new CopyEmp(200, "��", 2000));
		clist.add(new CopyEmp(300, "��", 3000));
		
		
		// 7.200�� ����� �޿��� 5000���� �����ؼ� ����ϼ���(�Ϲ� for�� �ȿ��� ....)
		//set �Լ�
		for (int i = 0; i < clist.size(); i++) {
			if (clist.get(i).getEmpno() == 200) {
				clist.get(i).setSal(5000);
				System.out.println(clist.get(i).toString());
			}
		}
		// 8.300�� ����� �̸��� "�ñ���" �� �����ؼ� ����ϼ���(������ for�� �ȿ��� ....)
		//set �Լ�
		for (CopyEmp emp : clist) {
			if (emp.getEmpno() == 300) {
				emp.setEmpname("�ñ���");
				System.out.println(emp.toString());
			}
		}
	}

}










