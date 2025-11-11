package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ26069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();

            if(set.contains(a) || set.contains(b)) {
                set.add(a);
                set.add(b);
            }
        }

        System.out.println(set.size());
    }
}
