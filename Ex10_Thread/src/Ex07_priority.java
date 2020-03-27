//여러개의 thread 가 있을때 우선순위를 부여해서 점유율(cpu) 를 늘리는 방법
//Min 1 ~ Max 10 까지의 상대적 수치를 가지고 있다. >> default 5(가운데)

class Pth extends Thread{

	@Override
	public void run() {
		for(int i =0; i <1000; i++){
			System.out.println("-----------------------");
		}
	}
}

class Pth2 extends Thread{

	@Override
	public void run() {
		for(int i =0; i <1000; i++){
			System.out.println("|||||||||||||||||||||||");
		}
	}
}

class Pth3 extends Thread{

	@Override
	public void run() {
		for(int i =0; i <1000; i++){
			System.out.println("************************");
		}
	}
}



public class Ex07_priority {

	public static void main(String[] args) {
		Pth pth = new Pth();
		Pth2 pth2 = new Pth2();
		Pth3 pth3 = new Pth3();
		
		System.out.println(pth.getPriority());  //우선순위 확인
		System.out.println(pth2.getPriority());
		System.out.println(pth3.getPriority());
		
		pth.setPriority(10); //먼저 end 할수 있는 확률을 높여준다
		pth3.setPriority(1);  // 제일 나중에 end 할수 있는 확률을 높여준다
		
		pth.start();
		pth2.start();
		pth3.start();

	}

}
