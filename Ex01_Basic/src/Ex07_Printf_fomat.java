import java.util.Scanner;

public class Ex07_Printf_fomat {

	public static void main(String[] args) {
		//java : System.out.println();
		//C# : Console. WirteLine();
		
		System.out.println();//�ٹٲ�
		System.out.print("A");
		System.out.print("B");
		System.out.println("C");
		System.out.println("D");
		
		int num = 100;
		System.out.println(num);
		System.out.println("num ���� : " + num + "�Դϴ�");
		//���� format
		System.out.printf("num ���� : %d �Դϴ� \n", num);
		//format ���� ���� (���)
		//%d (10���� ������ ������) >> d��� �ڸ��� 
		//%f (�Ǽ��� �ü��ִ� �ڸ�)
		//%s (���ڿ��� ������ �ִ� �ڸ�)
		//%c (���� (char) �� ������ �ִ� �ڸ�)
		//\t > tab , \n > enter (�ٹٲ�)
		System.out.printf("num ����[%d] �Դϴ� �׸���[%d]�� �־�� \n", num , 5555);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f �������� %f �Դϴ� \n",f);
		
		//�ݴ�� 
		//cmd (console) â���� ������ �Է� �ޱ�
		//java.util.Scanner
		Scanner sc = new Scanner(System.in);
		//����Ű : ctrl shift + o >> import ���� �ڵ� �����ϱ�
		//System.out.println("���� �Է��ϼ���");
		//String value = sc.nextLine();  //�Է��ϰ� ���� ĥ������ ��� (���ڿ��� ��ȯ)
		//System.out.println(value);
		
		//int number = sc.nextInt();
		//System.out.println("������ : " + number);
				
		//float fnumber = sc.nextFloat();
		//System.out.println("�Ǽ��� : " + fnumber);
		
		//������� : nextInt , nextFloat ���ٴ� nextLine() ���� �������
		//Today Point
		//[���ڸ�  -> ���ڷ� (����, �Ǽ�)]
		//Interger.parseInt("11") ���ڸ� ������
		//Float.parseFloat("3.111") ���ڸ� �Ǽ���
		//Double.parseDouble(s)
		
		System.out.println("���� �Է��ϼ���");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("������ : " + num2);
		
		//Tip
		//���ڸ� ->���ڷ�
		String data = String.valueOf(10000);
		System.out.println(data);
		
		
		
		
		
	}

}
