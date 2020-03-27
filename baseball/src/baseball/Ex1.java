package baseball;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        BaseballGame bg = new BaseballGame();
        Scanner in = new Scanner(System.in);
        int[] input = new int[3];
        int[] result = new int[2]; //0 : strike, 1 : ball
        bg.initialize(); //���� ����
        System.out.print("���� : ");
        for (int i = 0; i < bg.answer.length; i++) {
            System.out.print(bg.answer[i] + " ");
        }
        System.out.println();
        System.out.println("���� �߱� ����!");
        while (true) {
            System.out.print("���� ���� �ּ��� : ");
            for (int j = 0; j < input.length; j++) {
                input[j] = in.nextInt();
            }
            result = bg.judge(input);
            int count = bg.getCntThrow();
            System.out.println(result[0] + "strike " + result[1] + " ball �Դϴ�.");
            if(result[0] == 3) {
                System.out.println("�����Դϴ�!");
                System.out.println("����Ƚ�� : " + count);
                break;
            }
        }
    }
}