import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInputStream {
	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try{
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);   //번역기
			while(true){
				score = dis.readInt();
				System.out.println("score int 타입 : " + score);
				sum += score;
			}
		}catch(Exception e){
			//System.out.println("예외발생 : "+e.getMessage());
			e.printStackTrace();  //디테일한 예외
			System.out.println("sun 결과 : "+sum);
		}finally{
			try{
				fis.close();
				dis.close();
			}catch(Exception e2){
				System.out.println(e2.getMessage());
			}
			
		}

	}

}
