import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 Map 인터페이스 
 Map << (키와 값을 가지는) 쌍의 구조를 갖는 배열
 ex) 지역번호(02,서울)(031,경기)
 key, 중복을 허용 하지 않는다
 value : 중복을 허락한다
 
 generic 지원
 Map interface를 구현하는 클래스는 
 구버젼 : HashTable (동기화 보장)
 신버젼 : HashMap (동기화를 강제하지 않는다):성능고려
 지금까지는 (Thread를 배우지 않으면 동기화는 의미가 없다)
 
 */
public class Ex11_Map_Interface {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Tiger" ," 1004");
		map.put("scott", "1004");
		map.put("SPER MAN","1004");
		
		System.out.println(map.containsKey("tiger"));
		System.out.println(map.containsKey("scott"));
		System.out.println("1004");
		
		System.out.println(map.get("Tiger")); // value : 1004
		System.out.println(map.get("hong")); //해당되는 key가 없으면 null 반환
		map.put("Tiger", "1005"); //아 Tiger 의  value 값을 바꿀려고 ...(replace)
		System.out.println(map.get("Tiger"));
		System.out.println(map.size());
		
		
		Object value = map.remove("superman");
		System.out.println("value : " + value);
		System.out.println(map.toString());
		
		
		Set set = map.keySet(); //key 의 집합은 (순서,중복값 없음) == Set 
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Collection vlist = map.values();
		System.out.println(vlist.toString());

	}

}
