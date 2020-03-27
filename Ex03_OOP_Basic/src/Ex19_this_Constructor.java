/*
 1. 객체 자신을 가르키는 this
 2. this 사용하는 다른 생성자를 호출
 원칙 : 생성자 객체 생성시 하나만 호출
 this ..  한번에 여러개의 생성자를 호출 
 
 
 */

//Zcar car = new Zcar();
//Zcar car = new Zcar("blue","auto",4);


class  ZCar{
	String color;
	String geartype;
	int door;
	
	ZCar(){ //기본타입
		//this.color = "red";
		//this.geartype = "auto";
		//this.door = 2;
		//어 나를 다시 부르네?
		//ZCar("red","auto",4);
		this("red","auto",4);
		System.out.println("default constructor");
	}
	ZCar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor");
	}
	void print(){
		System.out.println(this.color + "/" + this.geartype + "/" + this.door);
	}
	
}

//*************** 생성자에서 this 를 사용 함으로서 코드량 감소 ******************
class  ZCar2{
	String color;
	String geartype;
	int door;
	
	ZCar2(){
		this("red",1);
		System.out.println("default constructor");
	}
	ZCar2(String color, int door){
		this(color,"auto",door);
		System.out.println("overloading constructor parm2개");
	}
	ZCar2(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor parm3개");
	}
	void print(){
		System.out.println(this.color + "/" + this.geartype + "/" + this.door);
	}
	
}

public class Ex19_this_Constructor {

	public static void main(String[] args) {
		//ZCar car = new ZCar();
		//car.print();
		
		//ZCar car2 = new ZCar("blue","auto",6);
		//car2.print();
		
		ZCar2 z = new ZCar2();
		z.print();
		
		ZCar2 z2 = new ZCar2("pink",10);
		z2.print();
		
		ZCar2 z3 = new ZCar2("black","stick",10);
		z3.print();

	}

}
