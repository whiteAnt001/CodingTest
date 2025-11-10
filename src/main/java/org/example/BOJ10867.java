package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BOJ10867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Set<Integer> set = new TreeSet<>();

        for(int i = 0; i < n; i++ ) {
            String m = sc.next();
            set.add(Integer.parseInt(m));
        }

        for(int num : set) {
            System.out.print(num + " ");
        }
    }
}
