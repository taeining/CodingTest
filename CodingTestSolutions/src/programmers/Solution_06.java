package programmers;

public class Solution_06 {
    class Solution {
        boolean solution(String s) {

            int cnt = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(') {
                    cnt++;
                } else if (c == ')') {
                    cnt--;
                }

                if (cnt < 0) {
                    return false;
                }
            }
            return cnt == 0;
        }
    }
}
