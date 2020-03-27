import java.util.Arrays;

//배열 (Array) 객체다
//1. 배열은 객체다 (new 통해서 생성)
//2. new heap 메모리에 생성된다
//3. 공정 배열 (정적 배열) : 배열의 크기는 한번 정해지면 고정된다.
//4. 자료 구조의 기본
public class Ex01_Array_Basic {

	public static void main(String[] args) {
		int s, s1, s2, s3;
		int[] score = new int[3]; // 방을 2개 // 방번호 (첨자,index)
		System.out.println(score[0]);
		score[0] = 101; // 각각의 방에 (index)
		score[1] = 20;
		score[2] = 300;
		System.out.println(score[0]);
		
		//방의 갯수는 항상 index 값보다 1크다.. (n-1 한것이 마지막 index)
		//score[3] = 40;  //마지막 방의 index >> 2
		//java.lang.ArrayIndexOutOfBoundsException
		//예외가 발생했어요(문제가 생겼어요)
		//그래서 컴파일러가 강제로 프로그램을 종료
		//문제가 발생했음에도 일단 실행 시킬수 있는 방벙이 있다
		//(try ~catch) 오류를 해결하는 것이 아니고  프로그램이 강제 종료 되는 것을 막는다.
		
		
		//Array 배열 (궁합 : 제어문 : for)
		for(int i = 0; i < 3; i++){
			System.out.printf("[%d] = %d\t",i,score[i]);
		}
		System.out.println();
		
		for(int i = 0; i < score.length; i++){
			System.out.printf("[%d] = %d\t",i,score[i]);
		}
		System.out.println();
		
		//Tip Array 도와주는 클래스 
		String result = Arrays.toString(score); //지금  쓰지마세요
		System.out.println(result);
		
		Arrays.sort(score);
		result = Arrays.toString(score); //지금  쓰지마세요
		System.out.println(result);
		
		
		//입사시험 배열에 대한 정렬 가장 흔한 문제 
		//Today Point
		//배열3가지
		//내일 아침에 가장 늦게오는 분이 칠판에 쓰고 들어가기
		int[]arr = new int[5]; //기본(방의갯수)
		int[]arr2 = new int[]{100,200,300}; //초기값을 통해서 방이 만들어지고 초기화
		int[]arr3 = {11,22,33,44,55}; //컴파일러가 알아서 new 를 자동생성
		//javascript : (var)let cararr = [1,2,3,4,5];
		
		for(int i = 0; i <arr3.length; i++){
			System.out.println(arr3[i]);
		}
		
		//배열은 객체다 (new memory >> heap) :선언과 할당을 분리할 수 있다.
		int[] arr4;
		arr4 = new int[]{21,22,23,24,25};
		System.out.println(arr4);
		//배열의 할당은 (주소값 할당)
		int[] arr5 = arr4;
		//증명
		System.out.println(arr5 == arr4);
		
		//Car c = new Car();
		//Car c2 = c;
		
		String[] strarr = new String[] {"가","나","다라마"};
		char[] ch = new char[10]; //빈문자 '\u0000'
		for(int i = 0; i <ch.length; i++){
			System.out.println(">"+ch[i]+"<");
		}
		
		//8가지 기본타입 +String > Array 타입가능
		//*****클래스 타입(사용자정의 타입) > Array 타입 가능*****
		//Car c = new Car();
		//Car c2 = new Car();
		
		//Car[] cars = new Car[10];
		
		
		
		
		
		
		
		
		

		
	}

}
