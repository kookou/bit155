package day02;
/*������ ���Ϲ��� switch ����
 * 
 * http status code�� ����
 * �̵��� �������� �����ְ�
 * �����ϰ�� ���� �޼������� ��������
 */
public class Ex08 {
	public static void main(String [] args) {
		int code = 200;
		String address = "";
		String errorMessage = "";
		switch(code) {
		case 200:
			address = "����ڰ� ��û�� �ּ�";
			errorMessage = null;
			break;
		case 404:
			address = "errpr.jsp";
			errorMessage = "�������� ã�� �� �����ϴ�.";
			break;
		case 500:
			address = "error.jsp";
			errorMessage = "��� ������ ���ܼ� ���� ���Դϴ�!";
			break;
			
		}
	}

}
