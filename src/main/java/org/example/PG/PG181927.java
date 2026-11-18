package org.example.PG;

import org.example.Solution;

import java.util.Arrays;

public class PG181927 {
    public static void main(String[] args) {
        PG181927 sol = new PG181927();
        int[] result = sol.solution(new int[]{2, 1, 6});
        System.out.println(Arrays.toString(result));

        result = sol.solution(new int[]{5, 2, 1, 7, 5});
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        int last = num_list[num_list.length - 1];
        int before = num_list[num_list.length - 2];

        answer[answer.length-1] = last > before ? last - before : last * 2;

        return answer;
    }
}
