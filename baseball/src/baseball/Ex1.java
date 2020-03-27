package baseball;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        BaseballGame bg = new BaseballGame();
        Scanner in = new Scanner(System.in);
        int[] input = new int[3];
        int[] result = new int[2]; //0 : strike, 1 : ball
        bg.initialize(); //난수 생성
        System.out.print("정답 : ");
        for (int i = 0; i < bg.answer.length; i++) {
            System.out.print(bg.answer[i] + " ");
        }
        System.out.println();
        System.out.println("숫자 야구 게임!");
        while (true) {
            System.out.print("공을 던져 주세요 : ");
            for (int j = 0; j < input.length; j++) {
                input[j] = in.nextInt();
            }
            result = bg.judge(input);
            int count = bg.getCntThrow();
            System.out.println(result[0] + "strike " + result[1] + " ball 입니다.");
            if(result[0] == 3) {
                System.out.println("정답입니다!");
                System.out.println("투구횟수 : " + count);
                break;
            }
        }
    }
}