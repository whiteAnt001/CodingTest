package org.example;

import java.util.Scanner;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();

            if (k == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(k);
            }
        }
        int sum = 0;
        for (int val : stack) {
            sum += val;
        }
        System.out.println(sum);
    }
}
