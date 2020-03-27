import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set 인터페이스를 구현하는 클래스
//Set 원 안에 들어가세요
//데이터의 순서 보장 안된다(중복된 데이터는 없다) : 순서가 없고 중복을 허락하지 않는 데이터의 집합 만들때 Set을 사용한다
//구현하는 클래스 : HashSer, TreeSet <<Set 이 붙어있는 애들
public class Ex09_Set_Interface {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		boolean bo2 = hs.add(55); // 정상적으로 원안에 들어가면 true 값을 주나보다
		System.out.println(bo2);
		System.out.println(hs.toString());
		bo2 = hs.add(1); // 같은 데이터는 추가 안되요 (보장)
		System.out.println(bo2); // 중복값을 허용하지 않기 때문에 false
		System.out.println(hs.toString());
		hs.add(2);
		System.out.println(hs.toString()); // 출력 순서 보장되지 않아요

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		hs2.add("A");
		hs2.add("A");
		hs2.add("A");
		System.out.println(hs2.toString()); // 중복값 안나온다
		// 로또의 중복값 거르기
		String[] obj = { "A", "B", "C", "D", "B", "A" };
		HashSet<String> hs3 = new HashSet<String>();
		for (int i = 0; i < obj.length; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		// Quiz
		// HashSet 을 사용해서 1~45까지의 난수 6개를 넣으세요
		HashSet lotto = new HashSet();

		for (int i = 0; lotto.size() < 6; i++) { // 중복값이나오면 lotto 안에 안들어 가기때문에
													// size 가 6보다 작을 때까지 중복값없이
													// 채울수 있다
			int num = (int) (Math.random() * 45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto.toString());
		Set/* 인터페이스 타입 */ set2 = new HashSet();
		int index = 0;
		while (set2.size() < 6) { // 조건이 true면 계속돈다
			System.out.println("index : " + (++index));
			int num = (int) (Math.random() * 45) + 1;
			set2.add(num);
		}
		System.out.println("set2 : " + set2.toString());

		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		System.out.println(set3.toString());

		Iterator<String> s = set3.iterator();
		while (s.hasNext()) {
			System.out.println(s.next()); //index 순서를 보장하지 않는다
		}
		
		//Collections.sort(List<t>); <<parameter가 List generic
		//sort 함수의 parameter로 List 인터페이스를 구현한 객체만 올수있다
		//vector, stack,ArrayList >>저장공간이 배열이기 때문에 정렬이 가능하다
		//하지만 HashSet 은 배열이 아니기 떄문에 정렬이 불가능하다
		
		List list = new ArrayList(set3); //컬렉션 부모가 자식 객체인 hashset 주소를 받을수 있다
		System.out.println("before 무작위 : "+list.toString());
		Collections.sort(list);
		System.out.println("after 정렬 : "+list);
		Collections.reverse(list);
		System.out.println("reverse 정렬"+list);
		

	}

}
