
public class Ex_01_main_Quiz3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
            	System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
            	System.out.print("*");
            }
            System.out.println();
	}
	  /* for(int i = 1; i <= 5; i++) {
           for(int j = 5; j >= 1; j--) {
            if(i < j) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
			System.out.println("");
    }*/
	
  }
}
