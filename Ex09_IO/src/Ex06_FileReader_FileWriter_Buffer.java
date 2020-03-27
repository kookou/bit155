import java.io.BufferedWriter;
import java.io.FileWriter;

//Reader
//Writer 작업시 성능 향상(buffer)
//buffer Line 단위 로 작업 가능(장점)
public class Ex06_FileReader_FileWriter_Buffer {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("Lotto.txt",true); //append
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("로또");
		bw.newLine();
		bw.write("1,45,20,4,3,5");
		bw.newLine();
		bw.flush();
		
		/*
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);
			String line = "";
			for(int i = 0; (line = br.readLine()) != null; i++){
				//System.out.println(line);
				if(line.indexOf(";") != -1){  //값이 있으면 -1 이 아니기 때문에 ";" 이 있는 문장만 출력
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			
		}finally{
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        */
	}

}
