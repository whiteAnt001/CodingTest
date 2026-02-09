package org.example;

import java.util.Scanner;

public class BOJ15989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] q = new int[a];

        int maxN = 0;
        for (int i = 0; i < a; i++) {
            q[i] = sc.nextInt();
            maxN = Math.max(maxN, q[i]);
        }

        long[] dp = new long[maxN + 1];
        dp[0] = 1;

        int[] nums = {1, 2 ,3};

        for (int num : nums) {
            for (int i = num; i <= maxN; i++) {
                dp[i] += dp[i - num];
            }
        }

        for (int i = 0; i < a; i ++) {
            System.out.println(dp[q[i]]);
        }
    }
}
