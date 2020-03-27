import java.util.HashMap;
import java.util.Scanner;

public class Ex12_HashMap {

	public static void main(String[] args) {
		//일상생활에서 (회원가입 > 로그인 > id, pwd)id 중복값 없음 pws 중복값 있음
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004"); // kye 값은 중복값을 허용 하지 않는다 value 값은 중복값도 허용한다
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		//우리 시스템에 가입된 회원 정보(id,pwd)
		//id,pwd 둘다 맞으면 회원이 
		//id 맞고 pwd 는 틀리면 실패 (비밀번호 입력강제)
		
		//id 틀린경우 pwd 볼필요 없이 실패
		//id,pwd 둘다 틀린경우
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("ID와 Password 입력해 주세요");
			System.out.println("ID");
			String id = sc.nextLine().trim().toLowerCase();
			
			System.out.println("Password");
			String pwd = sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)){
				System.out.println("ID가 다릅니다 재입력하세요");
			}else{
				//ID는 맞은경우 else 를 탄다 
				//비번만 검증
				if(loginmap.get(id).equals(pwd)){
					System.out.println("회원님 반갑습니다");
					break;//while 탈출
				}else{
					System.out.println("Password를 확인해주세요");
				}
			}
		}

	}

}
