class Data{
	int i;
}
public class Ex13_Method_Call {
	
	public static void main(String[]args){
		Data d = new Data(); //d >> xx번지
		d.i = 100;
		System.out.println("d.i : " + d.i);
		
		scall(d);//주소값 할당
		//System.out.println("d.i : " + d.i); // 111
		
		vcall(d.i); // 111
		System.out.println("d.i : " + d.i);
		
	}
	static void scall(Data data){  //Data 라는 타입을 갖는 주소 값을 받는다.
		                           //data 변수 >> xx번지
		System.out.println("함수 : " + data.i); //100
		data.i = 111;
		
	}
	
	static void vcall(int x) { //값을 받는다.
		System.out.println("before : " + x);
		x = 8888;
		System.out.println("after : " + x);
		
	}

}
