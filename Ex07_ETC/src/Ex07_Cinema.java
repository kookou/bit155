import java.util.Scanner;
public class Ex07_Cinema {
	Scanner sc = new Scanner(System.in);    //사용자한테 입력받기위해 Scanner class 생성
	String[][] seat = new String[3][5];     //3열5행의 String 배열 생성
	public void menu() {                    
		//좌석 만들기
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "___";
			}
		}
		while(true) {
			System.out.println("*************");
			System.out.println("1. 좌석 정보 보기");
			System.out.println("2. 좌 석     예 약");
			System.out.println("3. 좌 석     수 정");
			System.out.println("4. 좌 석     취 소");
			System.out.println("0. 종            료");
			System.out.println("*************");
			System.out.print("실행할 메뉴번호를 입력하세요: ");
			int menuNum = Integer.parseInt(sc.nextLine());
			switch(menuNum) {
				case 1: seatInfo(); break; //좌석 정보보기
				case 2: selectSeat(); break; //좌석 예매
				case 3: updateSeat(); break; //좌석 수정
				case 4: deleteSeat(); break; //좌석 취소
				case 0: System.exit(0); break;
				default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void updateSeat() {
		int row, col;
		outer:
			while(true) {
				System.out.print("수정할 예매자 성함을 입력하세요: ");
				String name = sc.nextLine();
				System.out.print("수정할 좌석 위치를 입력하세요(ex:2,1): ");
				String inputSeat = sc.nextLine();
				String[] seatArr = inputSeat.trim().replace(" ", "").split(",");
				row = Integer.parseInt(seatArr[0]);
				col = Integer.parseInt(seatArr[1]);
				if (!seat[row][col].equals("___")) {
					System.out.println("이미 예약된 자리입니다");
				} else {
					for (int i = 0; i < seat.length; i++) {
						for (int j = 0; j < seat[i].length; j++) {
							if(seat[i][j].equals(name)) {
								seat[i][j] = "___";
								seat[row][col] = name;
								System.out.println(name + "으로 예약하신 좌석이 수정되었습니다.");
								break outer;
							}
						}
					}
				}
				System.out.println("입력하신 이름으로 예약된 좌석이 없습니다.");
			}
		//좌석 정보 보여주기
		seatInfo();
	}
	public void deleteSeat() {
		outer:
		while(true) {
			System.out.print("취소할 예매자 성함을 입력하세요: ");
			String name = sc.nextLine();
			for (int i = 0; i < seat.length; i++) {
				for (int j = 0; j < seat[i].length; j++) {
					if(seat[i][j].equals(name)) {
						seat[i][j] = "___";
						System.out.println(name + "으로 예약하신 좌석이 취소되었습니다.");
						break outer;
					}
				}
			}
			System.out.println("입력하신 이름으로 예약된 좌석이 없습니다.");
		}
		//좌석 정보 보여주기
		seatInfo();
	}
	public void selectSeat() {
		int row, col;
		String name;
		System.out.print("예매자 성함을 입력하세요: ");
		name = sc.nextLine();
		do {
			try {
				System.out.print("예매할 좌석 위치를 입력하세요(ex:2,1): ");
				String inputSeat = sc.nextLine();
				String[] seatArr = inputSeat.trim().replace(" ", "").split(",");
				row = Integer.parseInt(seatArr[0]);
				col = Integer.parseInt(seatArr[1]);
				if(row > 2 || col > 4) {
					throw new Exception("좌석을 잘못 입력하셨습니다.");
				} else {
					break;
				}
			} catch (Exception e) {
				e.getMessage();
				System.out.println("(0,0)부터 (2,4)번의 자리까지만 존재합니다.");
			}
		} while(true);
		if (seat[row][col].equals("___")) {
			//받은 위치로 예매
			seat[row][col] = name;
			System.out.println("예매가 완료되었습니다.");
		} else {
			System.out.println("이미 예약된 자리입니다");
		}
		//좌석 정보 보여주기
		seatInfo();
	}
	public void seatInfo() {
		//좌석 정보 보여주기
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j].equals("___") ? "자리" : "예매");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Ex07_Cinema cinema = new Ex07_Cinema();
		cinema.menu();
	}
}