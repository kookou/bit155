import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex07_CopyEmp {

	public static void main(String[] args) {
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(100,"��",1000));
		emplist.add(new Emp(200,"��",2000));
	    emplist.add(new Emp(300,"��",3000));
	// 7.200�� ����� �޿��� 5000���� �����ؼ� ����ϼ���(�Ϲ� for�� �ȿ��� ..//setter ���)
	    for(int i = 0; i < emplist.size(); i++){
	    	if(emplist.get(i).getEmpno() ==200){
	    		emplist.get(i).setSal(5000);
	    		System.out.println(emplist.get(1).toString());
	    	}
	    }
   // 8.300�� ����� �̸��� "�ñ���" �� �����ؼ� ����ϼ���(������ for�� �ȿ��� ....)

	    for(Emp emp : emplist){
	    	if(emp.getEmpno() == 300){
	    		emp.setEmpname("�ñ���");
	    		System.out.println(emp.toString());
	    	}
	    }
	}
}
