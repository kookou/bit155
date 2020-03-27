import java.util.Random;

public class Ex_Random {
	public static void main(String[] args) {
		Random r = new Random ();
		int i = r.nextInt(10)+1;
		System.out.println(i);
	}

}
