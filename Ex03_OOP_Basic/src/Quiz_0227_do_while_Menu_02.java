import java.util.Random;
import java.util.Scanner;
public class Quiz_0227_do_while_Menu_02 {
	static Scanner sc = new Scanner(System.in);
	static Random ran = new Random ();
	static void RestaurantChina() {
		int c = 0;
		System.out.println("메뉴를 선택해 주세요");
		System.out.println("1.짜장면   2.짬뽕   3.랜덤  4.다른양식 선택");
		c = Integer.parseInt(sc.nextLine());
		test(c);
	}
	static public void test(int c) {
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
			c = ran.nextInt(3)+1;
			test(c);
			break;
		case 4:
			
			break;
		default :
			System.out.println("메뉴 선택 번호가 잘못 되었습니다");
			RestaurantChina();
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
			case 4: System.out.println("프로그램종료");
			        System.exit(0);
			}
		}
	}
}