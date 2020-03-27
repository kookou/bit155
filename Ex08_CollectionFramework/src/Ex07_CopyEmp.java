import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex07_CopyEmp {

	public static void main(String[] args) {
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(100,"김",1000));
		emplist.add(new Emp(200,"이",2000));
	    emplist.add(new Emp(300,"박",3000));
	// 7.200번 사원의 급여를 5000으로 수정해서 출력하세요(일반 for문 안에서 ..//setter 사용)
	    for(int i = 0; i < emplist.size(); i++){
	    	if(emplist.get(i).getEmpno() ==200){
	    		emplist.get(i).setSal(5000);
	    		System.out.println(emplist.get(1).toString());
	    	}
	    }
   // 8.300번 사원의 이름을 "궁금해" 로 수정해서 출력하세요(개선된 for문 안에서 ....)

	    for(Emp emp : emplist){
	    	if(emp.getEmpno() == 300){
	    		emp.setEmpname("궁금해");
	    		System.out.println(emp.toString());
	    	}
	    }
	}
}
