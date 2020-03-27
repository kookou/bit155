package kr.or.bit;

/*
 ���, ���� ����� ���
 �Լ�(function)(method)
 
 �Լ�(method) : ���� �Ǵ� ����� �ּҴ��� >>[**�ϳ��� ��ɸ� ����**]
 ex)�Դ´�, �ȴ´�, �ܴ�...
 
 Ŭ���� : �ʵ� + �Լ� + ������
 
ex) ���ӹ� : ���ӱ� �����ְ� .. �Լ�����
         �����̱� : �����ְ� ������ �޴°�.. �Լ�����

Java �Լ� ���� (4����)
1. void , parameter(o) : void print(String str) {�����ڵ�}
2. void , parameter(x) : void print() {�����ڵ�}
3. return Type, parameter (o) : int print(int data){return 100;}
4. return Type, parameter (x) : int print(){return 200;}

void >> �����ִ°��� ���� >> return value ����
return Type >> (8���� �⺻ Ÿ�� + String + ����Ÿ��) + Array + collection + interface
ex) Car print(){ return new Car();}
ex) boolean print() {return true;}

parameter (����, �μ�, �Ű���,���ް�) : ���ӱ��� ���� ���� (�������� 1��,������ �ϼ� �� �ִ�)
���� ���� 2���� 2���� �� ���� �־�� ����, ���������� 10�� �� 10���� �� �־�ߵ�
ex) void print(int a , int b, int c, int d, int f) >> print(10,20,30,40) (x)
 												   >> print(10,20,30,40,50) (o)
�Լ��� �̸��� : ������ ǥ��
�ǹ��ִ� �ܾ� ����
:getChnnelNumber(), getEmpListByEmpno()

�Լ���� ���� �ݵ�� ȣ��(call) �Ǿ�߸� ����ȴ� : ������ ���� �̸��� �θ��� ������ ������ �ȵȴ�
 */
public class Fclass {
	public int data;

	// void m()
	public void m() {
		System.out.println("�Ϲ��Լ� : void, parameter (x)");
	}

	// void m (int ..)
	public void m2(int i) {
		System.out.println("parameter value (scope :) : " + i);
		System.out.println("�Ϲ� �Լ� : void, parameter(o)");
	}

	public int m3() {
		return 100; // return type �� �ִ� �Լ��� �ݵ�� return Ű���带 ���
	}

	public int m4(int data) {
		return data + 1;
	}

	// ��� ������ �⺻..
	// Ȯ��

	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	// �Լ��� ������µ�
	// �����ڰ����� >> default int subsum()
	// �ٸ��������� ����� �� ����
	/*
	 * int subSum(int i){ return i +100; }
	 */
	// �������� �ǵ� : subSum �Լ��� Ȱ���� ���ο��� �ٸ� �Լ��� �����ִ� �Լ��� ����ڴ�.
	// ���� ���� �������� ����� ���� �ʴ´�.
	// �ǵ� : subsum() ��ü (���� ����) �������� ���ϰ� ���ο��� ���
	// private ������, ������
	// 1.Ŭ���� ���ο����� �ǹ̰� ����
	// 2.�������� (Fclass f = new Fclass()) f.private ���� ����.

	// subSum �Լ��� [�ٸ� �Լ��� ����]�ϴ� �Լ���. �׷��� ȣ�� �Ǿ�� �ȵȴ�
	// ���ο��� �ٸ� �Լ��� ȣ���ؼ� ���ȴ�
	// �ٸ� �Լ��� ����ϴ� [ ���� �Լ� ]
	private int subSum(int i) {
		return i + 100;
	}

	public void CallSubSum() {
		int result = subSum(100);
		print(result);
		
	}
	public void print(int data){
		System.out.println("data : " + data);
	}
	private int operationMethod(int data){
		return data *200;
	}
	public int opSum(int data){
		int result = operationMethod(data);
		if(result > 0){
			return 1;
			}else{
				return -1;
			}
	}
	//Quiz
	//a�� b ���߿� ū ���� return �ϴ� �Լ��� ���弼��
	//ex) max(500,300) return ���� 500�ް� �ϸ� �ǿ�
	//public int max (int a, int b)
	
    //30�� return ���� �ݺ��� ����� ���� �ʴ�
	/*   public int max(int a, int b){  
		if(a < b ){
			return b;
		}else{
			return a;
		}
	}
	*/

	/*
	60��
	 
	int result = 0;
	if(a>b){
		return = a;
	}else {
		return = b;
	}
	return result;
	
	90��
	int max = (a>b)?a:b;
	return max;
	
	
	100��
	return (a>b) ? a:b;
	*/
	   public int max(int a, int b){
		   return (a>b) ? a:b;
	   }
	   public String concat(String s ,String s1 , String s2){
		   //String result = s+"/"+s1+"/"+s2;
		   //return result;
		   return s+"/"+s1+"/"+s2;
	   }
	   //�������� �Լ��� �⺻��
	   //Ŭ������ Ÿ���̴�....
	   
	   /*
	    public int call(int i , int j ){return i + j;}
	    public Tv call(){return}
	    
	    
	    
	    
	    
	    */
	   public Tv tcall(){ 
		  return new Tv();  //Tv Ÿ�԰� ���� ��ü �ּ� �� �Ѱ��ش�
		  //Tv tv = new Tv(); return tv;
	   }
	   
	   public Tv tcall2(Tv t){
		   t.brandname = "A";
		   t.ch = 99;
		   return t;
		   
	   }
	   public int tcall3(int i){
		   return i+100;
	   }
	   
	   
	   //Today Point
	   //Ŭ������ memory �÷��� ��� �����ϴ�
	   //Tv t = new Tv(); >> t ��� ������ TvŸ�� ��ü�� �ּҸ� ���´�
	   
	   public Tv objMethod(){ //Tv ��� Ÿ���� ��ü �ּҸ� �����ֳ�
		   Tv tv = new Tv();
		   return tv;
		   
	   }
	   public Tv objMethod2(){
		   return new Tv();
	   }
	   public Tv objMethod3(Tv t){  //Tv��� Ÿ���� ���� ��ü�� �ּҸ� �ްڴ�.
		   return t;
	   }
	   /*
	    main
	    1.Tv t = new Tv();
	    t.objMethod3(t);
	    
	    2.
	    t.objMethod3(new Tv());  //t ��� ������ new Tv() �� �ּ� ���� �޴´�.
	      
	    */
	   
	   
	   

}	
	
	
