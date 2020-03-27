import java.util.Scanner;

public class Ex09_Study_Quiz {
/*조건문
1. 서울랜드 동물원에 놀러 갔습니다. 동물원 요금이 5세 미만은 무료, 5 - 11세 까지 2500원
12 부터는 5000원 입니다.
 화면에서 나이를 입력 받아 요금을 계산하여 출력하는 프로그램을 작성하시오
 출력예시>
 나이를 입력하세요 : 3
 입장료는 무료입니다.
 나이를 입력하세요 : 7
 입장료는 2500원 입니다.
 나이를 입력하세요 : 22
 입장료는 5000원 입니다.
*/
/*	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = Integer.parseInt(s.nextLine());	
		
		if(age < 0){			
			System.out.println("잘못 입력 하셨습니다.");
		}else if(age < 5){		 
			System.out.println("무료입니다.");				
		}else if (age <=11){
			System.out.println("2,500원 입니다.");
		}else {
			System.out.println("5,000원 입니다.");
		}
		
	}

*/

/*
7. 보통 시험에는 과락이 있습니다. 만약, 과락의 기준이 되는 점수가 60점이라면 1 - 100사
이의 랜덤 숫자를 생성하여 생성된 점수가 합격인지 불합격인지 판단하는 프로그램을 작성
하시오
출력예시>
96 점은 합격입니다.
8점은 불합격입니다.

*/
/*
	public static void main(String[] args) {
		int dScore = (int)((Math.random() * 100));
		String f = "";
		
		if(dScore >= 60){
			System.out.println(dScore+"합격입니다");
		}else {
			System.out.println(dScore+"불합격 입니다");
		}
	}
*/
	
/*
3. 화면에서 3개의 숫자를 입력 받아 최대값과 최소값을 구하는 프로그램을 작성하시오.
 출력예시>
 첫번째 숫자를 입력하세요 : 7
 두번째 숫자를 입력하세요 : 3
 세번째 숫자를 입력하세요 : 10
 최대값 : 10, 최소값 : 3
 */	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String m = "";
		int numf = 0;
		int nums = 0;
		int numt = 0;
		
		System.out.println("첫번째 숫자를 입력하세요");
		numf = Integer.parseInt(s.nextLine());
		
		System.out.println("두번째 숫자를 입력하세요");
		nums = Integer.parseInt(s.nextLine());
		
		System.out.println("세번째 숫자를 입력하세요");
		numt = Integer.parseInt(s.nextLine());
		
		if(numf < nums){
			if(numf < numt){
				
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	

}


