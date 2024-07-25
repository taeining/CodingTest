package programmers;

import java.io.IOException;

public class Solution_02 {
    class Solution {
        int[] fibo;
        public int solution(int n) {
            int answer = 0;
            fibo = new int[n+1];
            fibo[0] = 0;
            fibo[1] = 1;
            return fibo(n);
        }

        public int fibo(int n){
            if(n==0) return fibo[0];
            if(n==1) return fibo[1];
            if(fibo[n]!=0) return fibo[n];
            return fibo[n] = (fibo(n-1)+fibo(n-2))%1234567;
        }
    }
}
