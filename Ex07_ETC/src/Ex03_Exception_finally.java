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
		//throw : �����ڰ� ���Ƿ� ������ �߻����Ѽ� ������ ����ó�� �ϵ��� �ϴ� ���
		throw new IOException("Install �� ���� �߻�");
		}catch (Exception e){
			System.out.println("���� �޽��� ���: "+e.getMessage());
		}finally{ //������ ���� �� (���ܰ� �߻��ص�, ���ܰ� �߻� ���� �ʾƵ� �����Ѵ�) �ܵ����δ� ��� �Ҽ� ���� try ¦��
			fileDelete();
			
			//�ڿ����� (��ȯ�ϴ°� ���������� �����ص�, ������������ �����ص� ��ȯ) 
		}
		System.out.println("Main End");
		//**************************************
		//�Լ��� ���� ���� �Ҷ� return �� �־ finally �� ���� ���� ����ȴ�. 
		//**************************************
		
		

	}

}
