package programmers;
import java.util.*;
public class Solution_01 {
    public String solution(int[] numbers) {

        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuffer answer = new StringBuffer();
        for(String num : arr){
            answer.append(num);
        }

        return answer.toString();
    }
}
