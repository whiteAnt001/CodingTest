package org.example.PG;

import org.example.Solution;

public class PG120849 {
    public static void main(String[] args) {
        PG120849 sol = new PG120849();
        String result = sol.solution("bus");
        System.out.println(result);

        result = sol.solution("nice to meet you");
        System.out.println(result);
    }

    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if ("aeiou".indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
