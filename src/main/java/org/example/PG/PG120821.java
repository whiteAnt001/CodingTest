package org.example.PG;

import org.example.Solution;

import java.util.Arrays;

public class PG120821 {
    public static void main(String[] args) {
        PG120821 sol = new PG120821();
        int[] result = sol.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));

        result = sol.solution(new int[]{1, 1, 1, 1, 1, 2});
        System.out.println(Arrays.toString(result));

        result = sol.solution(new int[]{1, 0, 1, 1, 1, 3, 5});
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - 1 - i];
        }
        return answer;
    }
}
