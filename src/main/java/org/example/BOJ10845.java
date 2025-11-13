package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if(str.equals("push")) {
                int num = sc.nextInt();
                queue.add(num);
            }

            if(str.equals("pop")) {
                if(queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.poll());
                }
            }

            if(str.equals("size")) {
                System.out.println(queue.size());
            }

            if(str.equals("empty")) {
                if(queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

            if(str.equals("front")) {
                if(queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peek());
                }
            }

            if(str.equals("back")) {
                if(queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    int last = ((LinkedList<Integer>) queue).peekLast();
                    System.out.println(last);
                }
            }
        }
    }
}
