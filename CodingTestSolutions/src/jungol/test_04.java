package jungol;

import java.util.Scanner;

public class test_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = a; j >= b; j--) {
                System.out.print(j + " * " + i + " = " + (j*i) +"   ");
            }

        }
        sc.close();
    }
}
