import kr.or.bit.Emp;

public class Ex01 {

	public static void main(String[] args) {
//		System.out.println("Hello World 추워 :<"); 라인주석
		Emp emp = new Emp();
//		class명 이름 = new class명();
		
//		kr.or.bit.Emp emp = new kr.or.bit.Emp(); import가 없다면 이런식으로 일일히 경로를 붙여줘야 한다.
		
		emp.empno = 1000;
//		이름. 해당 이름이 가지고 있는 자원이 뜬다.
		emp.ename = "홍길동";
		emp.job = "과장";
//		emp.data = 100;
		
		emp.setData(19582);
		System.out.println(emp.getData());
		
		emp.getEmpInfo();
		
//		사원을 한명 더 추가하고싶다면 이름을 바꿔서 또 값을 저장하면 된다.
		Emp emp2 = new Emp();
		emp2.empno = 2000;
		emp2.ename = "김유신";
		emp2.job = "차장";
		emp2.getEmpInfo();
		
		
	}

}
