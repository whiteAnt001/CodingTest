package org.example;

import java.util.Scanner;

public class BOJ9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] dp = new boolean[n + 1];

        dp[0] = false;
        if(n >= 1) dp[1]= true;
        if(n >= 2) dp[2] = false;
        if(n >= 3) dp[3] = true;

        for(int i = 4; i <= n; i++) {
            dp[i] = !dp[i - 1] || !dp[i - 3];
        }

        System.out.println(dp[n] ? "SK" : "CY");
    }
}
