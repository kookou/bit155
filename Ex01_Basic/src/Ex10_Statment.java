import java.util.Scanner;

public class Ex10_Statment {

	public static void main(String[] args) {
		//반복문 (while, do~while)
		int i = 10;
		while(i >= 10){ //조건이 true 라면
			System.out.println(i);
			//반드시 조건에 증가감을 통해  true / false 안하면 무한루프
			i--;
			
		}
		
		
		
		//while(1~100) 까지의 합 
		//누적값 : 지역변수
		int sum = 0;
		int j = 1;
		while(j <=100){
			//sum+=j; //sum = sum+j
			//j++; //1~100까지의 합 : 5050
			
			//주의 합시다 (*증가감의 순서*)
			j++;
			sum+=j; //1~100까지의 합 : 5150
		}
		System.out.println("1~100까지의 합 : " + sum);
		
		//while 구구단 출력하세요
		//while(){while()}
		
		int k = 2;
		int p= 1;

		while(k <=9 ){
			p=1; //p를 다시 1로 초기화
			while (p <=9){
				System.out.printf("[%d]*[%d]=[%d]\t",k,p,k*p);
				p++; //마지막 10
			}
			System.out.println();
			k++;
		}
		int k1 = 2;
		while(k1 <=9 ){
			int p1= 1; //p를 다시 1로 초기화
			while (p1 <=9){
				System.out.printf("[%d]*[%d]=[%d]\t",k1,p1,k1*p1);
				p1++; //마지막 10
			}
			System.out.println();
			k1++;
		}
		//while (true){if(true) {break;}}
		
		
		//do ~while : 강제적 수행 무조건 한번은 실행되게 하겠다
		//do { 실행문  } while { 조건  }
		//메뉴 구성
		//1.인사
		//2.급여
		//당신이 원하는 업무 번호를 입력하세요 ? do {} 무조건 
		//입력값 : 3 while(조건) 에서 판단 
		
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do{
			System.out.println("숫자 입력해 (0~9)");
			inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata >= 10); //조건이 true 이면 do문을 계속 실행
			//while 조건 값이 true 가 나온다면 do{}문을 계속 반복해라
			//inputdata 값이 0~9 온다면 조건 false  반환 .. 탈출	
		System.out.println("당신이 입력한 숫자는  : " + inputdata);

	
	
		


	}

}
