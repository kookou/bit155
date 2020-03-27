import java.util.Scanner;

public class Ex10_Statment_Quiz {
	public static void main(String[] args) {
		
		/*
		 1번문제 알파벳 A~Z까지 출력하기 (for문 이용)
		 */
		for(int i = 'A' ; i <= 'Z'; i++){
			System.out.println((char) i );			
		}		
		
		/*
		 2번문제  1~100까지 10행 10열로출력하는 프로그램을 작성 (for문 이용)
		 */
		
		for(int i = 1; i<=100; i++){
			System.out.print(i+" ");
			if(i % 10 == 0){
			System.out.println();
			}
		}
		
		/*
		 조별과제 1번문제
		 1부터 20 까지의 정수 중에 2또는 3의 배수가 아닌 수의 총합
		 */
		int num = 0;
		for(int j = 1; j<=20; j++){
			if(j%2 !=0 && j%3!=0){
				num+=j;
			}
		}System.out.println(num);
		
		/*
		 2번문제
		 주사위 두개를 던졌을때 눈의 합의 6이되는 경우의 수를 구하기
		 */
		for(int j = 1; j<=6; j++){
			for(int i = 1; i<=6; i++){
				if(j+i == 6){
				System.out.printf("[%d]*[%d]=[%d]\t",j,i,i+j);	
				}
			}
		}
		System.out.println();
		/*
		 3번문제
		 가위, 바위, 보게임 (제어문을 통해 )
		 컴퓨터가 자동으로 나온 가위바위보 에 사용자가 값을 입력해 처리
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = (int)((Math.random() * 10)+1)*100;
		System.out.println("번호를 입력해 주세요 (1.가위 2.바위 3.보)");
		num1 = sc.nextInt();
		

		
	}

}
