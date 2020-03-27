package kr.or.bit;

import java.util.Scanner;



public class Officetel {
	static Scanner sc = new Scanner(System.in);
	String beth;
	String furniture;
	String security;
	
	public Officetel(){
		this("화장실","TV");
	}
	public Officetel(String beth , String furniture){
		this(beth, furniture , "도어락");
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
		System.out.println("추가할 가구를 입력하세요");
		furniture = furniture + ","+ sc.nextLine(); 
		print();
	}
	public void security(){
		System.out.println("추가할 보안장비를 입력하세요");
		security = security + ","+ sc.nextLine(); 
		print();
	}
	
	public int displayOption(){
		System.out.println("오피스텔 옵션을 선택해 주세요");
		System.out.println("1.기본옵션");
		System.out.println();
		System.out.println("2.가구추가");
		System.out.println();
		System.out.println("3.보안장비 추가");
		System.out.println();
		System.out.println("4.프로그램 종료");
		System.out.println();	
		
		int menu = 0;
		
		do{
			try{
				menu = Integer.parseInt(sc.nextLine());
				if(menu >=1 && menu <=4) {
					break;
			}else {
				throw new Exception("잘못 선택 하셨습니다");
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("다시한번 입력해 주세요");
		}
		
		
	}while(true);
	
	return menu;
 }
	

}
