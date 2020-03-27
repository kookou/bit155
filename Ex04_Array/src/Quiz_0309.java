import kr.or.bit.Emp;

/*
 *1. 1~45������ ������ �߻����� 6���� �迭�� ��������
      (int)(Math.random()*45 + 1)
      lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
 *2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (�ߺ��� ���� :����� ���)
 *3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����  (���� : �ڸ��ٲ�)
 *4. �� ����� ��� �ִ� �迭�� ����ϼ��� (ȭ�� ���)

 ���Ŀ��� ������ Ŭ���� �и��ؼ� Lotto.java ..... 
 ���� main �Լ� �ȿ��� ��� ....����...
  
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
		// ������ for��,����for��
		// JAVA : for(Type ������ : �迭 or Collection) {���౸��}
		// C# : for(Type ������ in �迭 or Collection) {���౸��}
		// Jacascript : for(Type ������ in �迭 or Collection) {���౸��}

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
		// ������ for ���� ����ؼ� ���, �̸� ���
		for (Emp val : list) {
			val.empInfoPrint();
		}
		
		for(int i = 0 ; i <list.length; i ++){
			list[i].empInfoPrint();
		}
		
		//��� Ŀ�� ���� (3��) : �ð� 3��
		int[][] score3 = new int[][]{
			{11,12},
			{13,14},
			{15,16}
			
		};
		
		//������ for ���� ����ؼ� �迭�� ���
		for(int[] a : score3){
			for(int b: a ){
				System.out.println(b);
			}
		}
		

	}
}
