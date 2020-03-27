
public class Ex10_Static_Method {
	
	public void method (){
		System.out.println("나 일반 함수야");
	}
	
	public static void smethod(){
		System.out.println("나 static 함수야");
	}

	public static void main(String[] args) {
		//나 일반 함수야 를 출력해 보세요
		Ex10_Static_Method.smethod();
		smethod();
		Ex10_Static_Method m = new Ex10_Static_Method();		
		m.method();
	
	}

}
