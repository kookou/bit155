class InitTest{
	static int cv=10;
	static int cv2;
	int iv = 1;	
	
	static { //static 초기자 : static 변수 초기화 (실행시점)
		//논리적인 코드.. new 하지 않고도 로직을 쓸수있다.
		cv = 20;
		cv2 = cv+10;
	}
	
	//초기자(static memberfield 나 memberfield의 값을 초기화)
	{//초기자 >> memory에 iv 라는 변수가 올라가고 나서 바로 실행
     //instance 변수의 초기화
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
