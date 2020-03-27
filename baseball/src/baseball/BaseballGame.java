package baseball;
import java.util.Random;
import java.util.Scanner;
public class BaseballGame {
    int[] answer = new int[3];
    static int cntThrow;
    Random r = new Random();
    //★난수 생성 알고리즘(중복X)
    void initialize() {
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (Math.random() * 9) + 1;
            for (int j = i - 1; j >= 0; j--) {
                if (answer[i] == answer[j]) {
                    i--;
                    break;
                }
            }
        }
    }
    int[] judge(int[] input) {
        int temp[] = new int[2]; // 0 : strike, 1: ball
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (answer[i] == input[j]) {
                    temp[1]++;
                    if (i == j) {
                        temp[0]++;
                        temp[1]--;
                    }
                }
            }
        }
        return temp;
    }
    int getCntThrow() {
        cntThrow++;
        return cntThrow;
    }
}