package org.example;

import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();

        int[] count = new int[26];

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            count[ch - 'A']++;
        }

        int max = -1;
        int idx = -1;
        boolean multi = false;

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                idx = i;
                multi = false;
            } else if (count[i] == max) {
                multi = true;
            }
        }

        if(multi) {
            System.out.println("?");
        } else {
            System.out.println((char) (idx +'A'));
        }
    }
}
