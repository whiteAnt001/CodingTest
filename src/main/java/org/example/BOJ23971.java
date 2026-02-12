package org.example;

import java.util.Scanner;

public class BOJ23971 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int maxPerRow= (int) Math.ceil((double) w / (m +1));
        int maxPerCol= (int) Math.ceil((double) h / (n +1));

        int maxPeople = maxPerRow * maxPerCol;

        System.out.println(maxPeople);
    }
}
