
public class Ex_01_main_Quiz2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) { //블럭변수 이기 떄문에 for문 탈출 했을때 j 는 i로 초기화
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
