package jungol;

import java.util.Scanner;

// 정올 반복제어문2 - 형성평가 7
public class test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.print(a*i + " ");
        }

        sc.close();
    }
}
