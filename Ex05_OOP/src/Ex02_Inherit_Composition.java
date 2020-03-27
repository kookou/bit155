/*
���赵 1�� .... ������ �������� ������ ....
������ ������ ���� ... 1�� �̻��� ���赵 ����
���> ���θ� > ȸ������ , �ֹ����� , ��۰���  ....���赵 5�� .... 
**������** �������� ���赵�� (����) �ξ��ִ� ��

1. ��Ӱ���(is ~ a : ���)  �� ~ �̴� (�θ� �ڿ�)

2. ���԰���(has ~ a : ����) �� ~ �� ������ �ִ� 

��)
��Ŭ����     ����Ŭ����
>>�� extends ���� (��Ӱ���)

��Ŭ����   ��Ŭ����
>>���� ���̴� (x)
>>���� ���� ������ �ִ� (0)
>>has ~ a (member field)
>>class �� { �� ������;  }


����Ŭ����           ��Ŭ����
������ ���̴� (x)
������ ���� ������ �ִ� (0)
class ���� { ���� ����; }

��  ��, �ﰢ�� , �簢�� ����� ���赵 �ۼ�

���� �����̴�
�ﰢ���� �����̴�
�簢���� �����̴�


���� : �߻�ȭ , �Ϲ�ȭ ( �׸��� , ���� ) >> �����ڿ�
��  : ��üȭ , Ư��ȭ (������ , ��) >> ���θ��� ������ Ư¡

�� : ��ǥ�� (x,y)
���� ���� ������ �ִ�
�ﰢ���� ���� ������ �ִ�
�簢���� ���� ������ �ִ�

class Shape : �Ϲ�ȭ ,�߻�,���� (�׸��� , ����)  >> ���
class Point : ��                                                  >> ����

��üȭ , Ư��ȭ : circle , triangle



*/
//�߻�ȭ , �Ϲ�ȭ , ����
class Shape {
	String color = "gold"; // ����Ӽ�

	void draw() { // ������
		System.out.println("�׸���");
	}
}

// ����
class Point {
	int x;
	int y;

	Point() {
		// this.x = 1;
		// this.y = 1;
		this(1, 1);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
// ���� : ���� ���弼�� (���� ���� : ���� ������ �������� ������ �ִ�)
// 1. ���� �����̴� (is ~ a) : ����(shape)
// 2. ���� ���� ������ �ִ�(has ~ a) : ��(point)
// 3. ���� �������� ������ �ִ� (Ư����) : r
// ���� �������� default ������ 10�� ������
// ���� x , y ��ǥ�� default �� (10,15)
// �⺻���� �������� ������ �������� ���� ���� �Է¹��� �� �ִ� (���� ����� ����)

class Circle extends Shape {
	Point point; // ���԰���(member field)
	int r; // ������ (Ư����)

	Circle() {
		// this.r = 10;
		// this.point = new Point(10, 15);
		this(10, new Point(10, 15));
	}

	Circle(int r, Point point) { // ������, ���� ���� ���Ƿ�
		this.r = r;
		this.point = point; // �ּҰ� �Ҵ�
	}
}

// Circle circle = new Circle();
// Circle circle = new Circle (15,new Point(3,5));

class transportation {
	String fuel = "�⸧";
	String handle;
	String breake;

	void carry() {
		System.out.println("�����δ�");
	}
}

class Car2 extends transportation {

}

class Airplane extends transportation {
	String wings = "5";

	Airplane() {
	}

	Airplane(String wings) {
		this.wings = wings;
	}
}

class Sheap extends transportation {

}

class He extends Airplane {
	String wings = "2";

	He() {
	}

	He(String wings) {
		super("2");
	}

	void He2() {
		System.out.println("wings" + wings);
		System.out.println("this" + this.wings);
		System.out.println("super" + super.wings);
	}
}

// ���� 2)
// �ﰢ�� Ŭ������ ���弼��
// ����) �ﰢ���� 3���� ���� ���� �׸��� �׸��ٶ�� ����� ������ �ִ�
// Shape, point ���� �޾ƿ�
// hint) (x,y) (x,y) (x,y) 3���� ��ǥ��
// default �� �׸� �� �ְ� , 3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ�
// 80��
class Triangle2 extends Shape {
	Point[] pointarray;

	Triangle2() {
		// x = new Point(10,20);
		// y = new Point(30,40);
		// z = new Point(50,60);
		// this(new Point(10,20),new Point(30,40),new Point(50,60));
		//pointarray = new Point[3]; // �游 ����� , ��ȿ��ٰ� �־���ߵȴ�
		//pointarray[0] = new Point(10, 20);
		//pointarray[1] = new Point(30, 40);
		//pointarray[0] = new Point(50, 60);
		//�ȵſ� >> pointarray = {new Point(10, 20),new Point(10, 20),new Point(10, 20)};
		this(new Point[]{new Point (10, 20),new Point(10, 20),new Point(10, 20)});
	}

	Triangle2(Point[] pointarray) {
	this.pointarray = pointarray;
	}

	// ��üȭ, Ư��ȭ
	// �߰����� ���
	void trianglePoint() {
		for(Point point : this.pointarray){
			System.out.printf("x : (%d,%d)\t",point.x,point.y);
			System.out.println();
		}
		//System.out.printf("x : (%d,%d)\t", x.x, x.y);
		//System.out.printf("y : (%d,%d)\t", y.x, y.y);
		//System.out.printf("z : (%d,%d)\t", z.x, z.y);
		//System.out.println();
	}

}
//�簢�� �����


class Square extends Shape{
	Point[] squarearr;
	Square(){
		this(new Point[]{new Point (1,2),new Point (3,4),new Point (5,6),new Point (7,8)});
	}
	Square(Point[] squarearr){
		this.squarearr = squarearr;
	}
	void squarePoint(){
		for(Point p  : this.squarearr){
			System.out.printf("Square : (%d,%d,)\t",p.x,p.y);
		}
	}
	
}



public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("������ : " + circle.r);
		System.out.println("�θ� : " + circle.color);
		System.out.println("��ǥ : " + circle.point.x);
		System.out.println("��ǥ : " + circle.point.y);
		circle.draw();

		Circle circle2 = new Circle(20, new Point(2, 5));
		System.out.println("������ : " + circle2.r);
		System.out.println("�θ� : " + circle2.color);
		System.out.println("��ǥ : " + circle2.point.x);
		System.out.println("��ǥ : " + circle2.point.y);
		circle2.draw();

		He he = new He();
		he.He2();

		Point[] pointer = {new Point (10, 20),new Point(30, 40),new Point(50, 60)};
		Triangle2 triangle2 = new Triangle2(pointer);
		triangle2.trianglePoint();
		triangle2.draw();
		
		

	}

}
