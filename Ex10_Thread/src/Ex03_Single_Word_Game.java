import javax.swing.JOptionPane;

//단어 맞추기 게임
//구구단 게임
//일정 시간이 주어지고 시간이 지나면 게임이 종료 된다 시간은 계속 흘러간다
//문제도 맞춰서 합산 해야한다

public class Ex03_Single_Word_Game {

	public static void main(String[] args) {
		String inputdata = JOptionPane.showInputDialog("값을 입력하세요");  //window 프로그램 만들때 쓰는 소스
		System.out.println("입력값 : "+ inputdata);

	}
	static void timer(){
		for(int i = 10; i >0;i--){
			try {
				System.out.println("남은시간 : "+i);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
