package kr.or.bit;
//vo, dto, domain ��Ī �Ѵ� �̷� Ŭ���� (������ �ϳ��� ������ �ִ� Ŭ����)
public class CopyEmp {
	private int empno;
	private String empname;
	private int sal;
	public CopyEmp(int empno, String empname, int sal) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.sal = sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", empname=" + empname + ", sal=" + sal + "]";
	}
	

}
