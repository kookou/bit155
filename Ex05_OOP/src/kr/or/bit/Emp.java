package kr.or.bit;

//class >> ���� >> DTO , VO, DOMAIN
public class Emp { // class Emp extends Object �����Ǿ��ִ�
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

	// toString() �Լ� ������ Object
	// ��Ӱ��迡�� toStin()�� �ڴ�� �ϰ�ʹ�
	// Object >> private String toString() <<������ ����������
	// Object >> public String toString() <<�ʿ��ϴٸ� ������ �ϼ���
	// ������ �ϸ� ������ �������� �޼ҵ�� ���� �θ� �θ��� ���� 

	/*
	  @Override public String toString() { return "����� ������"; // << Object �� ������
	  toString �Լ��� ������ }
	 */
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}

}
