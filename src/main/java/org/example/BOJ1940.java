package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(num);

        int l = 0;
        int r = n -1;
        int count = 0;

        while(l < r) {
            int sum = num[l] + num[r];
            if(sum == m) {
                count++;
                l++;
                r--;
            } else if (sum > m) {
                r--;
            } else {
                l++;
            }
        }
        System.out.println(count);
    }
}
