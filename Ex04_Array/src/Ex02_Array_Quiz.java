
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// 수학과 학생들의 기말고사 시험점수
		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };
		int max = score[0]; // max =79
		int min = score[0]; // min = 79
		/*
		 * 제어문을 사용해서 max 라는 변수에 시험점수 최대값을, min 변수에 최소값을 담으세요 출력되는 결과는 : max = 97
		 * , min = 54 단 for문을 한번만 사용하세요
		 */

		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
			
			/*
			 max = (score[i]) > max) ? score[i]:max;   //?연산자 > ?앞의 조건이 true 라면 > 뒷문항 실행
			 min = (score[i]) < min) ? score[i]:min;
			 */
		}
		System.out.println("최대값" + max + "최소값" + min);
		
		int[] number = new int[10];
		//10개 방의 값을 1~10까지 값으로 초기화 하세요
		//number[0] >> 1 ..... number[9] >>10
		for(int i =0; i<number.length;i++){
			number[i] = i+1;
			System.out.println(number[i]);
		}
		//어느 학생의 기말고사 시험점수 (5과목)
		int sum = 0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		/*
		 1.총 과목수
		 2.과목의 합
		 3.과목의 평균
		 단)2,3번 문제는 하나의 for 문으로 해결
		 */
		
		System.out.println(jumsu.length);
		
		
		for(int i = 0; i < jumsu.length; i++){
			sum += jumsu[i];
			//average = sum/(float)jumsu.length;
			//어느시점에 평균을 구하면 될까
			if(i == jumsu.length-1){
				average = sum/(float)jumsu.length;
			}
		}
		System.out.println("합: " + sum + "평균:" + average);
		
		
		
		
		
		

	}

}
