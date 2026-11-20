package org.example.PG;

import org.example.Solution;

public class PG120822 {
    public static void main(String[] args) {
        PG120822 sol = new PG120822();
        String result = sol.solution("jaron");
        System.out.println(result);

        result = sol.solution("bread");
        System.out.println(result);
    }

    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);

        sb.reverse();
        return sb.toString();
    }
}
