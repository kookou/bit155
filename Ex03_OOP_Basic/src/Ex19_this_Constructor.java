/*
 1. ��ü �ڽ��� ����Ű�� this
 2. this ����ϴ� �ٸ� �����ڸ� ȣ��
 ��Ģ : ������ ��ü ������ �ϳ��� ȣ��
 this ..  �ѹ��� �������� �����ڸ� ȣ�� 
 
 
 */

//Zcar car = new Zcar();
//Zcar car = new Zcar("blue","auto",4);


class  ZCar{
	String color;
	String geartype;
	int door;
	
	ZCar(){ //�⺻Ÿ��
		//this.color = "red";
		//this.geartype = "auto";
		//this.door = 2;
		//�� ���� �ٽ� �θ���?
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

//*************** �����ڿ��� this �� ��� �����μ� �ڵ差 ���� ******************
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
		System.out.println("overloading constructor parm2��");
	}
	ZCar2(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor parm3��");
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
