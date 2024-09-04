package baekjoon;

// #4673번 셀프 넘버
public class Solution_03 {
    public static void main(String[] args) {
        int num = 10000;
        boolean selfNum[] = new boolean[num + 1];

        for (int i = 1; i <= num; i++) {
            int result = i;
            int temp = i;

            while (temp > 0) {
                result += temp % 10;
                temp /= 10;
            }

            if (result <= num) {
                selfNum[result] = true;
            }
        }

        for (int j = 1; j <= num; j++) {
            if (!selfNum[j]) {
                System.out.println(j);
            }
          }
        }
    }
