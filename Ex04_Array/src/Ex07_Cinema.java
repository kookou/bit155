
public class Ex07_Cinema {
	public static void main(String[] args) {
		String[][] seat = new String[3][5];      //3행 5열의 2차원 배열 생성
		for (int i = 0; i < seat.length; i++) {  //행
			for (int j = 0; j < seat[i].length; j++) { //열 
				seat[i][j] = "___"; //2차원 배열의 행과 열만큼 "___" 문자열을 넣어준다 
			}
		}
		seat[2][1] = "홍길동"; // 2행 1열 예매
		seat[0][0] = "김유신"; // 0행 0열 예매

		// 좌석정보 보여주기
		for (int i = 0; i < seat.length; i++) { //행
			for (int j = 0; j < seat[i].length; j++) { //열
				System.out.printf("[%s]", seat[i][j].equals("___") ? "자리" : "예매"); //2차원 배열의 문자열("___") 과 비교하여 true면 자리 return false면 예매 return
			}
			System.out.println();
		}

		int row, col; // int Type의 변수 선언
		row = 0; //초기화
		col = 0; //초기화
		if (seat[row][col].equals("___")) { //2차원 배열 seat 와 문자열 비교
			System.out.println("예약 가능합니다"); //true 면 "예약 가능합니다" 출력
		} else {
			System.out.println("이미 예약 되었습니다"); //false 면 "이미 예약 되었습니다" 출력
		}

		// 좌석초기화
		for (int i = 0; i < seat.length; i++) { //행
			for (int j = 0; j < seat[i].length; j++) { //열
				seat[i][j] = "___";  //2차원 배열의 행과 열만큼 "___" 문자열을 넣어준다 
			}
		}
	}

}
