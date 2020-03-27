package kr.or.bit;

public class Emp {
	private int eno;
	private String ename;
	private int sal;
	private String job;
	public Emp(int eno, String ename, int sal,String job){
		super();
		this.eno = eno;
		this.ename =ename;
		this.sal = sal;
		this.job = job;
		
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Emp [사원번호 = " + eno + ", 사원이름 = " + ename + ", 사원급여 = " + sal + ", 사원직종 = " + job + "]";
	}
	
	

}
