class InitTest{
	static int cv=10;
	static int cv2;
	int iv = 1;	
	
	static { //static �ʱ��� : static ���� �ʱ�ȭ (�������)
		//������ �ڵ�.. new ���� �ʰ� ������ �����ִ�.
		cv = 20;
		cv2 = cv+10;
	}
	
	//�ʱ���(static memberfield �� memberfield�� ���� �ʱ�ȭ)
	{//�ʱ��� >> memory�� iv ��� ������ �ö󰡰� ���� �ٷ� ����
     //instance ������ �ʱ�ȭ
	 //if(iv > 10) iv = 100;
		iv = 3;
	}
}
public class Ex08_Static_init {

	public static void main(String[] args) {
		System.out.println(InitTest.cv);
		InitTest init = new InitTest();
		System.out.println(init.iv);
	}

}
