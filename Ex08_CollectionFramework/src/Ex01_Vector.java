import java.util.Vector;

/*
 Collection FrameWork
 [다수의 데이터를] 다루는 표준화된 인터페이스를 구현하는 클래스 집합 
 collection 인터페이스 <- List (상속)       < ---- ArrayList ..(구현하는 클래스)
                   <- Set (상속)        < ---- HashSet, TreeSet (구현하는 클래스)
 Map 인터페이스 (key,value)   < ----- HashMap (구현하는 클래스)
 ----------------------------------------------------------------------------
 List Interface (줄을 서시오)
 :순서가 보장된다(번호표), 중복허용   > 내부적으로 데이터를(자료, 객체) 배열로 관리한다
 1.Vector (구버전) - >  동기화 (멀티스레드 : stack 이 여러개 있는것) - > Lock (보호) -> 성능은 조금 떨어진다 한강의 화장실
 2.ArrayList(신버전) -> 동기화(멀티스레드 ) -> Lock(x) : 필요에 따라서 - > 성능 적인 면을 고려해서 잠금장치를 띠었다 붙였다  
 
 Array (배열) : 고정배열
 방의 개수가 할번 정해지면 (방의 크기는 변경 불가)
 int[] arr = new int[5];
 arr[0] = 100;
 10개의 방이 필요하다면 줄이거나 늘릴 수 없다
 int arr = {10,20,30};
 
 Array
 1. 배열의 크기가 고정 :Car[] card = {new Car(), new Car()}; 방2개
 2. 접근방법 index (첨자) index의 시작 값은 0부터 마지막 index 는 length-1  >> cars[]
 3. 초기 설정 변경 불가능 
 
 List 인터페이스를 구현한 클래스 :: Vector, ArrayList
 1. 배열의 크기를 동적으로 확장 축소가 가능 >> 사실은 배열의 재할당 
 2. 순서를 유지(Array), 순서값(index), 중복값 허용
 3. 데이터의 저장 공간 (Array) 
 
 
 */
public class Ex01_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 dsfault 용량 : "+v.capacity()); //기본방 10개
		v.add("AA");
		v.add("BB");
		v.add("AA");
		v.add(100);
		System.out.println(v.toString());  //<< Object 가 가지고 있는 toString override
		
		//Array(정적배열) >> length >> 배열의 길이
		//List >> size  >> 값의 길이 
		
		for(int i = 1; i < v.size(); i++){
			//정적(Array : arr[i] ..
			System.out.println(v.get(i)); //get 함수를 사용해서 값을 가져온다 (get 뒤에 index값) 외우기 
		}
		for(Object obj : v){
			System.out.println(obj);
		}
		//제너릭 >> 그릇(배열)의 타입을 강제하는 방법 > ↓String 만 담을수 있는 그릇
		Vector<String> v2 = new Vector<String>();
		v2.add("Hello");
		v2.add("안녕");
		v2.add("배고프다");
		for(String st : v2){
			System.out.println(st);
		}
		System.out.println(v2.toString());
		System.out.println(v2.get(1)); //<<get 함수는 size를 본다
		System.out.println("size 데이터 개수 : " +v2.size());
		System.out.println("Capacity : "+v2.capacity());
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println(v3.capacity());
		System.out.println(v3.size());

	}

}
