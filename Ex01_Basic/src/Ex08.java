package day02;
/*실제로 쓰일법한 switch 예제
 * 
 * http status code에 따라서
 * 이동할 페이지를 정해주고
 * 오류일경우 오류 메세지까지 정해주자
 */
public class Ex08 {
	public static void main(String [] args) {
		int code = 200;
		String address = "";
		String errorMessage = "";
		switch(code) {
		case 200:
			address = "사용자가 요청한 주소";
			errorMessage = null;
			break;
		case 404:
			address = "errpr.jsp";
			errorMessage = "페이지를 찾을 수 없습니다.";
			break;
		case 500:
			address = "error.jsp";
			errorMessage = "잠시 문제가 생겨서 점검 중입니다!";
			break;
			
		}
	}

}
