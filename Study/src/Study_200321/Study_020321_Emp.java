package Study_200321;

import java.util.ArrayList;

import kr.or.bit.Emp;

public class Study_020321_Emp {
	public static void main(String[] args) {
		// 3. Emp 클래스를 사용해서 사원 3명을 만드세요
		// 단 ArrayList<> 를 사용하세요
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(10, "김", 3000, "개발"));
		emplist.add(new Emp(20, "박", 10000, "개발"));
		emplist.add(new Emp(30, "이", 4000, "디자인"));
		emplist.add(2, new Emp(10, "이", 3000, "아하")); // 해당 인덱스에 넣는다

		// 4. 사원의 정보 (사번, 이름 , 직종) 을 개선된 for 문을 사용해서 출력하세요
		// toString() 사용금지

		for (Emp e : emplist) {
			System.out.println(e.getEname() + "/" + e.getEno() + "/" + e.getJob() + "/" + e.getSal());
		}

		// 5. 사원의 정보 (사번, 이름 , 직종) 을 일반 for 문을 사용해서 출력하세요
		// toString() 사용금지
		for (int i = 0; i < emplist.size(); i++) {
			System.out.println(emplist.get(i).getEname() + "/" + emplist.get(i).getEno() + "/" + emplist.get(i).getSal()
					+ "/" + emplist.get(i).getJob());
		}
		// 6.CopyEmp 라는 클래스를 만드세요(Emp 와 같은데)
		// job member field 대신에 >>
		// private int sal; 로 바꾸어서 만드세요(getter ,setter 구현)
		// kr.or.bit.CopyEmp 로 하세요
		// ArrayList<> 제너릭 사용해서 사원 3명 만드세요
		// 아래 데이터 사용
		// 100,"김",1000,"개발"
		// 200,"이",2000,"디자인"
		// 300,"박",3000,"기획"
		ArrayList<Emp> eemp = new ArrayList<Emp>();
		eemp.add(new Emp(100, "김", 1000, "개발"));
		eemp.add(new Emp(200, "이", 2000, "디자인"));
		eemp.add(new Emp(300, "박", 3000, "기획"));

		// 7.200번 사원의 급여를 5000으로 수정해서 출력하세요(일반 for문 안에서 ....)
		// set 함수

		for (int i = 0; i < eemp.size(); i++) {
			if (eemp.get(i).getEno() == 200) {
				eemp.get(i).setSal(5000);
				System.out.println(eemp.get(i).getSal());
			}
		}
		// 8.300번 사원의 이름을 "궁금해" 로 수정해서 출력하세요(개선된 for문 안에서 ....)
		// set 함수
		for(Emp e2 : eemp){
			if(e2.getEno() == 300){
				e2.setEname("자바개싫어");
				System.out.println(e2);
			}
		}
		

	}

}
