package org.example.PG;

import java.util.Scanner;

public class PG181945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            System.out.println(ch);
        }
    }
}
