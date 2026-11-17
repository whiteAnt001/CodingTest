package org.example.PG;

import org.example.Solution;

public class PG181939 {
    public static void main(String[] args) {
        PG181939 sol = new PG181939();
        int result = sol.solution(12, 3);
        System.out.println(result);
    }

    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(""+a+b);
        int ba = Integer.parseInt(""+b+a);

        answer = ab > ba ? ab : ba;
        return answer;
    }
}
