package programmers;

public class Solution_03 {
    class Solution {
        public int solution(String t, String p) {
            long num = Long.parseLong(p);
            int digits = (int) Math.log10(num) + 1;
            int cnt = 0;


            for (int i = 0; i <= t.length() - digits; i++) {
                String substring = t.substring(i, i + digits);
                long answer = Long.parseLong(substring);
                if (answer <= num) {
                    cnt++;
                }
            }
            return cnt;
        }
    }
}
