import java.util.Scanner;

public class Ex09_Statment0 {
	
	public static void main(String[] args) {
		System.out.println("�Է�");
		Scanner sc = new Scanner(System.in);
		/*
		if(sc.hasNextInt()){ //�ǹ� (true , false)
			System.out.println("�����Է�");			
		}else {
			System.out.println("������ �ƴմϴ� �ٽ� �Է����ּ���");
		}
		
		//�ϱ����� (�� �ϱ� �׽�Ʈ) ���
		//���ǹ� : if ���� (3����), switch(����){case �� : break;}
		//�ݺ��� : for(�ݺ�Ƚ�� ��Ȯ), while(true, false), do~while(){}
		//�б⹮ : break(�� Ż��), continue(�Ʒ����� skip)
		int count = 0;
		//if(count < 1)System.out.println("true");
		if(count < 1 ){
			System.out.println("true");
		}
		/*
		if(count < 1){
			
		}else{
			
		}
		
		if(count >=90){
			
		}else if()
		{
			
		}else if() {
			
		}else{
		
		}
		*/
		
		char data = 'A';
		switch(data){
		case 'A' : System.out.println("���ں�"); 
			break; //switch�� Ż���ϰڴ�.
		default : System.out.println("������ ����");
		}
		
		//�ݺ���
		//1~100������ ���� sum �̶�� ������ ��Ƽ� 
		
		int sum = 0;
		for(int i = 1; i <=100; i ++){
			sum+=i;
			
			
		}
		System.out.println(sum);
		
		//for�� ����ؼ� 1~10������ Ȧ���� ���� ���ϼ���
		//�� for���� ��� (if switch ����������)
		int num = 0;
		for(int j = 1; j <= 10; j+=2){ // ������ ���� 
			num += j;
		}
		System.out.println(num);
		
		//1~100������ ��
		//¦���� ���� ���ϼ��� (if��)
		
		int sum2 = 0;  // mian �Լ��� ��������
		for(int i = 1; i <= 100; i++){ //i �� for ���� ������ ������⶧���� �ٸ��������� ��� ���� 
			if(i % 2 == 0){
				sum2 += i;
			}
			
		}System.out.println(sum2);
		
		
		//�Ի���� (�ʼ�)
		//������ ����ϱ� (��ø for��)
		//2~9�� 
		//1~9 *���� 
		
		int num2 = 0;
		for(int i = 2; i <=9; i++){
			for(int j = 1; j <=9 ; j++){
				//System.out.println("i : " + i + "*" + j + "=" + (i*j));
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		//��ø for�� �����ϱ� (�����)
		System.out.println();
		//Today Point : break (Ż��) , continue (skip > �Ʒ�����)
		for(int i = 2 ; i <=9; i++){
			for(int j = 1; j <=9; j++){
				if(i == j){
					break; //���� for ���� Ż��
				}
				//System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		for(int i = 2 ; i <=9; i++){
			for(int j = 1; j <=9; j++){
				//if(i == j){
				//	continue; //�Ʒ� �ִ� ������ skip
				//}
				if (i == j) continue; // ���� if���� �߰�ȣ �� ���� ����
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
				//System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		
		for (int i = 2; i <=9; i++){
			for(int j = 1 ; j <i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 100; i >=0; i--) {
			System.out.println(i);
		}
		//�Ǻ���ġ ����
		int a = 0 , b = 1 , c = 0;
		for(int  i = 0; i <10 ; i ++){
			a = b;
			b = c;
			c =a+b;
			System.out.println(""+c);
		}
		
		
		
		
		
		
		
		
	}

}
