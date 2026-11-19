package org.example.PG;

import org.example.Solution;

public class PG120831 {
    public static void main(String[] args) {
        PG120831 sol = new PG120831();
        int result = sol.solution(10);
        System.out.println(result);

        result = sol.solution(4);
        System.out.println(result);
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
