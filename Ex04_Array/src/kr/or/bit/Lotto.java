package kr.or.bit;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//타입 : 8가지 + 스트링 + class + 배열(Array)
//설계도
public class Lotto {
	// public int[] numbers = new int[6]; 틀린 코드 아니지만 보통 쓰지않는다
	// 약속 : 초기화는 생성자에서 필요하다면 오버로딩 까지 연결되면 좋다
	/*
	 * 생성자 : 초기화를 담당
	 * 
	 * public Lotto() {// 생성자의 목적 : 초기화 (member field의) this(10); } public
	 * Lotto(int numbers){ this.numbers = numbers; }
	 */
	private int[] numbers;
	private Scanner scanner; // =new Scanner(System.in);
	private Random r; // = new Random();

	public Lotto() {
		// 초기화(member fuild)
		numbers = new int[6];
		scanner = new Scanner(System.in);
		r = new Random();
	}

	// 기능 ..(method)안에서 안에서 >> 함수 하나당 기능 한개만
	// 실번호 추출
	// 중복값이 나오면 안되요
	// 낮은 순으로 정렬 시키세요
	// 출력하세요(화면출력)
	// 메뉴기능 .. 선택..
	// 1 로또 추출
	// 2 프로그램 종료

	public void selectLottoNumber() {
		loop_1: while (true) {
			String selectionnum = showMenu(scanner);
			switch (selectionnum) {
			case "1":
				// makeLottoNumber(r, numbers); // 실번호 추출
				// showLottoNumbers(); //정렬하고 출력하기
				do {
	 				makeLottoNumber1(r,numbers); //실번호 추출
	 			}while(!checkEven() || !checkAverage());
	 			showLottoNumbers(); //정렬 하고 출력하기
				break;
			case "2": // 프로그램 종료 : return(함수탈출), System.exit(0), 라벨값
				System.out.println("Good Luck^^");
				break loop_1;
			default:
				System.out.println("Not in Operation");
				break;
			}
		}
	}

	// private 내부에서만 사용
	private String showMenu(Scanner sc) { // 연습이니까 (paramater)
		System.out.println("******************");
		System.out.println("*1. 당첨 예상 번호 추출 *");
		System.out.println("*2. 프로그램 종료^^!*");
		System.out.println("******************");
		System.out.print("원하는 작업 번호를 입력하세요:");
		String selectionnum = sc.nextLine();
		return selectionnum;
	}

	private void makeLottoNumber(Random r, int[] numbers) { // parameter 연습 //
															// 8가지 타입외에는 변수에
															// 주소값을 참조한다
		for (int i = 0; i < 6; i++) {
			numbers[i] = r.nextInt(45)+1;
			for (int j = 0; j < i; j++) { // j < i (채워진 개수 만큼 비교)
				if (numbers[i] == numbers[j]) {
					i--; // point 같은 방의 값을 바꾸어여 한다
					break;
				}
				
			}
		}
	}

	// 화면 출력기능
	private void showLottoNumbers() {
		System.out.println("[선택한 Lotto 번호]");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		FileWriter fw = new FileWriter("Lotto.txt",true); //append
		BufferedWriter bw = new BufferedWriter(fw);
		
		try{
			
			fw = new FileWriter("Copy_Lotto.txt"); //파일 생성
			//"Ex01_Stream.java" read 해서  "Copy_Stream.txt" 에 write 할거야
			int data = 0;
			while((data = fr.read())!= -1){
				//System.out.println((char)data);
				fw.write(data); //data 값을 read 해서 copy_Stream.txt write 하겠습니다
				if(data !='\n' && data !='\r' && data != '\t' && data != ' '){
					fw.write(data);
				}
			}
			System.out.println("file 처리");
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			try{
				fw.close();
				fr.close();
			}catch (IOException e){
				e.printStackTrace();
			}
			
		}

		// 출력하기
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("[%2d]", numbers[i]);
		}
		System.out.println();

	}

	// 규칙(배열의 합의 평균이 특정 범위에 벗어나면 재추출)
	private boolean checkAverage() {
		int sum = 0;
		int average = 0;
		for (int num : numbers) {
			sum += num;
		}
		
		average = sum / numbers.length;
		System.out.println("평균 : " + average);
		System.out.println("AA" + (average >= 15 && average <= 35));
		return (average >= 15 && average <= 35); // true, false
	}
	private void checkEvenAdd(){
		int even[] = new int[6];
		int add[] = new int[6];
		for(int i = 0; i <numbers.length;i++){
			if(numbers[i]%2 == 0){
				even[i] = numbers[i];
			}if(numbers[i]%2 != 0){
				add[i] = numbers[i];
			}
			 numbers[i] = even[0]+2+add[0]+2;
		}
		
	}
	private boolean checkEven() {
		int cnt = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt == 3);
		System.out.println("cnt"+cnt);
		return cnt == 3;
	}
	private void makeLottoNumber1(Random r, int[] numbers) { // parameter 연습
		int odd = 0;
		int even = 0;
		for (int i = 0; i < 6; i++) {
			if (even <= 2) {
				// numbers[i] = r.nextInt(45) + 1; //NPE
				numbers[i] = (r.nextInt(23)+1) * 2; // 랜덤 짝수
				for (int j = 0; j < i; j++) { // j < i (채워진 개수 만큼 비교)
					if (numbers[i] == numbers[j]) {
						i--; // point 같은 방의 값을 바꾸어여 한다
						break;
					}
				}
				even++;
			} else {
				numbers[i] = ((r.nextInt(22)+1) * 2) + 1; // 랜덤 홀수
				for (int j = 0; j < i; j++) { // j < i (채워진 개수 만큼 비교)
					if (numbers[i] == numbers[j]) {
						i--; // point 같은 방의 값을 바꾸어여 한다
						break;
					}
				}
				odd++;
			}
		}
	
	}

}
