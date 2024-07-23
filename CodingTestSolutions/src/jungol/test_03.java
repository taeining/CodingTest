package jungol;

import java.util.Scanner;

// 정올 반복제어문2 - 형성평가9
public class test_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println();
            for (int j = 1; j <= a; j++) {
                System.out.print("(" + i + ", " + j + ") ");
            }

        }
        sc.close();
    }
}
