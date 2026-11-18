package org.example.PG;

import org.example.Solution;

public class PG181932 {
    public static void main(String[] args) {
        PG181932 sol = new PG181932();
        String result = sol.solution("abc1abc1abc");
        System.out.println(result);
    }

    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++){
            char ch = code.charAt(i);

            if(mode == 0) {
                if (ch != '1') {
                    if (i % 2 == 0) {
                        sb.append(ch);
                    }
                } else if (ch == '1') {
                    mode = 1;
                }
            } else if (mode == 1) {
                if (ch != '1') {
                    if (i % 2 != 0) {
                        sb.append(ch);
                    }
                } else if (ch == '1') {
                    mode = 0;
                }
            }
        }

        if (sb.isEmpty()){
            return "EMPTY";
        }

        return sb.toString();
    }
}
