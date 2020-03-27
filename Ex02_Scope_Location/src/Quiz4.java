
public class Quiz4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*for(int i = 1; i <=5; i++){
			for(int j = 5; j <= 1; j-- ){
				if(i > j){
				System.out.print(" ");
			}else{
				System.out.print("*");
			}
		
		}System.out.println("");

	  }*/
	}

}
