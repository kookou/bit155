import kr.or.bit.Emp;

/*
 *1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
      (int)(Math.random()*45 + 1)
      lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
 *2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (중복값 검증 :별찍기 비슷)
 *3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요  (정렬 : 자리바꿈)
 *4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)

 추후에는 별도의 클래스 분리해서 Lotto.java ..... 
 현재 main 함수 안에서 사용 ....연습...
  
 */
public class Quiz_0309 {

	public static void main(String[] args) {
		int[] looto = new int[6];
		for (int i = 0; i < looto.length; i++) {
			looto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j <= i - 1; j++) {
				while (looto[i] == looto[j]) {
					looto[i] = (int) (Math.random() * 45 + 1);
				}
			}
		}
		int min;
		int tmp;
		for (int i = 0; i < looto.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < looto.length; j++) {
				if (looto[j] < looto[min])
					min = j;
			}
			tmp = looto[i];
			looto[i] = looto[min];
			looto[min] = tmp;
		}
		for (int k = 0; k < looto.length; k++) {
			System.out.print(looto[k] + " ");
		}
		System.out.println();

		// Today Point
		// 개선된 for문,향상된for문
		// JAVA : for(Type 변수병 : 배열 or Collection) {실행구문}
		// C# : for(Type 변수명 in 배열 or Collection) {실행구문}
		// Jacascript : for(Type 변수명 in 배열 or Collection) {실행구문}

		int[] arr3 = { 5, 6, 7, 8, 9 };
		// for(int i = 0; i <arr3.length;i++){
		// System.out.println(arr3[i]);
		// }

		for (int val : arr3) {
			System.out.println(val);
		}

		String[] starr = { "A", "B", "C", "D", "FFFF" };
		for (String val : starr) {
			System.out.println(val);
		}

		Emp[] list = { new Emp(1, "A"), new Emp(2, "B"), new Emp(3, "C") };
		// 개선된 for 문을 사용해서 사번, 이름 출력
		for (Emp val : list) {
			val.empInfoPrint();
		}
		
		for(int i = 0 ; i <list.length; i ++){
			list[i].empInfoPrint();
		}
		
		//모닝 커피 퀴즈 (3분) : 시간 3분
		int[][] score3 = new int[][]{
			{11,12},
			{13,14},
			{15,16}
			
		};
		
		//개선된 for 문을 사용해서 배열값 출력
		for(int[] a : score3){
			for(int b: a ){
				System.out.println(b);
			}
		}
		

	}
}
