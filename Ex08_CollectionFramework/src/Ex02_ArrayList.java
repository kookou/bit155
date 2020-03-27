import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Today Point****

public class Ex02_ArrayList {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);

		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println(arraylist.toString());

		System.out.println("특정방에 있는 값 : " + arraylist.get(1));
		// add 순차적으로 데이터 넣기
		// arraylist.add // overloading 되어있다 index, element
		arraylist.add(0, 111); // [111, 100, 200, 300] 데이터를 뒤로 미룬다
		System.out.println(arraylist.toString());
		arraylist.add(4, 444);
		System.out.println(arraylist.toString());
		// 비순차적인 데이터 추가, 삭제 >> ArrayList (순서가 있는 데이터의 집합)
		// 순차적인 데이터의 추가, 삭제를 좋아한다

		// 특정 위치에 데이터 삽입 (add) 중간에 >> 나머지 데이터를 이동 시킨다
		// 특정 위치에 데이터 삭제
		// ArraList 는 순차적인 데이터의 추가, 삭제에 활용 하는 것이다
		// arraylist.remove(index)
		// arraylist.add(index,element);

		// ArrayList가 가지는 함수 학습
		System.out.println(arraylist.contains(200)); // boolean 값 return list 에 있는 값 확인 있다 true
		System.out.println(arraylist.contains(5555));// 없음으로 false 

		System.out.println(arraylist.isEmpty()); // boolean 값 return size 가 있니? false
													// 나 비어있지 않아
		// true >> size == 0
		arraylist.clear(); // size == 0  전부 삭제
		System.out.println(arraylist.isEmpty());  //비어있다 true
		arraylist.add(101);  //arraylist 에 값을 넣는다 
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString()); 

		// 삭제 remove
		System.out.println("삭제전 : " + arraylist.size());
		Object value = arraylist.remove(0);// 0번째 방의 값을 삭제 해라 // Object value
											// 삭제된 데이터를 저장할 수 있다
		System.out.println("삭제된 데이터 : " + value);
		System.out.println(arraylist.toString());
		System.out.println("삭제후 : " + arraylist.size());
		// 중간에 데이터를 add 하면 배열의 방이 뒤로 밀리고 중간에 삭제하면 당겨진다

		// Point
		// 어렵게 사용하는법 개발자들이 좋아한다
		List li = new ArrayList(); // 다형성을 사용해서 > 확장성, 유연성
		// li.add(e)
		// ArrayList alist = new ArrayList();
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");

		List li4 = li.subList(0, 2); // sublist 가 만들어주는 데이터는 순서가 있는 데이터의 집합 이구나
		System.out.println(li4.toString());

		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(45);
		alist.add(3);
		alist.add(15);

		// Arrays.sort(a);
		System.out.println("before : " + alist.toString());
		Collections.sort(alist);  // << list 의 정렬 초보개발자는 쓰면 안된다
		System.out.println("after : " + alist.toString());
		//반대로 정렬하고 싶다면?
		Collections.reverse(alist);  // << list 의 정렬을 반대로
		System.out.println("after : " + alist.toString());
		

	}

}
