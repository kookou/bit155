import java.util.Scanner;

/*
 *������ ��Ģ �����(+ , - , * , /)
�Է°� 3�� (�Է°��� nextLine() �޾Ƽ� �ʿ��ϴٸ� ���� ��ȯ)
����: Integer.parseInt(), **equals()Ȱ��**
ȭ��

>�Է°� : ����
>�Է°�(��ȣ) : +
>�Է°� : ����
>������ : 200
 
 */
public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
/*		Scanner s = new Scanner(System.in);
		System.out.println("*��Ģ�����*");
		System.out.println("���ڸ� �Է��ϼ���");
		int num1 = Integer.parseInt(s.nextLine());
		
		System.out.println("��Ģ ��ȣ�� �Է��ϼ���");
		String nums = s.nextLine();
		if (!nums.equals("+") && !nums.equals("-") && !nums.equals("*") && !nums.equals("/")){
			
		}
		
		System.out.println("���ڸ� �Է��ϼ���");
		int num2 = Integer.parseInt(s.nextLine());			
		
		if (nums.equals("+")){
			System.out.println("�������� :" + (num1 + num2) +  "�Դϴ�.");
		}else if (nums.equals("-")){
			System.out.println("�������� :" + (num1 - num2) +  "�Դϴ�.");			
		}else if (nums.equals("*")){
			System.out.println("�������� :" + (num1 * num2) +  "�Դϴ�.");			
		}else if (nums.equals("/")) {
			System.out.println("�������� :" + (num1 / num2) +  "�Դϴ�.");
		}else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
		*/
		
		String opr=""; //���ڿ� �ʱ�ȭ
		int input_1=0;
		int input_2=0;
		int result=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է� : ");
		input_1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("�����ȣ(+,-,/,*):  ");
		opr = sc.nextLine();
		
		System.out.println("�����Է� : ");
		input_2 = Integer.parseInt(sc.nextLine());
		
		if(opr.equals("+")){ //POINT ���ڿ��� �񱳴� == �ƴϰ� , equals (String)
			result = input_1 + input_2;
			
		}else if(opr.equals("-")) {
			result = input_1 - input_2;
			
		}else if(opr.equals("*")) {
			result = input_1 * input_2;
			
		}else if(opr.equals("/")) {
			result = input_1 / input_2;
		}else {
			System.out.println ("�������� �ʴ� ������ �Դϴ�.");
			//key point (���⼭�� main �Լ�)
			//return Ű���� : [�Լ�����]�� ������ > main �Լ� Ż�� > ���� (�Ҽӵ� �Լ������� �����°�)
			return;
			
			//System.exit(0); //�������� ���α׷� ����
		}
		System.out.printf ("[%d %s %d = %d]", input_1,opr,input_2,result);
		
		
		
		
		
		
	}

}
