
public class Ex06_Array2_Basic {

	public static void main(String[] args) {
		// 2���� (�����)�迭
		// [��][��]
		// *��ȭ�� ���� (�¼�) �¼���ġ*
		// �̸� ���� : ��ȭ�� �¼� ��ġ
		// ���� (�浵,����)

		int[][] score = new int[3][2];
		System.out.println(score[0][0]);

		score[0][0] = 100;
		score[0][1] = 200;

		score[1][0] = 300;
		score[1][1] = 400;

		score[2][0] = 500;
		score[2][1] = 600;

		// ���Ǽ�, ���Ǽ�
		// ���� ���� : �迭�̸�.length > score.length
		// ���� ���� : �迭�̸�[i].length
		// ***�迭�̸�[0].length > 0���� ���� ����***

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d\t", i, j, score[i][j]);
			}
			System.out.println();
		}

	}

}
