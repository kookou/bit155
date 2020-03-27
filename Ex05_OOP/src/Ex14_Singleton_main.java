import kr.or.bit.Singleton;

public class Ex14_Singleton_main {

	public static void main(String[] args) {
		//Singleton singleton = new
		Singleton single = Singleton.getInstance();
		System.out.println(single);
		//kr.or.bit.Singleton@15db9742
		Singleton single1 = Singleton.getInstance();
		System.out.println(single1);
		//kr.or.bit.Singleton@15db9742
		Singleton single2 = Singleton.getInstance();
		System.out.println(single2);
		//kr.or.bit.Singleton@15db9742


	}

}
