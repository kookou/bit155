package kr.or.bit;

public class Notebook {
	public String color;
	private int year;
	//직접 할당을 막고 간접 할당을 통해서 자료를 보호하겠다
	
	public void setYear(int y){  //year라는 변수의 write 를 담당하는
		if(y<0) {
			year = 1999;
		}else{
			year = y;
		}
	}
	public int getYear(){   //year라는 변수의 read 를 담당하는
		return year;
	}
	
	public Mouse handle(Mouse m) { //Point >> 주소값 >> mouse
		m.x=100;
		m.y=200;
		return m;
	}

}
