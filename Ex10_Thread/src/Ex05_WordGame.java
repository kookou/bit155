import javax.swing.JOptionPane;

/*
문제
main 함수 제외한 Thread 2개 생성
1. 시간(time) 제어하는 Thread
2. 단어 입력을 처리하는 Thread

main 함수 2개 실행

단 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하세요
hint) 공유자원 (static)




*/
class WordQuiz{
	String quiz1 = "자격지심";
	String quiz2 = "고진감래";

	public void quiz1() {
		System.out.println("사자성어 퀴즈");
		System.out.println("Quiz 01 ");
		System.out.println("[자기가 한 일에 대하여 스스로 미흡하게 여기는 마음]에 해당하는 사자 성어는?");
		String inputdata = JOptionPane.showInputDialog("정답입력");
		if (inputdata != null && inputdata.equals(quiz1)) {
			System.out.println("정답입니다.");
			Ex05_WordGame.inputcheck = true;
			for (int i = 10; i > 0; i--) {
				if (Ex05_WordGame.inputcheck == true)
					quiz2();
				return;
			}
		} else {
			Ex05_WordGame.inputcheck = true;
			System.out.println("오답입니다.");
		}
		System.out.println("당신의 대답은 : " + inputdata);
	}
	public void quiz2() {
		System.out.println("사자성어 퀴즈");
		System.out.println("Quiz 02 ");
		System.out.println("[고생 끝에 즐거움이 옴을 이르는 말]에 해당하는 사자 성어는?");
		String inputdata = JOptionPane.showInputDialog("정답입력");
		if (Ex05_WordGame.inputcheck == true){
			Ex05_WordGame.inputcheck = false;
			for (int i = 10; i > 0; i--) {
				System.out.println("남은 시간: " + i);
				try {
					Thread.sleep(1000); // 대기실에서 1초간 쉬었다 ....
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				if (inputdata != null && inputdata.equals(quiz2)) {
					System.out.println("정답입니다.");
					Ex05_WordGame.inputcheck = true;
					return;
				} else {
					Ex05_WordGame.inputcheck = true;
					System.out.println("오답입니다.");
				}
			}
			
		}
			
		
		
		System.out.println("당신의 대답은 : " + inputdata);
	}
}


class WordTimeOut extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {

			if (Ex05_WordGame.inputcheck)
				return; // run함수 탈출

			System.out.println("남은 시간: " + i);
			try {
				Thread.sleep(1000); // 대기실에서 1초간 쉬었다 ....
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex05_WordGame {
	static boolean inputcheck = false;
	static boolean flag = false;

	public static void main(String[] args) {
		WordTimeOut time = new WordTimeOut();
		WordQuiz quiz = new WordQuiz();

		
		time.start();
		quiz.quiz1();

	}

}
