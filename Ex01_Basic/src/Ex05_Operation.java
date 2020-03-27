
public class Ex05_Operation {

	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2; //몫
		System.out.println(result);
		
//		나머지를 구하는 연산자(%)
		result = 13 % 2;
		System.out.println(result);
		
//		증가, 감소 (증가감 연산자 : ++ 1씩증가, --1씩 감소)
		int i = 10;
//		i = i + 1; // i + 1한 결과를 i에 덮어쓰는 코드
		++i; //전치증가 ++이 앞에 있으면 먼저 1을 증가시키고 나머지를 수행한다.
		System.out.println(i);
		i++; // 후치증가 ++이 뒤에 있으면 다른작업을 수행한 후 맨 마지막에 1을 더해준다.
		System.out.println(i);
//		변수가 혼자 있을 때, 전치,후치는 의미가 없다.
		
//		Point(연산자 전치, 후치의 성질이 드러난다.)
		int i2 = 5;
		int j2 = 4;
		
		int result2 = i2 + ++j2; // 전치연산자는 연산이 수행되기 전 미리 값을 조정한다.
		System.out.println(result2);
//		result2 : 10  j2 : 5  i2 : 5
		
		result2 = i2 + j2++;
//		result2 : 10	j2 : 6	i2 : 5 (위에 나온 연산 결과에서 연속되는거 잊지말자!!!!)
		
//		@@@@@@@@@@@@@@Today Point@@@@@@@@@@@@@@
//		자바의 연산규칙
//		******중요***[정수]의 모든 연산은  [int]로 변환 후 처리된다.*********
//		byte + byte => 컴파일러가 int + int 로 변환시켜서 값을 구한다. =>
		byte b = 100; // -128~127까지의 정수를 담을 수 있다.
//		8비트이지만 음,양 수 구분을 위해 부호비트로 한자리를 사용하므로 2의 7승-1이 범위이다.
		byte c = 1; //
//		byte d = b + c; //문제가 없어 보이지만 에러가 난다. 연산한 값이 int이기 때문.
//		byte d = (byte)(b + c); //데이터 손실이 발생한다.
		int d = b + c; //가장 효율적이고 옳은 코드.
		System.out.println("d: " + d);
		
//		byte + short => 컴파일러가 int + int로 바꿔서 연산한다.
//		char + char => 컴파일러가 int + int로 바꿔서 연산한다.
//		연산처리시
//		point : 정수연산에서 int보다 작은 타입은 다 int로 변환된다.(long은 int보다 크기 때문에 제외)
//		byte, char, short 타입의 연산은 int로 바꿔서 처리된다. 결과값도 int.
		
//		byte + short -> int + int
//		char + int -> int + int
//		int + long -> long + long
		
//		정수 + 실수 는 타입크기에 상관 없이 실수(큰 타입)를 따라간다.
		long ll = 10000000000L;
		float ff = 1.2f;
//		long fresult = (long)(ll + ff); // 왜 이 결과값이 10000000001이 아닌가?
//		System.out.println(fresult);
		float fresult = ll + ff;
		System.out.println("fresult: " + fresult);
		
		float num2 = 10.45f;
		int num3 = 20;
//		num2 + num3
//		float + int >> float + float
//		float result5 = num2 + num3;
//		System.out.println(result5);
		
		int result5 = (int)(num2 + num3); //소수부를 버리고 정수값만 취하고 싶은 경우
		System.out.println("정수값만 출력: " + result5);
		
		
		char c2 = '!'; // char은 정수타입
		char c3 = '!';
		
//		char cresult = c2 + c3; // char + char 의 결과가 int이기 때문에 에러가 발생
		int cresult = c2 + c3;
		System.out.println("cresult: " + cresult); //cresult: 66
		System.out.println("(char)cresult: " + (char)cresult);//(char)cresult: B
		
		
//		제어문
//		중소기업의 시험문제(구구단 출력) >> 응용 별찍기(삼각형)
		
		int sum = 0;
//		int j = 100; 이미 선언한 변수명을 for문 안에 다시 사용할 수 없다.
		for(int j = 1; j <= 100; j++){
//			System.out.println("j: " + j);
			if(j % 2 == 0){ 
//				System.out.println(j); // 짝수만 출력하기
//				sum = sum + j; // 이 코드를 축약하면 아래의 모습
				sum += j ;	//대입연산자
			}
		}
		System.out.println(sum);
//		System.out.println(j);  for문이 실행되면 생성되었다가 for문이 끝나면 사라진다.
		
		
//		== 연산자(값을 비교하는 연산자)
		if (10 == 10.0f) { // 두 숫자의 타입은 서로 다르지만 값을 비교해주는 것이므로 true출력됨.
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
//		! 부정연산자
		if('A' != 65){
			System.out.println("응 같지 않아"); // 'A'는 65가 아니라는 의미
		}else{
			System.out.println("아니 같아"); // 'A' == 65 라는 의미
		}
		
		
//		@@@@@@암기하자 Today Point @@@@@@@@@
//		삼항연산자 		(조건식) ? True일 때 값 : False일 때 값
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		System.out.println(result8);
		
//		삼항연산자는 제어문중에서 if문과 유사
//		위의 삼항연산자를 if문으로 작성하면 다음과 같다.
		if(p == k){
			result8 = p;
		}else{
			result8 = k;
		}
		System.out.println(result8);
		
//		삼항연산자도 중첩이 가능하다. 다음에 알아보자.
		
		/*
//		진리표
//		논리연산(진위여부 판단)
		0 : false
		1 : true
		
		0과 1로 가능한 조합 4가지
				 OR		 AND
		0 0		0false	0false
		0 1		1true	0false
		1 0		1true	0false
		1 1		1true	1true
		
		Oracle (sql)
		
		select *
		from emp
		where empno=1000 and sal > 2000; // 그리고(둘다 참인 조건)
		
		select *
		from emp
		where empno=1000 or sal > 2000; // 또는, 이거나(둘 중 하나 이상 참인 조건)
		
		
		연산자
		 | or 연산자
		 & and 연산자
		 
		 0과 1로 변환해서 bit 연산
		 || 논리연산 (or)
		 && 논리연산 (and)
		
		*/
		
		int x = 3;
		int y = 5;
		System.out.println("x|y: " + (x|y));
		System.out.println("x&y: " + (x&y));
//		십진수를 이진수로 변환해서 연산
//		128 64 32 16 8 4 2 1
//		
//		0 0 0 0 0 0 0 0 0 1 1 >> 십진수 3은 이진수 00000000011
//		0 0 0 0 0 0 0 0 1 0 1 >> 십진수 5는 이진수 00000000101
//	OR	0 0 0 0 0 0 0 0 1 1 1 >> 4 + 2 + 1 = 7
//	AND	0 0 0 0 0 0 0 0 0 0 1 >> 1 = 1
		
//		|연산자는 10진수 값을 2진수값으로 바꾸고 or연산을 해서 그 값을 다시 십진수로 돌려준다.
//		&연산자는 10진수 값을 2진수값으로 바꾸고 and연산을 해서 그 값을 다시 십진수로 돌려준다.
		
//		이런 비트연산은 그래픽분야에서 중요하고 웹에서는 아직 쓸 일이 별로 없다.
		
//		@@@@@@@@@@@@@Today Point(&&(and), ||(or))@@@@@@@@@@@@@@@
//		&&와 ||는 조건
//		if (10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) { 실행문  } 두번째 조건까지만 보면 됨.
//		if (10 > 0 || -1 > 1 || 100 > 2 || 1 > -1) { 실행문  }	첫번째 조건만 봐도 됨.
		
	
	}

}
