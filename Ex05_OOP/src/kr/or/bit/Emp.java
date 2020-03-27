package kr.or.bit;

//class >> 목적 >> DTO , VO, DOMAIN
public class Emp { // class Emp extends Object 생략되어있다
	private int empno;
	private String ename;

	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;

	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return ename;
	}

	public void setName(String name) {
		this.ename = name;
	}

	// toString() 함수 주인은 Object
	// 상속관계에서 toStin()내 멋대로 하고싶다
	// Object >> private String toString() <<재정의 하지마세요
	// Object >> public String toString() <<필요하다면 재정의 하세요
	// 재정의 하면 무조건 재정의한 메소드로 간다 부모를 부를수 없음 

	/*
	  @Override public String toString() { return "배고파 디진다"; // << Object 가 가지는
	  toString 함수를 재정의 }
	 */
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}

}
