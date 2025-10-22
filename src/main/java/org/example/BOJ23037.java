package org.example;

import java.util.Scanner;

public class BOJ23037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = String.valueOf(num);

        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            int d = str.charAt(i) - '0';
            sum += Math.pow(d, 5);
        }
        System.out.println(sum);
    }
}
