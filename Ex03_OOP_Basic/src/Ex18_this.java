import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 this 
 1. 객체 자신을 가르키는 this (앞으로 생성될 객체의 주소를 담을 곳 이라고 가정)
 2. this 객체 자신 (생성자 호출) : 원칙 >> 생성자는 객체가 만들어 질때 1개 만 호출
         예외적으로 this를 활용하면 여러개의 생성자를 호출 할수있다(Today Point)
 
 
 */

class Test6 {
	int i;
	int j;

	Test6() { // default constructor (디폴트 생성자)

	}
	//설계자 입장에서 
	//Test6(int k, int p) {} 문제점은 없어요
	//가독성(이해) ..
	//되도록이면 parameter 이름은 당신이 할당하려고 하는 instance 변수 명과 동일하게 
	//개발 의미 있는 변수명 >> 가독성 >> 유지보수 ..코드를 봤을때 유추가 되어야 한다
	//문제) 변수명이 같아서 어떤 변수를 말하는지 모른다..
	
	//int i;
	//int j;
	//parameter 로 받는 i,j 와 구분하게 해줄게
	//this > Test6 을 지칭한다
	Test6(int i, int j) {
		//this.i >>Test6 가지고 있는 member
		this.i = i;
		this.j = j;
	}

}


class Book2{
	String bname;
	
	Book2(String bname){
		this.bname = bname;
	}
}

//Today Point

class  SoCar{
	String color;
	String geartype;
	int door;
	
	SoCar(){ //기본타입
		this.color = "red";
		this.geartype = "auto";
		this.door = 2;
	}
	SoCar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	void print(){
		System.out.println(this.color + "/" + this.geartype + "/" + this.door);
	}
	
}

public class Ex18_this {

	public static void main(String[] args) {
		Test6 t6 = new Test6(10,20);
		System.out.println(t6.i);
		System.out.println(t6.j);
		
		Book2 book = new Book2("홍길동전");
		
		SoCar socar = new SoCar();
		socar.print();
		
		SoCar socar2 = new SoCar("blue","auto",6);
		socar2.print();

	}

}
