/*
 String Ŭ����
 String str = new String("ȫ�浿");
 8���� �⺻ Ÿ�԰� �����ϰ� ����� �� �ֵ��� ����
 int i = 100;
 String str = "ȫ�浿";
 
 1.String Ŭ���� : ������ ���� ���� : char[] �迭���� > ȫ�浿 > [ȫ][��][��]
 ex) String ename = "ABC" >> char[] >> [A] [B] [C]
 class String extends Object{
  char[]...
  void length(){}
  @override
  String toString(){
      ������
  }
 */
public class Ex05_String_Class {

	public static void main(String[] args) {
		String str = "ȫ�浿";
		System.out.println(str.length());  //�����Ͱ� ���������� char[] (�迭) �� ���� �Ǳ� ������
		System.out.println(str.toString());
		
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println(str1);  //str1.toString()  << ���� �Ǿ��ֱ� ������ �ּҰ��� �ƴ� �������̵� �� ���� �����Ѵ�
		System.out.println(str1.toString());  // String �� ���� ���� ���� ������ �޸𸮸� �������� �ʴ´� 
		System.out.println(str1 == str2);     // true
		//���ڿ� == ������ �� �ϴ� ��? >> �ּ� �� ("xx ����" == "xx����")
		//�����δ� ���ڿ��� ������ �ּҰ� �߿��Ѱ� �ƴϴ�
	    System.out.println(str1.equals(str2));
	    //******* ������ heap �� �ִ� ���� ���ϴ°� ("AAA" == "AAA")
	    
	    //�׷���..
	    String str3 = new String("BBB"); //new �� ����ϸ� ���ο� ��ü�� �����Ѵ�
	    String str4 = new String("BBB");
	    System.out.println(str3==str4);  //"xx����" == "yy����"  >>false
	    System.out.println(str3.equals(str4)); //"BBB" == "BBB" >>true
	    
	    //�ͼ���
	    String s = "A";
	    s+="B";
	    s+="C";
	    System.out.println(s);
	    
	    s = "A";
	    System.out.println(s);
	    String str5 = "BBB";
	    String str6 = new String();
		
		
		
		

	}

}
