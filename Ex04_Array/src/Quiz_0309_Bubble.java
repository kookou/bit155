public class Quiz_0309_Bubble {
	public static void main(String[] args) {

		int[] arr = new int[] { 3, 12, 41, 30, 1, 50 };
		System.out.print("���� ���� : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i -1; j++) { // 1ȸ�� �ϸ� ���� ū���� �� �ڿ� ���� ������ -i
				if (arr[j] > arr[j + 1]) {  // j ��°�� j+1 ��° ���� ���ϴ� ���ǽ�  // ������ ���� ���� ������ ���� �ٲ��� �ʴ´�. 
					
					int temp = arr[j];      // j ���� �ӽú��� temp�� �Ҵ�
                    arr[j] = arr[j + 1];    // j ���� j+1�� �Ҵ�
                    arr[j + 1] = temp;      // j+1�� �ӽú��� temp �� �Ҵ�
				}
			}
		}
		System.out.print("���� ���� : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
