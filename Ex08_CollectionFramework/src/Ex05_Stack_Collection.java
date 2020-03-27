import java.util.Stack;

import kr.or.bit.Coin;
import kr.or.bit.MyStack;

public class Ex05_Stack_Collection {

	public static void main(String[] args) {
		// Java�� ���� stak Ŭ���� [LIFO]
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop()); //���ܹ߻�
		System.out.println(stack.isEmpty());
		MyStack my = new MyStack(5);
		System.out.println("����"+my.full());
		System.out.println("����"+my.isEmpty());
		my.push(100);
		my.push(200);
		my.push(300);
		System.out.println(my.full());
		System.out.println(my.isEmpty());
		my.push(400);
		my.push(500);
		System.out.println("��á�µ�?"+my.full());
		System.out.println(my.pop());
		
		//���� �ڽ�
		Stack<Coin> coinbox = new Stack<Coin>();
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(10));
		
		
		while(!coinbox.isEmpty()){
			Coin coin = coinbox.pop();
			System.out.println("�������� : "+coin.getValue()+"��");
		}
		
	}

}
