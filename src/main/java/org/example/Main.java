package org.example;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();

            if (str[i].equals("push")) {
                int num = sc.nextInt();
                stack.push(num);
            }

            if (str[i].equals("pop")){
                if (stack.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }
            if (str[i].equals("size")){
                System.out.println(stack.size());
            }
            if (str[i].equals("empty")){
                System.out.println(stack.empty() ? 1 : 0);
            }
            if (str[i].equals("top")){
                if (stack.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}

