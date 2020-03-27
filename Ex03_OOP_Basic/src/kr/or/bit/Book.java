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
		System.out.printf("현재 책의 이름은 %s 입니다.\n",name);
	}
	public void BookPprice (){
		System.out.printf("현재 책의 가격은 %s 입니다.\n",sal);
	}
	public void BookInfo (){
		System.out.printf("선택하신 책의 이름은 %s 이고 가격은 %s 입니다. \n",name,sal);
	}

}

