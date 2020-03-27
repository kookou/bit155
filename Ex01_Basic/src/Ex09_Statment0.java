import java.util.Scanner;

public class Ex09_Statment0 {
	
	public static void main(String[] args) {
		System.out.println("입력");
		Scanner sc = new Scanner(System.in);
		/*
		if(sc.hasNextInt()){ //의문 (true , false)
			System.out.println("정수입력");			
		}else {
			System.out.println("정수가 아닙니다 다시 입력해주세요");
		}
		
		//암기하자 (월 암기 테스트) 제어문
		//조건문 : if 종류 (3가지), switch(조건){case 값 : break;}
		//반복문 : for(반복횟수 명확), while(true, false), do~while(){}
		//분기문 : break(블럭 탈출), continue(아래구문 skip)
		int count = 0;
		//if(count < 1)System.out.println("true");
		if(count < 1 ){
			System.out.println("true");
		}
		/*
		if(count < 1){
			
		}else{
			
		}
		
		if(count >=90){
			
		}else if()
		{
			
		}else if() {
			
		}else{
		
		}
		*/
		
		char data = 'A';
		switch(data){
		case 'A' : System.out.println("문자비교"); 
			break; //switch를 탈출하겠다.
		default : System.out.println("나머지 모든것");
		}
		
		//반복문
		//1~100까지의 합을 sum 이라는 변수에 담아서 
		
		int sum = 0;
		for(int i = 1; i <=100; i ++){
			sum+=i;
			
			
		}
		System.out.println(sum);
		
		//for을 사용해서 1~10까지의 홀수의 합을 구하세요
		//단 for문만 사용 (if switch 쓰지마세요)
		int num = 0;
		for(int j = 1; j <= 10; j+=2){ // 센스를 갖자 
			num += j;
		}
		System.out.println(num);
		
		//1~100까지의 합
		//짝수의 합을 구하세요 (if문)
		
		int sum2 = 0;  // mian 함수의 지역변수
		for(int i = 1; i <= 100; i++){ //i 는 for 문이 끝나면 사라지기때문에 다른곳에서도 사용 가능 
			if(i % 2 == 0){
				sum2 += i;
			}
			
		}System.out.println(sum2);
		
		
		//입사시헙 (필수)
		//구구단 출력하기 (중첩 for문)
		//2~9단 
		//1~9 *연산 
		
		int num2 = 0;
		for(int i = 2; i <=9; i++){
			for(int j = 1; j <=9 ; j++){
				//System.out.println("i : " + i + "*" + j + "=" + (i*j));
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		//중첩 for문 응용하기 (별찍기)
		System.out.println();
		//Today Point : break (탈출) , continue (skip > 아래구문)
		for(int i = 2 ; i <=9; i++){
			for(int j = 1; j <=9; j++){
				if(i == j){
					break; //안쪽 for 문을 탈출
				}
				//System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		for(int i = 2 ; i <=9; i++){
			for(int j = 1; j <=9; j++){
				//if(i == j){
				//	continue; //아래 있는 구문을 skip
				//}
				if (i == j) continue; // 단일 if문은 중괄호 블럭 생략 가능
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
				//System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		
		for (int i = 2; i <=9; i++){
			for(int j = 1 ; j <i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 100; i >=0; i--) {
			System.out.println(i);
		}
		//피보나치 수열
		int a = 0 , b = 1 , c = 0;
		for(int  i = 0; i <10 ; i ++){
			a = b;
			b = c;
			c =a+b;
			System.out.println(""+c);
		}
		
		
		
		
		
		
		
		
	}

}
