package org.example.PG;

import org.example.Solution;

public class PG120583 {
    public static void main(String[] args) {
        PG120583 sol = new PG120583();
        int result = sol.solution(new int[]{1, 1, 2, 3, 4, 5}, 1);
        System.out.println(result);

        result = sol.solution(new int[]{0, 2, 3, 4}, 1);
        System.out.println(result);
    }

    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == n) {
                answer ++;
            }
        }
        return answer;
    }
}
