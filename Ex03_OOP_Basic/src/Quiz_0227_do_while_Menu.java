import java.util.Random;
import java.util.Scanner;

public class Quiz_0227_do_while_Menu {
	
	static Scanner sc = new Scanner(System.in);
	static void RestaurantChina() {
		int c = 0;
		System.out.println("메뉴를 선택해 주세요");
		System.out.println("1.짜장면   2.짬뽕   3.다른양식 선택  4.랜덤");
		//c = Integer.parseInt(sc.nextLine());
		Random r = new Random ();
		c = r.nextInt(3)+1;
		//**Random 생성 **
		//c = (int)(Math.random()*3)+1;
		// Math.random 범위는 0.0 <= Math.random() < 1.0
		// 0 <= Math.random() * 3 < 3.0
		// 1 <= (Math.random() * 3) + 1 < 4.0
		// 1 <= (int)(Math.random() * 3) + 1 < 4
		// >>1, 2, 3만 출력

		switch (c) {
		case 1:
			System.out.println("짜장면을 주문합니다.");
			System.out.println("감사합니다.");

			break;
		case 2:
			System.out.println("짬뽕을 주문합니다.");
			System.out.println("감사합니다.");
			break;
		case 3:
			break;
		case 4:
			c = r.nextInt(3)+1;
			
			break;
		default :
			System.out.println("메뉴 선택 번호가 잘못 되었습니다");
			RestaurantChina();
		}
		
	}

	static void RestaurantUS() {
		int u = 0;
		System.out.println("메뉴를 선택해 주세요");
		System.out.println("1.스테이크   2.파스타   3.다른양식 선택");
		u = Integer.parseInt(sc.nextLine());
		switch (u) {
		case 1:
			System.out.println("스테이크를 주문합니다.");
			System.out.println("감사합니다.");
			break;
		case 2:
			System.out.println("파스타를 주문합니다.");
			System.out.println("감사합니다.");
			break;
		case 3:
			break;
		default :
			System.out.println("메뉴 선택 번호가 잘못 되었습니다");
			RestaurantUS();
		}
	}

	static void RestaurantKorea() {
		int k = 0;
		System.out.println("메뉴를 선택해 주세요");
		System.out.println("1.김치찌개   2.된장찌개   3.다른양식 선택");
		k = Integer.parseInt(sc.nextLine());
		switch (k) {
		case 1:
			System.out.println("김치찌개를 주문합니다.");
			System.out.println("감사합니다.");
			break;
		case 2:
			System.out.println("된장찌개를 주문합니다.");
			System.out.println("감사합니다.");
			break;
		case 3:
			break;
		default :
			System.out.println("메뉴 선택 번호가 잘못 되었습니다");
			RestaurantKorea();
		}
	}

	static int displayMenu(){
		System.out.println("원하는 양식을 선택해 주세요");
		System.out.println("1.중식당");
		System.out.println();
		System.out.println("2.양식당");
		System.out.println();
		System.out.println("3.한식당");
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
				throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("다시한번 입력해 주세요");
		}
		
		
	}while(true);
	
	return menu;
 }
	
	
	public static void main(String[] args) {
		
		while(true){
			switch(displayMenu()){
			case 1: 
				System.out.println("중식");
				RestaurantChina();
				break;
			case 2: 
				System.out.println("양식");
				RestaurantUS();
				break;
			case 3: 
				System.out.println("한식");
				RestaurantKorea();
				break;
			case 4: System.out.println("프로그램종료");
			        System.exit(0);
				
			}
		}
	}
}
