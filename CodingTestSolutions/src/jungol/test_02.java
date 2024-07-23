package jungol;

import java.util.Scanner;

public class test_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 행
        int b = sc.nextInt(); // 열

        for (int i = 1; i <= a; i++) {
            System.out.println();
            for (int j = 1; j <= b; j++) {
                System.out.print(i*j + " ");
            }
        }
    }
}
