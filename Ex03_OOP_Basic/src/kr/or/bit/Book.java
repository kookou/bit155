package kr.or.bit;

public class Book {
	private String sal;
	private String name;
	
	
	public String getSal() {
		return sal;
	}
	public String getName() {
		return name;
	}
	
	
	public Book(String name, String sal){	
		this.name = name;
		this.sal = sal;		
	}
	
	public void BookPname (){
		System.out.printf("���� å�� �̸��� %s �Դϴ�.\n",name);
	}
	public void BookPprice (){
		System.out.printf("���� å�� ������ %s �Դϴ�.\n",sal);
	}
	public void BookInfo (){
		System.out.printf("�����Ͻ� å�� �̸��� %s �̰� ������ %s �Դϴ�. \n",name,sal);
	}

}

