package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n];

        for(int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(p);
        int temp = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            temp += p[i];
            sum += temp;
        }

        System.out.println(sum);

    }
}
