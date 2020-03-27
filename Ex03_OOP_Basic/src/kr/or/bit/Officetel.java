package kr.or.bit;

import java.util.Scanner;



public class Officetel {
	static Scanner sc = new Scanner(System.in);
	String beth;
	String furniture;
	String security;
	
	public Officetel(){
		this("ȭ���","TV");
	}
	public Officetel(String beth , String furniture){
		this(beth, furniture , "�����");
	}
	public Officetel(String beth , String furniture, String security){
		this.beth = beth;
		this.furniture = furniture;
		this.security = security;
	}	

	public void print(){
		System.out.println(this.beth + "/" + this.furniture + "/" + this.security);
	}
	
	public void furniture(){
		System.out.println("�߰��� ������ �Է��ϼ���");
		furniture = furniture + ","+ sc.nextLine(); 
		print();
	}
	public void security(){
		System.out.println("�߰��� ������� �Է��ϼ���");
		security = security + ","+ sc.nextLine(); 
		print();
	}
	
	public int displayOption(){
		System.out.println("���ǽ��� �ɼ��� ������ �ּ���");
		System.out.println("1.�⺻�ɼ�");
		System.out.println();
		System.out.println("2.�����߰�");
		System.out.println();
		System.out.println("3.������� �߰�");
		System.out.println();
		System.out.println("4.���α׷� ����");
		System.out.println();	
		
		int menu = 0;
		
		do{
			try{
				menu = Integer.parseInt(sc.nextLine());
				if(menu >=1 && menu <=4) {
					break;
			}else {
				throw new Exception("�߸� ���� �ϼ̽��ϴ�");
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("�ٽ��ѹ� �Է��� �ּ���");
		}
		
		
	}while(true);
	
	return menu;
 }
	

}
