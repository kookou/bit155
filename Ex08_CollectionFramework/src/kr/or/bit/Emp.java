package kr.or.bit;
//vo, dto, domain 통칭 한다 이런 클래스 (데이터 하나를 담을수 있는 클래스)
public class Emp {
	private int empno;
	private String empname;
	private String job;
	public Emp(int empno, String empname, String job) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.job = job;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getJob() {
		return job;
	}
	public void setSal(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", empname=" + empname + ", job=" + job + "]";
	}
	

}
