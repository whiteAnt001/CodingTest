package org.example;

import java.util.Scanner;

public class BOJ4659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String password = sc.nextLine();

            if (password.equals("end")){
                break;
            }

            if(isAcceptable(password)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }
    }

    public static boolean isAcceptable(String password) {
        String vowels ="aeiou";

        boolean hasVowels = false;
        for(char c : vowels.toCharArray()) {
            if(password.indexOf(c) != -1) {
                hasVowels = true;
                break;
            }
        }
        if(!hasVowels) {
            return false;
        }

        if(!hasThreeConsecutive(password)) {
            return false;
        }

        if(!hasDoubleLetter(password)) {
            return false;
        }

        return true;
    }

    public static boolean hasThreeConsecutive(String password) {
        String vowels = "aeiou";
        int vowelStreak = 0;
        int consonantStreak = 0;

        for (char ch : password.toCharArray()) {
            if(vowels.indexOf(ch) != - 1) {
                vowelStreak++;
                consonantStreak = 0;
            } else {
                consonantStreak++;
                vowelStreak = 0;
            }

            if(vowelStreak == 3 || consonantStreak == 3) {
                return false;
            }
        }

        return true;
    }

    public static boolean hasDoubleLetter(String password) {
        for(int i = 0; i < password.length() -1; i++) {
            char curr = password.charAt(i);
            char next = password.charAt(i + 1);

            if (curr == next) {
                if (curr != 'e' && next != 'o') {
                    return false;
                }
            }
        }
        return true;
    }
}
