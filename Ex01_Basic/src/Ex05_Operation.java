
public class Ex05_Operation {

	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2; //��
		System.out.println(result);
		
//		�������� ���ϴ� ������(%)
		result = 13 % 2;
		System.out.println(result);
		
//		����, ���� (������ ������ : ++ 1������, --1�� ����)
		int i = 10;
//		i = i + 1; // i + 1�� ����� i�� ����� �ڵ�
		++i; //��ġ���� ++�� �տ� ������ ���� 1�� ������Ű�� �������� �����Ѵ�.
		System.out.println(i);
		i++; // ��ġ���� ++�� �ڿ� ������ �ٸ��۾��� ������ �� �� �������� 1�� �����ش�.
		System.out.println(i);
//		������ ȥ�� ���� ��, ��ġ,��ġ�� �ǹ̰� ����.
		
//		Point(������ ��ġ, ��ġ�� ������ �巯����.)
		int i2 = 5;
		int j2 = 4;
		
		int result2 = i2 + ++j2; // ��ġ�����ڴ� ������ ����Ǳ� �� �̸� ���� �����Ѵ�.
		System.out.println(result2);
//		result2 : 10  j2 : 5  i2 : 5
		
		result2 = i2 + j2++;
//		result2 : 10	j2 : 6	i2 : 5 (���� ���� ���� ������� ���ӵǴ°� ��������!!!!)
		
//		@@@@@@@@@@@@@@Today Point@@@@@@@@@@@@@@
//		�ڹ��� �����Ģ
//		******�߿�***[����]�� ��� ������  [int]�� ��ȯ �� ó���ȴ�.*********
//		byte + byte => �����Ϸ��� int + int �� ��ȯ���Ѽ� ���� ���Ѵ�. =>
		byte b = 100; // -128~127������ ������ ���� �� �ִ�.
//		8��Ʈ������ ��,�� �� ������ ���� ��ȣ��Ʈ�� ���ڸ��� ����ϹǷ� 2�� 7��-1�� �����̴�.
		byte c = 1; //
//		byte d = b + c; //������ ���� �������� ������ ����. ������ ���� int�̱� ����.
//		byte d = (byte)(b + c); //������ �ս��� �߻��Ѵ�.
		int d = b + c; //���� ȿ�����̰� ���� �ڵ�.
		System.out.println("d: " + d);
		
//		byte + short => �����Ϸ��� int + int�� �ٲ㼭 �����Ѵ�.
//		char + char => �����Ϸ��� int + int�� �ٲ㼭 �����Ѵ�.
//		����ó����
//		point : �������꿡�� int���� ���� Ÿ���� �� int�� ��ȯ�ȴ�.(long�� int���� ũ�� ������ ����)
//		byte, char, short Ÿ���� ������ int�� �ٲ㼭 ó���ȴ�. ������� int.
		
//		byte + short -> int + int
//		char + int -> int + int
//		int + long -> long + long
		
//		���� + �Ǽ� �� Ÿ��ũ�⿡ ��� ���� �Ǽ�(ū Ÿ��)�� ���󰣴�.
		long ll = 10000000000L;
		float ff = 1.2f;
//		long fresult = (long)(ll + ff); // �� �� ������� 10000000001�� �ƴѰ�?
//		System.out.println(fresult);
		float fresult = ll + ff;
		System.out.println("fresult: " + fresult);
		
		float num2 = 10.45f;
		int num3 = 20;
//		num2 + num3
//		float + int >> float + float
//		float result5 = num2 + num3;
//		System.out.println(result5);
		
		int result5 = (int)(num2 + num3); //�Ҽ��θ� ������ �������� ���ϰ� ���� ���
		System.out.println("�������� ���: " + result5);
		
		
		char c2 = '!'; // char�� ����Ÿ��
		char c3 = '!';
		
//		char cresult = c2 + c3; // char + char �� ����� int�̱� ������ ������ �߻�
		int cresult = c2 + c3;
		System.out.println("cresult: " + cresult); //cresult: 66
		System.out.println("(char)cresult: " + (char)cresult);//(char)cresult: B
		
		
//		���
//		�߼ұ���� ���蹮��(������ ���) >> ���� �����(�ﰢ��)
		
		int sum = 0;
//		int j = 100; �̹� ������ �������� for�� �ȿ� �ٽ� ����� �� ����.
		for(int j = 1; j <= 100; j++){
//			System.out.println("j: " + j);
			if(j % 2 == 0){ 
//				System.out.println(j); // ¦���� ����ϱ�
//				sum = sum + j; // �� �ڵ带 ����ϸ� �Ʒ��� ���
				sum += j ;	//���Կ�����
			}
		}
		System.out.println(sum);
//		System.out.println(j);  for���� ����Ǹ� �����Ǿ��ٰ� for���� ������ �������.
		
		
//		== ������(���� ���ϴ� ������)
		if (10 == 10.0f) { // �� ������ Ÿ���� ���� �ٸ����� ���� �����ִ� ���̹Ƿ� true��µ�.
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
//		! ����������
		if('A' != 65){
			System.out.println("�� ���� �ʾ�"); // 'A'�� 65�� �ƴ϶�� �ǹ�
		}else{
			System.out.println("�ƴ� ����"); // 'A' == 65 ��� �ǹ�
		}
		
		
//		@@@@@@�ϱ����� Today Point @@@@@@@@@
//		���׿����� 		(���ǽ�) ? True�� �� �� : False�� �� ��
		int p = 10;
		int k = -10;
		int result8 = (p == k) ? p : k;
		System.out.println(result8);
		
//		���׿����ڴ� ����߿��� if���� ����
//		���� ���׿����ڸ� if������ �ۼ��ϸ� ������ ����.
		if(p == k){
			result8 = p;
		}else{
			result8 = k;
		}
		System.out.println(result8);
		
//		���׿����ڵ� ��ø�� �����ϴ�. ������ �˾ƺ���.
		
		/*
//		����ǥ
//		������(�������� �Ǵ�)
		0 : false
		1 : true
		
		0�� 1�� ������ ���� 4����
				 OR		 AND
		0 0		0false	0false
		0 1		1true	0false
		1 0		1true	0false
		1 1		1true	1true
		
		Oracle (sql)
		
		select *
		from emp
		where empno=1000 and sal > 2000; // �׸���(�Ѵ� ���� ����)
		
		select *
		from emp
		where empno=1000 or sal > 2000; // �Ǵ�, �̰ų�(�� �� �ϳ� �̻� ���� ����)
		
		
		������
		 | or ������
		 & and ������
		 
		 0�� 1�� ��ȯ�ؼ� bit ����
		 || ������ (or)
		 && ������ (and)
		
		*/
		
		int x = 3;
		int y = 5;
		System.out.println("x|y: " + (x|y));
		System.out.println("x&y: " + (x&y));
//		�������� �������� ��ȯ�ؼ� ����
//		128 64 32 16 8 4 2 1
//		
//		0 0 0 0 0 0 0 0 0 1 1 >> ������ 3�� ������ 00000000011
//		0 0 0 0 0 0 0 0 1 0 1 >> ������ 5�� ������ 00000000101
//	OR	0 0 0 0 0 0 0 0 1 1 1 >> 4 + 2 + 1 = 7
//	AND	0 0 0 0 0 0 0 0 0 0 1 >> 1 = 1
		
//		|�����ڴ� 10���� ���� 2���������� �ٲٰ� or������ �ؼ� �� ���� �ٽ� �������� �����ش�.
//		&�����ڴ� 10���� ���� 2���������� �ٲٰ� and������ �ؼ� �� ���� �ٽ� �������� �����ش�.
		
//		�̷� ��Ʈ������ �׷��Ⱥо߿��� �߿��ϰ� �������� ���� �� ���� ���� ����.
		
//		@@@@@@@@@@@@@Today Point(&&(and), ||(or))@@@@@@@@@@@@@@@
//		&&�� ||�� ����
//		if (10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) { ���๮  } �ι�° ���Ǳ����� ���� ��.
//		if (10 > 0 || -1 > 1 || 100 > 2 || 1 > -1) { ���๮  }	ù��° ���Ǹ� ���� ��.
		
	
	}

}
