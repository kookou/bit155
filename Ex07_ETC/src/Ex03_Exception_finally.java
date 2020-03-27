import java.io.IOException;

public class Ex03_Exception_finally {
	static void startInstall(){
		System.out.println("INSTALL");
	}
	static void copyFiles(){
		System.out.println("COPY FILES");
	}
	static void fileDelete(){
		System.out.println("DELETE FILES");
	}

	public static void main(String[] args) {
		
		try{copyFiles();
		startInstall();
		//throw : 개발자가 임의로 문제를 발생시켜서 강제로 예외처리 하도록 하는 방법
		throw new IOException("Install 중 문제 발생");
		}catch (Exception e){
			System.out.println("예외 메시지 출력: "+e.getMessage());
		}finally{ //강제적 실행 블럭 (예외가 발생해도, 예외가 발생 하지 않아도 실행한다) 단독으로는 사용 할수 없고 try 짝꿍
			fileDelete();
			
			//자원해제 (반환하는것 정상적으로 실행해도, 비정상적으로 실행해도 반환) 
		}
		System.out.println("Main End");
		//**************************************
		//함수를 강제 종료 할때 return 이 있어도 finally 가 먼저 강제 실행된다. 
		//**************************************
		
		

	}

}
