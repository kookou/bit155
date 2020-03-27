package day02;
/*사용자로부터나이, 성별, 신체등급을 입력받아서
 * 현역,공익,미필을 출력하는 프로그램을 만들어보자
 */
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력해주세요: ");
		int age = scanner.nextInt();
		if(age >= 18) {
			/*성별을 입력받는다.*/
			System.out.println("성별을 입력해주세요.(남자는1 여자는2)");
			int sex = scanner.nextInt();
			if(sex == 1) {
				/*신체등급을 입력받는다*/
				System.out.println("신체 등급을 입력해주세요: ");
				int category = scanner.nextInt();
				if(category <= 3) {
					System.out.println("현역입니다.");
				}else if(category == 4) {
					System.out.println("공익입니다.");
				}else {
					System.out.println("면제입니다.");
				}
		}else {
			System.out.println("병역 의무대상이 아닙니다.");
		}
			
		scanner.close();
	}
  }
}