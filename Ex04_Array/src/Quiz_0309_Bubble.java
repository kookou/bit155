public class Quiz_0309_Bubble {
	public static void main(String[] args) {

		int[] arr = new int[] { 3, 12, 41, 30, 1, 50 };
		System.out.print("정렬 이전 : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i -1; j++) { // 1회전 하면 가장 큰수가 맨 뒤에 오기 때문에 -i
				if (arr[j] > arr[j + 1]) {  // j 번째와 j+1 번째 값을 비교하는 조건식  // 조건을 만족 하지 않으면 값을 바꾸지 않는다. 
					
					int temp = arr[j];      // j 값을 임시변수 temp에 할당
                    arr[j] = arr[j + 1];    // j 값에 j+1을 할당
                    arr[j + 1] = temp;      // j+1을 임시변수 temp 에 할당
				}
			}
		}
		System.out.print("정렬 이후 : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
