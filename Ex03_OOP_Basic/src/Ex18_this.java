import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 this 
 1. ��ü �ڽ��� ����Ű�� this (������ ������ ��ü�� �ּҸ� ���� �� �̶�� ����)
 2. this ��ü �ڽ� (������ ȣ��) : ��Ģ >> �����ڴ� ��ü�� ����� ���� 1�� �� ȣ��
         ���������� this�� Ȱ���ϸ� �������� �����ڸ� ȣ�� �Ҽ��ִ�(Today Point)
 
 
 */

class Test6 {
	int i;
	int j;

	Test6() { // default constructor (����Ʈ ������)

	}
	//������ ���忡�� 
	//Test6(int k, int p) {} �������� �����
	//������(����) ..
	//�ǵ����̸� parameter �̸��� ����� �Ҵ��Ϸ��� �ϴ� instance ���� ��� �����ϰ� 
	//���� �ǹ� �ִ� ������ >> ������ >> �������� ..�ڵ带 ������ ���߰� �Ǿ�� �Ѵ�
	//����) �������� ���Ƽ� � ������ ���ϴ��� �𸥴�..
	
	//int i;
	//int j;
	//parameter �� �޴� i,j �� �����ϰ� ���ٰ�
	//this > Test6 �� ��Ī�Ѵ�
	Test6(int i, int j) {
		//this.i >>Test6 ������ �ִ� member
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
	
	SoCar(){ //�⺻Ÿ��
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
		
		Book2 book = new Book2("ȫ�浿��");
		
		SoCar socar = new SoCar();
		socar.print();
		
		SoCar socar2 = new SoCar("blue","auto",6);
		socar2.print();

	}

}
