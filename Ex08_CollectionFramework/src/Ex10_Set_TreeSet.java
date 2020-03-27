import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex10_Set_TreeSet {

	public static void main(String[] args) {
		//Set 순서유지안됨, 중복값 안됨
		HashSet<String> hs = new HashSet<String>();
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("K");
		hs.add("B");
		hs.add("B");
		
		System.out.println(hs);
		//HashSet 확장 >> LinkedHashSet(순서유지) >> Linked(주소 : node)
		Set<String> hs2 = new LinkedHashSet<String>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("B");
		hs2.add("B");
		//순서가 유지된다(입력하는 순서)
		//정렬된다(내림차순,오름차순)
		System.out.println(hs2);  //<<순서
		
		//TreeSet
		//자료구조(순서지키지 않음, 중복 허용하지 않음, 정렬은 되어있다)
		//검색하거나 정렬을 필요로 하는 데이터 집합
		//로또 
		//1. 이진 트리 구조를 가지고 있다
		//2. 데이터가 저장 될때 정렬 된다
		//로또
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0; lotto.size() <6; i++){
			lotto.add((int)(Math.random()*45)+1);
		}
		//System.out.println(lotto.toString());
		Iterator<Integer> lo = lotto.iterator();
		while(lo.hasNext()){
			System.out.println(lo.next());
		}
		
		

	}

}
