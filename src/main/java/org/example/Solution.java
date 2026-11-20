package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
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