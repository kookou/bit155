import java.util.ArrayList;
import java.util.Stack;

/*
Today Point
Generic 
jdk 1.5
C# , Java  �ʼ� ���

Collection Ŭ�������� (��������� Ÿ�� : Object)
1. Object Ÿ�� ����  >> Ÿ�� ?? >> Ÿ�԰��� >> ���ʸ�
2. Ÿ�� ������ (Ÿ�� ����)
3. ����ȯ (casting) (x) >>   (Car)obj (x)

����� ���� : Ŭ���� ����  >> Ÿ���� �����ϵ��� 

*/
class MyGen<T>{ //Type parameter
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
}

class Person extends Object{
	int age=100;
}

public class Ex06_Generic {
	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("���ڿ�");
		String result = mygen.get();
		System.out.println(result);

		ArrayList list = new ArrayList(); //
		//�����ϴ� �������(Array >> Ÿ�� >> default Object)
		list.add(10);
		list.add(new Person());
		list.add("ȫ�浿");
		
		//���
		for(Object obj : list) {
			//System.out.println(obj);
			//Person p = (Person)(obj);
			//System.out.println(p.age);
			//�Ǵ� (��ü , �� ���� ... ��ȯ)
			if(obj instanceof Person) {
				Person p = (Person)(obj);
				System.out.println(p.age);
			}else {
				System.out.println(obj);
			}
		}
		
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		for(Person p : plist) {
			System.out.println(p.age);
		}
		
		MyGen<Person> myobj = new MyGen<Person>();
		myobj.add(new Person());
		Person pe = myobj.get();
		System.out.println(pe.age);
		
		Stack<String> s = new Stack<String>();
		s.push("���ڿ�");
		String str = s.pop();
	}

}






