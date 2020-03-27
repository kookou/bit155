import kr.or.bit.Mouse;
import kr.or.bit.Notebook;

public class Ex03_Method2 {

	public static void main(String[] args) {
		
		Notebook notebook = new Notebook();
		Mouse mouse = new Mouse();
		//mouse аж╪р
		Mouse mouse2 = notebook.handle(mouse); //public Mouse handle(Mouse m)
		System.out.println(mouse2.x);
		System.out.println(mouse2.y);

	}

}
