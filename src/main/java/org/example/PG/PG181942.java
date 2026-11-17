package org.example.PG;


import org.example.Solution;

public class PG181942 {
    public static void main(String[] args) {
        PG181942 sol = new PG181942();
        String result = sol.solution("aaaa","bbbbb");
        System.out.println(result);
    }

    public String solution(String str1, String str2) {

        StringBuilder sb = new StringBuilder(str1.length() * 2);

        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return sb.toString();
    }
}
