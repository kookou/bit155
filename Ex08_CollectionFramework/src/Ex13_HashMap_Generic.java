import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 HashMap <k,v>
 HashMap<String,String>
 HashMap<Integer,String>
 HashMap<String,Emp>
 >>put("hong",new Emp()); ******************
 */
class Student{
	int kor;
	int math;
	int eng;
	String name;
	Student(String name,int kor,int math, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
}
public class Ex13_HashMap_Generic {

	public static void main(String[] args) {
		HashMap<String, Student> sts = new HashMap<String,Student>();{
			sts.put("hong", new Student("홍길동",100,50,30));
			sts.put("kim", new Student("김유신",50,100,60));
			Student std = sts.get("hong");
			System.out.println(std.kor);
			System.out.println(std.math);
			
			//Tip 예외적으로
			//Map 안에 있는 key, value 모든 길이 출력
			Set set = sts.entrySet(); //집합 key + "=" + value
			Iterator it = set.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			//만약에 value 가 Object 라면 (객체)
			//Map.Entry (인터페이스가 인터페이스를 또가진것) 으로 : getKey(),getValue() 라는 함수를 제공 받는다
			for(Map.Entry m : sts.entrySet()){
				System.out.println(m.getKey()+"/"+((Student)m.getValue()).math); //객체가 가진 자원값도 출력 할수 있다
				
			}
		}

	}

}
