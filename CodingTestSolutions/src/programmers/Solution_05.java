package programmers;

public class Solution_05 {
    class Solution {
        public String solution(int n) {

            StringBuilder sb = new StringBuilder("");
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    sb.append("수");
                } else if (i % 2 == 0) {
                    sb.append("박");
                }
            }
            return sb.toString();
        }
    }
}
