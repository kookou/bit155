import kr.or.bit.Fclass;
import kr.or.bit.Notebook;

public class Ex02_Method {

	public static void main(String[] args) {
		Fclass fc = new Fclass();
		fc.m();
		
		fc.m2(10);
		
		int result = fc.m3();
		System.out.println(result);
		
		result = fc.m4(100);
		System.out.println(result);
		
		//1.fc.subsum() ȣ�⿩��
		//int subsum(int i){} default ������
		
		fc.CallSubSum();
		
		result = fc.opSum(-1);
		System.out.println(result);
		
		
		/////////////////////////
		Notebook nb = new Notebook();
		nb.color="red";
		
		nb.setYear(-20000);
		int rs = nb.getYear();
		System.out.println(rs);
		
		nb.setYear(2020);
		rs = nb.getYear();
		System.out.println(rs);
		
		result = fc.max(500,300);
		System.out.println("a�� b�� ���� �� ū ����: " + result);
		
		int result2 = fc.max(100, -50);
		System.out.println(result2);
		
		
		
		

	}

}
