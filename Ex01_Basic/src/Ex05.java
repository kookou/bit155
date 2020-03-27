package day02;
/*윤년 계산기
 * 사용자로부터 연도를 입력받으면
 * 해당연도가 윤년인지 평년인지 출력하는 프로그램
 * 윤년의 조건 : 
 * 1.400 으로 나눠떨어지면 무조건 윤년
 * 2.4로 나눠떨어지지만100으로 안나눠 떨어지면 윤년
 * 
 */
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("년도를 입력해주세요: ");
	int year = scanner.nextInt();
	//400으로 나눠 떨어지는가?
	if (year % 400 == 0 ||(year % 100 != 0 && year % 4 == 0)) {
		System.out.println("윤년입니다.");
	}else {
		   System.out.println("평년입니다.");
	}
	scanner.close();
  }

}
